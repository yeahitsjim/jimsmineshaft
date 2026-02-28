package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CopperShardDoubleOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (JimsmineshaftModBlocks.COPPER_SHARD.get() == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), JimsmineshaftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
		if (JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE.get() == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), JimsmineshaftModBlocks.COPPER_SHARD.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), JimsmineshaftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
	}
}