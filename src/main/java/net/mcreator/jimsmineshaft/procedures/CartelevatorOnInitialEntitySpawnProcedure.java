package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;

public class CartelevatorOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.CART_ELEVATOR_BOUNDING_BOX.get().spawn(_level, BlockPos.containing(x, y + 0, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}