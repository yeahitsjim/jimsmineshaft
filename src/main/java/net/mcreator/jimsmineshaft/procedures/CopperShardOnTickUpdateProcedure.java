package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

public class CopperShardOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (JimsmineshaftModBlocks.COPPER_SHARD.get() == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE.get().defaultBlockState(), 3);
		}
		if (JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE.get() == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), JimsmineshaftModBlocks.COPPER_SHARD_TRIPLE.get().defaultBlockState(), 3);
		}
	}
}