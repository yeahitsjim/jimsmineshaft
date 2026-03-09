package net.mcreator.jimsmineshaft.network;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ShiftKeyMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<ShiftKeyMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "key_shift_key"));

	public static final StreamCodec<RegistryFriendlyByteBuf, ShiftKeyMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ShiftKeyMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ShiftKeyMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ShiftKeyMessage> type() {
		return TYPE;
	}

	public static void handleData(final ShiftKeyMessage message, final IPayloadContext context) {
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
		JimsmineshaftMod.addNetworkMessage(ShiftKeyMessage.TYPE, ShiftKeyMessage.STREAM_CODEC, ShiftKeyMessage::handleData);
	}

}