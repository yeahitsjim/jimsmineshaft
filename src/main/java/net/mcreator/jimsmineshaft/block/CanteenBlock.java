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

public class CanteenBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public CanteenBlock(BlockBehaviour.Properties properties) {
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
			default -> Shapes.or(box(3, 1, 2, 13, 5, 12), box(4, 5, 3, 12, 6, 11), box(4, 0, 3, 12, 1, 11), box(2, 2, 5, 4, 4, 9), box(12, 2, 5, 14, 4, 9), box(7, 2, 12, 9, 4, 14));
			case NORTH -> Shapes.or(box(3, 1, 4, 13, 5, 14), box(4, 5, 5, 12, 6, 13), box(4, 0, 5, 12, 1, 13), box(12, 2, 7, 14, 4, 11), box(2, 2, 7, 4, 4, 11), box(7, 2, 2, 9, 4, 4));
			case EAST -> Shapes.or(box(2, 1, 3, 12, 5, 13), box(3, 5, 4, 11, 6, 12), box(3, 0, 4, 11, 1, 12), box(5, 2, 12, 9, 4, 14), box(5, 2, 2, 9, 4, 4), box(12, 2, 7, 14, 4, 9));
			case WEST -> Shapes.or(box(4, 1, 3, 14, 5, 13), box(5, 5, 4, 13, 6, 12), box(5, 0, 4, 13, 1, 12), box(7, 2, 2, 11, 4, 4), box(7, 2, 12, 11, 4, 14), box(2, 2, 7, 4, 4, 9));
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