package net.mcreator.jimsmineshaft.network;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ShaftbuilderGUILvl3ButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ShaftbuilderGUILvl3ButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "shaftbuilder_gui_lvl_3_buttons"));

	public static final StreamCodec<RegistryFriendlyByteBuf, ShaftbuilderGUILvl3ButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ShaftbuilderGUILvl3ButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ShaftbuilderGUILvl3ButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ShaftbuilderGUILvl3ButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ShaftbuilderGUILvl3ButtonMessage message, final IPayloadContext context) {
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

		if (buttonID == 0) {

			SetShaftF1Procedure.execute(world);
		}
		if (buttonID == 1) {

			SetShaftF2Procedure.execute(world);
		}
		if (buttonID == 2) {

			SetShaftF3Procedure.execute(world);
		}
		if (buttonID == 3) {

			SetRoomF2Procedure.execute(world);
		}
		if (buttonID == 4) {

			SetRoomF3Procedure.execute(world);
		}
		if (buttonID == 5) {

			SetRoomF4Procedure.execute(world);
		}
		if (buttonID == 6) {

			SetShaftG1Procedure.execute(world);
		}
		if (buttonID == 7) {

			SetShaftG2Procedure.execute(world);
		}
		if (buttonID == 8) {

			SetShaftF4Procedure.execute(world);
		}
		if (buttonID == 9) {

			SetShaftF5Procedure.execute(world);
		}
		if (buttonID == 10) {

			SetShaftF6Procedure.execute(world);
		}
		if (buttonID == 11) {

			SetRoomF1Procedure.execute(world);
		}
		if (buttonID == 12) {

			SetShaftG3BigProcedure.execute(world);
		}
		if (buttonID == 13) {

			SetRoomG1Procedure.execute(world);
		}
		if (buttonID == 14) {

			LeftClickSpawnerProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(ShaftbuilderGUILvl3ButtonMessage.TYPE, ShaftbuilderGUILvl3ButtonMessage.STREAM_CODEC, ShaftbuilderGUILvl3ButtonMessage::handleData);
	}

}