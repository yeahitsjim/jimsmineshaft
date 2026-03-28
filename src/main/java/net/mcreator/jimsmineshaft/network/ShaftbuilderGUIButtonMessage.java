package net.mcreator.jimsmineshaft.network;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ShaftbuilderGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<ShaftbuilderGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "shaftbuilder_gui_buttons"));

	public static final StreamCodec<RegistryFriendlyByteBuf, ShaftbuilderGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ShaftbuilderGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new ShaftbuilderGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ShaftbuilderGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ShaftbuilderGUIButtonMessage message, final IPayloadContext context) {
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

			SetShaftmainlitProcedure.execute(world);
		}
		if (buttonID == 1) {

			SetShaftmainnonlitProcedure.execute(world);
		}
		if (buttonID == 2) {

			SetShaftmainbitProcedure.execute(world);
		}
		if (buttonID == 3) {

			SetShaftB1Procedure.execute();
		}
		if (buttonID == 4) {

			SetShaftB2Procedure.execute();
		}
		if (buttonID == 5) {

			SetShaftB3Procedure.execute();
		}
		if (buttonID == 6) {

			SetShaftB4Procedure.execute();
		}
		if (buttonID == 7) {

			SetShaftB5Procedure.execute();
		}
		if (buttonID == 8) {

			SetShaftBbit1Procedure.execute(world);
		}
		if (buttonID == 9) {

			SetShaftBbit2Procedure.execute(world);
		}
		if (buttonID == 10) {

			SetShaftBbit3Procedure.execute(world);
		}
		if (buttonID == 11) {

			SetShaftBbit4Procedure.execute(world);
		}
		if (buttonID == 12) {

			SetShaftC1Procedure.execute(world);
		}
		if (buttonID == 13) {

			SetShaftC2Procedure.execute(world);
		}
		if (buttonID == 14) {

			SetShaftC3Procedure.execute(world);
		}
		if (buttonID == 15) {

			SetShaftC4Procedure.execute(world);
		}
		if (buttonID == 16) {

			SetShaftC5Procedure.execute(world);
		}
		if (buttonID == 17) {

			SetShaftCbit1Procedure.execute(world);
		}
		if (buttonID == 18) {

			SetShaftCbit2Procedure.execute(world);
		}
		if (buttonID == 19) {

			SetShaftCbit3Procedure.execute(world);
		}
		if (buttonID == 20) {

			SetShaftCbit4Procedure.execute(world);
		}
		if (buttonID == 21) {

			LeftClickSpawnerProcedure.execute();
		}
		if (buttonID == 22) {

			SetShaftBRoom1Procedure.execute(world);
		}
		if (buttonID == 23) {

			SetShaftBRoom2Procedure.execute(world);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(ShaftbuilderGUIButtonMessage.TYPE, ShaftbuilderGUIButtonMessage.STREAM_CODEC, ShaftbuilderGUIButtonMessage::handleData);
	}

}