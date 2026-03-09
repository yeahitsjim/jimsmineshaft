package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RustedIronCatwalkSupportedBlock extends Block {
	public RustedIronCatwalkSupportedBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(3f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 0, 0, 3, 11, 3), box(13, 0, 0, 16, 11, 3), box(13, 0, 13, 16, 11, 16), box(0, 0, 13, 3, 11, 16));
	}
}