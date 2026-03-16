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

import net.mcreator.jimsmineshaft.procedures.StalkerPoseSetPacketReceivedByClientProcedure;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record StalkerPoseSetPacketMessage(String extradata) implements CustomPacketPayload {
	public static final Type<StalkerPoseSetPacketMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "stalker_pose_set_packet"));
	public static final StreamCodec<RegistryFriendlyByteBuf, StalkerPoseSetPacketMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, StalkerPoseSetPacketMessage message) -> {
		buffer.writeUtf(message.extradata);
	}, (RegistryFriendlyByteBuf buffer) -> new StalkerPoseSetPacketMessage(buffer.readUtf()));

	@Override
	public Type<StalkerPoseSetPacketMessage> type() {
		return TYPE;
	}

	public static void handleData(final StalkerPoseSetPacketMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.CLIENTBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				String inboundString = message.extradata;

				StalkerPoseSetPacketReceivedByClientProcedure.execute(world, x, y, z, inboundString);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(StalkerPoseSetPacketMessage.TYPE, StalkerPoseSetPacketMessage.STREAM_CODEC, StalkerPoseSetPacketMessage::handleData);
	}
}