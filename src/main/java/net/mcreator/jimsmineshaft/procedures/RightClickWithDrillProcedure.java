package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RightClickWithDrillProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double savedX = 0;
		double savedY = 0;
		double savedZ = 0;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerDrillMode) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get().asItem()) {
				if (JimsmineshaftModBlocks.RAW_COPPER_2.get() == (world.getBlockState(
						new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
						.getBlock()) {
					if (3.3 > new Vec3((entity.getX()), (entity.getY()), (entity.getZ())).distanceTo(new Vec3(
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))) {
						if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerIsDrilling == false) {
							{
								JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.playerIsDrilling = true;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pressuredrillshortened")), SoundSource.NEUTRAL,
											1, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pressuredrillshortened")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ASH,
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										15, 1, 1, 1, 1);
							{
								JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.drillX = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getX();
								_vars.syncPlayerVariables(entity);
							}
							{
								JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.drillY = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getY();
								_vars.syncPlayerVariables(entity);
							}
							{
								JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.drillZ = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getZ();
								_vars.syncPlayerVariables(entity);
							}
							if (Direction.EAST == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection())) {
								JimsmineshaftMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH,
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ()),
												15, 0.5, 0.5, 0.5, 1);
									{
										Entity _ent = entity;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = JimsmineshaftModEntities.COPPER_DRILLED_EAST.get().spawn(_level,
												new BlockPos(
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()),
											Blocks.AIR.defaultBlockState(), 3);
									JimsmineshaftMod.queueServerWork(2, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH,
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ()),
													15, 0.5, 0.5, 0.5, 1);
										{
											Entity _ent = entity;
											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
														_ent.getYRot(), _ent.getXRot());
										}
										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
										JimsmineshaftMod.queueServerWork(2, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH,
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
														15, 0.5, 0.5, 0.5, 1);
											{
												Entity _ent = entity;
												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
															_ent.getYRot(), _ent.getXRot());
											}
											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
											JimsmineshaftMod.queueServerWork(2, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH,
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ()),
															15, 0.5, 0.5, 0.5, 1);
												{
													Entity _ent = entity;
													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																_ent.getYRot(), _ent.getXRot());
												}
												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
												JimsmineshaftMod.queueServerWork(2, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH,
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getY()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getZ()),
																15, 0.5, 0.5, 0.5, 1);
													{
														Entity _ent = entity;
														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																	_ent.getYRot(), _ent.getXRot());
													}
													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
													JimsmineshaftMod.queueServerWork(2, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.ASH,
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ()),
																	15, 0.5, 0.5, 0.5, 1);
														{
															Entity _ent = entity;
															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
														}
														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
														JimsmineshaftMod.queueServerWork(2, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																		(entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getY()),
																		(entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ()),
																		15, 0.5, 0.5, 0.5, 1);
															{
																Entity _ent = entity;
																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																if (_ent instanceof ServerPlayer _serverPlayer)
																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
															}
															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
															JimsmineshaftMod.queueServerWork(2, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.ASH, (entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																			(entity.level()
																					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																							entity))
																					.getBlockPos().getY()),
																			(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																			15, 0.5, 0.5, 0.5, 1);
																{
																	Entity _ent = entity;
																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																}
																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																JimsmineshaftMod.queueServerWork(2, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.ASH,
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																				15, 0.5, 0.5, 0.5, 1);
																	{
																		Entity _ent = entity;
																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																		if (_ent instanceof ServerPlayer _serverPlayer)
																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																	}
																	entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.ASH,
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getX()),
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getY()),
																					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																					15, 0.5, 0.5, 0.5, 1);
																		{
																			Entity _ent = entity;
																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																		}
																		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.ASH,
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																						15, 0.5, 0.5, 0.5, 1);
																			{
																				Entity _ent = entity;
																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																				if (_ent instanceof ServerPlayer _serverPlayer)
																					_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																			}
																			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.ASH,
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getX()),
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getY()),
																							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																							15, 0.5, 0.5, 0.5, 1);
																				{
																					Entity _ent = entity;
																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																				}
																				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.ASH,
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getX()),
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getY()),
																								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																								15, 0.5, 0.5, 0.5, 1);
																					{
																						Entity _ent = entity;
																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																						if (_ent instanceof ServerPlayer _serverPlayer)
																							_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																					}
																					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.ASH,
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getX()),
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getY()),
																									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																									15, 0.5, 0.5, 0.5, 1);
																						{
																							Entity _ent = entity;
																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																						}
																						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.ASH,
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getX()),
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getY()),
																										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																										15, 0.5, 0.5, 0.5, 1);
																							{
																								Entity _ent = entity;
																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																								if (_ent instanceof ServerPlayer _serverPlayer)
																									_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																							}
																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.ASH,
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getX()),
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getY()),
																											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																											15, 0.5, 0.5, 0.5, 1);
																								{
																									Entity _ent = entity;
																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																								}
																								entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																										new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.ASH,
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getX()),
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getY()),
																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																												15, 0.5, 0.5, 0.5, 1);
																									{
																										Entity _ent = entity;
																										_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																										if (_ent instanceof ServerPlayer _serverPlayer)
																											_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																									}
																									entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																											new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.ASH,
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getX()),
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getY()),
																													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																													15, 0.5, 0.5, 0.5, 1);
																										{
																											Entity _ent = entity;
																											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																										}
																										entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																												new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.ASH,
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getX()),
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getY()),
																														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																														15, 0.5, 0.5, 0.5, 1);
																											{
																												Entity _ent = entity;
																												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																												if (_ent instanceof ServerPlayer _serverPlayer)
																													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																											}
																											entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																													new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.ASH,
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getY()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getZ()),
																															15, 0.5, 0.5, 0.5, 1);
																												{
																													Entity _ent = entity;
																													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																												}
																												entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																														new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.ASH,
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getY()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getZ()),
																																15, 0.5, 0.5, 0.5, 1);
																													{
																														Entity _ent = entity;
																														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																														if (_ent instanceof ServerPlayer _serverPlayer)
																															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																													}
																													entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																															new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getY()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getZ()),
																																	15, 0.5, 0.5, 0.5, 1);
																														{
																															Entity _ent = entity;
																															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																														}
																														entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getY()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getZ()),
																																		15, 0.5, 0.5, 0.5, 1);
																															{
																																Entity _ent = entity;
																																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																if (_ent instanceof ServerPlayer _serverPlayer)
																																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																			(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																			_ent.getXRot());
																															}
																															entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																	new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.ASH,
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getX()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getY()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getZ()),
																																			15, 0.5, 0.5, 0.5, 1);
																																{
																																	Entity _ent = entity;
																																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																				(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																				_ent.getXRot());
																																}
																																entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																		new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.ASH,
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getX()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getY()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getZ()),
																																				15, 0.5, 0.5, 0.5, 1);
																																	{
																																		Entity _ent = entity;
																																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																					(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																					_ent.getXRot());
																																	}
																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																			new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.ASH,
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getY()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getZ()),
																																					15, 0.5, 0.5, 0.5, 1);
																																		{
																																			Entity _ent = entity;
																																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																						(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																						_ent.getYRot(), _ent.getXRot());
																																		}
																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																				new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.ASH,
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getY()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getZ()),
																																						15, 0.5, 0.5, 0.5, 1);
																																			{
																																				Entity _ent = entity;
																																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																					_serverPlayer.connection.teleport(
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																							_ent.getXRot());
																																			}
																																			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																					new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getY()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getZ()),
																																							15, 0.5, 0.5, 0.5, 1);
																																				{
																																					Entity _ent = entity;
																																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport(
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																								_ent.getXRot());
																																				}
																																				entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																						new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getY()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getZ()),
																																								15, 0.5, 0.5, 0.5, 1);
																																					{
																																						Entity _ent = entity;
																																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																								(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																							_serverPlayer.connection.teleport(
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																									_ent.getXRot());
																																					}
																																					entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																							new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.ASH,
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getY()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getZ()),
																																									15, 0.5, 0.5, 0.5, 1);
																																						{
																																							Entity _ent = entity;
																																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																									(entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																								_serverPlayer.connection.teleport(
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																										_ent.getYRot(), _ent.getXRot());
																																						}
																																						entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																								new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.ASH,
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getX()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getY()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getZ()),
																																										15, 0.5, 0.5, 0.5, 1);
																																							{
																																								Entity _ent = entity;
																																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																									_serverPlayer.connection.teleport(
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																											_ent.getYRot(), _ent.getXRot());
																																							}
																																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getY()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getZ()),
																																											15, 0.5, 0.5, 0.5, 1);
																																								{
																																									Entity _ent = entity;
																																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																										_serverPlayer.connection.teleport(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																												_ent.getYRot(), _ent.getXRot());
																																								}
																																								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.ASH,
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getX()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getY()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getZ()),
																																												15, 0.5, 0.5, 0.5, 1);
																																									{
																																										Entity _ent = entity;
																																										_ent.teleportTo(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																										if (_ent instanceof ServerPlayer _serverPlayer)
																																											_serverPlayer.connection.teleport(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																													_ent.getYRot(), _ent.getXRot());
																																									}
																																									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getX()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getY()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getZ()),
																																													15, 0.5, 0.5, 0.5, 1);
																																										{
																																											Entity _ent = entity;
																																											_ent.teleportTo(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																												_serverPlayer.connection.teleport(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()),
																																														_ent.getYRot(), _ent.getXRot());
																																										}
																																										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																														+ 0.5)));
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.ASH,
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getY()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getZ()),
																																														15, 0.5, 0.5, 0.5, 1);
																																											{
																																												Entity _ent = entity;
																																												_ent.teleportTo(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()));
																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																													_serverPlayer.connection.teleport(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()),
																																															_ent.getYRot(), _ent.getXRot());
																																											}
																																											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																															+ 0.5)));
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getX()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getY()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getZ()),
																																															15, 0.5, 0.5, 0.5, 1);
																																												{
																																													Entity _ent = entity;
																																													_ent.teleportTo(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()));
																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																														_serverPlayer.connection.teleport(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()),
																																																_ent.getYRot(), _ent.getXRot());
																																												}
																																												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																+ 0.5)));
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getY()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getZ()),
																																																15, 0.5, 0.5, 0.5, 1);
																																													{
																																														Entity _ent = entity;
																																														_ent.teleportTo(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()));
																																														if (_ent instanceof ServerPlayer _serverPlayer)
																																															_serverPlayer.connection
																																																	.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																													}
																																													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																	+ 0.5)));
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getX()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getY()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getZ()),
																																																	15, 0.5, 0.5, 0.5, 1);
																																														{
																																															Entity _ent = entity;
																																															_ent.teleportTo(
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getX()),
																																																	(entity.getY()),
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getZ()));
																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																_serverPlayer.connection
																																																		.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																														}
																																														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																		+ 0.5)));
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getX()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getY()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getZ()),
																																																		15, 0.5, 0.5, 0.5, 1);
																																															{
																																																Entity _ent = entity;
																																																_ent.teleportTo(
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getX()),
																																																		(entity.getY()),
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getZ()));
																																																if (_ent instanceof ServerPlayer _serverPlayer)
																																																	_serverPlayer.connection.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																															}
																																															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																			+ 0.5)));
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.ASH,
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getX()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getY()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getZ()),
																																																			15, 0.5, 0.5, 0.5, 1);
																																																{
																																																	Entity _ent = entity;
																																																	_ent.teleportTo(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()));
																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																		_serverPlayer.connection.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																																}
																																																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																				+ 0.5)));
																																																JimsmineshaftMod.queueServerWork(2, () -> {
																																																	if (world instanceof ServerLevel _level)
																																																		_level.sendParticles(ParticleTypes.ASH,
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getX()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getY()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getZ()),
																																																				15, 0.5, 0.5, 0.5, 1);
																																																	{
																																																		Entity _ent = entity;
																																																		_ent.teleportTo(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()));
																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																			_serverPlayer.connection.teleport(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getZ()),
																																																					_ent.getYRot(), _ent.getXRot());
																																																	}
																																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																			new Vec3((entity.getData(
																																																					JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																					+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																							+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																							+ 0.5)));
																																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																																		if (world instanceof ServerLevel _level)
																																																			_level.sendParticles(ParticleTypes.ASH,
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getX()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getY()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getZ()),
																																																					15, 0.5, 0.5, 0.5, 1);
																																																		{
																																																			Entity _ent = entity;
																																																			_ent.teleportTo(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05)
																																																							+ entity.getZ()));
																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																				_serverPlayer.connection
																																																						.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																		}
																																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																				new Vec3((entity.getData(
																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																						+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																								+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																								+ 0.5)));
																																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																																			if (world instanceof ServerLevel _level)
																																																				_level.sendParticles(ParticleTypes.ASH,
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getX()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getY()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getZ()),
																																																						15, 0.5, 0.5, 0.5, 1);
																																																			{
																																																				Entity _ent = entity;
																																																				_ent.teleportTo(
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getX()),
																																																						(entity.getY()),
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getZ()));
																																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																																					_serverPlayer.connection.teleport(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()),
																																																							_ent.getYRot(),
																																																							_ent.getXRot());
																																																			}
																																																			entity.lookAt(
																																																					EntityAnchorArgument.Anchor.EYES,
																																																					new Vec3((entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																							+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																									+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																									+ 0.5)));
																																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																																				if (world instanceof ServerLevel _level)
																																																					_level.sendParticles(
																																																							ParticleTypes.ASH,
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getX()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getY()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getZ()),
																																																							15, 0.5, 0.5, 0.5, 1);
																																																				{
																																																					Entity _ent = entity;
																																																					_ent.teleportTo(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()));
																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																						_serverPlayer.connection.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																				}
																																																				entity.lookAt(
																																																						EntityAnchorArgument.Anchor.EYES,
																																																						new Vec3((entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																								+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																										+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																										+ 0.5)));
																																																				JimsmineshaftMod.queueServerWork(2,
																																																						() -> {
																																																							if (world instanceof ServerLevel _level)
																																																								_level.sendParticles(
																																																										ParticleTypes.ASH,
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getX()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getY()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getZ()),
																																																										15, 0.5, 0.5, 0.5,
																																																										1);
																																																							{
																																																								Entity _ent = entity;
																																																								_ent.teleportTo((Mth
																																																										.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																										+ entity.getX()),
																																																										(entity.getY()),
																																																										(Mth.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																												+ entity.getZ()));
																																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																																									_serverPlayer.connection
																																																											.teleport((Mth
																																																													.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																													+ entity.getX()),
																																																													(entity.getY()),
																																																													(Mth.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																															+ entity.getZ()),
																																																													_ent.getYRot(),
																																																													_ent.getXRot());
																																																							}
																																																							entity.lookAt(
																																																									EntityAnchorArgument.Anchor.EYES,
																																																									new Vec3((entity
																																																											.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																											+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																													+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																													+ 0.5)));
																																																							JimsmineshaftMod
																																																									.queueServerWork(2,
																																																											() -> {
																																																												if (world instanceof ServerLevel _level)
																																																													_level.sendParticles(
																																																															ParticleTypes.ASH,
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getX()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getY()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getZ()),
																																																															15,
																																																															0.5,
																																																															0.5,
																																																															0.5,
																																																															1);
																																																												{
																																																													Entity _ent = entity;
																																																													_ent.teleportTo(
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getX()),
																																																															(entity.getY()),
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getZ()));
																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																														_serverPlayer.connection
																																																																.teleport(
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getX()),
																																																																		(entity.getY()),
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getZ()),
																																																																		_ent.getYRot(),
																																																																		_ent.getXRot());
																																																												}
																																																												entity.lookAt(
																																																														EntityAnchorArgument.Anchor.EYES,
																																																														new Vec3(
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																		+ 0.5)));
																																																												JimsmineshaftMod
																																																														.queueServerWork(
																																																																2,
																																																																() -> {
																																																																	if (world instanceof ServerLevel _level)
																																																																		_level.sendParticles(
																																																																				ParticleTypes.ASH,
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getX()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getY()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getZ()),
																																																																				15,
																																																																				0.5,
																																																																				0.5,
																																																																				0.5,
																																																																				1);
																																																																	{
																																																																		Entity _ent = entity;
																																																																		_ent.teleportTo(
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getX()),
																																																																				(entity.getY()),
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getZ()));
																																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																																			_serverPlayer.connection
																																																																					.teleport(
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getX()),
																																																																							(entity.getY()),
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getZ()),
																																																																							_ent.getYRot(),
																																																																							_ent.getXRot());
																																																																	}
																																																																	entity.lookAt(
																																																																			EntityAnchorArgument.Anchor.EYES,
																																																																			new Vec3(
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																							+ 0.5)));
																																																																	JimsmineshaftMod
																																																																			.queueServerWork(
																																																																					2,
																																																																					() -> {
																																																																						if (world instanceof ServerLevel _level)
																																																																							_level.sendParticles(
																																																																									ParticleTypes.ASH,
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getX()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getY()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getZ()),
																																																																									15,
																																																																									0.5,
																																																																									0.5,
																																																																									0.5,
																																																																									1);
																																																																						{
																																																																							Entity _ent = entity;
																																																																							_ent.teleportTo(
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getX()),
																																																																									(entity.getY()),
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getZ()));
																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																								_serverPlayer.connection
																																																																										.teleport(
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getX()),
																																																																												(entity.getY()),
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getZ()),
																																																																												_ent.getYRot(),
																																																																												_ent.getXRot());
																																																																						}
																																																																						entity.lookAt(
																																																																								EntityAnchorArgument.Anchor.EYES,
																																																																								new Vec3(
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																												+ 0.5)));
																																																																						JimsmineshaftMod
																																																																								.queueServerWork(
																																																																										2,
																																																																										() -> {
																																																																											if (world instanceof ServerLevel _level)
																																																																												_level.sendParticles(
																																																																														ParticleTypes.ASH,
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getX()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getY()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getZ()),
																																																																														15,
																																																																														0.5,
																																																																														0.5,
																																																																														0.5,
																																																																														1);
																																																																											{
																																																																												Entity _ent = entity;
																																																																												_ent.teleportTo(
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getX()),
																																																																														(entity.getY()),
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getZ()));
																																																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																																																													_serverPlayer.connection
																																																																															.teleport(
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getX()),
																																																																																	(entity.getY()),
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getZ()),
																																																																																	_ent.getYRot(),
																																																																																	_ent.getXRot());
																																																																											}
																																																																											entity.lookAt(
																																																																													EntityAnchorArgument.Anchor.EYES,
																																																																													new Vec3(
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																	+ 0.5)));
																																																																											JimsmineshaftMod
																																																																													.queueServerWork(
																																																																															2,
																																																																															() -> {
																																																																																if (world instanceof ServerLevel _level)
																																																																																	_level.sendParticles(
																																																																																			ParticleTypes.ASH,
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getX()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getY()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getZ()),
																																																																																			15,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			1);
																																																																																{
																																																																																	Entity _ent = entity;
																																																																																	_ent.teleportTo(
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getX()),
																																																																																			(entity.getY()),
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getZ()));
																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																		_serverPlayer.connection
																																																																																				.teleport(
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getX()),
																																																																																						(entity.getY()),
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getZ()),
																																																																																						_ent.getYRot(),
																																																																																						_ent.getXRot());
																																																																																}
																																																																																entity.lookAt(
																																																																																		EntityAnchorArgument.Anchor.EYES,
																																																																																		new Vec3(
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																						+ 0.5)));
																																																																																JimsmineshaftMod
																																																																																		.queueServerWork(
																																																																																				2,
																																																																																				() -> {
																																																																																					if (world instanceof ServerLevel _level)
																																																																																						_level.sendParticles(
																																																																																								ParticleTypes.ASH,
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getX()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getY()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getZ()),
																																																																																								15,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								1);
																																																																																					{
																																																																																						Entity _ent = entity;
																																																																																						_ent.teleportTo(
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getX()),
																																																																																								(entity.getY()),
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getZ()));
																																																																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																							_serverPlayer.connection
																																																																																									.teleport(
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getX()),
																																																																																											(entity.getY()),
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getZ()),
																																																																																											_ent.getYRot(),
																																																																																											_ent.getXRot());
																																																																																					}
																																																																																					entity.lookAt(
																																																																																							EntityAnchorArgument.Anchor.EYES,
																																																																																							new Vec3(
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																											+ 0.5)));
																																																																																					{
																																																																																						JimsmineshaftModVariables.PlayerVariables _vars = entity
																																																																																								.getData(
																																																																																										JimsmineshaftModVariables.PLAYER_VARIABLES);
																																																																																						_vars.playerIsDrilling = false;
																																																																																						_vars.syncPlayerVariables(
																																																																																								entity);
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
										});
									});
								});
							}
							if (Direction.WEST == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection())) {
								JimsmineshaftMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH,
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ()),
												15, 0.5, 0.5, 0.5, 1);
									{
										Entity _ent = entity;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = JimsmineshaftModEntities.COPPER_DRILLED_EAST.get().spawn(_level,
												new BlockPos(
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()),
											Blocks.AIR.defaultBlockState(), 3);
									JimsmineshaftMod.queueServerWork(2, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH,
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ()),
													15, 0.5, 0.5, 0.5, 1);
										{
											Entity _ent = entity;
											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
														_ent.getYRot(), _ent.getXRot());
										}
										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
										JimsmineshaftMod.queueServerWork(2, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH,
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
														15, 0.5, 0.5, 0.5, 1);
											{
												Entity _ent = entity;
												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
															_ent.getYRot(), _ent.getXRot());
											}
											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
											JimsmineshaftMod.queueServerWork(2, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH,
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ()),
															15, 0.5, 0.5, 0.5, 1);
												{
													Entity _ent = entity;
													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																_ent.getYRot(), _ent.getXRot());
												}
												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
												JimsmineshaftMod.queueServerWork(2, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH,
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getY()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getZ()),
																15, 0.5, 0.5, 0.5, 1);
													{
														Entity _ent = entity;
														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																	_ent.getYRot(), _ent.getXRot());
													}
													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
													JimsmineshaftMod.queueServerWork(2, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.ASH,
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ()),
																	15, 0.5, 0.5, 0.5, 1);
														{
															Entity _ent = entity;
															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
														}
														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
														JimsmineshaftMod.queueServerWork(2, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																		(entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getY()),
																		(entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ()),
																		15, 0.5, 0.5, 0.5, 1);
															{
																Entity _ent = entity;
																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																if (_ent instanceof ServerPlayer _serverPlayer)
																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
															}
															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
															JimsmineshaftMod.queueServerWork(2, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.ASH, (entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																			(entity.level()
																					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																							entity))
																					.getBlockPos().getY()),
																			(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																			15, 0.5, 0.5, 0.5, 1);
																{
																	Entity _ent = entity;
																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																}
																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																JimsmineshaftMod.queueServerWork(2, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.ASH,
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																				15, 0.5, 0.5, 0.5, 1);
																	{
																		Entity _ent = entity;
																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																		if (_ent instanceof ServerPlayer _serverPlayer)
																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																	}
																	entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.ASH,
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getX()),
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getY()),
																					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																					15, 0.5, 0.5, 0.5, 1);
																		{
																			Entity _ent = entity;
																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																		}
																		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.ASH,
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																						15, 0.5, 0.5, 0.5, 1);
																			{
																				Entity _ent = entity;
																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																				if (_ent instanceof ServerPlayer _serverPlayer)
																					_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																			}
																			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.ASH,
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getX()),
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getY()),
																							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																							15, 0.5, 0.5, 0.5, 1);
																				{
																					Entity _ent = entity;
																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																				}
																				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.ASH,
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getX()),
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getY()),
																								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																								15, 0.5, 0.5, 0.5, 1);
																					{
																						Entity _ent = entity;
																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																						if (_ent instanceof ServerPlayer _serverPlayer)
																							_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																					}
																					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.ASH,
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getX()),
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getY()),
																									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																									15, 0.5, 0.5, 0.5, 1);
																						{
																							Entity _ent = entity;
																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																						}
																						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.ASH,
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getX()),
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getY()),
																										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																										15, 0.5, 0.5, 0.5, 1);
																							{
																								Entity _ent = entity;
																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																								if (_ent instanceof ServerPlayer _serverPlayer)
																									_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																							}
																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.ASH,
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getX()),
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getY()),
																											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																											15, 0.5, 0.5, 0.5, 1);
																								{
																									Entity _ent = entity;
																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																								}
																								entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																										new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.ASH,
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getX()),
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getY()),
																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																												15, 0.5, 0.5, 0.5, 1);
																									{
																										Entity _ent = entity;
																										_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																										if (_ent instanceof ServerPlayer _serverPlayer)
																											_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																									}
																									entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																											new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.ASH,
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getX()),
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getY()),
																													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																													15, 0.5, 0.5, 0.5, 1);
																										{
																											Entity _ent = entity;
																											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																										}
																										entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																												new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.ASH,
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getX()),
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getY()),
																														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																														15, 0.5, 0.5, 0.5, 1);
																											{
																												Entity _ent = entity;
																												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																												if (_ent instanceof ServerPlayer _serverPlayer)
																													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																											}
																											entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																													new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.ASH,
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getY()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getZ()),
																															15, 0.5, 0.5, 0.5, 1);
																												{
																													Entity _ent = entity;
																													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																												}
																												entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																														new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.ASH,
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getY()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getZ()),
																																15, 0.5, 0.5, 0.5, 1);
																													{
																														Entity _ent = entity;
																														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																														if (_ent instanceof ServerPlayer _serverPlayer)
																															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																													}
																													entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																															new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getY()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getZ()),
																																	15, 0.5, 0.5, 0.5, 1);
																														{
																															Entity _ent = entity;
																															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																														}
																														entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getY()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getZ()),
																																		15, 0.5, 0.5, 0.5, 1);
																															{
																																Entity _ent = entity;
																																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																if (_ent instanceof ServerPlayer _serverPlayer)
																																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																			(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																			_ent.getXRot());
																															}
																															entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																	new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.ASH,
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getX()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getY()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getZ()),
																																			15, 0.5, 0.5, 0.5, 1);
																																{
																																	Entity _ent = entity;
																																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																				(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																				_ent.getXRot());
																																}
																																entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																		new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.ASH,
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getX()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getY()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getZ()),
																																				15, 0.5, 0.5, 0.5, 1);
																																	{
																																		Entity _ent = entity;
																																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																					(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																					_ent.getXRot());
																																	}
																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																			new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.ASH,
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getY()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getZ()),
																																					15, 0.5, 0.5, 0.5, 1);
																																		{
																																			Entity _ent = entity;
																																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																						(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																						_ent.getYRot(), _ent.getXRot());
																																		}
																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																				new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.ASH,
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getY()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getZ()),
																																						15, 0.5, 0.5, 0.5, 1);
																																			{
																																				Entity _ent = entity;
																																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																					_serverPlayer.connection.teleport(
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																							_ent.getXRot());
																																			}
																																			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																					new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getY()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getZ()),
																																							15, 0.5, 0.5, 0.5, 1);
																																				{
																																					Entity _ent = entity;
																																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport(
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																								_ent.getXRot());
																																				}
																																				entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																						new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getY()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getZ()),
																																								15, 0.5, 0.5, 0.5, 1);
																																					{
																																						Entity _ent = entity;
																																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																								(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																							_serverPlayer.connection.teleport(
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																									_ent.getXRot());
																																					}
																																					entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																							new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.ASH,
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getY()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getZ()),
																																									15, 0.5, 0.5, 0.5, 1);
																																						{
																																							Entity _ent = entity;
																																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																									(entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																								_serverPlayer.connection.teleport(
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																										_ent.getYRot(), _ent.getXRot());
																																						}
																																						entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																								new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.ASH,
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getX()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getY()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getZ()),
																																										15, 0.5, 0.5, 0.5, 1);
																																							{
																																								Entity _ent = entity;
																																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																									_serverPlayer.connection.teleport(
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																											_ent.getYRot(), _ent.getXRot());
																																							}
																																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getY()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getZ()),
																																											15, 0.5, 0.5, 0.5, 1);
																																								{
																																									Entity _ent = entity;
																																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																										_serverPlayer.connection.teleport(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																												_ent.getYRot(), _ent.getXRot());
																																								}
																																								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.ASH,
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getX()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getY()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getZ()),
																																												15, 0.5, 0.5, 0.5, 1);
																																									{
																																										Entity _ent = entity;
																																										_ent.teleportTo(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																										if (_ent instanceof ServerPlayer _serverPlayer)
																																											_serverPlayer.connection.teleport(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																													_ent.getYRot(), _ent.getXRot());
																																									}
																																									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getX()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getY()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getZ()),
																																													15, 0.5, 0.5, 0.5, 1);
																																										{
																																											Entity _ent = entity;
																																											_ent.teleportTo(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																												_serverPlayer.connection.teleport(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()),
																																														_ent.getYRot(), _ent.getXRot());
																																										}
																																										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																														+ 0.5)));
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.ASH,
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getY()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getZ()),
																																														15, 0.5, 0.5, 0.5, 1);
																																											{
																																												Entity _ent = entity;
																																												_ent.teleportTo(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()));
																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																													_serverPlayer.connection.teleport(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()),
																																															_ent.getYRot(), _ent.getXRot());
																																											}
																																											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																															+ 0.5)));
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getX()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getY()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getZ()),
																																															15, 0.5, 0.5, 0.5, 1);
																																												{
																																													Entity _ent = entity;
																																													_ent.teleportTo(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()));
																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																														_serverPlayer.connection.teleport(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()),
																																																_ent.getYRot(), _ent.getXRot());
																																												}
																																												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																+ 0.5)));
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getY()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getZ()),
																																																15, 0.5, 0.5, 0.5, 1);
																																													{
																																														Entity _ent = entity;
																																														_ent.teleportTo(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()));
																																														if (_ent instanceof ServerPlayer _serverPlayer)
																																															_serverPlayer.connection
																																																	.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																													}
																																													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																	+ 0.5)));
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getX()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getY()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getZ()),
																																																	15, 0.5, 0.5, 0.5, 1);
																																														{
																																															Entity _ent = entity;
																																															_ent.teleportTo(
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getX()),
																																																	(entity.getY()),
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getZ()));
																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																_serverPlayer.connection
																																																		.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																														}
																																														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																		+ 0.5)));
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getX()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getY()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getZ()),
																																																		15, 0.5, 0.5, 0.5, 1);
																																															{
																																																Entity _ent = entity;
																																																_ent.teleportTo(
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getX()),
																																																		(entity.getY()),
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getZ()));
																																																if (_ent instanceof ServerPlayer _serverPlayer)
																																																	_serverPlayer.connection.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																															}
																																															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																			+ 0.5)));
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.ASH,
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getX()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getY()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getZ()),
																																																			15, 0.5, 0.5, 0.5, 1);
																																																{
																																																	Entity _ent = entity;
																																																	_ent.teleportTo(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()));
																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																		_serverPlayer.connection.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																																}
																																																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																				+ 0.5)));
																																																JimsmineshaftMod.queueServerWork(2, () -> {
																																																	if (world instanceof ServerLevel _level)
																																																		_level.sendParticles(ParticleTypes.ASH,
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getX()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getY()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getZ()),
																																																				15, 0.5, 0.5, 0.5, 1);
																																																	{
																																																		Entity _ent = entity;
																																																		_ent.teleportTo(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()));
																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																			_serverPlayer.connection.teleport(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getZ()),
																																																					_ent.getYRot(), _ent.getXRot());
																																																	}
																																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																			new Vec3((entity.getData(
																																																					JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																					+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																							+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																							+ 0.5)));
																																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																																		if (world instanceof ServerLevel _level)
																																																			_level.sendParticles(ParticleTypes.ASH,
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getX()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getY()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getZ()),
																																																					15, 0.5, 0.5, 0.5, 1);
																																																		{
																																																			Entity _ent = entity;
																																																			_ent.teleportTo(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05)
																																																							+ entity.getZ()));
																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																				_serverPlayer.connection
																																																						.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																		}
																																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																				new Vec3((entity.getData(
																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																						+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																								+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																								+ 0.5)));
																																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																																			if (world instanceof ServerLevel _level)
																																																				_level.sendParticles(ParticleTypes.ASH,
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getX()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getY()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getZ()),
																																																						15, 0.5, 0.5, 0.5, 1);
																																																			{
																																																				Entity _ent = entity;
																																																				_ent.teleportTo(
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getX()),
																																																						(entity.getY()),
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getZ()));
																																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																																					_serverPlayer.connection.teleport(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()),
																																																							_ent.getYRot(),
																																																							_ent.getXRot());
																																																			}
																																																			entity.lookAt(
																																																					EntityAnchorArgument.Anchor.EYES,
																																																					new Vec3((entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																							+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																									+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																									+ 0.5)));
																																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																																				if (world instanceof ServerLevel _level)
																																																					_level.sendParticles(
																																																							ParticleTypes.ASH,
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getX()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getY()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getZ()),
																																																							15, 0.5, 0.5, 0.5, 1);
																																																				{
																																																					Entity _ent = entity;
																																																					_ent.teleportTo(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()));
																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																						_serverPlayer.connection.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																				}
																																																				entity.lookAt(
																																																						EntityAnchorArgument.Anchor.EYES,
																																																						new Vec3((entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																								+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																										+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																										+ 0.5)));
																																																				JimsmineshaftMod.queueServerWork(2,
																																																						() -> {
																																																							if (world instanceof ServerLevel _level)
																																																								_level.sendParticles(
																																																										ParticleTypes.ASH,
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getX()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getY()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getZ()),
																																																										15, 0.5, 0.5, 0.5,
																																																										1);
																																																							{
																																																								Entity _ent = entity;
																																																								_ent.teleportTo((Mth
																																																										.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																										+ entity.getX()),
																																																										(entity.getY()),
																																																										(Mth.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																												+ entity.getZ()));
																																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																																									_serverPlayer.connection
																																																											.teleport((Mth
																																																													.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																													+ entity.getX()),
																																																													(entity.getY()),
																																																													(Mth.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																															+ entity.getZ()),
																																																													_ent.getYRot(),
																																																													_ent.getXRot());
																																																							}
																																																							entity.lookAt(
																																																									EntityAnchorArgument.Anchor.EYES,
																																																									new Vec3((entity
																																																											.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																											+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																													+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																													+ 0.5)));
																																																							JimsmineshaftMod
																																																									.queueServerWork(2,
																																																											() -> {
																																																												if (world instanceof ServerLevel _level)
																																																													_level.sendParticles(
																																																															ParticleTypes.ASH,
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getX()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getY()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getZ()),
																																																															15,
																																																															0.5,
																																																															0.5,
																																																															0.5,
																																																															1);
																																																												{
																																																													Entity _ent = entity;
																																																													_ent.teleportTo(
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getX()),
																																																															(entity.getY()),
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getZ()));
																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																														_serverPlayer.connection
																																																																.teleport(
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getX()),
																																																																		(entity.getY()),
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getZ()),
																																																																		_ent.getYRot(),
																																																																		_ent.getXRot());
																																																												}
																																																												entity.lookAt(
																																																														EntityAnchorArgument.Anchor.EYES,
																																																														new Vec3(
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																		+ 0.5)));
																																																												JimsmineshaftMod
																																																														.queueServerWork(
																																																																2,
																																																																() -> {
																																																																	if (world instanceof ServerLevel _level)
																																																																		_level.sendParticles(
																																																																				ParticleTypes.ASH,
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getX()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getY()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getZ()),
																																																																				15,
																																																																				0.5,
																																																																				0.5,
																																																																				0.5,
																																																																				1);
																																																																	{
																																																																		Entity _ent = entity;
																																																																		_ent.teleportTo(
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getX()),
																																																																				(entity.getY()),
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getZ()));
																																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																																			_serverPlayer.connection
																																																																					.teleport(
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getX()),
																																																																							(entity.getY()),
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getZ()),
																																																																							_ent.getYRot(),
																																																																							_ent.getXRot());
																																																																	}
																																																																	entity.lookAt(
																																																																			EntityAnchorArgument.Anchor.EYES,
																																																																			new Vec3(
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																							+ 0.5)));
																																																																	JimsmineshaftMod
																																																																			.queueServerWork(
																																																																					2,
																																																																					() -> {
																																																																						if (world instanceof ServerLevel _level)
																																																																							_level.sendParticles(
																																																																									ParticleTypes.ASH,
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getX()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getY()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getZ()),
																																																																									15,
																																																																									0.5,
																																																																									0.5,
																																																																									0.5,
																																																																									1);
																																																																						{
																																																																							Entity _ent = entity;
																																																																							_ent.teleportTo(
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getX()),
																																																																									(entity.getY()),
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getZ()));
																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																								_serverPlayer.connection
																																																																										.teleport(
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getX()),
																																																																												(entity.getY()),
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getZ()),
																																																																												_ent.getYRot(),
																																																																												_ent.getXRot());
																																																																						}
																																																																						entity.lookAt(
																																																																								EntityAnchorArgument.Anchor.EYES,
																																																																								new Vec3(
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																												+ 0.5)));
																																																																						JimsmineshaftMod
																																																																								.queueServerWork(
																																																																										2,
																																																																										() -> {
																																																																											if (world instanceof ServerLevel _level)
																																																																												_level.sendParticles(
																																																																														ParticleTypes.ASH,
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getX()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getY()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getZ()),
																																																																														15,
																																																																														0.5,
																																																																														0.5,
																																																																														0.5,
																																																																														1);
																																																																											{
																																																																												Entity _ent = entity;
																																																																												_ent.teleportTo(
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getX()),
																																																																														(entity.getY()),
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getZ()));
																																																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																																																													_serverPlayer.connection
																																																																															.teleport(
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getX()),
																																																																																	(entity.getY()),
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getZ()),
																																																																																	_ent.getYRot(),
																																																																																	_ent.getXRot());
																																																																											}
																																																																											entity.lookAt(
																																																																													EntityAnchorArgument.Anchor.EYES,
																																																																													new Vec3(
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																	+ 0.5)));
																																																																											JimsmineshaftMod
																																																																													.queueServerWork(
																																																																															2,
																																																																															() -> {
																																																																																if (world instanceof ServerLevel _level)
																																																																																	_level.sendParticles(
																																																																																			ParticleTypes.ASH,
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getX()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getY()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getZ()),
																																																																																			15,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			1);
																																																																																{
																																																																																	Entity _ent = entity;
																																																																																	_ent.teleportTo(
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getX()),
																																																																																			(entity.getY()),
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getZ()));
																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																		_serverPlayer.connection
																																																																																				.teleport(
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getX()),
																																																																																						(entity.getY()),
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getZ()),
																																																																																						_ent.getYRot(),
																																																																																						_ent.getXRot());
																																																																																}
																																																																																entity.lookAt(
																																																																																		EntityAnchorArgument.Anchor.EYES,
																																																																																		new Vec3(
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																						+ 0.5)));
																																																																																JimsmineshaftMod
																																																																																		.queueServerWork(
																																																																																				2,
																																																																																				() -> {
																																																																																					if (world instanceof ServerLevel _level)
																																																																																						_level.sendParticles(
																																																																																								ParticleTypes.ASH,
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getX()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getY()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getZ()),
																																																																																								15,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								1);
																																																																																					{
																																																																																						Entity _ent = entity;
																																																																																						_ent.teleportTo(
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getX()),
																																																																																								(entity.getY()),
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getZ()));
																																																																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																							_serverPlayer.connection
																																																																																									.teleport(
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getX()),
																																																																																											(entity.getY()),
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getZ()),
																																																																																											_ent.getYRot(),
																																																																																											_ent.getXRot());
																																																																																					}
																																																																																					entity.lookAt(
																																																																																							EntityAnchorArgument.Anchor.EYES,
																																																																																							new Vec3(
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																											+ 0.5)));
																																																																																					{
																																																																																						JimsmineshaftModVariables.PlayerVariables _vars = entity
																																																																																								.getData(
																																																																																										JimsmineshaftModVariables.PLAYER_VARIABLES);
																																																																																						_vars.playerIsDrilling = false;
																																																																																						_vars.syncPlayerVariables(
																																																																																								entity);
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
										});
									});
								});
							}
							if (Direction.SOUTH == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection())) {
								JimsmineshaftMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH,
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ()),
												15, 0.5, 0.5, 0.5, 1);
									{
										Entity _ent = entity;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = JimsmineshaftModEntities.COPPER_DRILLED_NORTH.get().spawn(_level,
												new BlockPos(
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()),
											Blocks.AIR.defaultBlockState(), 3);
									JimsmineshaftMod.queueServerWork(2, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH,
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ()),
													15, 0.5, 0.5, 0.5, 1);
										{
											Entity _ent = entity;
											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
														_ent.getYRot(), _ent.getXRot());
										}
										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
										JimsmineshaftMod.queueServerWork(2, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH,
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
														15, 0.5, 0.5, 0.5, 1);
											{
												Entity _ent = entity;
												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
															_ent.getYRot(), _ent.getXRot());
											}
											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
											JimsmineshaftMod.queueServerWork(2, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH,
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ()),
															15, 0.5, 0.5, 0.5, 1);
												{
													Entity _ent = entity;
													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																_ent.getYRot(), _ent.getXRot());
												}
												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
												JimsmineshaftMod.queueServerWork(2, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH,
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getY()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getZ()),
																15, 0.5, 0.5, 0.5, 1);
													{
														Entity _ent = entity;
														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																	_ent.getYRot(), _ent.getXRot());
													}
													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
													JimsmineshaftMod.queueServerWork(2, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.ASH,
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ()),
																	15, 0.5, 0.5, 0.5, 1);
														{
															Entity _ent = entity;
															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
														}
														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
														JimsmineshaftMod.queueServerWork(2, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																		(entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getY()),
																		(entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ()),
																		15, 0.5, 0.5, 0.5, 1);
															{
																Entity _ent = entity;
																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																if (_ent instanceof ServerPlayer _serverPlayer)
																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
															}
															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
															JimsmineshaftMod.queueServerWork(2, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.ASH, (entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																			(entity.level()
																					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																							entity))
																					.getBlockPos().getY()),
																			(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																			15, 0.5, 0.5, 0.5, 1);
																{
																	Entity _ent = entity;
																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																}
																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																JimsmineshaftMod.queueServerWork(2, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.ASH,
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																				15, 0.5, 0.5, 0.5, 1);
																	{
																		Entity _ent = entity;
																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																		if (_ent instanceof ServerPlayer _serverPlayer)
																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																	}
																	entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.ASH,
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getX()),
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getY()),
																					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																					15, 0.5, 0.5, 0.5, 1);
																		{
																			Entity _ent = entity;
																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																		}
																		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.ASH,
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																						15, 0.5, 0.5, 0.5, 1);
																			{
																				Entity _ent = entity;
																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																				if (_ent instanceof ServerPlayer _serverPlayer)
																					_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																			}
																			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.ASH,
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getX()),
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getY()),
																							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																							15, 0.5, 0.5, 0.5, 1);
																				{
																					Entity _ent = entity;
																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																				}
																				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.ASH,
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getX()),
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getY()),
																								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																								15, 0.5, 0.5, 0.5, 1);
																					{
																						Entity _ent = entity;
																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																						if (_ent instanceof ServerPlayer _serverPlayer)
																							_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																					}
																					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.ASH,
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getX()),
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getY()),
																									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																									15, 0.5, 0.5, 0.5, 1);
																						{
																							Entity _ent = entity;
																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																						}
																						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.ASH,
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getX()),
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getY()),
																										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																										15, 0.5, 0.5, 0.5, 1);
																							{
																								Entity _ent = entity;
																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																								if (_ent instanceof ServerPlayer _serverPlayer)
																									_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																							}
																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.ASH,
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getX()),
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getY()),
																											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																											15, 0.5, 0.5, 0.5, 1);
																								{
																									Entity _ent = entity;
																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																								}
																								entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																										new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.ASH,
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getX()),
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getY()),
																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																												15, 0.5, 0.5, 0.5, 1);
																									{
																										Entity _ent = entity;
																										_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																										if (_ent instanceof ServerPlayer _serverPlayer)
																											_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																									}
																									entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																											new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.ASH,
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getX()),
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getY()),
																													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																													15, 0.5, 0.5, 0.5, 1);
																										{
																											Entity _ent = entity;
																											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																										}
																										entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																												new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.ASH,
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getX()),
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getY()),
																														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																														15, 0.5, 0.5, 0.5, 1);
																											{
																												Entity _ent = entity;
																												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																												if (_ent instanceof ServerPlayer _serverPlayer)
																													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																											}
																											entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																													new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.ASH,
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getY()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getZ()),
																															15, 0.5, 0.5, 0.5, 1);
																												{
																													Entity _ent = entity;
																													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																												}
																												entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																														new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.ASH,
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getY()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getZ()),
																																15, 0.5, 0.5, 0.5, 1);
																													{
																														Entity _ent = entity;
																														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																														if (_ent instanceof ServerPlayer _serverPlayer)
																															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																													}
																													entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																															new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getY()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getZ()),
																																	15, 0.5, 0.5, 0.5, 1);
																														{
																															Entity _ent = entity;
																															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																														}
																														entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getY()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getZ()),
																																		15, 0.5, 0.5, 0.5, 1);
																															{
																																Entity _ent = entity;
																																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																if (_ent instanceof ServerPlayer _serverPlayer)
																																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																			(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																			_ent.getXRot());
																															}
																															entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																	new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.ASH,
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getX()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getY()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getZ()),
																																			15, 0.5, 0.5, 0.5, 1);
																																{
																																	Entity _ent = entity;
																																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																				(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																				_ent.getXRot());
																																}
																																entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																		new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.ASH,
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getX()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getY()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getZ()),
																																				15, 0.5, 0.5, 0.5, 1);
																																	{
																																		Entity _ent = entity;
																																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																					(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																					_ent.getXRot());
																																	}
																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																			new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.ASH,
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getY()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getZ()),
																																					15, 0.5, 0.5, 0.5, 1);
																																		{
																																			Entity _ent = entity;
																																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																						(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																						_ent.getYRot(), _ent.getXRot());
																																		}
																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																				new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.ASH,
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getY()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getZ()),
																																						15, 0.5, 0.5, 0.5, 1);
																																			{
																																				Entity _ent = entity;
																																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																					_serverPlayer.connection.teleport(
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																							_ent.getXRot());
																																			}
																																			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																					new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getY()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getZ()),
																																							15, 0.5, 0.5, 0.5, 1);
																																				{
																																					Entity _ent = entity;
																																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport(
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																								_ent.getXRot());
																																				}
																																				entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																						new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getY()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getZ()),
																																								15, 0.5, 0.5, 0.5, 1);
																																					{
																																						Entity _ent = entity;
																																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																								(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																							_serverPlayer.connection.teleport(
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																									_ent.getXRot());
																																					}
																																					entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																							new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.ASH,
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getY()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getZ()),
																																									15, 0.5, 0.5, 0.5, 1);
																																						{
																																							Entity _ent = entity;
																																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																									(entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																								_serverPlayer.connection.teleport(
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																										_ent.getYRot(), _ent.getXRot());
																																						}
																																						entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																								new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.ASH,
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getX()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getY()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getZ()),
																																										15, 0.5, 0.5, 0.5, 1);
																																							{
																																								Entity _ent = entity;
																																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																									_serverPlayer.connection.teleport(
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																											_ent.getYRot(), _ent.getXRot());
																																							}
																																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getY()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getZ()),
																																											15, 0.5, 0.5, 0.5, 1);
																																								{
																																									Entity _ent = entity;
																																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																										_serverPlayer.connection.teleport(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																												_ent.getYRot(), _ent.getXRot());
																																								}
																																								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.ASH,
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getX()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getY()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getZ()),
																																												15, 0.5, 0.5, 0.5, 1);
																																									{
																																										Entity _ent = entity;
																																										_ent.teleportTo(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																										if (_ent instanceof ServerPlayer _serverPlayer)
																																											_serverPlayer.connection.teleport(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																													_ent.getYRot(), _ent.getXRot());
																																									}
																																									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getX()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getY()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getZ()),
																																													15, 0.5, 0.5, 0.5, 1);
																																										{
																																											Entity _ent = entity;
																																											_ent.teleportTo(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																												_serverPlayer.connection.teleport(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()),
																																														_ent.getYRot(), _ent.getXRot());
																																										}
																																										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																														+ 0.5)));
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.ASH,
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getY()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getZ()),
																																														15, 0.5, 0.5, 0.5, 1);
																																											{
																																												Entity _ent = entity;
																																												_ent.teleportTo(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()));
																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																													_serverPlayer.connection.teleport(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()),
																																															_ent.getYRot(), _ent.getXRot());
																																											}
																																											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																															+ 0.5)));
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getX()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getY()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getZ()),
																																															15, 0.5, 0.5, 0.5, 1);
																																												{
																																													Entity _ent = entity;
																																													_ent.teleportTo(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()));
																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																														_serverPlayer.connection.teleport(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()),
																																																_ent.getYRot(), _ent.getXRot());
																																												}
																																												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																+ 0.5)));
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getY()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getZ()),
																																																15, 0.5, 0.5, 0.5, 1);
																																													{
																																														Entity _ent = entity;
																																														_ent.teleportTo(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()));
																																														if (_ent instanceof ServerPlayer _serverPlayer)
																																															_serverPlayer.connection
																																																	.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																													}
																																													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																	+ 0.5)));
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getX()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getY()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getZ()),
																																																	15, 0.5, 0.5, 0.5, 1);
																																														{
																																															Entity _ent = entity;
																																															_ent.teleportTo(
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getX()),
																																																	(entity.getY()),
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getZ()));
																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																_serverPlayer.connection
																																																		.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																														}
																																														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																		+ 0.5)));
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getX()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getY()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getZ()),
																																																		15, 0.5, 0.5, 0.5, 1);
																																															{
																																																Entity _ent = entity;
																																																_ent.teleportTo(
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getX()),
																																																		(entity.getY()),
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getZ()));
																																																if (_ent instanceof ServerPlayer _serverPlayer)
																																																	_serverPlayer.connection.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																															}
																																															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																			+ 0.5)));
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.ASH,
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getX()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getY()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getZ()),
																																																			15, 0.5, 0.5, 0.5, 1);
																																																{
																																																	Entity _ent = entity;
																																																	_ent.teleportTo(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()));
																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																		_serverPlayer.connection.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																																}
																																																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																				+ 0.5)));
																																																JimsmineshaftMod.queueServerWork(2, () -> {
																																																	if (world instanceof ServerLevel _level)
																																																		_level.sendParticles(ParticleTypes.ASH,
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getX()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getY()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getZ()),
																																																				15, 0.5, 0.5, 0.5, 1);
																																																	{
																																																		Entity _ent = entity;
																																																		_ent.teleportTo(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()));
																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																			_serverPlayer.connection.teleport(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getZ()),
																																																					_ent.getYRot(), _ent.getXRot());
																																																	}
																																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																			new Vec3((entity.getData(
																																																					JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																					+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																							+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																							+ 0.5)));
																																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																																		if (world instanceof ServerLevel _level)
																																																			_level.sendParticles(ParticleTypes.ASH,
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getX()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getY()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getZ()),
																																																					15, 0.5, 0.5, 0.5, 1);
																																																		{
																																																			Entity _ent = entity;
																																																			_ent.teleportTo(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05)
																																																							+ entity.getZ()));
																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																				_serverPlayer.connection
																																																						.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																		}
																																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																				new Vec3((entity.getData(
																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																						+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																								+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																								+ 0.5)));
																																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																																			if (world instanceof ServerLevel _level)
																																																				_level.sendParticles(ParticleTypes.ASH,
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getX()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getY()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getZ()),
																																																						15, 0.5, 0.5, 0.5, 1);
																																																			{
																																																				Entity _ent = entity;
																																																				_ent.teleportTo(
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getX()),
																																																						(entity.getY()),
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getZ()));
																																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																																					_serverPlayer.connection.teleport(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()),
																																																							_ent.getYRot(),
																																																							_ent.getXRot());
																																																			}
																																																			entity.lookAt(
																																																					EntityAnchorArgument.Anchor.EYES,
																																																					new Vec3((entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																							+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																									+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																									+ 0.5)));
																																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																																				if (world instanceof ServerLevel _level)
																																																					_level.sendParticles(
																																																							ParticleTypes.ASH,
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getX()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getY()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getZ()),
																																																							15, 0.5, 0.5, 0.5, 1);
																																																				{
																																																					Entity _ent = entity;
																																																					_ent.teleportTo(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()));
																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																						_serverPlayer.connection.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																				}
																																																				entity.lookAt(
																																																						EntityAnchorArgument.Anchor.EYES,
																																																						new Vec3((entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																								+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																										+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																										+ 0.5)));
																																																				JimsmineshaftMod.queueServerWork(2,
																																																						() -> {
																																																							if (world instanceof ServerLevel _level)
																																																								_level.sendParticles(
																																																										ParticleTypes.ASH,
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getX()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getY()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getZ()),
																																																										15, 0.5, 0.5, 0.5,
																																																										1);
																																																							{
																																																								Entity _ent = entity;
																																																								_ent.teleportTo((Mth
																																																										.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																										+ entity.getX()),
																																																										(entity.getY()),
																																																										(Mth.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																												+ entity.getZ()));
																																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																																									_serverPlayer.connection
																																																											.teleport((Mth
																																																													.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																													+ entity.getX()),
																																																													(entity.getY()),
																																																													(Mth.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																															+ entity.getZ()),
																																																													_ent.getYRot(),
																																																													_ent.getXRot());
																																																							}
																																																							entity.lookAt(
																																																									EntityAnchorArgument.Anchor.EYES,
																																																									new Vec3((entity
																																																											.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																											+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																													+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																													+ 0.5)));
																																																							JimsmineshaftMod
																																																									.queueServerWork(2,
																																																											() -> {
																																																												if (world instanceof ServerLevel _level)
																																																													_level.sendParticles(
																																																															ParticleTypes.ASH,
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getX()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getY()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getZ()),
																																																															15,
																																																															0.5,
																																																															0.5,
																																																															0.5,
																																																															1);
																																																												{
																																																													Entity _ent = entity;
																																																													_ent.teleportTo(
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getX()),
																																																															(entity.getY()),
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getZ()));
																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																														_serverPlayer.connection
																																																																.teleport(
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getX()),
																																																																		(entity.getY()),
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getZ()),
																																																																		_ent.getYRot(),
																																																																		_ent.getXRot());
																																																												}
																																																												entity.lookAt(
																																																														EntityAnchorArgument.Anchor.EYES,
																																																														new Vec3(
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																		+ 0.5)));
																																																												JimsmineshaftMod
																																																														.queueServerWork(
																																																																2,
																																																																() -> {
																																																																	if (world instanceof ServerLevel _level)
																																																																		_level.sendParticles(
																																																																				ParticleTypes.ASH,
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getX()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getY()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getZ()),
																																																																				15,
																																																																				0.5,
																																																																				0.5,
																																																																				0.5,
																																																																				1);
																																																																	{
																																																																		Entity _ent = entity;
																																																																		_ent.teleportTo(
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getX()),
																																																																				(entity.getY()),
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getZ()));
																																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																																			_serverPlayer.connection
																																																																					.teleport(
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getX()),
																																																																							(entity.getY()),
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getZ()),
																																																																							_ent.getYRot(),
																																																																							_ent.getXRot());
																																																																	}
																																																																	entity.lookAt(
																																																																			EntityAnchorArgument.Anchor.EYES,
																																																																			new Vec3(
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																							+ 0.5)));
																																																																	JimsmineshaftMod
																																																																			.queueServerWork(
																																																																					2,
																																																																					() -> {
																																																																						if (world instanceof ServerLevel _level)
																																																																							_level.sendParticles(
																																																																									ParticleTypes.ASH,
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getX()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getY()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getZ()),
																																																																									15,
																																																																									0.5,
																																																																									0.5,
																																																																									0.5,
																																																																									1);
																																																																						{
																																																																							Entity _ent = entity;
																																																																							_ent.teleportTo(
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getX()),
																																																																									(entity.getY()),
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getZ()));
																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																								_serverPlayer.connection
																																																																										.teleport(
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getX()),
																																																																												(entity.getY()),
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getZ()),
																																																																												_ent.getYRot(),
																																																																												_ent.getXRot());
																																																																						}
																																																																						entity.lookAt(
																																																																								EntityAnchorArgument.Anchor.EYES,
																																																																								new Vec3(
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																												+ 0.5)));
																																																																						JimsmineshaftMod
																																																																								.queueServerWork(
																																																																										2,
																																																																										() -> {
																																																																											if (world instanceof ServerLevel _level)
																																																																												_level.sendParticles(
																																																																														ParticleTypes.ASH,
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getX()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getY()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getZ()),
																																																																														15,
																																																																														0.5,
																																																																														0.5,
																																																																														0.5,
																																																																														1);
																																																																											{
																																																																												Entity _ent = entity;
																																																																												_ent.teleportTo(
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getX()),
																																																																														(entity.getY()),
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getZ()));
																																																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																																																													_serverPlayer.connection
																																																																															.teleport(
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getX()),
																																																																																	(entity.getY()),
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getZ()),
																																																																																	_ent.getYRot(),
																																																																																	_ent.getXRot());
																																																																											}
																																																																											entity.lookAt(
																																																																													EntityAnchorArgument.Anchor.EYES,
																																																																													new Vec3(
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																	+ 0.5)));
																																																																											JimsmineshaftMod
																																																																													.queueServerWork(
																																																																															2,
																																																																															() -> {
																																																																																if (world instanceof ServerLevel _level)
																																																																																	_level.sendParticles(
																																																																																			ParticleTypes.ASH,
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getX()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getY()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getZ()),
																																																																																			15,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			1);
																																																																																{
																																																																																	Entity _ent = entity;
																																																																																	_ent.teleportTo(
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getX()),
																																																																																			(entity.getY()),
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getZ()));
																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																		_serverPlayer.connection
																																																																																				.teleport(
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getX()),
																																																																																						(entity.getY()),
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getZ()),
																																																																																						_ent.getYRot(),
																																																																																						_ent.getXRot());
																																																																																}
																																																																																entity.lookAt(
																																																																																		EntityAnchorArgument.Anchor.EYES,
																																																																																		new Vec3(
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																						+ 0.5)));
																																																																																JimsmineshaftMod
																																																																																		.queueServerWork(
																																																																																				2,
																																																																																				() -> {
																																																																																					if (world instanceof ServerLevel _level)
																																																																																						_level.sendParticles(
																																																																																								ParticleTypes.ASH,
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getX()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getY()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getZ()),
																																																																																								15,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								1);
																																																																																					{
																																																																																						Entity _ent = entity;
																																																																																						_ent.teleportTo(
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getX()),
																																																																																								(entity.getY()),
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getZ()));
																																																																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																							_serverPlayer.connection
																																																																																									.teleport(
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getX()),
																																																																																											(entity.getY()),
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getZ()),
																																																																																											_ent.getYRot(),
																																																																																											_ent.getXRot());
																																																																																					}
																																																																																					entity.lookAt(
																																																																																							EntityAnchorArgument.Anchor.EYES,
																																																																																							new Vec3(
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																											+ 0.5)));
																																																																																					{
																																																																																						JimsmineshaftModVariables.PlayerVariables _vars = entity
																																																																																								.getData(
																																																																																										JimsmineshaftModVariables.PLAYER_VARIABLES);
																																																																																						_vars.playerIsDrilling = false;
																																																																																						_vars.syncPlayerVariables(
																																																																																								entity);
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
										});
									});
								});
							}
							if (Direction.NORTH == (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getDirection())) {
								JimsmineshaftMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ASH,
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getX()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getY()),
												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
														.getBlockPos().getZ()),
												15, 0.5, 0.5, 0.5, 1);
									{
										Entity _ent = entity;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = JimsmineshaftModEntities.COPPER_DRILLED_NORTH.get().spawn(_level,
												new BlockPos(
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY(),
														entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
												EntitySpawnReason.MOB_SUMMONED);
										if (entityToSpawn != null) {
											entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
										}
									}
									world.setBlock(new BlockPos(
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getX(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getY(),
											entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
													.getZ()),
											Blocks.AIR.defaultBlockState(), 3);
									JimsmineshaftMod.queueServerWork(2, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ASH,
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getX()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getY()),
													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
															.getBlockPos().getZ()),
													15, 0.5, 0.5, 0.5, 1);
										{
											Entity _ent = entity;
											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
														_ent.getYRot(), _ent.getXRot());
										}
										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
										JimsmineshaftMod.queueServerWork(2, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ASH,
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getX()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getY()),
														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																.getBlockPos().getZ()),
														15, 0.5, 0.5, 0.5, 1);
											{
												Entity _ent = entity;
												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
															_ent.getYRot(), _ent.getXRot());
											}
											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
											JimsmineshaftMod.queueServerWork(2, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.ASH,
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getX()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getY()),
															(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																	.getBlockPos().getZ()),
															15, 0.5, 0.5, 0.5, 1);
												{
													Entity _ent = entity;
													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																_ent.getYRot(), _ent.getXRot());
												}
												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
												JimsmineshaftMod.queueServerWork(2, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles(ParticleTypes.ASH,
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getY()),
																(entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getZ()),
																15, 0.5, 0.5, 0.5, 1);
													{
														Entity _ent = entity;
														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
														if (_ent instanceof ServerPlayer _serverPlayer)
															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																	_ent.getYRot(), _ent.getXRot());
													}
													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
													JimsmineshaftMod.queueServerWork(2, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles(ParticleTypes.ASH,
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getY()),
																	(entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getZ()),
																	15, 0.5, 0.5, 0.5, 1);
														{
															Entity _ent = entity;
															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
															if (_ent instanceof ServerPlayer _serverPlayer)
																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
														}
														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
														JimsmineshaftMod.queueServerWork(2, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																		.getBlockPos().getX()),
																		(entity.level()
																				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																						entity))
																				.getBlockPos().getY()),
																		(entity.level().clip(
																				new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																				.getBlockPos().getZ()),
																		15, 0.5, 0.5, 0.5, 1);
															{
																Entity _ent = entity;
																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																if (_ent instanceof ServerPlayer _serverPlayer)
																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
															}
															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
															JimsmineshaftMod.queueServerWork(2, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles(ParticleTypes.ASH, (entity.level()
																			.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																			.getBlockPos().getX()),
																			(entity.level()
																					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																							entity))
																					.getBlockPos().getY()),
																			(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																					ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																			15, 0.5, 0.5, 0.5, 1);
																{
																	Entity _ent = entity;
																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																	if (_ent instanceof ServerPlayer _serverPlayer)
																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																}
																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																JimsmineshaftMod.queueServerWork(2, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles(ParticleTypes.ASH,
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getX()),
																				(entity.level()
																						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity))
																						.getBlockPos().getY()),
																				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																						ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																				15, 0.5, 0.5, 0.5, 1);
																	{
																		Entity _ent = entity;
																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																		if (_ent instanceof ServerPlayer _serverPlayer)
																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																	}
																	entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																	JimsmineshaftMod.queueServerWork(2, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles(ParticleTypes.ASH,
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getX()),
																					(entity.level()
																							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity))
																							.getBlockPos().getY()),
																					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																							ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																					15, 0.5, 0.5, 0.5, 1);
																		{
																			Entity _ent = entity;
																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																			if (_ent instanceof ServerPlayer _serverPlayer)
																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																		}
																		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																		JimsmineshaftMod.queueServerWork(2, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.sendParticles(ParticleTypes.ASH,
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getX()),
																						(entity.level()
																								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																										ClipContext.Fluid.NONE, entity))
																								.getBlockPos().getY()),
																						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																								ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																						15, 0.5, 0.5, 0.5, 1);
																			{
																				Entity _ent = entity;
																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																				if (_ent instanceof ServerPlayer _serverPlayer)
																					_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																			}
																			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																			JimsmineshaftMod.queueServerWork(2, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.sendParticles(ParticleTypes.ASH,
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getX()),
																							(entity.level()
																									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																											ClipContext.Fluid.NONE, entity))
																									.getBlockPos().getY()),
																							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																							15, 0.5, 0.5, 0.5, 1);
																				{
																					Entity _ent = entity;
																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																					if (_ent instanceof ServerPlayer _serverPlayer)
																						_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																				}
																				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																				JimsmineshaftMod.queueServerWork(2, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.sendParticles(ParticleTypes.ASH,
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getX()),
																								(entity.level()
																										.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																												ClipContext.Fluid.NONE, entity))
																										.getBlockPos().getY()),
																								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																								15, 0.5, 0.5, 0.5, 1);
																					{
																						Entity _ent = entity;
																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																						if (_ent instanceof ServerPlayer _serverPlayer)
																							_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																					}
																					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																					JimsmineshaftMod.queueServerWork(2, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.sendParticles(ParticleTypes.ASH,
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getX()),
																									(entity.level()
																											.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																													ClipContext.Fluid.NONE, entity))
																											.getBlockPos().getY()),
																									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																									15, 0.5, 0.5, 0.5, 1);
																						{
																							Entity _ent = entity;
																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																							if (_ent instanceof ServerPlayer _serverPlayer)
																								_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																						}
																						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5), (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																						JimsmineshaftMod.queueServerWork(2, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.sendParticles(ParticleTypes.ASH,
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getX()),
																										(entity.level()
																												.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																												.getBlockPos().getY()),
																										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																										15, 0.5, 0.5, 0.5, 1);
																							{
																								Entity _ent = entity;
																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																								if (_ent instanceof ServerPlayer _serverPlayer)
																									_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																							}
																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																							JimsmineshaftMod.queueServerWork(2, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.sendParticles(ParticleTypes.ASH,
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getX()),
																											(entity.level()
																													.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																													.getBlockPos().getY()),
																											(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																											15, 0.5, 0.5, 0.5, 1);
																								{
																									Entity _ent = entity;
																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																									if (_ent instanceof ServerPlayer _serverPlayer)
																										_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																								}
																								entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																										new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																								JimsmineshaftMod.queueServerWork(2, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.sendParticles(ParticleTypes.ASH,
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getX()),
																												(entity.level()
																														.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																														.getBlockPos().getY()),
																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																												15, 0.5, 0.5, 0.5, 1);
																									{
																										Entity _ent = entity;
																										_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																										if (_ent instanceof ServerPlayer _serverPlayer)
																											_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																									}
																									entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																											new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																									JimsmineshaftMod.queueServerWork(2, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.sendParticles(ParticleTypes.ASH,
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getX()),
																													(entity.level()
																															.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																															.getBlockPos().getY()),
																													(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																													15, 0.5, 0.5, 0.5, 1);
																										{
																											Entity _ent = entity;
																											_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																											if (_ent instanceof ServerPlayer _serverPlayer)
																												_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																										}
																										entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																												new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																										JimsmineshaftMod.queueServerWork(2, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.sendParticles(ParticleTypes.ASH,
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getX()),
																														(entity.level()
																																.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																.getBlockPos().getY()),
																														(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
																														15, 0.5, 0.5, 0.5, 1);
																											{
																												Entity _ent = entity;
																												_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																												if (_ent instanceof ServerPlayer _serverPlayer)
																													_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																											}
																											entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																													new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																															(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																											JimsmineshaftMod.queueServerWork(2, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.sendParticles(ParticleTypes.ASH,
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getY()),
																															(entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getZ()),
																															15, 0.5, 0.5, 0.5, 1);
																												{
																													Entity _ent = entity;
																													_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																													if (_ent instanceof ServerPlayer _serverPlayer)
																														_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																												}
																												entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																														new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																												JimsmineshaftMod.queueServerWork(2, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.sendParticles(ParticleTypes.ASH,
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getY()),
																																(entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getZ()),
																																15, 0.5, 0.5, 0.5, 1);
																													{
																														Entity _ent = entity;
																														_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																														if (_ent instanceof ServerPlayer _serverPlayer)
																															_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																													}
																													entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																															new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																	(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																													JimsmineshaftMod.queueServerWork(2, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																	.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																			ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																	.getBlockPos().getX()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getY()),
																																	(entity.level()
																																			.clip(new ClipContext(entity.getEyePosition(1f),
																																					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																					ClipContext.Fluid.NONE, entity))
																																			.getBlockPos().getZ()),
																																	15, 0.5, 0.5, 0.5, 1);
																														{
																															Entity _ent = entity;
																															_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																															if (_ent instanceof ServerPlayer _serverPlayer)
																																_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(), _ent.getXRot());
																														}
																														entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																		(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																														JimsmineshaftMod.queueServerWork(2, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																		.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																				ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																		.getBlockPos().getX()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getY()),
																																		(entity.level()
																																				.clip(new ClipContext(entity.getEyePosition(1f),
																																						entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																						ClipContext.Fluid.NONE, entity))
																																				.getBlockPos().getZ()),
																																		15, 0.5, 0.5, 0.5, 1);
																															{
																																Entity _ent = entity;
																																_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																		(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																if (_ent instanceof ServerPlayer _serverPlayer)
																																	_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																			(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																			_ent.getXRot());
																															}
																															entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																	new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																			(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																															JimsmineshaftMod.queueServerWork(2, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.sendParticles(ParticleTypes.ASH,
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getX()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getY()),
																																			(entity.level()
																																					.clip(new ClipContext(entity.getEyePosition(1f),
																																							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
																																							ClipContext.Fluid.NONE, entity))
																																					.getBlockPos().getZ()),
																																			15, 0.5, 0.5, 0.5, 1);
																																{
																																	Entity _ent = entity;
																																	_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																			(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																		_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																				(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																				_ent.getXRot());
																																}
																																entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																		new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																				(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																JimsmineshaftMod.queueServerWork(2, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.sendParticles(ParticleTypes.ASH,
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getX()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getY()),
																																				(entity.level()
																																						.clip(new ClipContext(entity.getEyePosition(1f),
																																								entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																						.getBlockPos().getZ()),
																																				15, 0.5, 0.5, 0.5, 1);
																																	{
																																		Entity _ent = entity;
																																		_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																				(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																			_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																					(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																					_ent.getXRot());
																																	}
																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																			new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																					(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.sendParticles(ParticleTypes.ASH,
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getY()),
																																					(entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getZ()),
																																					15, 0.5, 0.5, 0.5, 1);
																																		{
																																			Entity _ent = entity;
																																			_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																					(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																				_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																						(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																						_ent.getYRot(), _ent.getXRot());
																																		}
																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																				new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																						(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																			if (world instanceof ServerLevel _level)
																																				_level.sendParticles(ParticleTypes.ASH,
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getY()),
																																						(entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getZ()),
																																						15, 0.5, 0.5, 0.5, 1);
																																			{
																																				Entity _ent = entity;
																																				_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																						(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																					_serverPlayer.connection.teleport(
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																							_ent.getXRot());
																																			}
																																			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																					new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																							(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																				if (world instanceof ServerLevel _level)
																																					_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																							.clip(new ClipContext(entity.getEyePosition(1f),
																																									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																									ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																							.getBlockPos().getX()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getY()),
																																							(entity.level()
																																									.clip(new ClipContext(entity.getEyePosition(1f),
																																											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																									.getBlockPos().getZ()),
																																							15, 0.5, 0.5, 0.5, 1);
																																				{
																																					Entity _ent = entity;
																																					_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																							(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																						_serverPlayer.connection.teleport(
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																								(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																								_ent.getXRot());
																																				}
																																				entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																						new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																								(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																				JimsmineshaftMod.queueServerWork(2, () -> {
																																					if (world instanceof ServerLevel _level)
																																						_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																								.clip(new ClipContext(entity.getEyePosition(1f),
																																										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																								.getBlockPos().getX()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getY()),
																																								(entity.level()
																																										.clip(new ClipContext(entity.getEyePosition(1f),
																																												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																										.getBlockPos().getZ()),
																																								15, 0.5, 0.5, 0.5, 1);
																																					{
																																						Entity _ent = entity;
																																						_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																								(entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																							_serverPlayer.connection.teleport(
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()), (entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()), _ent.getYRot(),
																																									_ent.getXRot());
																																					}
																																					entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																							new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																									(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																					JimsmineshaftMod.queueServerWork(2, () -> {
																																						if (world instanceof ServerLevel _level)
																																							_level.sendParticles(ParticleTypes.ASH,
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getY()),
																																									(entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getZ()),
																																									15, 0.5, 0.5, 0.5, 1);
																																						{
																																							Entity _ent = entity;
																																							_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																									(entity.getY()),
																																									(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																								_serverPlayer.connection.teleport(
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																										_ent.getYRot(), _ent.getXRot());
																																						}
																																						entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																								new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																						JimsmineshaftMod.queueServerWork(2, () -> {
																																							if (world instanceof ServerLevel _level)
																																								_level.sendParticles(ParticleTypes.ASH,
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getX()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getY()),
																																										(entity.level()
																																												.clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																												.getBlockPos().getZ()),
																																										15, 0.5, 0.5, 0.5, 1);
																																							{
																																								Entity _ent = entity;
																																								_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																										(entity.getY()),
																																										(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																									_serverPlayer.connection.teleport(
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																											_ent.getYRot(), _ent.getXRot());
																																							}
																																							entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																									new Vec3((entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																							JimsmineshaftMod.queueServerWork(2, () -> {
																																								if (world instanceof ServerLevel _level)
																																									_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																											.clip(new ClipContext(entity.getEyePosition(1f),
																																													entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																													ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																											.getBlockPos().getX()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getY()),
																																											(entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getZ()),
																																											15, 0.5, 0.5, 0.5, 1);
																																								{
																																									Entity _ent = entity;
																																									_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																											(entity.getY()),
																																											(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																									if (_ent instanceof ServerPlayer _serverPlayer)
																																										_serverPlayer.connection.teleport(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																												_ent.getYRot(), _ent.getXRot());
																																								}
																																								entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																										(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																								JimsmineshaftMod.queueServerWork(2, () -> {
																																									if (world instanceof ServerLevel _level)
																																										_level.sendParticles(ParticleTypes.ASH,
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getX()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getY()),
																																												(entity.level().clip(new ClipContext(entity.getEyePosition(1f),
																																														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)),
																																														ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																														.getBlockPos().getZ()),
																																												15, 0.5, 0.5, 0.5, 1);
																																									{
																																										Entity _ent = entity;
																																										_ent.teleportTo(
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																												(entity.getY()),
																																												(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																										if (_ent instanceof ServerPlayer _serverPlayer)
																																											_serverPlayer.connection.teleport(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()),
																																													_ent.getYRot(), _ent.getXRot());
																																									}
																																									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																											(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ + 0.5)));
																																									JimsmineshaftMod.queueServerWork(2, () -> {
																																										if (world instanceof ServerLevel _level)
																																											_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																													.clip(new ClipContext(entity.getEyePosition(1f),
																																															entity.getEyePosition(1f)
																																																	.add(entity.getViewVector(1f).scale(5)),
																																															ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
																																													.getBlockPos().getX()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getY()),
																																													(entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getZ()),
																																													15, 0.5, 0.5, 0.5, 1);
																																										{
																																											Entity _ent = entity;
																																											_ent.teleportTo(
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getX()),
																																													(entity.getY()),
																																													(Mth.nextDouble(RandomSource.create(), -0.05, 0.05) + entity.getZ()));
																																											if (_ent instanceof ServerPlayer _serverPlayer)
																																												_serverPlayer.connection.teleport(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()),
																																														_ent.getYRot(), _ent.getXRot());
																																										}
																																										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY + 0.5),
																																												(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																														+ 0.5)));
																																										JimsmineshaftMod.queueServerWork(2, () -> {
																																											if (world instanceof ServerLevel _level)
																																												_level.sendParticles(ParticleTypes.ASH,
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getY()),
																																														(entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getZ()),
																																														15, 0.5, 0.5, 0.5, 1);
																																											{
																																												Entity _ent = entity;
																																												_ent.teleportTo(
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getX()),
																																														(entity.getY()),
																																														(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																+ entity.getZ()));
																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																													_serverPlayer.connection.teleport(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()),
																																															_ent.getYRot(), _ent.getXRot());
																																											}
																																											entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																															+ 0.5),
																																													(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																															+ 0.5)));
																																											JimsmineshaftMod.queueServerWork(2, () -> {
																																												if (world instanceof ServerLevel _level)
																																													_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																															.clip(new ClipContext(entity.getEyePosition(1f),
																																																	entity.getEyePosition(1f)
																																																			.add(entity.getViewVector(1f).scale(5)),
																																																	ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																	entity))
																																															.getBlockPos().getX()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getY()),
																																															(entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getZ()),
																																															15, 0.5, 0.5, 0.5, 1);
																																												{
																																													Entity _ent = entity;
																																													_ent.teleportTo(
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getX()),
																																															(entity.getY()),
																																															(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																	+ entity.getZ()));
																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																														_serverPlayer.connection.teleport(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()),
																																																_ent.getYRot(), _ent.getXRot());
																																												}
																																												entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																+ 0.5),
																																														(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																+ 0.5)));
																																												JimsmineshaftMod.queueServerWork(2, () -> {
																																													if (world instanceof ServerLevel _level)
																																														_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																.clip(new ClipContext(entity.getEyePosition(1f),
																																																		entity.getEyePosition(1f)
																																																				.add(entity.getViewVector(1f).scale(5)),
																																																		ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
																																																		entity))
																																																.getBlockPos().getX()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getY()),
																																																(entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getZ()),
																																																15, 0.5, 0.5, 0.5, 1);
																																													{
																																														Entity _ent = entity;
																																														_ent.teleportTo(
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getX()),
																																																(entity.getY()),
																																																(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																		+ entity.getZ()));
																																														if (_ent instanceof ServerPlayer _serverPlayer)
																																															_serverPlayer.connection
																																																	.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																													}
																																													entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																	+ 0.5),
																																															(entity.getData(
																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																	+ 0.5)));
																																													JimsmineshaftMod.queueServerWork(2, () -> {
																																														if (world instanceof ServerLevel _level)
																																															_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																	.clip(new ClipContext(entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity))
																																																	.getBlockPos().getX()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getY()),
																																																	(entity.level().clip(new ClipContext(
																																																			entity.getEyePosition(1f),
																																																			entity.getEyePosition(1f).add(
																																																					entity.getViewVector(1f).scale(5)),
																																																			ClipContext.Block.OUTLINE,
																																																			ClipContext.Fluid.NONE, entity)).getBlockPos()
																																																			.getZ()),
																																																	15, 0.5, 0.5, 0.5, 1);
																																														{
																																															Entity _ent = entity;
																																															_ent.teleportTo(
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getX()),
																																																	(entity.getY()),
																																																	(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)
																																																			+ entity.getZ()));
																																															if (_ent instanceof ServerPlayer _serverPlayer)
																																																_serverPlayer.connection
																																																		.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																														}
																																														entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																		+ 0.5),
																																																(entity.getData(
																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																		+ 0.5)));
																																														JimsmineshaftMod.queueServerWork(2, () -> {
																																															if (world instanceof ServerLevel _level)
																																																_level.sendParticles(ParticleTypes.ASH, (entity.level()
																																																		.clip(new ClipContext(entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																		.getBlockPos().getX()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getY()),
																																																		(entity.level().clip(new ClipContext(
																																																				entity.getEyePosition(1f),
																																																				entity.getEyePosition(1f)
																																																						.add(entity.getViewVector(1f)
																																																								.scale(5)),
																																																				ClipContext.Block.OUTLINE,
																																																				ClipContext.Fluid.NONE, entity))
																																																				.getBlockPos().getZ()),
																																																		15, 0.5, 0.5, 0.5, 1);
																																															{
																																																Entity _ent = entity;
																																																_ent.teleportTo(
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getX()),
																																																		(entity.getY()),
																																																		(Mth.nextDouble(RandomSource.create(), -0.05,
																																																				0.05) + entity.getZ()));
																																																if (_ent instanceof ServerPlayer _serverPlayer)
																																																	_serverPlayer.connection.teleport(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()),
																																																			_ent.getYRot(), _ent.getXRot());
																																															}
																																															entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																			+ 0.5),
																																																	(entity.getData(
																																																			JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																			+ 0.5)));
																																															JimsmineshaftMod.queueServerWork(2, () -> {
																																																if (world instanceof ServerLevel _level)
																																																	_level.sendParticles(ParticleTypes.ASH,
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getX()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getY()),
																																																			(entity.level().clip(new ClipContext(
																																																					entity.getEyePosition(1f),
																																																					entity.getEyePosition(1f)
																																																							.add(entity.getViewVector(1f)
																																																									.scale(5)),
																																																					ClipContext.Block.OUTLINE,
																																																					ClipContext.Fluid.NONE, entity))
																																																					.getBlockPos().getZ()),
																																																			15, 0.5, 0.5, 0.5, 1);
																																																{
																																																	Entity _ent = entity;
																																																	_ent.teleportTo(
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getX()),
																																																			(entity.getY()),
																																																			(Mth.nextDouble(RandomSource.create(), -0.05,
																																																					0.05) + entity.getZ()));
																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																		_serverPlayer.connection.teleport(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()),
																																																				_ent.getYRot(), _ent.getXRot());
																																																}
																																																entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																				+ 0.5),
																																																		(entity.getData(
																																																				JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																				+ 0.5)));
																																																JimsmineshaftMod.queueServerWork(2, () -> {
																																																	if (world instanceof ServerLevel _level)
																																																		_level.sendParticles(ParticleTypes.ASH,
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getX()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getY()),
																																																				(entity.level().clip(new ClipContext(
																																																						entity.getEyePosition(1f),
																																																						entity.getEyePosition(1f)
																																																								.add(entity
																																																										.getViewVector(1f)
																																																										.scale(5)),
																																																						ClipContext.Block.OUTLINE,
																																																						ClipContext.Fluid.NONE, entity))
																																																						.getBlockPos().getZ()),
																																																				15, 0.5, 0.5, 0.5, 1);
																																																	{
																																																		Entity _ent = entity;
																																																		_ent.teleportTo(
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getX()),
																																																				(entity.getY()),
																																																				(Mth.nextDouble(RandomSource.create(),
																																																						-0.05, 0.05) + entity.getZ()));
																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																			_serverPlayer.connection.teleport(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getZ()),
																																																					_ent.getYRot(), _ent.getXRot());
																																																	}
																																																	entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																			new Vec3((entity.getData(
																																																					JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																					+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																							+ 0.5),
																																																					(entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																							+ 0.5)));
																																																	JimsmineshaftMod.queueServerWork(2, () -> {
																																																		if (world instanceof ServerLevel _level)
																																																			_level.sendParticles(ParticleTypes.ASH,
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getX()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getY()),
																																																					(entity.level().clip(new ClipContext(
																																																							entity.getEyePosition(1f),
																																																							entity.getEyePosition(1f).add(
																																																									entity.getViewVector(
																																																											1f).scale(5)),
																																																							ClipContext.Block.OUTLINE,
																																																							ClipContext.Fluid.NONE,
																																																							entity)).getBlockPos()
																																																							.getZ()),
																																																					15, 0.5, 0.5, 0.5, 1);
																																																		{
																																																			Entity _ent = entity;
																																																			_ent.teleportTo(
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05) + entity.getX()),
																																																					(entity.getY()),
																																																					(Mth.nextDouble(RandomSource.create(),
																																																							-0.05, 0.05)
																																																							+ entity.getZ()));
																																																			if (_ent instanceof ServerPlayer _serverPlayer)
																																																				_serverPlayer.connection
																																																						.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																		}
																																																		entity.lookAt(EntityAnchorArgument.Anchor.EYES,
																																																				new Vec3((entity.getData(
																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																						+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																								+ 0.5),
																																																						(entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																								+ 0.5)));
																																																		JimsmineshaftMod.queueServerWork(2, () -> {
																																																			if (world instanceof ServerLevel _level)
																																																				_level.sendParticles(ParticleTypes.ASH,
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getX()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getY()),
																																																						(entity.level().clip(
																																																								new ClipContext(entity
																																																										.getEyePosition(
																																																												1f),
																																																										entity.getEyePosition(
																																																												1f)
																																																												.add(entity
																																																														.getViewVector(
																																																																1f)
																																																														.scale(5)),
																																																										ClipContext.Block.OUTLINE,
																																																										ClipContext.Fluid.NONE,
																																																										entity))
																																																								.getBlockPos().getZ()),
																																																						15, 0.5, 0.5, 0.5, 1);
																																																			{
																																																				Entity _ent = entity;
																																																				_ent.teleportTo(
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getX()),
																																																						(entity.getY()),
																																																						(Mth.nextDouble(
																																																								RandomSource.create(),
																																																								-0.05, 0.05)
																																																								+ entity.getZ()));
																																																				if (_ent instanceof ServerPlayer _serverPlayer)
																																																					_serverPlayer.connection.teleport(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()),
																																																							_ent.getYRot(),
																																																							_ent.getXRot());
																																																			}
																																																			entity.lookAt(
																																																					EntityAnchorArgument.Anchor.EYES,
																																																					new Vec3((entity.getData(
																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																							+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																									+ 0.5),
																																																							(entity.getData(
																																																									JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																									+ 0.5)));
																																																			JimsmineshaftMod.queueServerWork(2, () -> {
																																																				if (world instanceof ServerLevel _level)
																																																					_level.sendParticles(
																																																							ParticleTypes.ASH,
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getX()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getY()),
																																																							(entity.level().clip(
																																																									new ClipContext(entity
																																																											.getEyePosition(
																																																													1f),
																																																											entity.getEyePosition(
																																																													1f)
																																																													.add(entity
																																																															.getViewVector(
																																																																	1f)
																																																															.scale(5)),
																																																											ClipContext.Block.OUTLINE,
																																																											ClipContext.Fluid.NONE,
																																																											entity))
																																																									.getBlockPos()
																																																									.getZ()),
																																																							15, 0.5, 0.5, 0.5, 1);
																																																				{
																																																					Entity _ent = entity;
																																																					_ent.teleportTo(
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getX()),
																																																							(entity.getY()),
																																																							(Mth.nextDouble(
																																																									RandomSource.create(),
																																																									-0.05, 0.05)
																																																									+ entity.getZ()));
																																																					if (_ent instanceof ServerPlayer _serverPlayer)
																																																						_serverPlayer.connection.teleport(
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getX()),
																																																								(entity.getY()),
																																																								(Mth.nextDouble(
																																																										RandomSource
																																																												.create(),
																																																										-0.05, 0.05)
																																																										+ entity.getZ()),
																																																								_ent.getYRot(),
																																																								_ent.getXRot());
																																																				}
																																																				entity.lookAt(
																																																						EntityAnchorArgument.Anchor.EYES,
																																																						new Vec3((entity.getData(
																																																								JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																								+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																										+ 0.5),
																																																								(entity.getData(
																																																										JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																										+ 0.5)));
																																																				JimsmineshaftMod.queueServerWork(2,
																																																						() -> {
																																																							if (world instanceof ServerLevel _level)
																																																								_level.sendParticles(
																																																										ParticleTypes.ASH,
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getX()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getY()),
																																																										(entity.level()
																																																												.clip(new ClipContext(
																																																														entity.getEyePosition(
																																																																1f),
																																																														entity.getEyePosition(
																																																																1f)
																																																																.add(entity
																																																																		.getViewVector(
																																																																				1f)
																																																																		.scale(5)),
																																																														ClipContext.Block.OUTLINE,
																																																														ClipContext.Fluid.NONE,
																																																														entity))
																																																												.getBlockPos()
																																																												.getZ()),
																																																										15, 0.5, 0.5, 0.5,
																																																										1);
																																																							{
																																																								Entity _ent = entity;
																																																								_ent.teleportTo((Mth
																																																										.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																										+ entity.getX()),
																																																										(entity.getY()),
																																																										(Mth.nextDouble(
																																																												RandomSource
																																																														.create(),
																																																												-0.05,
																																																												0.05)
																																																												+ entity.getZ()));
																																																								if (_ent instanceof ServerPlayer _serverPlayer)
																																																									_serverPlayer.connection
																																																											.teleport((Mth
																																																													.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																													+ entity.getX()),
																																																													(entity.getY()),
																																																													(Mth.nextDouble(
																																																															RandomSource
																																																																	.create(),
																																																															-0.05,
																																																															0.05)
																																																															+ entity.getZ()),
																																																													_ent.getYRot(),
																																																													_ent.getXRot());
																																																							}
																																																							entity.lookAt(
																																																									EntityAnchorArgument.Anchor.EYES,
																																																									new Vec3((entity
																																																											.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																											+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																													+ 0.5),
																																																											(entity.getData(
																																																													JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																													+ 0.5)));
																																																							JimsmineshaftMod
																																																									.queueServerWork(2,
																																																											() -> {
																																																												if (world instanceof ServerLevel _level)
																																																													_level.sendParticles(
																																																															ParticleTypes.ASH,
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getX()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getY()),
																																																															(entity.level()
																																																																	.clip(new ClipContext(
																																																																			entity.getEyePosition(
																																																																					1f),
																																																																			entity.getEyePosition(
																																																																					1f)
																																																																					.add(entity
																																																																							.getViewVector(
																																																																									1f)
																																																																							.scale(5)),
																																																																			ClipContext.Block.OUTLINE,
																																																																			ClipContext.Fluid.NONE,
																																																																			entity))
																																																																	.getBlockPos()
																																																																	.getZ()),
																																																															15,
																																																															0.5,
																																																															0.5,
																																																															0.5,
																																																															1);
																																																												{
																																																													Entity _ent = entity;
																																																													_ent.teleportTo(
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getX()),
																																																															(entity.getY()),
																																																															(Mth.nextDouble(
																																																																	RandomSource
																																																																			.create(),
																																																																	-0.05,
																																																																	0.05)
																																																																	+ entity.getZ()));
																																																													if (_ent instanceof ServerPlayer _serverPlayer)
																																																														_serverPlayer.connection
																																																																.teleport(
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getX()),
																																																																		(entity.getY()),
																																																																		(Mth.nextDouble(
																																																																				RandomSource
																																																																						.create(),
																																																																				-0.05,
																																																																				0.05)
																																																																				+ entity.getZ()),
																																																																		_ent.getYRot(),
																																																																		_ent.getXRot());
																																																												}
																																																												entity.lookAt(
																																																														EntityAnchorArgument.Anchor.EYES,
																																																														new Vec3(
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																		+ 0.5),
																																																																(entity.getData(
																																																																		JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																		+ 0.5)));
																																																												JimsmineshaftMod
																																																														.queueServerWork(
																																																																2,
																																																																() -> {
																																																																	if (world instanceof ServerLevel _level)
																																																																		_level.sendParticles(
																																																																				ParticleTypes.ASH,
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getX()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getY()),
																																																																				(entity.level()
																																																																						.clip(new ClipContext(
																																																																								entity.getEyePosition(
																																																																										1f),
																																																																								entity.getEyePosition(
																																																																										1f)
																																																																										.add(entity
																																																																												.getViewVector(
																																																																														1f)
																																																																												.scale(5)),
																																																																								ClipContext.Block.OUTLINE,
																																																																								ClipContext.Fluid.NONE,
																																																																								entity))
																																																																						.getBlockPos()
																																																																						.getZ()),
																																																																				15,
																																																																				0.5,
																																																																				0.5,
																																																																				0.5,
																																																																				1);
																																																																	{
																																																																		Entity _ent = entity;
																																																																		_ent.teleportTo(
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getX()),
																																																																				(entity.getY()),
																																																																				(Mth.nextDouble(
																																																																						RandomSource
																																																																								.create(),
																																																																						-0.05,
																																																																						0.05)
																																																																						+ entity.getZ()));
																																																																		if (_ent instanceof ServerPlayer _serverPlayer)
																																																																			_serverPlayer.connection
																																																																					.teleport(
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getX()),
																																																																							(entity.getY()),
																																																																							(Mth.nextDouble(
																																																																									RandomSource
																																																																											.create(),
																																																																									-0.05,
																																																																									0.05)
																																																																									+ entity.getZ()),
																																																																							_ent.getYRot(),
																																																																							_ent.getXRot());
																																																																	}
																																																																	entity.lookAt(
																																																																			EntityAnchorArgument.Anchor.EYES,
																																																																			new Vec3(
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																							+ 0.5),
																																																																					(entity.getData(
																																																																							JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																							+ 0.5)));
																																																																	JimsmineshaftMod
																																																																			.queueServerWork(
																																																																					2,
																																																																					() -> {
																																																																						if (world instanceof ServerLevel _level)
																																																																							_level.sendParticles(
																																																																									ParticleTypes.ASH,
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getX()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getY()),
																																																																									(entity.level()
																																																																											.clip(new ClipContext(
																																																																													entity.getEyePosition(
																																																																															1f),
																																																																													entity.getEyePosition(
																																																																															1f)
																																																																															.add(entity
																																																																																	.getViewVector(
																																																																																			1f)
																																																																																	.scale(5)),
																																																																													ClipContext.Block.OUTLINE,
																																																																													ClipContext.Fluid.NONE,
																																																																													entity))
																																																																											.getBlockPos()
																																																																											.getZ()),
																																																																									15,
																																																																									0.5,
																																																																									0.5,
																																																																									0.5,
																																																																									1);
																																																																						{
																																																																							Entity _ent = entity;
																																																																							_ent.teleportTo(
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getX()),
																																																																									(entity.getY()),
																																																																									(Mth.nextDouble(
																																																																											RandomSource
																																																																													.create(),
																																																																											-0.05,
																																																																											0.05)
																																																																											+ entity.getZ()));
																																																																							if (_ent instanceof ServerPlayer _serverPlayer)
																																																																								_serverPlayer.connection
																																																																										.teleport(
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getX()),
																																																																												(entity.getY()),
																																																																												(Mth.nextDouble(
																																																																														RandomSource
																																																																																.create(),
																																																																														-0.05,
																																																																														0.05)
																																																																														+ entity.getZ()),
																																																																												_ent.getYRot(),
																																																																												_ent.getXRot());
																																																																						}
																																																																						entity.lookAt(
																																																																								EntityAnchorArgument.Anchor.EYES,
																																																																								new Vec3(
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																												+ 0.5),
																																																																										(entity.getData(
																																																																												JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																												+ 0.5)));
																																																																						JimsmineshaftMod
																																																																								.queueServerWork(
																																																																										2,
																																																																										() -> {
																																																																											if (world instanceof ServerLevel _level)
																																																																												_level.sendParticles(
																																																																														ParticleTypes.ASH,
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getX()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getY()),
																																																																														(entity.level()
																																																																																.clip(new ClipContext(
																																																																																		entity.getEyePosition(
																																																																																				1f),
																																																																																		entity.getEyePosition(
																																																																																				1f)
																																																																																				.add(entity
																																																																																						.getViewVector(
																																																																																								1f)
																																																																																						.scale(5)),
																																																																																		ClipContext.Block.OUTLINE,
																																																																																		ClipContext.Fluid.NONE,
																																																																																		entity))
																																																																																.getBlockPos()
																																																																																.getZ()),
																																																																														15,
																																																																														0.5,
																																																																														0.5,
																																																																														0.5,
																																																																														1);
																																																																											{
																																																																												Entity _ent = entity;
																																																																												_ent.teleportTo(
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getX()),
																																																																														(entity.getY()),
																																																																														(Mth.nextDouble(
																																																																																RandomSource
																																																																																		.create(),
																																																																																-0.05,
																																																																																0.05)
																																																																																+ entity.getZ()));
																																																																												if (_ent instanceof ServerPlayer _serverPlayer)
																																																																													_serverPlayer.connection
																																																																															.teleport(
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getX()),
																																																																																	(entity.getY()),
																																																																																	(Mth.nextDouble(
																																																																																			RandomSource
																																																																																					.create(),
																																																																																			-0.05,
																																																																																			0.05)
																																																																																			+ entity.getZ()),
																																																																																	_ent.getYRot(),
																																																																																	_ent.getXRot());
																																																																											}
																																																																											entity.lookAt(
																																																																													EntityAnchorArgument.Anchor.EYES,
																																																																													new Vec3(
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																	+ 0.5),
																																																																															(entity.getData(
																																																																																	JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																	+ 0.5)));
																																																																											JimsmineshaftMod
																																																																													.queueServerWork(
																																																																															2,
																																																																															() -> {
																																																																																if (world instanceof ServerLevel _level)
																																																																																	_level.sendParticles(
																																																																																			ParticleTypes.ASH,
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getX()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getY()),
																																																																																			(entity.level()
																																																																																					.clip(new ClipContext(
																																																																																							entity.getEyePosition(
																																																																																									1f),
																																																																																							entity.getEyePosition(
																																																																																									1f)
																																																																																									.add(entity
																																																																																											.getViewVector(
																																																																																													1f)
																																																																																											.scale(5)),
																																																																																							ClipContext.Block.OUTLINE,
																																																																																							ClipContext.Fluid.NONE,
																																																																																							entity))
																																																																																					.getBlockPos()
																																																																																					.getZ()),
																																																																																			15,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			0.5,
																																																																																			1);
																																																																																{
																																																																																	Entity _ent = entity;
																																																																																	_ent.teleportTo(
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getX()),
																																																																																			(entity.getY()),
																																																																																			(Mth.nextDouble(
																																																																																					RandomSource
																																																																																							.create(),
																																																																																					-0.05,
																																																																																					0.05)
																																																																																					+ entity.getZ()));
																																																																																	if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																		_serverPlayer.connection
																																																																																				.teleport(
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getX()),
																																																																																						(entity.getY()),
																																																																																						(Mth.nextDouble(
																																																																																								RandomSource
																																																																																										.create(),
																																																																																								-0.05,
																																																																																								0.05)
																																																																																								+ entity.getZ()),
																																																																																						_ent.getYRot(),
																																																																																						_ent.getXRot());
																																																																																}
																																																																																entity.lookAt(
																																																																																		EntityAnchorArgument.Anchor.EYES,
																																																																																		new Vec3(
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																						+ 0.5),
																																																																																				(entity.getData(
																																																																																						JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																						+ 0.5)));
																																																																																JimsmineshaftMod
																																																																																		.queueServerWork(
																																																																																				2,
																																																																																				() -> {
																																																																																					if (world instanceof ServerLevel _level)
																																																																																						_level.sendParticles(
																																																																																								ParticleTypes.ASH,
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getX()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getY()),
																																																																																								(entity.level()
																																																																																										.clip(new ClipContext(
																																																																																												entity.getEyePosition(
																																																																																														1f),
																																																																																												entity.getEyePosition(
																																																																																														1f)
																																																																																														.add(entity
																																																																																																.getViewVector(
																																																																																																		1f)
																																																																																																.scale(5)),
																																																																																												ClipContext.Block.OUTLINE,
																																																																																												ClipContext.Fluid.NONE,
																																																																																												entity))
																																																																																										.getBlockPos()
																																																																																										.getZ()),
																																																																																								15,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								0.5,
																																																																																								1);
																																																																																					{
																																																																																						Entity _ent = entity;
																																																																																						_ent.teleportTo(
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getX()),
																																																																																								(entity.getY()),
																																																																																								(Mth.nextDouble(
																																																																																										RandomSource
																																																																																												.create(),
																																																																																										-0.05,
																																																																																										0.05)
																																																																																										+ entity.getZ()));
																																																																																						if (_ent instanceof ServerPlayer _serverPlayer)
																																																																																							_serverPlayer.connection
																																																																																									.teleport(
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getX()),
																																																																																											(entity.getY()),
																																																																																											(Mth.nextDouble(
																																																																																													RandomSource
																																																																																															.create(),
																																																																																													-0.05,
																																																																																													0.05)
																																																																																													+ entity.getZ()),
																																																																																											_ent.getYRot(),
																																																																																											_ent.getXRot());
																																																																																					}
																																																																																					entity.lookAt(
																																																																																							EntityAnchorArgument.Anchor.EYES,
																																																																																							new Vec3(
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillX
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillY
																																																																																											+ 0.5),
																																																																																									(entity.getData(
																																																																																											JimsmineshaftModVariables.PLAYER_VARIABLES).drillZ
																																																																																											+ 0.5)));
																																																																																					{
																																																																																						JimsmineshaftModVariables.PlayerVariables _vars = entity
																																																																																								.getData(
																																																																																										JimsmineshaftModVariables.PLAYER_VARIABLES);
																																																																																						_vars.playerIsDrilling = false;
																																																																																						_vars.syncPlayerVariables(
																																																																																								entity);
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
										});
									});
								});
							}
						}
					} else {
						{
							JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
							_vars.playerDrillMoveCloser = true;
							_vars.syncPlayerVariables(entity);
						}
						JimsmineshaftMod.queueServerWork(80, () -> {
							{
								JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.playerDrillMoveCloser = false;
								_vars.syncPlayerVariables(entity);
							}
						});
					}
				}
			}
		}
	}
}