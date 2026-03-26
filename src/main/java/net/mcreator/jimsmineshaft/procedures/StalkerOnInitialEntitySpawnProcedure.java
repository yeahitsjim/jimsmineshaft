package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.jimsmineshaft.entity.StalkerEntity;
import net.mcreator.jimsmineshaft.entity.SkinStealerEntityEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.Comparator;

public class StalkerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof SkinStealerEntityEntity) {
					if (entityiterator instanceof SkinStealerEntityEntity _datEntL1 && _datEntL1.getEntityData().get(SkinStealerEntityEntity.DATA_snapped)) {
						{
							Entity _ent = entity;
							_ent.setYRot(entityiterator.getYRot());
							_ent.setXRot(entityiterator.getXRot());
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
							_datEntSetI.getEntityData().set(StalkerEntity.DATA_transition, 2);
						if (entity instanceof StalkerEntity _datEntSetL)
							_datEntSetL.getEntityData().set(StalkerEntity.DATA_transformed, true);
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_pose, "transformed");
						if (entity instanceof StalkerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StalkerEntity.DATA_attack, "transformed");
						{
							Entity _ent = entity;
							_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
						}
						JimsmineshaftMod.queueServerWork(2, () -> {
							{
								Entity _ent = entity;
								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
							}
							JimsmineshaftMod.queueServerWork(2, () -> {
								{
									Entity _ent = entity;
									_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								JimsmineshaftMod.queueServerWork(2, () -> {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									JimsmineshaftMod.queueServerWork(2, () -> {
										{
											Entity _ent = entity;
											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
										}
										JimsmineshaftMod.queueServerWork(2, () -> {
											{
												Entity _ent = entity;
												_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
											}
											JimsmineshaftMod.queueServerWork(2, () -> {
												{
													Entity _ent = entity;
													_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
												}
												JimsmineshaftMod.queueServerWork(2, () -> {
													{
														Entity _ent = entity;
														_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
													}
													JimsmineshaftMod.queueServerWork(2, () -> {
														{
															Entity _ent = entity;
															_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
														}
														JimsmineshaftMod.queueServerWork(2, () -> {
															{
																Entity _ent = entity;
																_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																if (_ent instanceof ServerPlayer _serverPlayer)
																	_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
															}
															JimsmineshaftMod.queueServerWork(2, () -> {
																{
																	Entity _ent = entity;
																	_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																}
																JimsmineshaftMod.queueServerWork(2, () -> {
																	{
																		Entity _ent = entity;
																		_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																		if (_ent instanceof ServerPlayer _serverPlayer)
																			_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																	}
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		{
																			Entity _ent = entity;
																			_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																		}
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			{
																				Entity _ent = entity;
																				_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																				if (_ent instanceof ServerPlayer _serverPlayer)
																					_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																			}
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				{
																					Entity _ent = entity;
																					_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																				}
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					{
																						Entity _ent = entity;
																						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																						if (_ent instanceof ServerPlayer _serverPlayer)
																							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																					}
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						{
																							Entity _ent = entity;
																							_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																						}
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							{
																								Entity _ent = entity;
																								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																								if (_ent instanceof ServerPlayer _serverPlayer)
																									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																							}
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								{
																									Entity _ent = entity;
																									_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																								}
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									{
																										Entity _ent = entity;
																										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																										if (_ent instanceof ServerPlayer _serverPlayer)
																											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																									}
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										{
																											Entity _ent = entity;
																											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(),
																														_ent.getXRot());
																										}
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											{
																												Entity _ent = entity;
																												_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																												if (_ent instanceof ServerPlayer _serverPlayer)
																													_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(),
																															_ent.getXRot());
																											}
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												{
																													Entity _ent = entity;
																													_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(),
																																_ent.getXRot());
																												}
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													{
																														Entity _ent = entity;
																														_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																														if (_ent instanceof ServerPlayer _serverPlayer)
																															_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(),
																																	_ent.getXRot());
																													}
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														{
																															Entity _ent = entity;
																															_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
																																		_ent.getYRot(), _ent.getXRot());
																														}
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															{
																																Entity _ent = entity;
																																_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																																if (_ent instanceof ServerPlayer _serverPlayer)
																																	_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
																																			_ent.getYRot(), _ent.getXRot());
																															}
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																{
																																	Entity _ent = entity;
																																	_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
																																				_ent.getYRot(), _ent.getXRot());
																																}
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	{
																																		Entity _ent = entity;
																																		_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																			_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
																																					_ent.getYRot(), _ent.getXRot());
																																	}
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		{
																																			Entity _ent = entity;
																																			_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()),
																																						(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																		}
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			{
																																				Entity _ent = entity;
																																				_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																					_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()),
																																							(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																			}
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				{
																																					Entity _ent = entity;
																																					_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()),
																																								(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																				}
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
					}
				}
			}
		}
	}
}