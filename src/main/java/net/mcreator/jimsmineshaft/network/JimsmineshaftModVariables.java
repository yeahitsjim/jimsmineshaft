package net.mcreator.jimsmineshaft.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Supplier;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, JimsmineshaftMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());
	public static com.google.gson.JsonObject filledSpaces = new com.google.gson.JsonObject();
	public static com.google.gson.JsonObject cuurentCoords = new com.google.gson.JsonObject();

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
		JimsmineshaftMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.drillX = original.drillX;
			clone.drillY = original.drillY;
			clone.playerDrillMode = original.playerDrillMode;
			clone.drillZ = original.drillZ;
			clone.nearElevator = original.nearElevator;
			clone.playerDrillMoveCloser = original.playerDrillMoveCloser;
			clone.maxbattery = original.maxbattery;
			clone.throwAwayVariable = original.throwAwayVariable;
			clone.playerCantOpenDrill = original.playerCantOpenDrill;
			clone.playerIsDrilling = original.playerIsDrilling;
			clone.inElevator = original.inElevator;
			clone.batterylife = original.batterylife;
			clone.LookingInventoryValue = original.LookingInventoryValue;
			clone.cartPushing = original.cartPushing;
			clone.playerInvValue = original.playerInvValue;
			clone.elevatorPlace = original.elevatorPlace;
			clone.playerHoldingDrill = original.playerHoldingDrill;
			clone.stamina = original.stamina;
			clone.staminamax = original.staminamax;
			clone.darknessOverlay = original.darknessOverlay;
			clone.elevatorSeatNumber = original.elevatorSeatNumber;
			clone.overlay = original.overlay;
			if (!event.isWasDeath()) {
				clone.analogScreenInx = original.analogScreenInx;
				clone.paradise_ticks = original.paradise_ticks;
				clone.sentencedToDeath = original.sentencedToDeath;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "jimsmineshaft_worldvars";

		public static WorldVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			WorldVariables data = new WorldVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof ServerLevel level)
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldVariables::new, WorldVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "jimsmineshaft_mapvars";
		public double levelTokens = 0;
		public String currentVariant = "\"\"";
		public boolean workingRoomIsBit = false;
		public Direction currentDirection = Direction.NORTH;
		public String lastGeneratedStructure = "\"\"";
		public double variantTokens = 0;
		public double totalTokensRemaining = 0;
		public String SBselectedShaft = "\"\"";
		public double totalPlayers = 0;
		public double SB_z = 0;
		public double SB_x = 0;
		public double SB_y = 0;
		public boolean doBlockSpawning = false;

		public static MapVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			MapVariables data = new MapVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			levelTokens = nbt.getDouble("levelTokens");
			currentVariant = nbt.getString("currentVariant");
			workingRoomIsBit = nbt.getBoolean("workingRoomIsBit");
			currentDirection = Direction.from3DDataValue(nbt.getInt("currentDirection"));
			lastGeneratedStructure = nbt.getString("lastGeneratedStructure");
			variantTokens = nbt.getDouble("variantTokens");
			totalTokensRemaining = nbt.getDouble("totalTokensRemaining");
			SBselectedShaft = nbt.getString("SBselectedShaft");
			totalPlayers = nbt.getDouble("totalPlayers");
			SB_z = nbt.getDouble("SB_z");
			SB_x = nbt.getDouble("SB_x");
			SB_y = nbt.getDouble("SB_y");
			doBlockSpawning = nbt.getBoolean("doBlockSpawning");
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putDouble("levelTokens", levelTokens);
			nbt.putString("currentVariant", currentVariant);
			nbt.putBoolean("workingRoomIsBit", workingRoomIsBit);
			nbt.putInt("currentDirection", currentDirection.get3DDataValue());
			nbt.putString("lastGeneratedStructure", lastGeneratedStructure);
			nbt.putDouble("variantTokens", variantTokens);
			nbt.putDouble("totalTokensRemaining", totalTokensRemaining);
			nbt.putString("SBselectedShaft", SBselectedShaft);
			nbt.putDouble("totalPlayers", totalPlayers);
			nbt.putDouble("SB_z", SB_z);
			nbt.putDouble("SB_x", SB_x);
			nbt.putDouble("SB_y", SB_y);
			nbt.putBoolean("doBlockSpawning", doBlockSpawning);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(new SavedData.Factory<>(MapVariables::new, MapVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public double drillX = 0;
		public double drillY = 0;
		public boolean playerDrillMode = false;
		public double drillZ = 0;
		public boolean nearElevator = false;
		public boolean playerDrillMoveCloser = false;
		public double maxbattery = 100.0;
		public double throwAwayVariable = 0;
		public boolean playerCantOpenDrill = false;
		public boolean playerIsDrilling = false;
		public boolean inElevator = false;
		public double batterylife = 100.0;
		public double LookingInventoryValue = 0;
		public boolean cartPushing = false;
		public double playerInvValue = 0;
		public double elevatorPlace = 0;
		public boolean playerHoldingDrill = false;
		public String analogScreenInx = "\"\"";
		public double stamina = 300.0;
		public double staminamax = 300.0;
		public double darknessOverlay = 0;
		public double elevatorSeatNumber = 0;
		public boolean overlay = true;
		public double paradise_ticks = 0;
		public boolean sentencedToDeath = false;

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("drillX", drillX);
			nbt.putDouble("drillY", drillY);
			nbt.putBoolean("playerDrillMode", playerDrillMode);
			nbt.putDouble("drillZ", drillZ);
			nbt.putBoolean("nearElevator", nearElevator);
			nbt.putBoolean("playerDrillMoveCloser", playerDrillMoveCloser);
			nbt.putDouble("maxbattery", maxbattery);
			nbt.putDouble("throwAwayVariable", throwAwayVariable);
			nbt.putBoolean("playerCantOpenDrill", playerCantOpenDrill);
			nbt.putBoolean("playerIsDrilling", playerIsDrilling);
			nbt.putBoolean("inElevator", inElevator);
			nbt.putDouble("batterylife", batterylife);
			nbt.putDouble("LookingInventoryValue", LookingInventoryValue);
			nbt.putBoolean("cartPushing", cartPushing);
			nbt.putDouble("playerInvValue", playerInvValue);
			nbt.putDouble("elevatorPlace", elevatorPlace);
			nbt.putBoolean("playerHoldingDrill", playerHoldingDrill);
			nbt.putString("analogScreenInx", analogScreenInx);
			nbt.putDouble("stamina", stamina);
			nbt.putDouble("staminamax", staminamax);
			nbt.putDouble("darknessOverlay", darknessOverlay);
			nbt.putDouble("elevatorSeatNumber", elevatorSeatNumber);
			nbt.putBoolean("overlay", overlay);
			nbt.putDouble("paradise_ticks", paradise_ticks);
			nbt.putBoolean("sentencedToDeath", sentencedToDeath);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			drillX = nbt.getDouble("drillX");
			drillY = nbt.getDouble("drillY");
			playerDrillMode = nbt.getBoolean("playerDrillMode");
			drillZ = nbt.getDouble("drillZ");
			nearElevator = nbt.getBoolean("nearElevator");
			playerDrillMoveCloser = nbt.getBoolean("playerDrillMoveCloser");
			maxbattery = nbt.getDouble("maxbattery");
			throwAwayVariable = nbt.getDouble("throwAwayVariable");
			playerCantOpenDrill = nbt.getBoolean("playerCantOpenDrill");
			playerIsDrilling = nbt.getBoolean("playerIsDrilling");
			inElevator = nbt.getBoolean("inElevator");
			batterylife = nbt.getDouble("batterylife");
			LookingInventoryValue = nbt.getDouble("LookingInventoryValue");
			cartPushing = nbt.getBoolean("cartPushing");
			playerInvValue = nbt.getDouble("playerInvValue");
			elevatorPlace = nbt.getDouble("elevatorPlace");
			playerHoldingDrill = nbt.getBoolean("playerHoldingDrill");
			analogScreenInx = nbt.getString("analogScreenInx");
			stamina = nbt.getDouble("stamina");
			staminamax = nbt.getDouble("staminamax");
			darknessOverlay = nbt.getDouble("darknessOverlay");
			elevatorSeatNumber = nbt.getDouble("elevatorSeatNumber");
			overlay = nbt.getBoolean("overlay");
			paradise_ticks = nbt.getDouble("paradise_ticks");
			sentencedToDeath = nbt.getBoolean("sentencedToDeath");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}