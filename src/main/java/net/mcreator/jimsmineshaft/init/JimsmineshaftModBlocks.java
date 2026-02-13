/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.jimsmineshaft.block.RottenSupportBeamBlock;
import net.mcreator.jimsmineshaft.block.RottenPlanksBlock;
import net.mcreator.jimsmineshaft.block.IronSidingCornerBlock;
import net.mcreator.jimsmineshaft.block.IronSidingBlock;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Function;

public class JimsmineshaftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(JimsmineshaftMod.MODID);
	public static final DeferredBlock<Block> IRON_SIDING = register("iron_siding", IronSidingBlock::new);
	public static final DeferredBlock<Block> IRON_SIDING_CORNER = register("iron_siding_corner", IronSidingCornerBlock::new);
	public static final DeferredBlock<Block> ROTTEN_PLANKS = register("rotten_planks", RottenPlanksBlock::new);
	public static final DeferredBlock<Block> ROTTEN_SUPPORT_BEAM = register("rotten_support_beam", RottenSupportBeamBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}