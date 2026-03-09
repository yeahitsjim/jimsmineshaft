package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RustedIronRailingCornerBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public RustedIronRailingCornerBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(1.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 13, 0.125, 15, 14.25, 1.375), box(2.25, 0, 0, 3.75, 16, 1.5), box(14.5, 0, 0, 16, 16, 1.5), box(0, 8, 0.125, 15, 9.25, 1.375), box(14.5, 0, 12.35, 16, 16, 13.85), box(14.5, 0, 12.35, 16, 16, 13.85),
					box(14.625, 8, 1.11, 15.875, 9.25, 16.11), box(14.625, 13, 1.1, 15.875, 14.25, 16.1));
			case NORTH -> Shapes.or(box(1, 13, 14.625, 16, 14.25, 15.875), box(12.25, 0, 14.5, 13.75, 16, 16), box(0, 0, 14.5, 1.5, 16, 16), box(1, 8, 14.625, 16, 9.25, 15.875), box(0, 0, 2.15, 1.5, 16, 3.65), box(0, 0, 2.15, 1.5, 16, 3.65),
					box(0.125, 8, -0.11, 1.375, 9.25, 14.89), box(0.125, 13, -0.1, 1.375, 14.25, 14.9));
			case EAST -> Shapes.or(box(0.125, 13, 1, 1.375, 14.25, 16), box(0, 0, 12.25, 1.5, 16, 13.75), box(0, 0, 0, 1.5, 16, 1.5), box(0.125, 8, 1, 1.375, 9.25, 16), box(12.35, 0, 0, 13.85, 16, 1.5), box(12.35, 0, 0, 13.85, 16, 1.5),
					box(1.11, 8, 0.125, 16.11, 9.25, 1.375), box(1.1, 13, 0.125, 16.1, 14.25, 1.375));
			case WEST -> Shapes.or(box(14.625, 13, 0, 15.875, 14.25, 15), box(14.5, 0, 2.25, 16, 16, 3.75), box(14.5, 0, 14.5, 16, 16, 16), box(14.625, 8, 0, 15.875, 9.25, 15), box(2.15, 0, 14.5, 3.65, 16, 16), box(2.15, 0, 14.5, 3.65, 16, 16),
					box(-0.11, 8, 14.625, 14.89, 9.25, 15.875), box(-0.1, 13, 14.625, 14.9, 14.25, 15.875));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}