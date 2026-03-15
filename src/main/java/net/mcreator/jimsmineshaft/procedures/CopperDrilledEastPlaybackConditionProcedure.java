package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;
import net.mcreator.jimsmineshaft.entity.CopperDrilledEastEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CopperDrilledEastPlaybackConditionProcedure {
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
		if (entity instanceof CopperDrilledEastEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 20, 1, 0.02, 0.2, 1);
			JimsmineshaftMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
				JimsmineshaftMod.queueServerWork(2, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
					JimsmineshaftMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
						JimsmineshaftMod.queueServerWork(2, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
							JimsmineshaftMod.queueServerWork(2, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
								JimsmineshaftMod.queueServerWork(2, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
									JimsmineshaftMod.queueServerWork(2, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
										JimsmineshaftMod.queueServerWork(2, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
											JimsmineshaftMod.queueServerWork(2, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
												JimsmineshaftMod.queueServerWork(2, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
													JimsmineshaftMod.queueServerWork(2, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
														JimsmineshaftMod.queueServerWork(2, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
															JimsmineshaftMod.queueServerWork(2, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																JimsmineshaftMod.queueServerWork(2, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2,
																																										1);
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0, 0.2,
																																										1);
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0,
																																											0.2, 1);
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1, 0, 0.2,
																																											1);
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1,
																																												0, 0.2, 1);
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0.5), 10, 1, 0,
																																												0.2, 1);
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0), 10,
																																													1, 0, 0.2, 1);
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10, 1,
																																													0, 0.2, 1);
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z - 0),
																																														10, 1, 0, 0.2, 1);
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0), 10,
																																														1, 0, 0.2, 1);
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5),
																																															(z - 0), 10, 1, 0, 0.2, 1);
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5), (z - 0),
																																															10, 1, 0, 0.2, 1);
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5),
																																																(z - 0.5), 10, 1, 0, 0.2, 1);
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5),
																																																(z - 0.5), 10, 1, 0, 0.2, 1);
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5),
																																																	(y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.ASH, (x + 0.5), (y + 0.5),
																																																	(z - 0), 10, 1, 0, 0.2, 1);
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5),
																																																		(y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.ASH, (x + 0.5),
																																																		(y + 0.5), (z - 0.5), 10, 1, 0, 0.2, 1);
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5),
																																																			(y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.ASH, (x + 0.5),
																																																			(y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																																JimsmineshaftMod.queueServerWork(2, () -> {
																																																	if (world instanceof ServerLevel _level)
																																																		_level.sendParticles(ParticleTypes.CLOUD,
																																																				(x + 0.5), (y + 0.5), (z - 0), 10, 1, 0,
																																																				0.2, 1);
																																																	if (world instanceof ServerLevel _level)
																																																		_level.sendParticles(ParticleTypes.ASH, (x + 0.5),
																																																				(y + 0.5), (z - 0), 10, 1, 0, 0.2, 1);
																																																	if (!entity.level().isClientSide())
																																																		entity.discard();
																																																	world.setBlock(BlockPos.containing(x, y, z),
																																																			JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST
																																																					.get().defaultBlockState(),
																																																			3);
																																																	{
																																																		Direction _dir = Direction.EAST;
																																																		BlockPos _pos = BlockPos.containing(x, y, z);
																																																		BlockState _bs = world.getBlockState(_pos);
																																																		if (_bs.getBlock().getStateDefinition()
																																																				.getProperty(
																																																						"facing") instanceof EnumProperty _dp
																																																				&& _dp.getPossibleValues()
																																																						.contains(_dir)) {
																																																			world.setBlock(_pos, _bs.setValue(_dp, _dir),
																																																					3);
																																																		} else if (_bs.getBlock().getStateDefinition()
																																																				.getProperty(
																																																						"axis") instanceof EnumProperty _ap
																																																				&& _ap.getPossibleValues()
																																																						.contains(_dir.getAxis())) {
																																																			world.setBlock(_pos,
																																																					_bs.setValue(_ap, _dir.getAxis()), 3);
																																																		}
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
			return true;
		}
		return false;
	}
}