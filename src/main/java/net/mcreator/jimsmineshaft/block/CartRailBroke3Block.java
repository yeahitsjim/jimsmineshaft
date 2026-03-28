package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CartRailBroke3Block extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public CartRailBroke3Block(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(4, 0, 3, 12, 1, 5), box(12, 0, 0, 14, 2, 16), box(2, 0, 0, 4, 2, 16), box(1, 0.1, 1, 15, 1.1, 3), box(4, 0, 9, 12, 1, 11), box(1, 0.1, 13, 15, 1.1, 15));
			case NORTH -> Shapes.or(box(4, 0, 11, 12, 1, 13), box(2, 0, 0, 4, 2, 16), box(12, 0, 0, 14, 2, 16), box(1, 0.1, 13, 15, 1.1, 15), box(4, 0, 5, 12, 1, 7), box(1, 0.1, 1, 15, 1.1, 3));
			case EAST -> Shapes.or(box(3, 0, 4, 5, 1, 12), box(0, 0, 2, 16, 2, 4), box(0, 0, 12, 16, 2, 14), box(1, 0.1, 1, 3, 1.1, 15), box(9, 0, 4, 11, 1, 12), box(13, 0.1, 1, 15, 1.1, 15));
			case WEST -> Shapes.or(box(11, 0, 4, 13, 1, 12), box(0, 0, 12, 16, 2, 14), box(0, 0, 2, 16, 2, 4), box(13, 0.1, 1, 15, 1.1, 15), box(5, 0, 4, 7, 1, 12), box(1, 0.1, 1, 3, 1.1, 15));
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