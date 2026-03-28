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

public class RustedIronRailingBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public RustedIronRailingBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(1.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0.25, 13, 0.125, 16.25, 14.25, 1.375), box(2.25, 0, 0, 3.75, 16, 1.5), box(12.25, 0, 0, 13.75, 16, 1.5), box(0.25, 8, 0.125, 16.25, 9.25, 1.375));
			case NORTH -> Shapes.or(box(-0.25, 13, 14.625, 15.75, 14.25, 15.875), box(12.25, 0, 14.5, 13.75, 16, 16), box(2.25, 0, 14.5, 3.75, 16, 16), box(-0.25, 8, 14.625, 15.75, 9.25, 15.875));
			case EAST -> Shapes.or(box(0.125, 13, -0.25, 1.375, 14.25, 15.75), box(0, 0, 12.25, 1.5, 16, 13.75), box(0, 0, 2.25, 1.5, 16, 3.75), box(0.125, 8, -0.25, 1.375, 9.25, 15.75));
			case WEST -> Shapes.or(box(14.625, 13, 0.25, 15.875, 14.25, 16.25), box(14.5, 0, 2.25, 16, 16, 3.75), box(14.5, 0, 12.25, 16, 16, 13.75), box(14.625, 8, 0.25, 15.875, 9.25, 16.25));
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