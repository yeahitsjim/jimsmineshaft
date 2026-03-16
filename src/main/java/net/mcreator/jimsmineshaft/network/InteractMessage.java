package net.mcreator.jimsmineshaft.network;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record InteractMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<InteractMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "key_interact"));

	public static final StreamCodec<RegistryFriendlyByteBuf, InteractMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, InteractMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new InteractMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<InteractMessage> type() {
		return TYPE;
	}

	public static void handleData(final InteractMessage message, final IPayloadContext context) {
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

			Rightclicks2Procedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(InteractMessage.TYPE, InteractMessage.STREAM_CODEC, InteractMessage::handleData);
	}

}