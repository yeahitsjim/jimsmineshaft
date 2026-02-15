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

public class OldCabinetBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public OldCabinetBlock(BlockBehaviour.Properties properties) {
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
			default -> Shapes.or(box(1, 2, 1, 2, 30, 15), box(14, 2, 1, 15, 30, 15), box(2, 2, 1, 14, 30, 2), box(0, 30, 0, 16, 32, 16), box(0, 0, 0, 16, 2, 16), box(2, 15, 2, 14, 17, 15), box(2, 7, 2, 14, 9, 15), box(2, 23, 2, 14, 25, 15));
			case NORTH -> Shapes.or(box(14, 2, 1, 15, 30, 15), box(1, 2, 1, 2, 30, 15), box(2, 2, 14, 14, 30, 15), box(0, 30, 0, 16, 32, 16), box(0, 0, 0, 16, 2, 16), box(2, 15, 1, 14, 17, 14), box(2, 7, 1, 14, 9, 14), box(2, 23, 1, 14, 25, 14));
			case EAST -> Shapes.or(box(1, 2, 14, 15, 30, 15), box(1, 2, 1, 15, 30, 2), box(1, 2, 2, 2, 30, 14), box(0, 30, 0, 16, 32, 16), box(0, 0, 0, 16, 2, 16), box(2, 15, 2, 15, 17, 14), box(2, 7, 2, 15, 9, 14), box(2, 23, 2, 15, 25, 14));
			case WEST -> Shapes.or(box(1, 2, 1, 15, 30, 2), box(1, 2, 14, 15, 30, 15), box(14, 2, 2, 15, 30, 14), box(0, 30, 0, 16, 32, 16), box(0, 0, 0, 16, 2, 16), box(1, 15, 2, 14, 17, 14), box(1, 7, 2, 14, 9, 14), box(1, 23, 2, 14, 25, 14));
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