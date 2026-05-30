/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jimsmineshaft.client.gui.StoreGUIScreen;
import net.mcreator.jimsmineshaft.client.gui.ShaftbuilderGUIScreen;
import net.mcreator.jimsmineshaft.client.gui.ShaftbuilderGUILvl3Screen;
import net.mcreator.jimsmineshaft.client.gui.ShaftbuilderGUILvl2Screen;
import net.mcreator.jimsmineshaft.client.gui.CartGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JimsmineshaftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(JimsmineshaftModMenus.CART_GUI.get(), CartGUIScreen::new);
		event.register(JimsmineshaftModMenus.SHAFTBUILDER_GUI.get(), ShaftbuilderGUIScreen::new);
		event.register(JimsmineshaftModMenus.STORE_GUI.get(), StoreGUIScreen::new);
		event.register(JimsmineshaftModMenus.SHAFTBUILDER_GUI_LVL_3.get(), ShaftbuilderGUILvl3Screen::new);
		event.register(JimsmineshaftModMenus.SHAFTBUILDER_GUI_LVL_2.get(), ShaftbuilderGUILvl2Screen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}