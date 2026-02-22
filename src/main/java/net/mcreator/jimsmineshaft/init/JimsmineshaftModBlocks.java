/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.jimsmineshaft.block.WoodenWallTypeBBlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportTypeBBlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportTypeABlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportTopTypeABlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportTopLightTypeABlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportPlainTypeBBlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportFullTypeCBlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportCornerTypeBBlock;
import net.mcreator.jimsmineshaft.block.WoodenSupportCornerTypeB2Block;
import net.mcreator.jimsmineshaft.block.WoodenShelfBlock;
import net.mcreator.jimsmineshaft.block.WoodenShaftLiningBlock;
import net.mcreator.jimsmineshaft.block.WoodenRoofTypeCBlock;
import net.mcreator.jimsmineshaft.block.WoodenRoofTypeBBlock;
import net.mcreator.jimsmineshaft.block.WoodenRoofTypeABlock;
import net.mcreator.jimsmineshaft.block.WoodPileBlock;
import net.mcreator.jimsmineshaft.block.WallSupportedWoodenShelfBlock;
import net.mcreator.jimsmineshaft.block.TiltedCorruptedSupportBeamBlock;
import net.mcreator.jimsmineshaft.block.StrippedRottenSupportBeamBlock;
import net.mcreator.jimsmineshaft.block.SteelShelfBlock;
import net.mcreator.jimsmineshaft.block.StackableSteelShelfBlock;
import net.mcreator.jimsmineshaft.block.RustedMinecartBlock;
import net.mcreator.jimsmineshaft.block.RustedIronSupportBlock;
import net.mcreator.jimsmineshaft.block.RottenSupportBeamBlock;
import net.mcreator.jimsmineshaft.block.RottenPlanksBlock;
import net.mcreator.jimsmineshaft.block.RottenPlankStairsBlock;
import net.mcreator.jimsmineshaft.block.RottenPlankSlabBlock;
import net.mcreator.jimsmineshaft.block.RottenCabinetBlock;
import net.mcreator.jimsmineshaft.block.OldCabinetBlock;
import net.mcreator.jimsmineshaft.block.LongWoodenShelfBlock;
import net.mcreator.jimsmineshaft.block.JimsminedimensionPortalBlock;
import net.mcreator.jimsmineshaft.block.IronSupportBlock;
import net.mcreator.jimsmineshaft.block.IronSidingCornerBlock;
import net.mcreator.jimsmineshaft.block.IronSidingBlock;
import net.mcreator.jimsmineshaft.block.FencedCorruptedSupportBeamBlock;
import net.mcreator.jimsmineshaft.block.CorruptedSupportBeamBlock;
import net.mcreator.jimsmineshaft.block.CorruptedSupportBarBlock;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Function;

public class JimsmineshaftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(JimsmineshaftMod.MODID);
	public static final DeferredBlock<Block> IRON_SIDING_CORNER = register("iron_siding_corner", IronSidingCornerBlock::new);
	public static final DeferredBlock<Block> ROTTEN_PLANKS = register("rotten_planks", RottenPlanksBlock::new);
	public static final DeferredBlock<Block> ROTTEN_SUPPORT_BEAM = register("rotten_support_beam", RottenSupportBeamBlock::new);
	public static final DeferredBlock<Block> IRON_SIDING = register("iron_siding", IronSidingBlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_CORNER_TYPE_B = register("wooden_support_corner_type_b", WoodenSupportCornerTypeBBlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_FULL_TYPE_C = register("wooden_support_full_type_c", WoodenSupportFullTypeCBlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_TOP_TYPE_A = register("wooden_support_top_type_a", WoodenSupportTopTypeABlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_PLAIN_TYPE_B = register("wooden_support_plain_type_b", WoodenSupportPlainTypeBBlock::new);
	public static final DeferredBlock<Block> JIMSMINEDIMENSION_PORTAL = register("jimsminedimension_portal", JimsminedimensionPortalBlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_CORNER_TYPE_B_2 = register("wooden_support_corner_type_b_2", WoodenSupportCornerTypeB2Block::new);
	public static final DeferredBlock<Block> WOODEN_WALL_TYPE_B = register("wooden_wall_type_b", WoodenWallTypeBBlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_TYPE_A = register("wooden_support_type_a", WoodenSupportTypeABlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_TOP_LIGHT_TYPE_A = register("wooden_support_top_light_type_a", WoodenSupportTopLightTypeABlock::new);
	public static final DeferredBlock<Block> WOODEN_SUPPORT_TYPE_B = register("wooden_support_type_b", WoodenSupportTypeBBlock::new);
	public static final DeferredBlock<Block> WOODEN_ROOF_TYPE_A = register("wooden_roof_type_a", WoodenRoofTypeABlock::new);
	public static final DeferredBlock<Block> WOODEN_ROOF_TYPE_C = register("wooden_roof_type_c", WoodenRoofTypeCBlock::new);
	public static final DeferredBlock<Block> WOODEN_ROOF_TYPE_B = register("wooden_roof_type_b", WoodenRoofTypeBBlock::new);
	public static final DeferredBlock<Block> STRIPPED_ROTTEN_SUPPORT_BEAM = register("stripped_rotten_support_beam", StrippedRottenSupportBeamBlock::new);
	public static final DeferredBlock<Block> CORRUPTED_SUPPORT_BEAM = register("corrupted_support_beam", CorruptedSupportBeamBlock::new);
	public static final DeferredBlock<Block> TILTED_CORRUPTED_SUPPORT_BEAM = register("tilted_corrupted_support_beam", TiltedCorruptedSupportBeamBlock::new);
	public static final DeferredBlock<Block> STEEL_SHELF = register("steel_shelf", SteelShelfBlock::new);
	public static final DeferredBlock<Block> OLD_CABINET = register("old_cabinet", OldCabinetBlock::new);
	public static final DeferredBlock<Block> ROTTEN_CABINET = register("rotten_cabinet", RottenCabinetBlock::new);
	public static final DeferredBlock<Block> WOOD_PILE = register("wood_pile", WoodPileBlock::new);
	public static final DeferredBlock<Block> RUSTED_MINECART = register("rusted_minecart", RustedMinecartBlock::new);
	public static final DeferredBlock<Block> STACKABLE_STEEL_SHELF = register("stackable_steel_shelf", StackableSteelShelfBlock::new);
	public static final DeferredBlock<Block> WALL_SUPPORTED_WOODEN_SHELF = register("wall_supported_wooden_shelf", WallSupportedWoodenShelfBlock::new);
	public static final DeferredBlock<Block> WOODEN_SHAFT_LINING = register("wooden_shaft_lining", WoodenShaftLiningBlock::new);
	public static final DeferredBlock<Block> WOODEN_SHELF = register("wooden_shelf", WoodenShelfBlock::new);
	public static final DeferredBlock<Block> LONG_WOODEN_SHELF = register("long_wooden_shelf", LongWoodenShelfBlock::new);
	public static final DeferredBlock<Block> FENCED_CORRUPTED_SUPPORT_BEAM = register("fenced_corrupted_support_beam", FencedCorruptedSupportBeamBlock::new);
	public static final DeferredBlock<Block> CORRUPTED_SUPPORT_BAR = register("corrupted_support_bar", CorruptedSupportBarBlock::new);
	public static final DeferredBlock<Block> ROTTEN_PLANK_SLAB = register("rotten_plank_slab", RottenPlankSlabBlock::new);
	public static final DeferredBlock<Block> ROTTEN_PLANK_STAIRS = register("rotten_plank_stairs", RottenPlankStairsBlock::new);
	public static final DeferredBlock<Block> IRON_SUPPORT = register("iron_support", IronSupportBlock::new);
	public static final DeferredBlock<Block> RUSTED_IRON_SUPPORT = register("rusted_iron_support", RustedIronSupportBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}