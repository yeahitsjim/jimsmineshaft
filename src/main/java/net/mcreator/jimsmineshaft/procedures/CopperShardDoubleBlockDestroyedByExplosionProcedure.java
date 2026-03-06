package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CopperShardDoubleBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), JimsmineshaftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
	}
}