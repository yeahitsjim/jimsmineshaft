package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CandleHolderBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public CandleHolderBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(3f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape().offsetType(Block.OffsetType.XZ));
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
		Vec3 offset = state.getOffset(pos);
		return (switch (state.getValue(FACING)) {
			default -> Shapes.or(box(7, 0, 5, 8, 1, 15), box(8, 0, 7, 10, 1, 9), box(8, 0, 6, 10, 5, 7), box(8, 0, 9, 10, 5, 10), box(10, 0, 7, 11, 5, 9), box(7, 3, 6, 8, 5, 9), box(4, 0, 7, 7, 1, 8), box(4, 1, 7, 5, 8, 8), box(7, 0, 1, 8, 1, 5),
					box(7.2, 0, 0.55, 8.2, 1, 4.8), box(6.8, 0, 0.55, 7.8, 1, 4.8), box(7, 0, 1, 8, 1, 5), box(3.55, 6.9, 7, 4.55, 8.9, 8), box(2.23, 7.8, 7, 3.23, 9.8, 8));
			case NORTH -> Shapes.or(box(8, 0, 1, 9, 1, 11), box(6, 0, 7, 8, 1, 9), box(6, 0, 9, 8, 5, 10), box(6, 0, 6, 8, 5, 7), box(5, 0, 7, 6, 5, 9), box(8, 3, 7, 9, 5, 10), box(9, 0, 8, 12, 1, 9), box(11, 1, 8, 12, 8, 9), box(8, 0, 11, 9, 1, 15),
					box(7.8, 0, 11.2, 8.8, 1, 15.45), box(8.2, 0, 11.2, 9.2, 1, 15.45), box(8, 0, 11, 9, 1, 15), box(11.45, 6.9, 8, 12.45, 8.9, 9), box(12.77, 7.8, 8, 13.77, 9.8, 9));
			case EAST -> Shapes.or(box(5, 0, 8, 15, 1, 9), box(7, 0, 6, 9, 1, 8), box(6, 0, 6, 7, 5, 8), box(9, 0, 6, 10, 5, 8), box(7, 0, 5, 9, 5, 6), box(6, 3, 8, 9, 5, 9), box(7, 0, 9, 8, 1, 12), box(7, 1, 11, 8, 8, 12), box(1, 0, 8, 5, 1, 9),
					box(0.55, 0, 7.8, 4.8, 1, 8.8), box(0.55, 0, 8.2, 4.8, 1, 9.2), box(1, 0, 8, 5, 1, 9), box(7, 6.9, 11.45, 8, 8.9, 12.45), box(7, 7.8, 12.77, 8, 9.8, 13.77));
			case WEST -> Shapes.or(box(1, 0, 7, 11, 1, 8), box(7, 0, 8, 9, 1, 10), box(9, 0, 8, 10, 5, 10), box(6, 0, 8, 7, 5, 10), box(7, 0, 10, 9, 5, 11), box(7, 3, 7, 10, 5, 8), box(8, 0, 4, 9, 1, 7), box(8, 1, 4, 9, 8, 5),
					box(11, 0, 7, 15, 1, 8), box(11.2, 0, 7.2, 15.45, 1, 8.2), box(11.2, 0, 6.8, 15.45, 1, 7.8), box(11, 0, 7, 15, 1, 8), box(8, 6.9, 3.55, 9, 8.9, 4.55), box(8, 7.8, 2.23, 9, 9.8, 3.23));
		}).move(offset.x, offset.y, offset.z);
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