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
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class RottenPlanksBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 5);
	public static final EnumProperty<Direction> FACING = DirectionalBlock.FACING;

	public RottenPlanksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(2f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 8, 0, 4, 11, 16), box(4, 8, 12, 12, 11, 16), box(8, 8, 0, 16, 11, 4), box(4, 9, 0, 8, 11, 12), box(12, 10, 4, 16, 11, 12), box(8, 7, 4, 12, 11, 8), box(12, 9, 12, 16, 11, 16));
				case NORTH -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(12, 8, 0, 16, 11, 16), box(4, 8, 0, 12, 11, 4), box(0, 8, 12, 8, 11, 16), box(8, 9, 4, 12, 11, 16), box(0, 10, 4, 4, 11, 12), box(4, 7, 8, 8, 11, 12), box(0, 9, 0, 4, 11, 4));
				case EAST -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 8, 12, 16, 11, 16), box(12, 8, 4, 16, 11, 12), box(0, 8, 0, 4, 11, 8), box(0, 9, 8, 12, 11, 12), box(4, 10, 0, 12, 11, 4), box(4, 7, 4, 8, 11, 8), box(12, 9, 0, 16, 11, 4));
				case WEST -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 8, 0, 16, 11, 4), box(0, 8, 4, 4, 11, 12), box(12, 8, 8, 16, 11, 16), box(4, 9, 4, 16, 11, 8), box(4, 10, 12, 12, 11, 16), box(8, 7, 8, 12, 11, 12), box(0, 9, 12, 4, 11, 16));
				case UP -> Shapes.or(box(0, 0, 11, 16, 16, 16), box(12, 0, 8, 16, 16, 11), box(4, 12, 8, 12, 16, 11), box(0, 0, 8, 8, 4, 11), box(8, 0, 9, 12, 12, 11), box(0, 4, 10, 4, 12, 11), box(4, 4, 7, 8, 8, 11), box(0, 12, 9, 4, 16, 11));
				case DOWN -> Shapes.or(box(0, 0, 0, 16, 16, 5), box(12, 0, 5, 16, 16, 8), box(4, 0, 5, 12, 4, 8), box(0, 12, 5, 8, 16, 8), box(8, 4, 5, 12, 16, 7), box(0, 4, 5, 4, 12, 6), box(4, 8, 5, 8, 12, 9), box(0, 0, 5, 4, 4, 7));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 8, 0, 4, 11, 16), box(4, 8, 12, 12, 11, 16), box(8, 8, 0, 16, 11, 4), box(4, 9, 0, 8, 11, 12), box(12, 10, 4, 16, 11, 12), box(8, 7, 4, 12, 11, 8), box(12, 9, 12, 16, 11, 16));
				case NORTH -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(12, 8, 0, 16, 11, 16), box(4, 8, 0, 12, 11, 4), box(0, 8, 12, 8, 11, 16), box(8, 9, 4, 12, 11, 16), box(0, 10, 4, 4, 11, 12), box(4, 7, 8, 8, 11, 12), box(0, 9, 0, 4, 11, 4));
				case EAST -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 8, 12, 16, 11, 16), box(12, 8, 4, 16, 11, 12), box(0, 8, 0, 4, 11, 8), box(0, 9, 8, 12, 11, 12), box(4, 10, 0, 12, 11, 4), box(4, 7, 4, 8, 11, 8), box(12, 9, 0, 16, 11, 4));
				case WEST -> Shapes.or(box(0, 11, 0, 16, 16, 16), box(0, 8, 0, 16, 11, 4), box(0, 8, 4, 4, 11, 12), box(12, 8, 8, 16, 11, 16), box(4, 9, 4, 16, 11, 8), box(4, 10, 12, 12, 11, 16), box(8, 7, 8, 12, 11, 12), box(0, 9, 12, 4, 11, 16));
				case UP -> Shapes.or(box(0, 0, 11, 16, 16, 16), box(12, 0, 8, 16, 16, 11), box(4, 12, 8, 12, 16, 11), box(0, 0, 8, 8, 4, 11), box(8, 0, 9, 12, 12, 11), box(0, 4, 10, 4, 12, 11), box(4, 4, 7, 8, 8, 11), box(0, 12, 9, 4, 16, 11));
				case DOWN -> Shapes.or(box(0, 0, 0, 16, 16, 5), box(12, 0, 5, 16, 16, 8), box(4, 0, 5, 12, 4, 8), box(0, 12, 5, 8, 16, 8), box(8, 4, 5, 12, 16, 7), box(0, 4, 5, 4, 12, 6), box(4, 8, 5, 8, 12, 9), box(0, 0, 5, 4, 4, 7));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0, 0, 0, 16, 16, 16);
			case NORTH -> box(0, 0, 0, 16, 16, 16);
			case EAST -> box(0, 0, 0, 16, 16, 16);
			case WEST -> box(0, 0, 0, 16, 16, 16);
			case UP -> box(0, 0, 0, 16, 16, 16);
			case DOWN -> box(0, 0, 0, 16, 16, 16);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}