/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.jimsmineshaft.world.inventory.StoreGUIMenu;
import net.mcreator.jimsmineshaft.world.inventory.ShaftbuilderGUIMenu;
import net.mcreator.jimsmineshaft.world.inventory.ShaftbuilderGUILvl3Menu;
import net.mcreator.jimsmineshaft.world.inventory.ShaftbuilderGUILvl2Menu;
import net.mcreator.jimsmineshaft.world.inventory.CartGUIMenu;
import net.mcreator.jimsmineshaft.network.MenuStateUpdateMessage;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.Map;

public class JimsmineshaftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, JimsmineshaftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CartGUIMenu>> CART_GUI = REGISTRY.register("cart_gui", () -> IMenuTypeExtension.create(CartGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ShaftbuilderGUIMenu>> SHAFTBUILDER_GUI = REGISTRY.register("shaftbuilder_gui", () -> IMenuTypeExtension.create(ShaftbuilderGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<StoreGUIMenu>> STORE_GUI = REGISTRY.register("store_gui", () -> IMenuTypeExtension.create(StoreGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ShaftbuilderGUILvl2Menu>> SHAFTBUILDER_GUI_LVL_2 = REGISTRY.register("shaftbuilder_gui_lvl_2", () -> IMenuTypeExtension.create(ShaftbuilderGUILvl2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ShaftbuilderGUILvl3Menu>> SHAFTBUILDER_GUI_LVL_3 = REGISTRY.register("shaftbuilder_gui_lvl_3", () -> IMenuTypeExtension.create(ShaftbuilderGUILvl3Menu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof JimsmineshaftModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}