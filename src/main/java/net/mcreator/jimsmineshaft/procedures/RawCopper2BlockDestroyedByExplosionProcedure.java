package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class RawCopper2BlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), JimsmineshaftModBlocks.COPPER_SHARD.get().defaultBlockState(), 3);
	}
}