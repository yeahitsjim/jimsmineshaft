package net.mcreator.jimsmineshaft.network;

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
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(StalkerPoseSetPacketMessage.TYPE, StalkerPoseSetPacketMessage.STREAM_CODEC, StalkerPoseSetPacketMessage::handleData);
	}

}