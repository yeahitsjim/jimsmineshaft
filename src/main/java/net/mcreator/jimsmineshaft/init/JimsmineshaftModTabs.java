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
				tabData.accept(JimsmineshaftModItems.WOE_MINESHAFT_BE_UPON_THE_2.get());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_LIGHT_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_PLAIN_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B_2.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_WALL_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SUPPORT_FULL_TYPE_C.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_C.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.IRON_SIDING.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.IRON_SIDING_CORNER.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.ROTTEN_PLANKS.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.ROTTEN_SUPPORT_BEAM.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.STRIPPED_ROTTEN_SUPPORT_BEAM.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.CORRUPTED_SUPPORT_BEAM.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.TILTED_CORRUPTED_SUPPORT_BEAM.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.STEEL_SHELF.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.OLD_CABINET.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.ROTTEN_CABINET.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOOD_PILE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RUSTED_MINECART.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.STACKABLE_STEEL_SHELF.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SHAFT_LINING.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(JimsmineshaftModItems.TEST_SYNC_THE_SECOND.get());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JimsmineshaftModItems.JIMSMINEDIMENSION.get());
		}
	}
}