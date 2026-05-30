package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CartelevatorOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(x, y + 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}