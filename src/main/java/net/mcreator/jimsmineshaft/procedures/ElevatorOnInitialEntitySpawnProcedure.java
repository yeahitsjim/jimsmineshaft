package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.Comparator;

public class ElevatorOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomNum = 0;
		boolean elevatorExist = false;
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
		if (Level.OVERWORLD == (entity.level().dimension())) {
			entity.getPersistentData().putString("stage", "start");
		}
		if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {
			entity.getPersistentData().putString("stage", "lvl1start");
			JimsmineshaftMod.queueServerWork(20, () -> {
				if (235 > entity.getY()) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (!entityiterator.isPassenger()) {
									entityiterator.getPersistentData().putBoolean("needsSeat", true);
								}
							}
						}
					}
				}
			});
		}
		if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension())) {
			entity.getPersistentData().putString("stage", "lvl1start");
			JimsmineshaftMod.queueServerWork(20, () -> {
				if (235 > entity.getY()) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (!entityiterator.isPassenger()) {
									entityiterator.getPersistentData().putBoolean("needsSeat", true);
								}
							}
						}
					}
				}
			});
		}
		entity.getPersistentData().putBoolean("needsFirstStop", true);
	}
}