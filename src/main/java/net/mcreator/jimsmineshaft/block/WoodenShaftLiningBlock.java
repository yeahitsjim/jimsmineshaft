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

public class WoodenShaftLiningBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public WoodenShaftLiningBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(3f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
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
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(7, 0, 2, 9, 16, 3), box(13, 0, 7, 14, 16, 9), box(0, 0, 0, 16, 2, 2), box(0, 14, 0, 16, 16, 2), box(0, 7, 0, 16, 9, 2), box(14, 0, 2, 16, 2, 16), box(14, 14, 2, 16, 16, 16), box(14, 7, 2, 16, 9, 16));
				case NORTH -> Shapes.or(box(7, 0, 13, 9, 16, 14), box(2, 0, 7, 3, 16, 9), box(0, 0, 14, 16, 2, 16), box(0, 14, 14, 16, 16, 16), box(0, 7, 14, 16, 9, 16), box(0, 0, 0, 2, 2, 14), box(0, 14, 0, 2, 16, 14), box(0, 7, 0, 2, 9, 14));
				case EAST -> Shapes.or(box(2, 0, 7, 3, 16, 9), box(7, 0, 2, 9, 16, 3), box(0, 0, 0, 2, 2, 16), box(0, 14, 0, 2, 16, 16), box(0, 7, 0, 2, 9, 16), box(2, 0, 0, 16, 2, 2), box(2, 14, 0, 16, 16, 2), box(2, 7, 0, 16, 9, 2));
				case WEST ->
					Shapes.or(box(13, 0, 7, 14, 16, 9), box(7, 0, 13, 9, 16, 14), box(14, 0, 0, 16, 2, 16), box(14, 14, 0, 16, 16, 16), box(14, 7, 0, 16, 9, 16), box(0, 0, 14, 14, 2, 16), box(0, 14, 14, 14, 16, 16), box(0, 7, 14, 14, 9, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(7, 0, 2, 9, 16, 3), box(0, 0, 0, 16, 2, 2), box(0, 14, 0, 16, 16, 2), box(0, 4, 0, 16, 12, 2));
				case NORTH -> Shapes.or(box(7, 0, 13, 9, 16, 14), box(0, 0, 14, 16, 2, 16), box(0, 14, 14, 16, 16, 16), box(0, 4, 14, 16, 12, 16));
				case EAST -> Shapes.or(box(2, 0, 7, 3, 16, 9), box(0, 0, 0, 2, 2, 16), box(0, 14, 0, 2, 16, 16), box(0, 4, 0, 2, 12, 16));
				case WEST -> Shapes.or(box(13, 0, 7, 14, 16, 9), box(14, 0, 0, 16, 2, 16), box(14, 14, 0, 16, 16, 16), box(14, 4, 0, 16, 12, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(7, 0, 2, 9, 16, 3), box(13, 0, 7, 14, 16, 9), box(0, 0, 0, 16, 2, 2), box(0, 14, 0, 16, 16, 2), box(0, 4, 0, 16, 12, 2), box(14, 0, 2, 16, 2, 16), box(14, 14, 2, 16, 16, 16), box(14, 4, 2, 16, 12, 16));
				case NORTH -> Shapes.or(box(7, 0, 13, 9, 16, 14), box(2, 0, 7, 3, 16, 9), box(0, 0, 14, 16, 2, 16), box(0, 14, 14, 16, 16, 16), box(0, 4, 14, 16, 12, 16), box(0, 0, 0, 2, 2, 14), box(0, 14, 0, 2, 16, 14), box(0, 4, 0, 2, 12, 14));
				case EAST -> Shapes.or(box(2, 0, 7, 3, 16, 9), box(7, 0, 2, 9, 16, 3), box(0, 0, 0, 2, 2, 16), box(0, 14, 0, 2, 16, 16), box(0, 4, 0, 2, 12, 16), box(2, 0, 0, 16, 2, 2), box(2, 14, 0, 16, 16, 2), box(2, 4, 0, 16, 12, 2));
				case WEST ->
					Shapes.or(box(13, 0, 7, 14, 16, 9), box(7, 0, 13, 9, 16, 14), box(14, 0, 0, 16, 2, 16), box(14, 14, 0, 16, 16, 16), box(14, 4, 0, 16, 12, 16), box(0, 0, 14, 14, 2, 16), box(0, 14, 14, 14, 16, 16), box(0, 4, 14, 14, 12, 16));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(7, 0, 2, 9, 16, 3), box(0, 0, 0, 16, 2, 2), box(0, 14, 0, 16, 16, 2), box(0, 7, 0, 16, 9, 2));
			case NORTH -> Shapes.or(box(7, 0, 13, 9, 16, 14), box(0, 0, 14, 16, 2, 16), box(0, 14, 14, 16, 16, 16), box(0, 7, 14, 16, 9, 16));
			case EAST -> Shapes.or(box(2, 0, 7, 3, 16, 9), box(0, 0, 0, 2, 2, 16), box(0, 14, 0, 2, 16, 16), box(0, 7, 0, 2, 9, 16));
			case WEST -> Shapes.or(box(13, 0, 7, 14, 16, 9), box(14, 0, 0, 16, 2, 16), box(14, 14, 0, 16, 16, 16), box(14, 7, 0, 16, 9, 16));
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