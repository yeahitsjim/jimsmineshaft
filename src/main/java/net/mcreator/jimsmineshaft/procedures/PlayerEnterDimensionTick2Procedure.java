package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat8Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat7Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat6Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat5Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat4Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat3Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat2Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat1Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorFAILSAFEboxEntity;
import net.mcreator.jimsmineshaft.entity.ElevatorEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class PlayerEnterDimensionTick2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean elevatorExist = false;
		boolean detectedElevator = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof ElevatorEntity) {
					{
						JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
						_vars.nearElevator = true;
						_vars.syncPlayerVariables(entity);
					}
					detectedElevator = true;
				}
			}
		}
		if (!detectedElevator) {
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.nearElevator = false;
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.inElevator = false;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())
				|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension")) == (entity.level().dimension())
				|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
			if (entity.getPersistentData().getBoolean("canLowerOverlay")) {
				if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay > 0) {
					{
						JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
						_vars.darknessOverlay = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay - 1;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("hasJustChangedDimension")) {
			entity.getPersistentData().putBoolean("hasJustChangedDimension", false);
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension())) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_FAILSAF_EBOX.get().spawn(_level, new BlockPos(0, 216, 0), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				JimsmineshaftMod.queueServerWork(120, () -> {
					{
						final Vec3 _center = new Vec3(0, 221, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorFAILSAFEboxEntity) {
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
				});
				JimsmineshaftMod.queueServerWork(140, () -> {
					{
						final Vec3 _center = new Vec3(0, 216, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (entityiterator instanceof Player) {
									if (entity.getY() < 209) {
										{
											Entity _ent = entity;
											_ent.teleportTo(0, 217, 6.5);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(0, 217, 6.5, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					}
				});
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (!(Blocks.BEDROCK == (world.getBlockState(new BlockPos(100, 250, 0))).getBlock())) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "shop3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(-16, 202, -5), new BlockPos(-16, 202, -5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
										3);
							}
						}
						world.setBlock(new BlockPos(100, 250, 0), Blocks.BEDROCK.defaultBlockState(), 3);
					}
				});
				if (!JimsmineshaftModVariables.MapVariables.get(world).hasBeenPaid) {
					JimsmineshaftModVariables.MapVariables.get(world).hasBeenPaid = true;
					JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
					JimsmineshaftMod.queueServerWork(25, () -> {
						for (int index0 = 0; index0 < (int) ((JimsmineshaftModVariables.MapVariables.get(world).cashReturnedFromLevel * 0.05) / 10); index0++) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					});
				}
				JimsmineshaftMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("canLowerOverlay", true);
				});
				JimsmineshaftMod.queueServerWork(5, () -> {
					{
						Entity _ent = entity;
						_ent.teleportTo(0, 250, 0);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(0, 250, 0, _ent.getYRot(), _ent.getXRot());
					}
				});
				{
					final Vec3 _center = new Vec3(0, 250, 0);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof ElevatorEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
				{
					final Vec3 _center = new Vec3(0, 250, 0);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof ElevatorEntity) {
							elevatorExist = true;
							entityiterator.getPersistentData().putString("movement", "down");
							entityiterator.getPersistentData().putString("stage", "shop");
						}
					}
				}
				if (elevatorExist == false) {
					JimsmineshaftMod.queueServerWork(5, () -> {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR.get().spawn(_level, new BlockPos(0, 250, 0), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						{
							final Vec3 _center = new Vec3(0, 250, 0);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
								if (entityiterator instanceof ElevatorEntity) {
									entityiterator.getPersistentData().putString("movement", "down");
									entityiterator.getPersistentData().putString("stage", "shop");
								}
							}
						}
					});
				}
				JimsmineshaftMod.queueServerWork(12, () -> {
					{
						final Vec3 _center = new Vec3(0, 250, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorEntity) {
								entityiterator.getPersistentData().putString("movement", "down");
								entityiterator.getPersistentData().putString("stage", "shop");
							}
						}
					}
				});
				JimsmineshaftMod.queueServerWork(19, () -> {
					if (entity instanceof Player) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Seat: " + entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber)), false);
						if (1 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat1Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (2 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat2Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (3 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat3Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (4 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat4Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (5 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat5Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (6 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat6Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (7 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat7Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (8 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat8Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (0 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (!entityiterator.isVehicle()) {
										if (entityiterator instanceof ElevatorSeat1Entity) {
											entity.startRiding(entityiterator);
										}
									} else {
										if (!entityiterator.isVehicle()) {
											if (entityiterator instanceof ElevatorSeat5Entity) {
												entity.startRiding(entityiterator);
											}
										} else {
											if (!entityiterator.isVehicle()) {
												if (entityiterator instanceof ElevatorSeat6Entity) {
													entity.startRiding(entityiterator);
												}
											} else {
												if (!entityiterator.isVehicle()) {
													if (entityiterator instanceof ElevatorSeat3Entity) {
														entity.startRiding(entityiterator);
													}
												} else {
													if (!entityiterator.isVehicle()) {
														if (entityiterator instanceof ElevatorSeat4Entity) {
															entity.startRiding(entityiterator);
														}
													} else {
														if (!entityiterator.isVehicle()) {
															if (entityiterator instanceof ElevatorSeat7Entity) {
																entity.startRiding(entityiterator);
															}
														} else {
															if (!entityiterator.isVehicle()) {
																if (entityiterator instanceof ElevatorSeat8Entity) {
																	entity.startRiding(entityiterator);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				});
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())
					|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension")) == (entity.level().dimension())
					|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR_FAILSAF_EBOX.get().spawn(_level, new BlockPos(0, 216, 0), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				JimsmineshaftMod.queueServerWork(120, () -> {
					{
						final Vec3 _center = new Vec3(0, 216, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorFAILSAFEboxEntity) {
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
				});
				JimsmineshaftMod.queueServerWork(140, () -> {
					{
						final Vec3 _center = new Vec3(0, 216, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (entityiterator instanceof Player) {
									if (entity.getY() < 209) {
										{
											Entity _ent = entity;
											_ent.teleportTo(0, 217, 6.5);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(0, 217, 6.5, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					}
				});
				JimsmineshaftMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("canLowerOverlay", true);
				});
				JimsmineshaftMod.queueServerWork(5, () -> {
					{
						Entity _ent = entity;
						_ent.teleportTo(0, 250, 0);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(0, 250, 0, _ent.getYRot(), _ent.getXRot());
					}
				});
				JimsmineshaftMod.queueServerWork(5, () -> {
					JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 1;
					JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
				});
				if (!entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).hadDiedInMatch) {
					{
						final Vec3 _center = new Vec3(0, 250, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorEntity) {
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
					{
						final Vec3 _center = new Vec3(0, 250, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(150 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorEntity) {
								elevatorExist = true;
								entityiterator.getPersistentData().putString("movement", "down");
								entityiterator.getPersistentData().putString("stage", "shop");
							}
						}
					}
					if (elevatorExist == false) {
						JimsmineshaftMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR.get().spawn(_level, new BlockPos(0, 250, 0), EntitySpawnReason.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorEntity) {
										entityiterator.getPersistentData().putString("movement", "down");
										entityiterator.getPersistentData().putString("stage", "shop");
									}
								}
							}
						});
					}
				} else {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
				}
				JimsmineshaftMod.queueServerWork(20, () -> {
					{
						final Vec3 _center = new Vec3(0, 250, 0);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof ElevatorEntity) {
								entityiterator.getPersistentData().putString("movement", "down");
								entityiterator.getPersistentData().putString("stage", "lvl1start");
							}
						}
					}
				});
				JimsmineshaftMod.queueServerWork(12, () -> {
					if (entity instanceof Player) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Seat: " + entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber)), false);
						if (1 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat1Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (2 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat2Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (3 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat3Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (4 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat4Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (5 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat5Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (6 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat6Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (7 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat7Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (8 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof ElevatorSeat8Entity) {
										entity.startRiding(entityiterator);
									}
								}
							}
						}
						if (0 == entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).elevatorSeatNumber) {
							{
								final Vec3 _center = new Vec3(0, 250, 0);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (!entityiterator.isVehicle()) {
										if (entityiterator instanceof ElevatorSeat1Entity) {
											entity.startRiding(entityiterator);
										}
									} else {
										if (!entityiterator.isVehicle()) {
											if (entityiterator instanceof ElevatorSeat5Entity) {
												entity.startRiding(entityiterator);
											}
										} else {
											if (!entityiterator.isVehicle()) {
												if (entityiterator instanceof ElevatorSeat6Entity) {
													entity.startRiding(entityiterator);
												}
											} else {
												if (!entityiterator.isVehicle()) {
													if (entityiterator instanceof ElevatorSeat3Entity) {
														entity.startRiding(entityiterator);
													}
												} else {
													if (!entityiterator.isVehicle()) {
														if (entityiterator instanceof ElevatorSeat4Entity) {
															entity.startRiding(entityiterator);
														}
													} else {
														if (!entityiterator.isVehicle()) {
															if (entityiterator instanceof ElevatorSeat7Entity) {
																entity.startRiding(entityiterator);
															}
														} else {
															if (!entityiterator.isVehicle()) {
																if (entityiterator instanceof ElevatorSeat8Entity) {
																	entity.startRiding(entityiterator);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				});
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {
				JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 1;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (!(Blocks.BEDROCK == (world.getBlockState(new BlockPos(100, 250, 0))).getBlock())) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevatorshaftstone2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(-5, 172, -5), new BlockPos(-5, 172, -5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
										3);
							}
						}
						JimsmineshaftMod.queueServerWork(4, () -> {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "level1jim2"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(-165, 216, -112), new BlockPos(-165, 216, -112), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						});
						JimsmineshaftMod.queueServerWork(15, () -> {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "cartelevatorshaft2_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(-5, 172, 10), new BlockPos(-5, 172, 10), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = JimsmineshaftModEntities.THECART.get().spawn(_level, new BlockPos(3, 217, 10), EntitySpawnReason.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						});
						world.setBlock(new BlockPos(100, 250, 0), Blocks.BEDROCK.defaultBlockState(), 3);
					}
				});
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension")) == (entity.level().dimension())) {
				JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 2;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (!(Blocks.BEDROCK == (world.getBlockState(new BlockPos(100, 250, 0))).getBlock())) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevatorshaftdeepslate2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(-5, 172, -5), new BlockPos(-5, 172, -5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
										3);
							}
						}
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "albortolevel2_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(-79, 215, -77), new BlockPos(-79, 215, -77), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						JimsmineshaftMod.queueServerWork(15, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = JimsmineshaftModEntities.THECART.get().spawn(_level, new BlockPos(3, 217, 10), EntitySpawnReason.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "cartelevatoreast_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(-12, 172, 10), new BlockPos(-12, 172, 10), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						});
						world.setBlock(new BlockPos(100, 250, 0), Blocks.BEDROCK.defaultBlockState(), 3);
					}
				});
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
				JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 3;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (!(Blocks.BEDROCK == (world.getBlockState(new BlockPos(100, 250, 0))).getBlock())) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevatorshaftdeepslate2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(-5, 172, -5), new BlockPos(-5, 172, -5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
										3);
							}
						}
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "albortolevel3_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(-90, 215, -98), new BlockPos(-90, 215, -98), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						JimsmineshaftMod.queueServerWork(15, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = JimsmineshaftModEntities.THECART.get().spawn(_level, new BlockPos(3, 217, 10), EntitySpawnReason.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "cartelevatorshaftwest_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(8, 172, 11), new BlockPos(8, 172, 11), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
											3);
								}
							}
						});
						world.setBlock(new BlockPos(100, 250, 0), Blocks.BEDROCK.defaultBlockState(), 3);
					}
				});
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_4_dimension")) == (entity.level().dimension())) {
				JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 4;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_5_dimension")) == (entity.level().dimension())) {
				JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 5;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_6_dimension")) == (entity.level().dimension())) {
				JimsmineshaftModVariables.MapVariables.get(world).currentLevel = 6;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}