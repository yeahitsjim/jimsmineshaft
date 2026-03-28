package net.mcreator.jimsmineshaft.network;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record FreezeClientMessage(String extradata) implements CustomPacketPayload {

	public static final Type<FreezeClientMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "freeze_client"));

	public static final StreamCodec<RegistryFriendlyByteBuf, FreezeClientMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, FreezeClientMessage message) -> {
		buffer.writeUtf(message.extradata);
	}, (RegistryFriendlyByteBuf buffer) -> new FreezeClientMessage(buffer.readUtf()));

	@Override
	public Type<FreezeClientMessage> type() {
		return TYPE;
	}

	public static void handleData(final FreezeClientMessage message, final IPayloadContext context) {
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(FreezeClientMessage.TYPE, FreezeClientMessage.STREAM_CODEC, FreezeClientMessage::handleData);
	}

}