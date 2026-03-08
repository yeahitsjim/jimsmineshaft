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
				tabData.accept(JimsmineshaftModBlocks.ROTTEN_PLANK_STAIRS.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.ROTTEN_PLANK_SLAB.get().asItem());
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
				tabData.accept(JimsmineshaftModBlocks.WOODEN_SHELF.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.LONG_WOODEN_SHELF.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.FENCED_CORRUPTED_SUPPORT_BEAM.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.CORRUPTED_SUPPORT_BAR.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.IRON_SUPPORT.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RUSTED_IRON_SUPPORT.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.CANARY_CAGE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.CANDLE_HOLDER.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.CANTEEN.get().asItem());
				tabData.accept(JimsmineshaftModItems.FIRE_AXE.get());
				tabData.accept(JimsmineshaftModItems.OLD_KNIFE.get());
				tabData.accept(JimsmineshaftModItems.RUSTY_PICKAXE.get());
				tabData.accept(JimsmineshaftModItems.SMALL_PICKAXE.get());
				tabData.accept(JimsmineshaftModItems.TOMMY_GUN.get());
				tabData.accept(JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A.get().asItem());
				tabData.accept(JimsmineshaftModItems.THECART_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST_DYNAMITE.get().asItem());
				tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.IRON_BULLET.get());
				tabData.accept(JimsmineshaftModItems.FLINTLOCK_PISTOL.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_2.get().asItem());
				tabData.accept(JimsmineshaftModItems.STALKER_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.NEW_STRIPPED_DARK_OAK_LOG.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_SHARD.get().asItem());
				tabData.accept(JimsmineshaftModItems.STRUCTURE_SPAWNER.get());
				tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_FOLDED_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_EAST_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.COPPER_SHARD_TRIPLE.get().asItem());
				tabData.accept(JimsmineshaftModItems.BATTERY.get());
				tabData.accept(JimsmineshaftModBlocks.MYSTERY_ITEM.get().asItem());
				tabData.accept(JimsmineshaftModItems.HOLE_ENTITY_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.CART_RAIL.get().asItem());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.DETONATOR_BLOCK_PUSHED.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_BOUNDING_BOX_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.ELEVATOR_FRONT.get().asItem());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_5_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_6_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_3_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.FLASHLIGHT.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_4_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_7_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_8_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_5.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_1.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_2.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_3.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.COPPER_FRAGMENT_4.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.MYSTERY_RAIL.get().asItem());
				tabData.accept(JimsmineshaftModItems.CART_4_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_210.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get().asItem());
				tabData.accept(JimsmineshaftModItems.CART_3_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.CART_2_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_1_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_2_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_29.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_28.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_27.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_26.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_25.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_24.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_23.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_SUSPICIOUS_GRAVEL.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH_DYNAMITE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_STONE.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.PRESSURE_DRILL_FOLDED_MODEL.get().asItem());
				tabData.accept(JimsmineshaftModItems.DYNAMITE_BOX.get());
				tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_NORTH_SPAWN_EGG.get());
				tabData.accept(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH.get().asItem());
				tabData.accept(JimsmineshaftModBlocks.NEW_GRAVEL.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(JimsmineshaftModItems.TEST_SYNC_THE_SECOND.get());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JimsmineshaftModItems.JIMSMINEDIMENSION.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(JimsmineshaftModItems.THECART_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.PRESSURE_DRILL_FOLDED_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.BIG_IRON_GATE_FRAME_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_EAST_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.HOLE_ENTITY_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_BOUNDING_BOX_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_5_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_6_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_3_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_4_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_7_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.BIG_IRON_GATE_LEFT_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_8_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.CART_4_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.CART_3_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.CART_2_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.RIGHTGATE_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_1_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.ELEVATOR_SEAT_2_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.LEFTGATE_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.BIG_IRON_GATE_RIGHT_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.BIG_GATE_SPAWN_EGG.get());
			tabData.accept(JimsmineshaftModItems.COPPER_DRILLED_NORTH_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(JimsmineshaftModItems.MINING_GOON_SET_HELMET.get());
			tabData.accept(JimsmineshaftModItems.MINING_GOON_SET_CHESTPLATE.get());
			tabData.accept(JimsmineshaftModItems.MINING_GOON_SET_LEGGINGS.get());
			tabData.accept(JimsmineshaftModItems.MINING_GOON_SET_BOOTS.get());
		}
	}
}