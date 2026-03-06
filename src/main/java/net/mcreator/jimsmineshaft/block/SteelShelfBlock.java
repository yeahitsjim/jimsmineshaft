package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SteelShelfBlock extends Block {
	public SteelShelfBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(0, 0, 0, 16, 18, 16);
	}
}