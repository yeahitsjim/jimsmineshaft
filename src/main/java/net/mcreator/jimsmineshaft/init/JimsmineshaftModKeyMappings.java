/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.jimsmineshaft.network.ShiftKeyMessage;
import net.mcreator.jimsmineshaft.network.PlaceDrillMessage;
import net.mcreator.jimsmineshaft.network.OpenSpawnerGUIMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JimsmineshaftModKeyMappings {
	public static final KeyMapping OPEN_SPAWNER_GUI = new KeyMapping("key.jimsmineshaft.open_spawner_gui", GLFW.GLFW_KEY_F, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new OpenSpawnerGUIMessage(0, 0));
				OpenSpawnerGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SHIFT_KEY = new KeyMapping("key.jimsmineshaft.shift_key", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ShiftKeyMessage(0, 0));
				ShiftKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PLACE_DRILL = new KeyMapping("key.jimsmineshaft.place_drill", GLFW.GLFW_KEY_P, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new PlaceDrillMessage(0, 0));
				PlaceDrillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPEN_SPAWNER_GUI);
		event.register(SHIFT_KEY);
		event.register(PLACE_DRILL);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				OPEN_SPAWNER_GUI.consumeClick();
				SHIFT_KEY.consumeClick();
				PLACE_DRILL.consumeClick();
			}
		}
	}
}