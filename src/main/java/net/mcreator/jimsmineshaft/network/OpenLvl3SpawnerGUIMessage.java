package net.mcreator.jimsmineshaft.network;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record OpenLvl3SpawnerGUIMessage(int eventType, int pressedms) implements CustomPacketPayload {

	public static final Type<OpenLvl3SpawnerGUIMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "key_open_lvl_3_spawner_gui"));

	public static final StreamCodec<RegistryFriendlyByteBuf, OpenLvl3SpawnerGUIMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, OpenLvl3SpawnerGUIMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new OpenLvl3SpawnerGUIMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<OpenLvl3SpawnerGUIMessage> type() {
		return TYPE;
	}

	public static void handleData(final OpenLvl3SpawnerGUIMessage message, final IPayloadContext context) {
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

			OpenLvl3SpawnerGUIOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(OpenLvl3SpawnerGUIMessage.TYPE, OpenLvl3SpawnerGUIMessage.STREAM_CODEC, OpenLvl3SpawnerGUIMessage::handleData);
	}

}