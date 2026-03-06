package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StalkerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean safasfasdfasdf = false;
		if (entity instanceof StalkerEntity _datEntL0 && _datEntL0.getEntityData().get(StalkerEntity.DATA_transformed)) {
			safasfasdfasdf = true;
		} else {
			if (!((entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : "").equals("transform"))) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					if (Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
							+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) < 7) {
						if (!world.isClientSide()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalker.emerge")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalker.emerge")), SoundSource.HOSTILE, 1, 1, false);
								}
							}
						}
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "transform");
						entity.getPersistentData().putDouble("FaceDir", (entity.getYRot()));
					}
				}
			} else {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
			}
		}
		if ((entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : "").equals("transform")) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) entity.getPersistentData().getDouble("FaceDir"));
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
			if (entity instanceof StalkerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StalkerEntity.DATA_attackTicks, (int) ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) + 1));
			if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 10) {
				if (entity instanceof StalkerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(StalkerEntity.DATA_transition, 1);
			}
			if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 20) {
				if (entity instanceof StalkerEntity _datEntSetI)
					_datEntSetI.getEntityData().set(StalkerEntity.DATA_transition, 2);
			}
			if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 90) {
				if (entity instanceof StalkerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(StalkerEntity.DATA_transformed, true);
				if (entity instanceof StalkerEntity _datEntSetS)
					_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "");
			}
		} else if (entity instanceof StalkerEntity _datEntL31 && _datEntL31.getEntityData().get(StalkerEntity.DATA_transformed)) {
			if (entity instanceof StalkerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StalkerEntity.DATA_attackTicks, (int) ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) + 1));
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if ((entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_attack) : "").equals("impale")) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3, 1, false, false));
					if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 1) {
						if (!world.isClientSide()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalker_growl_1")), SoundSource.HOSTILE, 1,
											(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalker_growl_1")), SoundSource.HOSTILE, 1, (float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2),
											false);
								}
							}
						}
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "impale_start");
					}
					if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 19) {
						if (!world.isClientSide()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalker_impale")), SoundSource.HOSTILE, 1,
											(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalker_impale")), SoundSource.HOSTILE, 1, (float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2),
											false);
								}
							}
						}
						if (Math.sqrt(
								Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
										+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) < 5) {
							if (entity instanceof StalkerEntity _datEntSetS)
								_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "impale_hit");
							entity.getPersistentData().putString("ImpaleEntity", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
							entity.getPersistentData().putDouble("FaceDir",
									Math.atan(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ())));
							entity.getPersistentData().putDouble("ImpaleDistance",
									Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2)
											+ Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
											+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)));
						} else {
							if (entity instanceof StalkerEntity _datEntSetS)
								_datEntSetS.getEntityData().set(StalkerEntity.DATA_attack, "");
							if (entity instanceof StalkerEntity _datEntSetS)
								_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "");
							if (entity instanceof StalkerEntity _datEntSetI)
								_datEntSetI.getEntityData().set(StalkerEntity.DATA_attackTicks, -30);
						}
					}
					if ((entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : "").equals("impale_hit")) {
						entity.setDeltaMovement(new Vec3(0, 0, 0));
						{
							Entity _ent = entity;
							_ent.setYRot((float) entity.getPersistentData().getDouble("FaceDir"));
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
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
							(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).setNoGravity(true);
							{
								Entity _ent = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null);
								_ent.teleportTo((x + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("FaceDir"))) * entity.getPersistentData().getDouble("ImpaleDistance")),
										(y + 0.15 * entity.getPersistentData().getDouble("ImpaleDistance")), (z + Math.cos(Math.toRadians(entity.getPersistentData().getDouble("FaceDir"))) * entity.getPersistentData().getDouble("ImpaleDistance")));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((x + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("FaceDir"))) * entity.getPersistentData().getDouble("ImpaleDistance")),
											(y + 0.15 * entity.getPersistentData().getDouble("ImpaleDistance")), (z + Math.cos(Math.toRadians(entity.getPersistentData().getDouble("FaceDir"))) * entity.getPersistentData().getDouble("ImpaleDistance")),
											_ent.getYRot(), _ent.getXRot());
							}
							if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 45) {
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).hurt(new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK), entity), 150);
							}
						} else {
							if (entity instanceof StalkerEntity _datEntSetS)
								_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "");
							if (entity instanceof StalkerEntity _datEntSetS)
								_datEntSetS.getEntityData().set(StalkerEntity.DATA_attack, "");
						}
					}
					if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) == 60) {
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "");
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_attack, "");
					}
				}
			} else {
				if (entity instanceof StalkerEntity _datEntSetS)
					_datEntSetS.getEntityData().set(StalkerEntity.DATA_attack, "");
				if (entity instanceof StalkerEntity _datEntSetS)
					_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "");
			}
			if ((entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_attack) : "").equals("")) {
				if (entity instanceof StalkerEntity _datEntSetS)
					_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "");
				if ((entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_attackTicks) : 0) > 0) {
					if (entity instanceof StalkerEntity _datEntSetI)
						_datEntSetI.getEntityData().set(StalkerEntity.DATA_attackTicks, 0);
				}
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					if (Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY(), 2)
							+ Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2)) < 6.7) {
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_attack, "impale");
					}
				}
			}
		}
		if (!((entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : "").equals(entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_lastPose) : ""))) {
			PacketDistributor.sendToAllPlayers(new StalkerPoseSetPacketMessage((entity.getStringUUID() + "," + (entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : ""))));
			if (entity instanceof StalkerEntity _datEntSetS)
				_datEntSetS.getEntityData().set(StalkerEntity.DATA_lastPose, (entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : ""));
		}
	}
}