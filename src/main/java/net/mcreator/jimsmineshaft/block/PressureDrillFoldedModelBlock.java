package net.mcreator.jimsmineshaft.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.procedures.PressureDrillFoldedModelOnBlockRightClickedProcedure;

public class PressureDrillFoldedModelBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public PressureDrillFoldedModelBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(0, 4, 7, 17, 6, 9), box(8, 2, 5, 17, 4, 11), box(4, 2, 7, 8, 4, 9), box(0, 2, 4, 4, 4, 12), box(0, 5, 9, 17, 6, 10), box(0, 5, 6, 17, 6, 7), box(2, 6, 7, 20, 8, 9), box(5, 8, 7, 13, 9, 9),
					box(22, 6, 7.5, 32, 7, 8.5), box(20, 6, 7, 24, 7, 9), box(24, 6, 7, 26, 8, 9), box(11, 1, 7, 31, 3, 9), box(3.14052, 0.5991, 9.2, 24.14052, 2.5991, 11.2), box(3.14052, 0.5991, 4.2, 24.14052, 2.5991, 6.2));
			case NORTH -> Shapes.or(box(-1, 4, 7, 16, 6, 9), box(-1, 2, 5, 8, 4, 11), box(8, 2, 7, 12, 4, 9), box(12, 2, 4, 16, 4, 12), box(-1, 5, 6, 16, 6, 7), box(-1, 5, 9, 16, 6, 10), box(-4, 6, 7, 14, 8, 9), box(3, 8, 7, 11, 9, 9),
					box(-16, 6, 7.5, -6, 7, 8.5), box(-8, 6, 7, -4, 7, 9), box(-10, 6, 7, -8, 8, 9), box(-15, 1, 7, 5, 3, 9), box(-8.14052, 0.5991, 4.8, 12.85948, 2.5991, 6.8), box(-8.14052, 0.5991, 9.8, 12.85948, 2.5991, 11.8));
			case EAST -> Shapes.or(box(7, 4, -1, 9, 6, 16), box(5, 2, -1, 11, 4, 8), box(7, 2, 8, 9, 4, 12), box(4, 2, 12, 12, 4, 16), box(9, 5, -1, 10, 6, 16), box(6, 5, -1, 7, 6, 16), box(7, 6, -4, 9, 8, 14), box(7, 8, 3, 9, 9, 11),
					box(7.5, 6, -16, 8.5, 7, -6), box(7, 6, -8, 9, 7, -4), box(7, 6, -10, 9, 8, -8), box(7, 1, -15, 9, 3, 5), box(9.2, 0.5991, -8.14052, 11.2, 2.5991, 12.85948), box(4.2, 0.5991, -8.14052, 6.2, 2.5991, 12.85948));
			case WEST -> Shapes.or(box(7, 4, 0, 9, 6, 17), box(5, 2, 8, 11, 4, 17), box(7, 2, 4, 9, 4, 8), box(4, 2, 0, 12, 4, 4), box(6, 5, 0, 7, 6, 17), box(9, 5, 0, 10, 6, 17), box(7, 6, 2, 9, 8, 20), box(7, 8, 5, 9, 9, 13),
					box(7.5, 6, 22, 8.5, 7, 32), box(7, 6, 20, 9, 7, 24), box(7, 6, 24, 9, 8, 26), box(7, 1, 11, 9, 3, 31), box(4.8, 0.5991, 3.14052, 6.8, 2.5991, 24.14052), box(9.8, 0.5991, 3.14052, 11.8, 2.5991, 24.14052));
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

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		PressureDrillFoldedModelOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}