package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RustedIronStairsBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public RustedIronStairsBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(1, 2, 10, 15, 4, 16), box(1, 7, 5, 15, 9, 11), box(1, 12, 0, 15, 14, 6));
			case NORTH -> Shapes.or(box(1, 2, 0, 15, 4, 6), box(1, 7, 5, 15, 9, 11), box(1, 12, 10, 15, 14, 16));
			case EAST -> Shapes.or(box(10, 2, 1, 16, 4, 15), box(5, 7, 1, 11, 9, 15), box(0, 12, 1, 6, 14, 15));
			case WEST -> Shapes.or(box(0, 2, 1, 6, 4, 15), box(5, 7, 1, 11, 9, 15), box(10, 12, 1, 16, 14, 15));
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