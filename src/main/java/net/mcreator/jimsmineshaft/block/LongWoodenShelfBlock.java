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

public class LongWoodenShelfBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public LongWoodenShelfBlock(BlockBehaviour.Properties properties) {
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
			default -> Shapes.or(box(14, 0, 14, 16, 16, 16), box(14, 0, -16, 16, 16, -14), box(0, 0, 14, 2, 16, 16), box(0, 0, -16, 2, 16, -14), box(0, 14, -14, 16, 16, 14), box(0, 6, -14, 1, 8, 14), box(2, 14, 14, 14, 16, 16),
					box(2, 14, -16, 14, 16, -14));
			case NORTH -> Shapes.or(box(0, 0, 0, 2, 16, 2), box(0, 0, 30, 2, 16, 32), box(14, 0, 0, 16, 16, 2), box(14, 0, 30, 16, 16, 32), box(0, 14, 2, 16, 16, 30), box(15, 6, 2, 16, 8, 30), box(2, 14, 0, 14, 16, 2), box(2, 14, 30, 14, 16, 32));
			case EAST -> Shapes.or(box(14, 0, 0, 16, 16, 2), box(-16, 0, 0, -14, 16, 2), box(14, 0, 14, 16, 16, 16), box(-16, 0, 14, -14, 16, 16), box(-14, 14, 0, 14, 16, 16), box(-14, 6, 15, 14, 8, 16), box(14, 14, 2, 16, 16, 14),
					box(-16, 14, 2, -14, 16, 14));
			case WEST -> Shapes.or(box(0, 0, 14, 2, 16, 16), box(30, 0, 14, 32, 16, 16), box(0, 0, 0, 2, 16, 2), box(30, 0, 0, 32, 16, 2), box(2, 14, 0, 30, 16, 16), box(2, 6, 0, 30, 8, 1), box(0, 14, 2, 2, 16, 14), box(30, 14, 2, 32, 16, 14));
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