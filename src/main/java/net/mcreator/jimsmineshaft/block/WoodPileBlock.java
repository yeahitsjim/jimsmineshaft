package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
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

public class WoodPileBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public WoodPileBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(3f, 2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default ->
				Shapes.or(box(9, 0, 0, 11, 1, 16), box(4, 0, 0, 6, 1, 16), box(5, 0, 0, 7, 1, 16), box(1, 0, 0, 3, 2, 16), box(8, 1, 0, 10, 3, 16), box(6, 2, 0, 8, 4, 16), box(4, 4, 0, 6, 6, 16), box(12, 0, 0, 14, 2, 16), box(12, 2, 0, 14, 4, 8));
			case NORTH ->
				Shapes.or(box(5, 0, 0, 7, 1, 16), box(10, 0, 0, 12, 1, 16), box(9, 0, 0, 11, 1, 16), box(13, 0, 0, 15, 2, 16), box(6, 1, 0, 8, 3, 16), box(8, 2, 0, 10, 4, 16), box(10, 4, 0, 12, 6, 16), box(2, 0, 0, 4, 2, 16), box(2, 2, 8, 4, 4, 16));
			case EAST ->
				Shapes.or(box(0, 0, 5, 16, 1, 7), box(0, 0, 10, 16, 1, 12), box(0, 0, 9, 16, 1, 11), box(0, 0, 13, 16, 2, 15), box(0, 1, 6, 16, 3, 8), box(0, 2, 8, 16, 4, 10), box(0, 4, 10, 16, 6, 12), box(0, 0, 2, 16, 2, 4), box(0, 2, 2, 8, 4, 4));
			case WEST ->
				Shapes.or(box(0, 0, 9, 16, 1, 11), box(0, 0, 4, 16, 1, 6), box(0, 0, 5, 16, 1, 7), box(0, 0, 1, 16, 2, 3), box(0, 1, 8, 16, 3, 10), box(0, 2, 6, 16, 4, 8), box(0, 4, 4, 16, 6, 6), box(0, 0, 12, 16, 2, 14), box(8, 2, 12, 16, 4, 14));
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