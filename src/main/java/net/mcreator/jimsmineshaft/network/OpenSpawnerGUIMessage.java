package net.mcreator.jimsmineshaft.network;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record OpenSpawnerGUIMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<OpenSpawnerGUIMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "key_open_spawner_gui"));

	public static final StreamCodec<RegistryFriendlyByteBuf, OpenSpawnerGUIMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, OpenSpawnerGUIMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new OpenSpawnerGUIMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<OpenSpawnerGUIMessage> type() {
		return TYPE;
	}

	public static void handleData(final OpenSpawnerGUIMessage message, final IPayloadContext context) {
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
		JimsmineshaftMod.addNetworkMessage(OpenSpawnerGUIMessage.TYPE, OpenSpawnerGUIMessage.STREAM_CODEC, OpenSpawnerGUIMessage::handleData);
	}

}