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

import net.mcreator.jimsmineshaft.procedures.FreezeClientReceivedByClientProcedure;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record FreezeClientMessage(String extradata) implements CustomPacketPayload {
	public static final Type<FreezeClientMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "freeze_client"));
	public static final StreamCodec<RegistryFriendlyByteBuf, FreezeClientMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, FreezeClientMessage message) -> {
		buffer.writeUtf(message.extradata);
	}, (RegistryFriendlyByteBuf buffer) -> new FreezeClientMessage(buffer.readUtf()));

	@Override
	public Type<FreezeClientMessage> type() {
		return TYPE;
	}

	public static void handleData(final FreezeClientMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.CLIENTBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				String inboundString = message.extradata;

				FreezeClientReceivedByClientProcedure.execute();
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(FreezeClientMessage.TYPE, FreezeClientMessage.STREAM_CODEC, FreezeClientMessage::handleData);
	}
}