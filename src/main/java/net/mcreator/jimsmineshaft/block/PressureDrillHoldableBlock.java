package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PressureDrillHoldableBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public PressureDrillHoldableBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0, 16, 7, 17, 18, 9), box(8, 14, 5, 17, 16, 11), box(4, 14, 7, 8, 16, 9), box(0, 14, 4, 4, 16, 12), box(0, 17, 9, 17, 18, 10), box(0, 17, 6, 17, 18, 7), box(2, 18, 7, 20, 20, 9), box(5, 20, 7, 13, 21, 9),
					box(22, 18, 7.5, 32, 19, 8.5), box(20, 18, 7, 24, 19, 9), box(24, 18, 7, 26, 20, 9), box(10, -6, 7, 12, 14, 9), box(1.54787, -6.79251, 7.2, 3.54787, 14.20749, 9.2), box(1.54787, -6.79251, 6.2, 3.54787, 14.20749, 8.2));
			case NORTH ->
				Shapes.or(box(-1, 16, 7, 16, 18, 9), box(-1, 14, 5, 8, 16, 11), box(8, 14, 7, 12, 16, 9), box(12, 14, 4, 16, 16, 12), box(-1, 17, 6, 16, 18, 7), box(-1, 17, 9, 16, 18, 10), box(-4, 18, 7, 14, 20, 9), box(3, 20, 7, 11, 21, 9),
						box(-16, 18, 7.5, -6, 19, 8.5), box(-8, 18, 7, -4, 19, 9), box(-10, 18, 7, -8, 20, 9), box(4, -6, 7, 6, 14, 9), box(12.45213, -6.79251, 6.8, 14.45213, 14.20749, 8.8), box(12.45213, -6.79251, 7.8, 14.45213, 14.20749, 9.8));
			case EAST -> Shapes.or(box(7, 16, -1, 9, 18, 16), box(5, 14, -1, 11, 16, 8), box(7, 14, 8, 9, 16, 12), box(4, 14, 12, 12, 16, 16), box(9, 17, -1, 10, 18, 16), box(6, 17, -1, 7, 18, 16), box(7, 18, -4, 9, 20, 14), box(7, 20, 3, 9, 21, 11),
					box(7.5, 18, -16, 8.5, 19, -6), box(7, 18, -8, 9, 19, -4), box(7, 18, -10, 9, 20, -8), box(7, -6, 4, 9, 14, 6), box(7.2, -6.79251, 12.45213, 9.2, 14.20749, 14.45213), box(6.2, -6.79251, 12.45213, 8.2, 14.20749, 14.45213));
			case WEST -> Shapes.or(box(7, 16, 0, 9, 18, 17), box(5, 14, 8, 11, 16, 17), box(7, 14, 4, 9, 16, 8), box(4, 14, 0, 12, 16, 4), box(6, 17, 0, 7, 18, 17), box(9, 17, 0, 10, 18, 17), box(7, 18, 2, 9, 20, 20), box(7, 20, 5, 9, 21, 13),
					box(7.5, 18, 22, 8.5, 19, 32), box(7, 18, 20, 9, 19, 24), box(7, 18, 24, 9, 20, 26), box(7, -6, 10, 9, 14, 12), box(6.8, -6.79251, 1.54787, 8.8, 14.20749, 3.54787), box(7.8, -6.79251, 1.54787, 9.8, 14.20749, 3.54787));
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

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return PressureDrillHoldableBlockValidPlacementConditionProcedure.execute();
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess scheduledTickAccess, BlockPos currentPos, Direction facing, BlockPos facingPos, BlockState facingState, RandomSource random) {
		return !state.canSurvive(world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, world, scheduledTickAccess, currentPos, facing, facingPos, facingState, random);
	}
}