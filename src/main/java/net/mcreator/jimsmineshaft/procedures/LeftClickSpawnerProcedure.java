package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber(value = {Dist.CLIENT})
public class LeftClickSpawnerProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		PacketDistributor.sendToServer(new LeftClickSpawnerMessage());
		execute();
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public record LeftClickSpawnerMessage() implements CustomPacketPayload {
		public static final Type<LeftClickSpawnerMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "procedure_left_click_spawner"));
		public static final StreamCodec<RegistryFriendlyByteBuf, LeftClickSpawnerMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, LeftClickSpawnerMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new LeftClickSpawnerMessage());

		@Override
		public Type<LeftClickSpawnerMessage> type() {
			return TYPE;
		}

		public static void handleData(final LeftClickSpawnerMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.SERVERBOUND) {
				context.enqueueWork(() -> {
					if (!context.player().level().hasChunkAt(context.player().blockPosition()))
						return;
					execute();
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			JimsmineshaftMod.addNetworkMessage(LeftClickSpawnerMessage.TYPE, LeftClickSpawnerMessage.STREAM_CODEC, LeftClickSpawnerMessage::handleData);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		Direction workingDirection = Direction.NORTH;
		String workingRoomPick = "";
		com.google.gson.JsonObject freshCoordsJSON = new com.google.gson.JsonObject();
	}
}