/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jimsmineshaft.item.WoemineshaftfullmemefortotemItem;
import net.mcreator.jimsmineshaft.item.WoeMineshaftBeUponTheItem;
import net.mcreator.jimsmineshaft.item.WoeMineshaftBeUponThe2Item;
import net.mcreator.jimsmineshaft.item.TestSyncTheSecondItem;
import net.mcreator.jimsmineshaft.item.StructureSpawnerItem;
import net.mcreator.jimsmineshaft.item.JimsminedimensionItem;
import net.mcreator.jimsmineshaft.item.DynamiteBoxItem;
import net.mcreator.jimsmineshaft.item.DetonatorBlockPushedItem;
import net.mcreator.jimsmineshaft.item.DetonatorBlockItemItem;
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
	public static final DeferredItem<Item> WOEMINESHAFTFULLMEMEFORTOTEM = register("woemineshaftfullmemefortotem", WoemineshaftfullmemefortotemItem::new);
	public static final DeferredItem<Item> NEW_STONE = block(JimsmineshaftModBlocks.NEW_STONE);
	public static final DeferredItem<Item> NEW_GRAVEL = block(JimsmineshaftModBlocks.NEW_GRAVEL);
	public static final DeferredItem<Item> NEW_SUSPICIOUS_GRAVEL = block(JimsmineshaftModBlocks.NEW_SUSPICIOUS_GRAVEL);
	public static final DeferredItem<Item> NEW_STRIPPED_DARK_OAK_LOG = block(JimsmineshaftModBlocks.NEW_STRIPPED_DARK_OAK_LOG);
	public static final DeferredItem<Item> STRUCTURE_SPAWNER = register("structure_spawner", StructureSpawnerItem::new);
	public static final DeferredItem<Item> MYSTERY_ITEM = block(JimsmineshaftModBlocks.MYSTERY_ITEM);
	public static final DeferredItem<Item> MYSTERY_RAIL = block(JimsmineshaftModBlocks.MYSTERY_RAIL);
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_A = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_B = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_C = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_D = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_E = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_2 = block(JimsmineshaftModBlocks.RAW_COPPER_2, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_SHARD = block(JimsmineshaftModBlocks.COPPER_SHARD, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_SHARD_DOUBLE = block(JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_SHARD_TRIPLE = block(JimsmineshaftModBlocks.COPPER_SHARD_TRIPLE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> PRESSURE_DRILL_SPAWN_EGG = register("pressure_drill_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.PRESSURE_DRILL.get(), properties));
	public static final DeferredItem<Item> PRESSURE_DRILL_FOLDED_SPAWN_EGG = register("pressure_drill_folded_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.PRESSURE_DRILL_FOLDED.get(), properties));
	public static final DeferredItem<Item> PRESSURE_DRILL_FOLDED_MODEL = block(JimsmineshaftModBlocks.PRESSURE_DRILL_FOLDED_MODEL);
	public static final DeferredItem<Item> HOLE_ENTITY_SPAWN_EGG = register("hole_entity_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.HOLE_ENTITY.get(), properties));
	public static final DeferredItem<Item> PRESSURE_DRILL_HOLDABLE = block(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_NORTH = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_DRILLED_NORTH_SPAWN_EGG = register("copper_drilled_north_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.COPPER_DRILLED_NORTH.get(), properties));
	public static final DeferredItem<Item> COPPER_DRILLED_EAST_SPAWN_EGG = register("copper_drilled_east_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.COPPER_DRILLED_EAST.get(), properties));
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_EAST = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> DETONATOR_BLOCK_ITEM = register("detonator_block_item", DetonatorBlockItemItem::new);
	public static final DeferredItem<Item> DETONATOR_BLOCK_PUSHED = register("detonator_block_pushed", DetonatorBlockPushedItem::new);
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_EAST_DYNAMITE = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST_DYNAMITE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_NORTH_DYNAMITE = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH_DYNAMITE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> DYNAMITE_BOX = register("dynamite_box", DynamiteBoxItem::new);
	public static final DeferredItem<Item> COPPER_FRAGMENT_1 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_1, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_2 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_2, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_3 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_3, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_4 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_4, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_5 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_5, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_22 = block(JimsmineshaftModBlocks.RAW_COPPER_22, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_23 = block(JimsmineshaftModBlocks.RAW_COPPER_23, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_24 = block(JimsmineshaftModBlocks.RAW_COPPER_24, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_25 = block(JimsmineshaftModBlocks.RAW_COPPER_25, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_26 = block(JimsmineshaftModBlocks.RAW_COPPER_26, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_27 = block(JimsmineshaftModBlocks.RAW_COPPER_27, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_28 = block(JimsmineshaftModBlocks.RAW_COPPER_28, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_29 = block(JimsmineshaftModBlocks.RAW_COPPER_29, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_210 = block(JimsmineshaftModBlocks.RAW_COPPER_210, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> THECART_SPAWN_EGG = register("thecart_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.THECART.get(), properties));

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