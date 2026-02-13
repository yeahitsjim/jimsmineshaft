package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WoodenSupportCornerTypeB2Block extends Block implements SimpleWaterloggedBlock {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public WoodenSupportCornerTypeB2Block(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return state.getFluidState().isEmpty();
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
			default -> Shapes.or(box(6, 0, 6, 10, 16, 10), box(7, 1, 0, 9, 5, 6), box(7, 6, 0, 9, 10, 6), box(7, 11, 0, 9, 15, 6), box(0, 11, 7, 6, 15, 9), box(0, 6, 7, 6, 10, 9), box(0, 1, 7, 6, 5, 9));
			case NORTH -> Shapes.or(box(6, 0, 6, 10, 16, 10), box(7, 1, 10, 9, 5, 16), box(7, 6, 10, 9, 10, 16), box(7, 11, 10, 9, 15, 16), box(10, 11, 7, 16, 15, 9), box(10, 6, 7, 16, 10, 9), box(10, 1, 7, 16, 5, 9));
			case EAST -> Shapes.or(box(6, 0, 6, 10, 16, 10), box(0, 1, 7, 6, 5, 9), box(0, 6, 7, 6, 10, 9), box(0, 11, 7, 6, 15, 9), box(7, 11, 10, 9, 15, 16), box(7, 6, 10, 9, 10, 16), box(7, 1, 10, 9, 5, 16));
			case WEST -> Shapes.or(box(6, 0, 6, 10, 16, 10), box(10, 1, 7, 16, 5, 9), box(10, 6, 7, 16, 10, 9), box(10, 11, 7, 16, 15, 9), box(7, 11, 0, 9, 15, 6), box(7, 6, 0, 9, 10, 6), box(7, 1, 0, 9, 5, 6));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess scheduledTickAccess, BlockPos currentPos, Direction facing, BlockPos facingPos, BlockState facingState, RandomSource random) {
		if (state.getValue(WATERLOGGED)) {
			scheduledTickAccess.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, world, scheduledTickAccess, currentPos, facing, facingPos, facingState, random);
	}
}