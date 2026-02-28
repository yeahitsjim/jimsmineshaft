/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jimsmineshaft.client.gui.ShaftbuilderGUIScreen;
import net.mcreator.jimsmineshaft.client.gui.CartGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JimsmineshaftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(JimsmineshaftModMenus.CART_GUI.get(), CartGUIScreen::new);
		event.register(JimsmineshaftModMenus.SHAFTBUILDER_GUI.get(), ShaftbuilderGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}