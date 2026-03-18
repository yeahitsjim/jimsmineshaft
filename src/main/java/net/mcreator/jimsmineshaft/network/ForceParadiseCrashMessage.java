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

import net.mcreator.jimsmineshaft.procedures.ForceParadiseCrashReceivedByClientProcedure;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ForceParadiseCrashMessage(String extradata) implements CustomPacketPayload {
	public static final Type<ForceParadiseCrashMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, "force_paradise_crash"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ForceParadiseCrashMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ForceParadiseCrashMessage message) -> {
		buffer.writeUtf(message.extradata);
	}, (RegistryFriendlyByteBuf buffer) -> new ForceParadiseCrashMessage(buffer.readUtf()));

	@Override
	public Type<ForceParadiseCrashMessage> type() {
		return TYPE;
	}

	public static void handleData(final ForceParadiseCrashMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.CLIENTBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				String inboundString = message.extradata;

				ForceParadiseCrashReceivedByClientProcedure.execute();
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JimsmineshaftMod.addNetworkMessage(ForceParadiseCrashMessage.TYPE, ForceParadiseCrashMessage.STREAM_CODEC, ForceParadiseCrashMessage::handleData);
	}
}