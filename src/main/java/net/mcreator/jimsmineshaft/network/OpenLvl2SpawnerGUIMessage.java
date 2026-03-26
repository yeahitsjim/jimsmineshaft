package net.mcreator.jimsmineshaft.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.jimsmineshaft.procedures.OpenSpawnerLvl2GUIOnKeyPressedProcedure;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record OpenLvl2SpawnerGUIMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<OpenLvl2SpawnerGUIMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "key_open_lvl_2_spawner_gui"));
	public static final StreamCodec<RegistryFriendlyByteBuf, OpenLvl2SpawnerGUIMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, OpenLvl2SpawnerGUIMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new OpenLvl2SpawnerGUIMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<OpenLvl2SpawnerGUIMessage> type() {
		return TYPE;
	}

	public static void handleData(final OpenLvl2SpawnerGUIMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			OpenSpawnerLvl2GUIOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(OpenLvl2SpawnerGUIMessage.TYPE, OpenLvl2SpawnerGUIMessage.STREAM_CODEC, OpenLvl2SpawnerGUIMessage::handleData);
	}
}