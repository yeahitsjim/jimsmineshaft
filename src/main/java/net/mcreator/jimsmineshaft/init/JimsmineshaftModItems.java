/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.jimsmineshaft.item.TestSyncTheSecondItem;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Function;

public class JimsmineshaftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JimsmineshaftMod.MODID);
	public static final DeferredItem<Item> TEST_SYNC_THE_SECOND = register("test_sync_the_second", TestSyncTheSecondItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}