package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SkinStealerEntityEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ())));
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = JimsmineshaftModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(entity.getYRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				entityToSpawn.setXRot(entity.getXRot());
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		JimsmineshaftMod.queueServerWork(20, () -> {
			entity.getPersistentData().putDouble("pinnedYaw", (entity.getYRot()));
			entity.getPersistentData().putDouble("pinnedPitch", (entity.getXRot()));
			if (entity instanceof SkinStealerEntityEntity _datEntSetL)
				_datEntSetL.getEntityData().set(SkinStealerEntityEntity.DATA_snapped, true);
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if ((sourceentity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())) {
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.3), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkercrack")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkercrack")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						JimsmineshaftMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkerrip1")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkerrip1")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							JimsmineshaftMod.queueServerWork(4, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
								JimsmineshaftMod.queueServerWork(4, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
									JimsmineshaftMod.queueServerWork(4, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
										JimsmineshaftMod.queueServerWork(4, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
											JimsmineshaftMod.queueServerWork(4, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												JimsmineshaftMod.queueServerWork(4, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												});
												if (world instanceof ServerLevel _level)
													_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												JimsmineshaftMod.queueServerWork(4, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1.15), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												});
											});
										});
									});
								});
							});
							JimsmineshaftMod.queueServerWork(25, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkerrip1")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkerrip1")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
								JimsmineshaftMod.queueServerWork(4, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
									JimsmineshaftMod.queueServerWork(4, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
										JimsmineshaftMod.queueServerWork(4, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
											JimsmineshaftMod.queueServerWork(4, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												if (world instanceof ServerLevel _level)
													_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												JimsmineshaftMod.queueServerWork(4, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
													JimsmineshaftMod.queueServerWork(4, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
														if (world instanceof ServerLevel _level)
															_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.DELETED_MOD_ELEMENT.get()), (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
													});
												});
											});
										});
									});
								});
								JimsmineshaftMod.queueServerWork(27, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.totem.use")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.totem.use")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkerscream1")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:stalkerscream1")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 25, 0.2, 0.4, 0.2, 0.2);
									JimsmineshaftMod.queueServerWork(4, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 25, 0.2, 0.4, 0.2, 0.2);
										JimsmineshaftMod.queueServerWork(4, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 25, 0.2, 0.4, 0.2, 0.2);
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = JimsmineshaftModEntities.STALKER.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
												if (entityToSpawn != null) {
													entityToSpawn.setYRot(entity.getYRot() + 180);
													entityToSpawn.setYBodyRot(entity.getYRot() + 180);
													entityToSpawn.setYHeadRot(entity.getYRot() + 180);
													entityToSpawn.setXRot(entity.getXRot());
													entityToSpawn.setDeltaMovement(0, 0, 0);
												}
											}
											JimsmineshaftMod.queueServerWork(4, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 25, 0.2, 0.4, 0.2, 0.2);
												JimsmineshaftMod.queueServerWork(4, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 50, 0.2, 0.4, 0.2, 0.2);
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 0.75), (entity.getZ()), 25, 0.2, 0.4, 0.2, 0.2);
												});
											});
										});
									});
								});
							});
						});
					}
				}
			}
		});
	}
}