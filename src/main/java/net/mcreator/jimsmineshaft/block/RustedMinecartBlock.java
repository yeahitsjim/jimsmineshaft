package net.mcreator.jimsmineshaft.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
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

public class RustedMinecartBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 1);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public RustedMinecartBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
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
			default -> Shapes.or(box(2, 1, 0, 14, 2, 16), box(2, 2, 14, 14, 10, 16), box(2, 2, 0, 14, 10, 2), box(12, 2, 2, 14, 10, 14), box(2, 2, 2, 4, 10, 14), box(14, 0, 12, 15, 3, 15), box(14, 0, 1, 15, 3, 4), box(1, 1, 12, 2, 4, 15),
					box(1, 0, 1, 2, 3, 4));
			case NORTH -> Shapes.or(box(2, 1, 0, 14, 2, 16), box(2, 2, 0, 14, 10, 2), box(2, 2, 14, 14, 10, 16), box(2, 2, 2, 4, 10, 14), box(12, 2, 2, 14, 10, 14), box(1, 0, 1, 2, 3, 4), box(1, 0, 12, 2, 3, 15), box(14, 1, 1, 15, 4, 4),
					box(14, 0, 12, 15, 3, 15));
			case EAST -> Shapes.or(box(0, 1, 2, 16, 2, 14), box(14, 2, 2, 16, 10, 14), box(0, 2, 2, 2, 10, 14), box(2, 2, 2, 14, 10, 4), box(2, 2, 12, 14, 10, 14), box(12, 0, 1, 15, 3, 2), box(1, 0, 1, 4, 3, 2), box(12, 1, 14, 15, 4, 15),
					box(1, 0, 14, 4, 3, 15));
			case WEST -> Shapes.or(box(0, 1, 2, 16, 2, 14), box(0, 2, 2, 2, 10, 14), box(14, 2, 2, 16, 10, 14), box(2, 2, 12, 14, 10, 14), box(2, 2, 2, 14, 10, 4), box(1, 0, 14, 4, 3, 15), box(12, 0, 14, 15, 3, 15), box(1, 1, 1, 4, 4, 2),
					box(12, 0, 1, 15, 3, 2));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
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