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

import net.mcreator.jimsmineshaft.procedures.CartGUIWhileThisGUIIsOpenTickProcedure;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record CartGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {

	public static final Type<CartGUISlotMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "cart_gui_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CartGUISlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CartGUISlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new CartGUISlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<CartGUISlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final CartGUISlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleSlotAction(context.player(), message.slotID, message.changeType, message.meta, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 1 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 2 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 3 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 4 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 5 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 6 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 7 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 8 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 9 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 10 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 11 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 12 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 13 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 14 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 15 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 16 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 17 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 18 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 19 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 20 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 21 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 22 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 23 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 24 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 25 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 26 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 27 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 28 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 29 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 30 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 31 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 32 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 33 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 34 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 35 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 36 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 37 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 38 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 39 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 40 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 41 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 42 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 43 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 44 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 45 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 46 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 47 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 48 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 49 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 50 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 51 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 52 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 53 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 54 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 55 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 56 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 57 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 58 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 59 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 60 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 61 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 62 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 63 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 64 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 65 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 66 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 67 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 68 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 69 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 70 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 71 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 72 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 73 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 74 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 75 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 76 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 77 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 78 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 79 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 80 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 81 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 82 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 83 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 84 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 85 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 86 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 87 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 88 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 89 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 90 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 91 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 92 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 93 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 94 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 95 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 96 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 97 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 98 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 99 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 100 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 101 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 102 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 103 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 104 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 105 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 106 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 107 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 108 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 109 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 110 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 111 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 112 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
		if (slot == 113 && changeType == 0) {

			CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(CartGUISlotMessage.TYPE, CartGUISlotMessage.STREAM_CODEC, CartGUISlotMessage::handleData);
	}
}