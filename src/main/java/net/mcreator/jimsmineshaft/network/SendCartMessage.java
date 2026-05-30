package net.mcreator.jimsmineshaft.network;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record SendCartMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<SendCartMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "key_send_cart"));

	public static final StreamCodec<RegistryFriendlyByteBuf, SendCartMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SendCartMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new SendCartMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SendCartMessage> type() {
		return TYPE;
	}

	public static void handleData(final SendCartMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(SendCartMessage.TYPE, SendCartMessage.STREAM_CODEC, SendCartMessage::handleData);
	}

}