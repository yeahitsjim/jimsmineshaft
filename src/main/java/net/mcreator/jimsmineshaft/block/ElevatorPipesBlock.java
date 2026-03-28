package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ElevatorPipesBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public ElevatorPipesBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0, -16, 0, 5, 32, 5), box(0, -14, 5, 5, -12, 6), box(5, -14, 0, 6, -12, 6), box(12, -16, 0, 14, 32, 2), box(0, -16, 7, 2, 32, 9), box(9, -16, 0, 11, 32, 2), box(7, -16, 0, 8, 32, 1), box(0, -16, 13, 1, 32, 14));
			case NORTH -> Shapes.or(box(11, -16, 11, 16, 32, 16), box(11, -14, 10, 16, -12, 11), box(10, -14, 10, 11, -12, 16), box(2, -16, 14, 4, 32, 16), box(14, -16, 7, 16, 32, 9), box(5, -16, 14, 7, 32, 16), box(8, -16, 15, 9, 32, 16),
					box(15, -16, 2, 16, 32, 3));
			case EAST ->
				Shapes.or(box(0, -16, 11, 5, 32, 16), box(5, -14, 11, 6, -12, 16), box(0, -14, 10, 6, -12, 11), box(0, -16, 2, 2, 32, 4), box(7, -16, 14, 9, 32, 16), box(0, -16, 5, 2, 32, 7), box(0, -16, 8, 1, 32, 9), box(13, -16, 15, 14, 32, 16));
			case WEST -> Shapes.or(box(11, -16, 0, 16, 32, 5), box(10, -14, 0, 11, -12, 5), box(10, -14, 5, 16, -12, 6), box(14, -16, 12, 16, 32, 14), box(7, -16, 0, 9, 32, 2), box(14, -16, 9, 16, 32, 11), box(15, -16, 7, 16, 32, 8),
					box(2, -16, 0, 3, 32, 1));
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