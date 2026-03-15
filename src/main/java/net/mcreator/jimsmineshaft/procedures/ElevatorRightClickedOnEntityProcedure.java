package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat8Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat7Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat6Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat5Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat4Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat3Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat2Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat1Entity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.Comparator;

public class ElevatorRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getDouble("doorCooldown") <= 0) {
			if (entity.getPersistentData().getBoolean("doorOpen")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						sourceentity.getPersistentData().putBoolean("inElevator", true);
						{
							JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
							_vars.inElevator = true;
							_vars.syncPlayerVariables(sourceentity);
						}
						if (entityiterator instanceof ElevatorSeat1Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat2Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat3Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat4Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat5Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat6Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat7Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
						if (entityiterator instanceof ElevatorSeat8Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
							}
						}
					}
				}
			} else {
				entity.getPersistentData().putBoolean("doorOpen", true);
				entity.getPersistentData().putDouble("doorCooldown", 60);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoropen")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoropen")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				JimsmineshaftMod.queueServerWork(30, () -> {
					sourceentity.getPersistentData().putBoolean("inElevator", true);
					{
						JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
						_vars.inElevator = true;
						_vars.syncPlayerVariables(sourceentity);
					}
					world.setBlock(BlockPos.containing(x, y, z + 3), Blocks.AIR.defaultBlockState(), 3);
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorSeat1Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat2Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat3Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat4Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat5Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat6Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat7Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
							if (entityiterator instanceof ElevatorSeat8Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
								}
							}
						}
					}
				});
			}
		}
		if (!sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).inElevator) {
			entity.getPersistentData().putDouble("playerCount", (entity.getPersistentData().getDouble("playerCount") + 1));
			{
				JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.inElevator = true;
				_vars.syncPlayerVariables(sourceentity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.elevatorPlace = entity.getPersistentData().getDouble("playerCount");
				_vars.syncPlayerVariables(sourceentity);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Message"), false);
		}
	}
}