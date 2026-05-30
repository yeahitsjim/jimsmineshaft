package net.mcreator.jimsmineshaft.network;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ShaftbuilderGUILvl2ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ShaftbuilderGUILvl2ButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "shaftbuilder_gui_lvl_2_buttons"));

	public static final StreamCodec<RegistryFriendlyByteBuf, ShaftbuilderGUILvl2ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ShaftbuilderGUILvl2ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ShaftbuilderGUILvl2ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ShaftbuilderGUILvl2ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ShaftbuilderGUILvl2ButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 6) {

			SetBitD31Procedure.execute(world);
		}
		if (buttonID == 7) {

			SetBitD32Procedure.execute(world);
		}
		if (buttonID == 12) {

			SetBitD33Procedure.execute(world);
		}
		if (buttonID == 13) {

			SetBitD34Procedure.execute(world);
		}
		if (buttonID == 14) {

			SetBitD41Procedure.execute(world);
		}
		if (buttonID == 15) {

			SetBitD42Procedure.execute(world);
		}
		if (buttonID == 16) {

			SetBitD71Procedure.execute(world);
		}
		if (buttonID == 17) {

			SetBitD72Procedure.execute(world);
		}
		if (buttonID == 21) {

			LeftClickSpawnerProcedure.execute();
		}
		if (buttonID == 24) {

			SetRoomE1Procedure.execute(world);
		}
		if (buttonID == 25) {

			SetRoomE2Procedure.execute(world);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(ShaftbuilderGUILvl2ButtonMessage.TYPE, ShaftbuilderGUILvl2ButtonMessage.STREAM_CODEC, ShaftbuilderGUILvl2ButtonMessage::handleData);
	}

}