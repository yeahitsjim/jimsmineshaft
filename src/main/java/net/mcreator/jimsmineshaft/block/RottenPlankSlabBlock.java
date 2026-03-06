package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RottenPlankSlabBlock extends SlabBlock {
	public RottenPlankSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(2f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}
}