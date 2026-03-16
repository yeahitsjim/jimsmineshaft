package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

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
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 1;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat2Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 2;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat3Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 3;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat4Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 4;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat5Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 5;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat6Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 6;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat7Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 7;
									_vars.syncPlayerVariables(sourceentity);
								}
							}
						}
						if (entityiterator instanceof ElevatorSeat8Entity) {
							if (!entityiterator.isVehicle()) {
								sourceentity.startRiding(entityiterator);
								{
									JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 8;
									_vars.syncPlayerVariables(sourceentity);
								}
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
				JimsmineshaftMod.queueServerWork(60, () -> {
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
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 1;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat2Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 2;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat3Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 3;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat4Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 4;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat5Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 5;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat6Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 6;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat7Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 7;
										_vars.syncPlayerVariables(sourceentity);
									}
								}
							}
							if (entityiterator instanceof ElevatorSeat8Entity) {
								if (!entityiterator.isVehicle()) {
									sourceentity.startRiding(entityiterator);
									{
										JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
										_vars.elevatorSeatNumber = 8;
										_vars.syncPlayerVariables(sourceentity);
									}
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
		}
	}
}