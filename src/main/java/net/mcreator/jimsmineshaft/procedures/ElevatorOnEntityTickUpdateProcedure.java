package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ElevatorOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomNum = 0;
		entity.getPersistentData().putDouble("doorCooldown", (entity.getPersistentData().getDouble("doorCooldown") - 1));
		{
			Entity _ent = entity;
			_ent.setYRot(0);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		if (("down").equals(entity.getPersistentData().getString("movement"))) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y - 0.2), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y - 0.2), z, _ent.getYRot(), _ent.getXRot());
			}
		}
		if (Level.OVERWORLD == (entity.level().dimension())) {
			if (entity.getY() < 20) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							{
								JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.darknessOverlay = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay + 1;
								_vars.syncPlayerVariables(entityiterator);
							}
						}
					}
				}
			}
			if (entity.getY() < 0) {
				entity.getPersistentData().putString("movement", "null");
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat1Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 1;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat2Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 2;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat3Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 3;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat4Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 4;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat5Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 5;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat6Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 6;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat7Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 7;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
							if ((entityiterator.getVehicle()) instanceof ElevatorSeat8Entity) {
								{
									JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
									_vars.elevatorSeatNumber = 8;
									_vars.syncPlayerVariables(entityiterator);
								}
							}
						}
						if (entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension"));
							if (_player.level().dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), Set.of(), _player.getYRot(), _player.getXRot(), true);
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance _effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
						entityiterator.getPersistentData().putBoolean("hasJustChangedDimension", true);
					}
				}
				JimsmineshaftMod.queueServerWork(40, () -> {
					if (!entity.level().isClientSide())
						entity.discard();
				});
			}
		}
		randomNum = Mth.nextInt(RandomSource.create(), 1, 8);
		if (("up").equals(entity.getPersistentData().getString("movement"))) {
			if (0 >= entity.getPersistentData().getDouble("soundCount")) {
				entity.getPersistentData().putDouble("soundCount", 20);
				if (randomNum == 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator1")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator1")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 2) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator2")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator2")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 3) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator3")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator3")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator4")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator4")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator5")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator5")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator6")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator6")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator7")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator7")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 8) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator8")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator8")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("soundCount", (entity.getPersistentData().getDouble("soundCount") - 1));
			}
		}
		if (("down").equals(entity.getPersistentData().getString("movement"))) {
			if (0 >= entity.getPersistentData().getDouble("soundCount")) {
				entity.getPersistentData().putDouble("soundCount", 20);
				if (randomNum == 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator1")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator1")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 2) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator2")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator2")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 3) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator3")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator3")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator4")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator4")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator5")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator5")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator6")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator6")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator7")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator7")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (randomNum == 8) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator8")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevator8")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("soundCount", (entity.getPersistentData().getDouble("soundCount") - 1));
			}
		}
	}
}