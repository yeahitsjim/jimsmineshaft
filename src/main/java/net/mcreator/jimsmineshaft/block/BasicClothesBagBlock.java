package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BasicClothesBagBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public BasicClothesBagBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SCAFFOLDING).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(1, 0, 4, 15, 7, 11), box(5, 8, 7, 11, 9, 8), box(5, 7, 7, 6, 8, 8), box(10, 7, 7, 11, 8, 8));
			case NORTH -> Shapes.or(box(1, 0, 5, 15, 7, 12), box(5, 8, 8, 11, 9, 9), box(10, 7, 8, 11, 8, 9), box(5, 7, 8, 6, 8, 9));
			case EAST -> Shapes.or(box(4, 0, 1, 11, 7, 15), box(7, 8, 5, 8, 9, 11), box(7, 7, 10, 8, 8, 11), box(7, 7, 5, 8, 8, 6));
			case WEST -> Shapes.or(box(5, 0, 1, 12, 7, 15), box(8, 8, 5, 9, 9, 11), box(8, 7, 5, 9, 8, 6), box(8, 7, 10, 9, 8, 11));
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