package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class CopperDrilledNorthPlaybackConditionProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		return execute(null, world, x, y, z, entity);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof CopperDrilledNorthEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5), 20, 0.2, 0.02, 1, 1);
			JimsmineshaftMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
				JimsmineshaftMod.queueServerWork(2, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
					JimsmineshaftMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
						JimsmineshaftMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
							JimsmineshaftMod.queueServerWork(2, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
								JimsmineshaftMod.queueServerWork(2, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
									JimsmineshaftMod.queueServerWork(2, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
										JimsmineshaftMod.queueServerWork(2, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
											JimsmineshaftMod.queueServerWork(2, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
												JimsmineshaftMod.queueServerWork(2, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
													JimsmineshaftMod.queueServerWork(2, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
														JimsmineshaftMod.queueServerWork(2, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
															JimsmineshaftMod.queueServerWork(2, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																JimsmineshaftMod.queueServerWork(2, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1,
																																										1);
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0,
																																											1, 1);
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0, 1,
																																											1);
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2,
																																												0, 1, 1);
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10, 0.2, 0,
																																												1, 1);
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5), 10,
																																													0.2, 0, 1, 1);
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10,
																																													0.2, 0, 1, 1);
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5), (z + 0.5),
																																														10, 0.2, 0, 1, 1);
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5), 10,
																																														0.2, 0, 1, 1);
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5),
																																															(z + 0.5), 10, 0.2, 0, 1, 1);
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5), (z + 0.5),
																																															10, 0.2, 0, 1, 1);
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5),
																																																(z + 0.5), 10, 0.2, 0, 1, 1);
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5),
																																																(z + 0.5), 10, 0.2, 0, 1, 1);
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.CLOUD, (x - 0), (y + 0.5),
																																																	(z + 0.5), 10, 0.2, 0, 1, 1);
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.ASH, (x - 0), (y + 0.5),
																																																	(z + 0.5), 10, 0.2, 0, 1, 1);
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.CLOUD, (x - 0),
																																																		(y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.ASH, (x - 0),
																																																		(y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.CLOUD, (x - 0),
																																																			(y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.ASH, (x - 0),
																																																			(y + 0.5), (z + 0.5), 10, 0.2, 0, 1, 1);
																																																if (!entity.level().isClientSide())
																																																	entity.discard();
																																																world.setBlock(BlockPos.containing(x, y, z),
																																																		JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH
																																																				.get().defaultBlockState(),
																																																		3);
																																															});
																																														});
																																													});
																																												});
																																											});
																																										});
																																									});
																																								});
																																							});
																																						});
																																					});
																																				});
																																			});
																																		});
																																	});
																																});
																															});
																														});
																													});
																												});
																											});
																										});
																									});
																								});
																							});
																						});
																					});
																				});
																			});
																		});
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
			return true;
		}
		return false;
	}
}