package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RottenSupportBeamBlock extends Block {
	public static final EnumProperty<Direction> FACING = DirectionalBlock.FACING;

	public RottenSupportBeamBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(3f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> box(6, 0, 0, 10, 16, 4);
			case NORTH -> box(6, 0, 12, 10, 16, 16);
			case EAST -> box(0, 0, 6, 4, 16, 10);
			case WEST -> box(12, 0, 6, 16, 16, 10);
			case UP -> box(6, 0, 0, 10, 4, 16);
			case DOWN -> box(6, 12, 0, 10, 16, 16);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}