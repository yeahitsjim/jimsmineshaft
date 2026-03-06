package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CopperShardTripleBlock extends FallingBlock {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final MapCodec<CopperShardTripleBlock> CODEC = simpleCodec(CopperShardTripleBlock::new);

	public MapCodec<CopperShardTripleBlock> codec() {
		return CODEC;
	}

	public CopperShardTripleBlock(BlockBehaviour.Properties properties) {
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
			default -> box(3, 0, 3, 14, 12, 14);
			case NORTH -> box(2, 0, 2, 13, 12, 13);
			case EAST -> box(3, 0, 2, 14, 12, 13);
			case WEST -> box(2, 0, 3, 13, 12, 14);
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