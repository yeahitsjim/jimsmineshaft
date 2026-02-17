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
			default -> Shapes.or(box(14, 4, 4, 15, 5, 14), box(1, 4, 4, 2, 5, 14), box(1, 13, 4, 2, 14, 14), box(14, 13, 4, 15, 14, 14), box(14, 4, -14, 15, 5, -4), box(1, 4, -14, 2, 5, -4), box(1, 13, -14, 2, 14, -4), box(14, 13, -14, 15, 14, -4),
					box(2, 15, 14, 14, 16, 15), box(2, 15, -15, 14, 16, -14), box(2, 6, -15, 14, 7, -14), box(2, 6, 14, 14, 7, 15), box(0, 17, -14, 16, 18, 14), box(2, 17, 14, 14, 18, 16), box(2, 17, -16, 14, 18, -14), box(0, 8, -14, 16, 9, 14),
					box(2, 8, 14, 14, 9, 16), box(2, 8, -16, 14, 9, -14), box(0, 0, 14, 2, 18, 16), box(14, 0, 14, 16, 18, 16), box(14, 0, -16, 16, 18, -14), box(0, 0, -16, 2, 18, -14));
			case NORTH -> Shapes.or(box(1, 4, 2, 2, 5, 12), box(14, 4, 2, 15, 5, 12), box(14, 13, 2, 15, 14, 12), box(1, 13, 2, 2, 14, 12), box(1, 4, 20, 2, 5, 30), box(14, 4, 20, 15, 5, 30), box(14, 13, 20, 15, 14, 30), box(1, 13, 20, 2, 14, 30),
					box(2, 15, 1, 14, 16, 2), box(2, 15, 30, 14, 16, 31), box(2, 6, 30, 14, 7, 31), box(2, 6, 1, 14, 7, 2), box(0, 17, 2, 16, 18, 30), box(2, 17, 0, 14, 18, 2), box(2, 17, 30, 14, 18, 32), box(0, 8, 2, 16, 9, 30),
					box(2, 8, 0, 14, 9, 2), box(2, 8, 30, 14, 9, 32), box(14, 0, 0, 16, 18, 2), box(0, 0, 0, 2, 18, 2), box(0, 0, 30, 2, 18, 32), box(14, 0, 30, 16, 18, 32));
			case EAST -> Shapes.or(box(4, 4, 1, 14, 5, 2), box(4, 4, 14, 14, 5, 15), box(4, 13, 14, 14, 14, 15), box(4, 13, 1, 14, 14, 2), box(-14, 4, 1, -4, 5, 2), box(-14, 4, 14, -4, 5, 15), box(-14, 13, 14, -4, 14, 15), box(-14, 13, 1, -4, 14, 2),
					box(14, 15, 2, 15, 16, 14), box(-15, 15, 2, -14, 16, 14), box(-15, 6, 2, -14, 7, 14), box(14, 6, 2, 15, 7, 14), box(-14, 17, 0, 14, 18, 16), box(14, 17, 2, 16, 18, 14), box(-16, 17, 2, -14, 18, 14), box(-14, 8, 0, 14, 9, 16),
					box(14, 8, 2, 16, 9, 14), box(-16, 8, 2, -14, 9, 14), box(14, 0, 14, 16, 18, 16), box(14, 0, 0, 16, 18, 2), box(-16, 0, 0, -14, 18, 2), box(-16, 0, 14, -14, 18, 16));
			case WEST -> Shapes.or(box(2, 4, 14, 12, 5, 15), box(2, 4, 1, 12, 5, 2), box(2, 13, 1, 12, 14, 2), box(2, 13, 14, 12, 14, 15), box(20, 4, 14, 30, 5, 15), box(20, 4, 1, 30, 5, 2), box(20, 13, 1, 30, 14, 2), box(20, 13, 14, 30, 14, 15),
					box(1, 15, 2, 2, 16, 14), box(30, 15, 2, 31, 16, 14), box(30, 6, 2, 31, 7, 14), box(1, 6, 2, 2, 7, 14), box(2, 17, 0, 30, 18, 16), box(0, 17, 2, 2, 18, 14), box(30, 17, 2, 32, 18, 14), box(2, 8, 0, 30, 9, 16),
					box(0, 8, 2, 2, 9, 14), box(30, 8, 2, 32, 9, 14), box(0, 0, 0, 2, 18, 2), box(0, 0, 14, 2, 18, 16), box(30, 0, 14, 32, 18, 16), box(30, 0, 0, 32, 18, 2));
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