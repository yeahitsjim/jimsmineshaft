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

public class CanaryCageBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public CanaryCageBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape().offsetType(Block.OffsetType.XZ));
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
			default -> Shapes.or(box(2, 0, 6, 14, 1, 10), box(3, 0, 10, 13, 1, 12), box(4, 0, 12, 12, 1, 13), box(6, 0, 13, 10, 1, 14), box(6, 0, 2, 10, 1, 3), box(3, 0, 4, 13, 1, 6), box(4, 0, 3, 12, 1, 4), box(2, 10, 6, 14, 12, 10),
					box(3, 10, 10, 13, 12, 12), box(4, 10, 12, 12, 12, 13), box(6, 10, 13, 10, 12, 14), box(6, 10, 2, 10, 12, 3), box(3, 10, 4, 13, 12, 6), box(4, 10, 3, 12, 12, 4), box(4, 12, 5, 12, 13, 11), box(5, 12, 11, 11, 13, 12),
					box(5, 12, 4, 11, 13, 5), box(7, 14, 7, 9, 15, 9), box(9, 13, 7, 10, 14, 9), box(6, 13, 7, 7, 14, 9), box(6, 1, 12, 7, 10, 13), box(9, 1, 12, 10, 8, 13), box(12, 1, 9, 13, 10, 10), box(12, 1, 6, 13, 10, 7),
					box(9, 1, 3, 10, 10, 4), box(6, 1, 3, 7, 10, 4), box(3, 1, 6, 4, 6, 7), box(4, 6, 6, 5, 10, 7), box(3, 1, 9, 4, 10, 10), box(4, 1, 11, 5, 10, 12), box(11, 1, 11, 12, 9, 12), box(11, 2, 4, 12, 10, 5), box(4, 1, 4, 5, 10, 5));
			case NORTH -> Shapes.or(box(2, 0, 6, 14, 1, 10), box(3, 0, 4, 13, 1, 6), box(4, 0, 3, 12, 1, 4), box(6, 0, 2, 10, 1, 3), box(6, 0, 13, 10, 1, 14), box(3, 0, 10, 13, 1, 12), box(4, 0, 12, 12, 1, 13), box(2, 10, 6, 14, 12, 10),
					box(3, 10, 4, 13, 12, 6), box(4, 10, 3, 12, 12, 4), box(6, 10, 2, 10, 12, 3), box(6, 10, 13, 10, 12, 14), box(3, 10, 10, 13, 12, 12), box(4, 10, 12, 12, 12, 13), box(4, 12, 5, 12, 13, 11), box(5, 12, 4, 11, 13, 5),
					box(5, 12, 11, 11, 13, 12), box(7, 14, 7, 9, 15, 9), box(6, 13, 7, 7, 14, 9), box(9, 13, 7, 10, 14, 9), box(9, 1, 3, 10, 10, 4), box(6, 1, 3, 7, 8, 4), box(3, 1, 6, 4, 10, 7), box(3, 1, 9, 4, 10, 10), box(6, 1, 12, 7, 10, 13),
					box(9, 1, 12, 10, 10, 13), box(12, 1, 9, 13, 6, 10), box(11, 6, 9, 12, 10, 10), box(12, 1, 6, 13, 10, 7), box(11, 1, 4, 12, 10, 5), box(4, 1, 4, 5, 9, 5), box(4, 2, 11, 5, 10, 12), box(11, 1, 11, 12, 10, 12));
			case EAST -> Shapes.or(box(6, 0, 2, 10, 1, 14), box(10, 0, 3, 12, 1, 13), box(12, 0, 4, 13, 1, 12), box(13, 0, 6, 14, 1, 10), box(2, 0, 6, 3, 1, 10), box(4, 0, 3, 6, 1, 13), box(3, 0, 4, 4, 1, 12), box(6, 10, 2, 10, 12, 14),
					box(10, 10, 3, 12, 12, 13), box(12, 10, 4, 13, 12, 12), box(13, 10, 6, 14, 12, 10), box(2, 10, 6, 3, 12, 10), box(4, 10, 3, 6, 12, 13), box(3, 10, 4, 4, 12, 12), box(5, 12, 4, 11, 13, 12), box(11, 12, 5, 12, 13, 11),
					box(4, 12, 5, 5, 13, 11), box(7, 14, 7, 9, 15, 9), box(7, 13, 6, 9, 14, 7), box(7, 13, 9, 9, 14, 10), box(12, 1, 9, 13, 10, 10), box(12, 1, 6, 13, 8, 7), box(9, 1, 3, 10, 10, 4), box(6, 1, 3, 7, 10, 4), box(3, 1, 6, 4, 10, 7),
					box(3, 1, 9, 4, 10, 10), box(6, 1, 12, 7, 6, 13), box(6, 6, 11, 7, 10, 12), box(9, 1, 12, 10, 10, 13), box(11, 1, 11, 12, 10, 12), box(11, 1, 4, 12, 9, 5), box(4, 2, 4, 5, 10, 5), box(4, 1, 11, 5, 10, 12));
			case WEST -> Shapes.or(box(6, 0, 2, 10, 1, 14), box(4, 0, 3, 6, 1, 13), box(3, 0, 4, 4, 1, 12), box(2, 0, 6, 3, 1, 10), box(13, 0, 6, 14, 1, 10), box(10, 0, 3, 12, 1, 13), box(12, 0, 4, 13, 1, 12), box(6, 10, 2, 10, 12, 14),
					box(4, 10, 3, 6, 12, 13), box(3, 10, 4, 4, 12, 12), box(2, 10, 6, 3, 12, 10), box(13, 10, 6, 14, 12, 10), box(10, 10, 3, 12, 12, 13), box(12, 10, 4, 13, 12, 12), box(5, 12, 4, 11, 13, 12), box(4, 12, 5, 5, 13, 11),
					box(11, 12, 5, 12, 13, 11), box(7, 14, 7, 9, 15, 9), box(7, 13, 9, 9, 14, 10), box(7, 13, 6, 9, 14, 7), box(3, 1, 6, 4, 10, 7), box(3, 1, 9, 4, 8, 10), box(6, 1, 12, 7, 10, 13), box(9, 1, 12, 10, 10, 13),
					box(12, 1, 9, 13, 10, 10), box(12, 1, 6, 13, 10, 7), box(9, 1, 3, 10, 6, 4), box(9, 6, 4, 10, 10, 5), box(6, 1, 3, 7, 10, 4), box(4, 1, 4, 5, 10, 5), box(4, 1, 11, 5, 9, 12), box(11, 2, 11, 12, 10, 12), box(11, 1, 4, 12, 10, 5));
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