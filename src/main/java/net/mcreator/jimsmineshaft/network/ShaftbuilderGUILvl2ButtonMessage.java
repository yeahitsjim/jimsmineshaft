package net.mcreator.jimsmineshaft.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.procedures.SetShaftE4Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftE3Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftE2Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftE1Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftD6Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftD5Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftD4Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftD3Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftD2Procedure;
import net.mcreator.jimsmineshaft.procedures.SetShaftD1Procedure;
import net.mcreator.jimsmineshaft.procedures.SetRoomE2Procedure;
import net.mcreator.jimsmineshaft.procedures.SetRoomE1Procedure;
import net.mcreator.jimsmineshaft.procedures.SetRoomD4Procedure;
import net.mcreator.jimsmineshaft.procedures.SetRoomD3Procedure;
import net.mcreator.jimsmineshaft.procedures.SetRoomD2Procedure;
import net.mcreator.jimsmineshaft.procedures.SetRoomD1Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitE4Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitE3Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitE2Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitE1Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD72Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD71Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD42Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD41Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD34Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD33Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD32Procedure;
import net.mcreator.jimsmineshaft.procedures.SetBitD31Procedure;
import net.mcreator.jimsmineshaft.procedures.LeftClickSpawnerProcedure;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

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
		if (buttonID == 0) {

			SetShaftD1Procedure.execute(world);
		}
		if (buttonID == 1) {

			SetShaftD2Procedure.execute(world);
		}
		if (buttonID == 2) {

			SetShaftD3Procedure.execute(world);
		}
		if (buttonID == 3) {

			SetRoomD2Procedure.execute(world);
		}
		if (buttonID == 4) {

			SetRoomD3Procedure.execute(world);
		}
		if (buttonID == 5) {

			SetRoomD4Procedure.execute(world);
		}
		if (buttonID == 6) {

			SetBitD31Procedure.execute(world);
		}
		if (buttonID == 7) {

			SetBitD32Procedure.execute(world);
		}
		if (buttonID == 8) {

			SetShaftD4Procedure.execute(world);
		}
		if (buttonID == 9) {

			SetShaftD5Procedure.execute(world);
		}
		if (buttonID == 10) {

			SetShaftD6Procedure.execute(world);
		}
		if (buttonID == 11) {

			SetRoomD1Procedure.execute(world);
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
		if (buttonID == 18) {

			SetShaftE1Procedure.execute(world);
		}
		if (buttonID == 19) {

			SetShaftE2Procedure.execute(world);
		}
		if (buttonID == 20) {

			SetShaftE3Procedure.execute(world);
		}
		if (buttonID == 21) {

			LeftClickSpawnerProcedure.execute();
		}
		if (buttonID == 22) {

			SetShaftE4Procedure.execute(world);
		}
		if (buttonID == 23) {

			SetShaftE4Procedure.execute(world);
		}
		if (buttonID == 24) {

			SetRoomE1Procedure.execute(world);
		}
		if (buttonID == 25) {

			SetRoomE2Procedure.execute(world);
		}
		if (buttonID == 26) {

			SetBitE1Procedure.execute(world);
		}
		if (buttonID == 27) {

			SetBitE2Procedure.execute(world);
		}
		if (buttonID == 28) {

			SetBitE3Procedure.execute(world);
		}
		if (buttonID == 29) {

			SetBitE4Procedure.execute(world);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(ShaftbuilderGUILvl2ButtonMessage.TYPE, ShaftbuilderGUILvl2ButtonMessage.STREAM_CODEC, ShaftbuilderGUILvl2ButtonMessage::handleData);
	}
}