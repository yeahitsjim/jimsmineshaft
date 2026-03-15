package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;

public class ElevatorOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_BOUNDING_BOX.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_1.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_2.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_3.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_4.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_5.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_6.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_7.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_SEAT_8.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
	}
}