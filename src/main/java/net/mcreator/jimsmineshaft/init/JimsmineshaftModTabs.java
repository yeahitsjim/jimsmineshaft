/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JimsmineshaftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> JIMS_MINESHAFT = REGISTRY.register("jims_mineshaft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jimsmineshaft.jims_mineshaft")).icon(() -> new ItemStack(JimsmineshaftModItems.TEST_SYNC_THE_SECOND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_FULL_TYPE_C.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_PLAIN_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B_2.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_WALL_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModItems.WOE_MINESHAFT_BE_UPON_THE_2.get());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_LIGHT_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_C.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_STONE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_GRAVEL.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_SUSPICIOUS_GRAVEL.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_STRIPPED_DARK_OAK_LOG.get().asItem());
				tabData.accept(JimsmineshaftModItems.STRUCTURE_SPAWNER.get());
				tabData.accept(JimsmineshaftModBlocks.MYSTERY_ITEM.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.MYSTERY_RAIL.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_2.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_SHARD.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_SHARD_TRIPLE.get().asItem());
				tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_FOLDED_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.PRESSURE_DRILL_FOLDED_MODEL.get().asItem());
				tabData.accept(JimsmineshaftModItems.HOLE_ENTITY_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH.get().asItem());
				tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_NORTH_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_EAST_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST.get().asItem());
				tabData.accept(JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get());
				tabData.accept(JimsmineshaftModItems.DETONATOR_BLOCK_PUSHED.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST_DYNAMITE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH_DYNAMITE.get().asItem());
				tabData.accept(JimsmineshaftModItems.DYNAMITE_BOX.get());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_1.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_2.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_3.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_4.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_5.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_22.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_23.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_24.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_25.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_26.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_27.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_28.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_29.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_210.get().asItem());
				tabData.accept(JimsmineshaftModItems.THECART_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(JimsmineshaftModItems.TEST_SYNC_THE_SECOND.get());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(JimsmineshaftModBlocks.IRON_SIDING_CORNER.get().asItem());
			tabData.accept(JimsmineshaftModBlocks.ROTTEN_PLANKS.get().asItem());
			tabData.accept(JimsmineshaftModBlocks.ROTTEN_SUPPORT_BEAM.get().asItem());
			tabData.accept(JimsmineshaftModBlocks.IRON_SIDING.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JimsmineshaftModItems.JIMSMINEDIMENSION.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_FOLDED_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.HOLE_ENTITY_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_NORTH_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_EAST_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.THECART_SPAWN_EGG.get());
		}
	}
}