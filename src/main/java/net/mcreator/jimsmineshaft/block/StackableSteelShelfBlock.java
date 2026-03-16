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

public class StackableSteelShelfBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public StackableSteelShelfBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(14, 3, 4, 15, 4, 14), box(1, 3, 4, 2, 4, 14), box(1, 11, 4, 2, 12, 14), box(14, 11, 4, 15, 12, 14), box(14, 3, -14, 15, 4, -4), box(1, 3, -14, 2, 4, -4), box(1, 11, -14, 2, 12, -4), box(14, 11, -14, 15, 12, -4),
					box(2, 13, 14, 14, 14, 15), box(2, 13, -15, 14, 14, -14), box(2, 5, -15, 14, 6, -14), box(2, 5, 14, 14, 6, 15), box(0, 15, -14, 16, 16, 14), box(2, 15, 14, 14, 16, 16), box(2, 15, -16, 14, 16, -14), box(0, 7, -14, 16, 8, 14),
					box(2, 7, 14, 14, 8, 16), box(2, 7, -16, 14, 8, -14), box(0, 0, 14, 2, 16, 16), box(14, 0, 14, 16, 16, 16), box(14, 0, -16, 16, 16, -14), box(0, 0, -16, 2, 16, -14));
			case NORTH -> Shapes.or(box(1, 3, 2, 2, 4, 12), box(14, 3, 2, 15, 4, 12), box(14, 11, 2, 15, 12, 12), box(1, 11, 2, 2, 12, 12), box(1, 3, 20, 2, 4, 30), box(14, 3, 20, 15, 4, 30), box(14, 11, 20, 15, 12, 30), box(1, 11, 20, 2, 12, 30),
					box(2, 13, 1, 14, 14, 2), box(2, 13, 30, 14, 14, 31), box(2, 5, 30, 14, 6, 31), box(2, 5, 1, 14, 6, 2), box(0, 15, 2, 16, 16, 30), box(2, 15, 0, 14, 16, 2), box(2, 15, 30, 14, 16, 32), box(0, 7, 2, 16, 8, 30),
					box(2, 7, 0, 14, 8, 2), box(2, 7, 30, 14, 8, 32), box(14, 0, 0, 16, 16, 2), box(0, 0, 0, 2, 16, 2), box(0, 0, 30, 2, 16, 32), box(14, 0, 30, 16, 16, 32));
			case EAST -> Shapes.or(box(4, 3, 1, 14, 4, 2), box(4, 3, 14, 14, 4, 15), box(4, 11, 14, 14, 12, 15), box(4, 11, 1, 14, 12, 2), box(-14, 3, 1, -4, 4, 2), box(-14, 3, 14, -4, 4, 15), box(-14, 11, 14, -4, 12, 15), box(-14, 11, 1, -4, 12, 2),
					box(14, 13, 2, 15, 14, 14), box(-15, 13, 2, -14, 14, 14), box(-15, 5, 2, -14, 6, 14), box(14, 5, 2, 15, 6, 14), box(-14, 15, 0, 14, 16, 16), box(14, 15, 2, 16, 16, 14), box(-16, 15, 2, -14, 16, 14), box(-14, 7, 0, 14, 8, 16),
					box(14, 7, 2, 16, 8, 14), box(-16, 7, 2, -14, 8, 14), box(14, 0, 14, 16, 16, 16), box(14, 0, 0, 16, 16, 2), box(-16, 0, 0, -14, 16, 2), box(-16, 0, 14, -14, 16, 16));
			case WEST -> Shapes.or(box(2, 3, 14, 12, 4, 15), box(2, 3, 1, 12, 4, 2), box(2, 11, 1, 12, 12, 2), box(2, 11, 14, 12, 12, 15), box(20, 3, 14, 30, 4, 15), box(20, 3, 1, 30, 4, 2), box(20, 11, 1, 30, 12, 2), box(20, 11, 14, 30, 12, 15),
					box(1, 13, 2, 2, 14, 14), box(30, 13, 2, 31, 14, 14), box(30, 5, 2, 31, 6, 14), box(1, 5, 2, 2, 6, 14), box(2, 15, 0, 30, 16, 16), box(0, 15, 2, 2, 16, 14), box(30, 15, 2, 32, 16, 14), box(2, 7, 0, 30, 8, 16),
					box(0, 7, 2, 2, 8, 14), box(30, 7, 2, 32, 8, 14), box(0, 0, 0, 2, 16, 2), box(0, 0, 14, 2, 16, 16), box(30, 0, 14, 32, 16, 16), box(30, 0, 0, 32, 16, 2));
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