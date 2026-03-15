package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.Comparator;

public class ActivateElevatoreOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				JimsmineshaftMod.queueServerWork(2, () -> {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					JimsmineshaftMod.queueServerWork(2, () -> {
						{
							Entity _ent = entityiterator;
							_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
						}
						JimsmineshaftMod.queueServerWork(2, () -> {
							{
								Entity _ent = entityiterator;
								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
							}
							JimsmineshaftMod.queueServerWork(2, () -> {
								{
									Entity _ent = entityiterator;
									_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								JimsmineshaftMod.queueServerWork(2, () -> {
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									JimsmineshaftMod.queueServerWork(2, () -> {
										{
											Entity _ent = entityiterator;
											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
										}
										JimsmineshaftMod.queueServerWork(2, () -> {
											{
												Entity _ent = entityiterator;
												_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
											}
											JimsmineshaftMod.queueServerWork(2, () -> {
												{
													Entity _ent = entityiterator;
													_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
												}
												JimsmineshaftMod.queueServerWork(2, () -> {
													{
														Entity _ent = entityiterator;
														_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
													}
													JimsmineshaftMod.queueServerWork(2, () -> {
														{
															Entity _ent = entityiterator;
															_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
														}
														JimsmineshaftMod.queueServerWork(2, () -> {
															{
																Entity _ent = entityiterator;
																_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																if (_ent instanceof ServerPlayer _serverPlayer)
																	_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
															}
															JimsmineshaftMod.queueServerWork(2, () -> {
																{
																	Entity _ent = entityiterator;
																	_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																}
																JimsmineshaftMod.queueServerWork(2, () -> {
																	{
																		Entity _ent = entityiterator;
																		_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																		if (_ent instanceof ServerPlayer _serverPlayer)
																			_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																	}
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		{
																			Entity _ent = entityiterator;
																			_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																		}
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			{
																				Entity _ent = entityiterator;
																				_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																				if (_ent instanceof ServerPlayer _serverPlayer)
																					_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																			}
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				{
																					Entity _ent = entityiterator;
																					_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																				}
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					{
																						Entity _ent = entityiterator;
																						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																						if (_ent instanceof ServerPlayer _serverPlayer)
																							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																					}
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						{
																							Entity _ent = entityiterator;
																							_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																						}
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							{
																								Entity _ent = entityiterator;
																								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																								if (_ent instanceof ServerPlayer _serverPlayer)
																									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																							}
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								{
																									Entity _ent = entityiterator;
																									_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																												_ent.getXRot());
																								}
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									{
																										Entity _ent = entityiterator;
																										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																										if (_ent instanceof ServerPlayer _serverPlayer)
																											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																													_ent.getXRot());
																									}
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										{
																											Entity _ent = entityiterator;
																											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																														_ent.getXRot());
																										}
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											{
																												Entity _ent = entityiterator;
																												_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																												if (_ent instanceof ServerPlayer _serverPlayer)
																													_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																															_ent.getXRot());
																											}
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												{
																													Entity _ent = entityiterator;
																													_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																																_ent.getXRot());
																												}
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													{
																														Entity _ent = entityiterator;
																														_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																														if (_ent instanceof ServerPlayer _serverPlayer)
																															_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																	_ent.getYRot(), _ent.getXRot());
																													}
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														{
																															Entity _ent = entityiterator;
																															_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																		_ent.getYRot(), _ent.getXRot());
																														}
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															{
																																Entity _ent = entityiterator;
																																_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																if (_ent instanceof ServerPlayer _serverPlayer)
																																	_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																			_ent.getYRot(), _ent.getXRot());
																															}
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																{
																																	Entity _ent = entityiterator;
																																	_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																				_ent.getYRot(), _ent.getXRot());
																																}
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	{
																																		Entity _ent = entityiterator;
																																		_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																			_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																					(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																	}
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		{
																																			Entity _ent = entityiterator;
																																			_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																						(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																		}
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			{
																																				Entity _ent = entityiterator;
																																				_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																					_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																							(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																			}
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				{
																																					Entity _ent = entityiterator;
																																					_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																								(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																				}
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					{
																																						Entity _ent = entityiterator;
																																						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																									(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																					}
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						{
																																							Entity _ent = entityiterator;
																																							_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																									(entityiterator.getZ()));
																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																								_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																										(entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
																																						}
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							{
																																								Entity _ent = entityiterator;
																																								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																										(entityiterator.getZ()));
																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																									_serverPlayer.connection.teleport((entityiterator.getX()),
																																											(entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																																											_ent.getXRot());
																																							}
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								{
																																									Entity _ent = entityiterator;
																																									_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																											(entityiterator.getZ()));
																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																										_serverPlayer.connection.teleport((entityiterator.getX()),
																																												(entityiterator.getY() + 0.1), (entityiterator.getZ()), _ent.getYRot(),
																																												_ent.getXRot());
																																								}
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									{
																																										Entity _ent = entityiterator;
																																										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																												(entityiterator.getZ()));
																																										if (_ent instanceof ServerPlayer _serverPlayer)
																																											_serverPlayer.connection.teleport((entityiterator.getX()),
																																													(entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																													_ent.getYRot(), _ent.getXRot());
																																									}
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										{
																																											Entity _ent = entityiterator;
																																											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																													(entityiterator.getZ()));
																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																												_serverPlayer.connection.teleport((entityiterator.getX()),
																																														(entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																														_ent.getYRot(), _ent.getXRot());
																																										}
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											{
																																												Entity _ent = entityiterator;
																																												_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 0.1),
																																														(entityiterator.getZ()));
																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																													_serverPlayer.connection.teleport((entityiterator.getX()),
																																															(entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																															_ent.getYRot(), _ent.getXRot());
																																											}
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												{
																																													Entity _ent = entityiterator;
																																													_ent.teleportTo((entityiterator.getX()),
																																															(entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																														_serverPlayer.connection.teleport((entityiterator.getX()),
																																																(entityiterator.getY() + 0.1), (entityiterator.getZ()),
																																																_ent.getYRot(), _ent.getXRot());
																																												}
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													{
																																														Entity _ent = entityiterator;
																																														_ent.teleportTo((entityiterator.getX()),
																																																(entityiterator.getY() + 0.1), (entityiterator.getZ()));
																																														if (_ent instanceof ServerPlayer _serverPlayer)
																																															_serverPlayer.connection.teleport((entityiterator.getX()),
																																																	(entityiterator.getY() + 0.1),
																																																	(entityiterator.getZ()), _ent.getYRot(),
																																																	_ent.getXRot());
																																													}
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														{
																																															Entity _ent = entityiterator;
																																															_ent.teleportTo((entityiterator.getX()),
																																																	(entityiterator.getY() + 0.1),
																																																	(entityiterator.getZ()));
																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																_serverPlayer.connection.teleport((entityiterator.getX()),
																																																		(entityiterator.getY() + 0.1),
																																																		(entityiterator.getZ()), _ent.getYRot(),
																																																		_ent.getXRot());
																																														}
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															{
																																																Entity _ent = entityiterator;
																																																_ent.teleportTo((entityiterator.getX()),
																																																		(entityiterator.getY() + 0.1),
																																																		(entityiterator.getZ()));
																																																if (_ent instanceof ServerPlayer _serverPlayer)
																																																	_serverPlayer.connection.teleport(
																																																			(entityiterator.getX()),
																																																			(entityiterator.getY() + 0.1),
																																																			(entityiterator.getZ()), _ent.getYRot(),
																																																			_ent.getXRot());
																																															}
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																{
																																																	Entity _ent = entityiterator;
																																																	_ent.teleportTo((entityiterator.getX()),
																																																			(entityiterator.getY() + 0.1),
																																																			(entityiterator.getZ()));
																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																		_serverPlayer.connection.teleport(
																																																				(entityiterator.getX()),
																																																				(entityiterator.getY() + 0.1),
																																																				(entityiterator.getZ()), _ent.getYRot(),
																																																				_ent.getXRot());
																																																}
																																																JimsmineshaftMod.queueServerWork(2, () -> {
																																																	{
																																																		Entity _ent = entityiterator;
																																																		_ent.teleportTo((entityiterator.getX()),
																																																				(entityiterator.getY() + 0.1),
																																																				(entityiterator.getZ()));
																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																			_serverPlayer.connection.teleport(
																																																					(entityiterator.getX()),
																																																					(entityiterator.getY() + 0.1),
																																																					(entityiterator.getZ()),
																																																					_ent.getYRot(), _ent.getXRot());
																																																	}
																																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																																		{
																																																			Entity _ent = entityiterator;
																																																			_ent.teleportTo((entityiterator.getX()),
																																																					(entityiterator.getY() + 0.1),
																																																					(entityiterator.getZ()));
																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																				_serverPlayer.connection.teleport(
																																																						(entityiterator.getX()),
																																																						(entityiterator.getY() + 0.1),
																																																						(entityiterator.getZ()),
																																																						_ent.getYRot(), _ent.getXRot());
																																																		}
																																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																																			{
																																																				Entity _ent = entityiterator;
																																																				_ent.teleportTo((entityiterator.getX()),
																																																						(entityiterator.getY() + 0.1),
																																																						(entityiterator.getZ()));
																																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																																					_serverPlayer.connection.teleport(
																																																							(entityiterator.getX()),
																																																							(entityiterator.getY() + 0.1),
																																																							(entityiterator.getZ()),
																																																							_ent.getYRot(),
																																																							_ent.getXRot());
																																																			}
																																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																																				{
																																																					Entity _ent = entityiterator;
																																																					_ent.teleportTo(
																																																							(entityiterator.getX()),
																																																							(entityiterator.getY() + 0.1),
																																																							(entityiterator.getZ()));
																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																						_serverPlayer.connection.teleport(
																																																								(entityiterator.getX()),
																																																								(entityiterator.getY()
																																																										+ 0.1),
																																																								(entityiterator.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
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