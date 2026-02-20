/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jimsmineshaft.item.WoeMineshaftBeUponTheItem;
import net.mcreator.jimsmineshaft.item.WoeMineshaftBeUponThe2Item;
import net.mcreator.jimsmineshaft.item.TestSyncTheSecondItem;
import net.mcreator.jimsmineshaft.item.JimsminedimensionItem;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Function;

public class JimsmineshaftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JimsmineshaftMod.MODID);
	public static final DeferredItem<Item> TEST_SYNC_THE_SECOND = register("test_sync_the_second", TestSyncTheSecondItem::new);
	public static final DeferredItem<Item> IRON_SIDING_CORNER = block(JimsmineshaftModBlocks.IRON_SIDING_CORNER);
	public static final DeferredItem<Item> ROTTEN_PLANKS = block(JimsmineshaftModBlocks.ROTTEN_PLANKS);
	public static final DeferredItem<Item> ROTTEN_SUPPORT_BEAM = block(JimsmineshaftModBlocks.ROTTEN_SUPPORT_BEAM);
	public static final DeferredItem<Item> IRON_SIDING = block(JimsmineshaftModBlocks.IRON_SIDING);
	public static final DeferredItem<Item> WOODEN_SUPPORT_CORNER_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B);
	public static final DeferredItem<Item> WOE_MINESHAFT_BE_UPON_THE = register("woe_mineshaft_be_upon_the", WoeMineshaftBeUponTheItem::new);
	public static final DeferredItem<Item> WOODEN_SUPPORT_FULL_TYPE_C = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_FULL_TYPE_C);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TOP_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_TYPE_A);
	public static final DeferredItem<Item> WOODEN_SUPPORT_PLAIN_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_PLAIN_TYPE_B);
	public static final DeferredItem<Item> JIMSMINEDIMENSION = register("jimsminedimension", JimsminedimensionItem::new);
	public static final DeferredItem<Item> WOODEN_SUPPORT_CORNER_TYPE_B_2 = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B_2);
	public static final DeferredItem<Item> WOODEN_WALL_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_WALL_TYPE_B);
	public static final DeferredItem<Item> WOE_MINESHAFT_BE_UPON_THE_2 = register("woe_mineshaft_be_upon_the_2", WoeMineshaftBeUponThe2Item::new);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_A);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TOP_LIGHT_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_LIGHT_TYPE_A);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_B);
	public static final DeferredItem<Item> WOODEN_ROOF_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_A);
	public static final DeferredItem<Item> WOODEN_ROOF_TYPE_C = block(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_C);
	public static final DeferredItem<Item> WOODEN_ROOF_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_B);
	public static final DeferredItem<Item> STRIPPED_ROTTEN_SUPPORT_BEAM = block(JimsmineshaftModBlocks.STRIPPED_ROTTEN_SUPPORT_BEAM);
	public static final DeferredItem<Item> CORRUPTED_SUPPORT_BEAM = block(JimsmineshaftModBlocks.CORRUPTED_SUPPORT_BEAM);
	public static final DeferredItem<Item> TILTED_CORRUPTED_SUPPORT_BEAM = block(JimsmineshaftModBlocks.TILTED_CORRUPTED_SUPPORT_BEAM);
	public static final DeferredItem<Item> STEEL_SHELF = block(JimsmineshaftModBlocks.STEEL_SHELF);
	public static final DeferredItem<Item> OLD_CABINET = block(JimsmineshaftModBlocks.OLD_CABINET);
	public static final DeferredItem<Item> ROTTEN_CABINET = block(JimsmineshaftModBlocks.ROTTEN_CABINET);
	public static final DeferredItem<Item> WOOD_PILE = block(JimsmineshaftModBlocks.WOOD_PILE);
	public static final DeferredItem<Item> RUSTED_MINECART = block(JimsmineshaftModBlocks.RUSTED_MINECART);
	public static final DeferredItem<Item> STACKABLE_STEEL_SHELF = block(JimsmineshaftModBlocks.STACKABLE_STEEL_SHELF);
	public static final DeferredItem<Item> WALL_SUPPORTED_WOODEN_SHELF = block(JimsmineshaftModBlocks.WALL_SUPPORTED_WOODEN_SHELF);
	public static final DeferredItem<Item> WOODEN_SHAFT_LINING = block(JimsmineshaftModBlocks.WOODEN_SHAFT_LINING);
	public static final DeferredItem<Item> WOODEN_SHELF = block(JimsmineshaftModBlocks.WOODEN_SHELF);
	public static final DeferredItem<Item> LONG_WOODEN_SHELF = block(JimsmineshaftModBlocks.LONG_WOODEN_SHELF);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}