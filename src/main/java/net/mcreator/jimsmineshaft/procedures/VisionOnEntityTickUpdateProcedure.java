package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.network.FreezeClientMessage;
import net.mcreator.jimsmineshaft.entity.VisionEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.UUID;
import java.util.ArrayList;

public class VisionOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ArrayList<Object> possibleTargets = new ArrayList<>();
		double testX = 0;
		double testY = 0;
		double testZ = 0;
		Entity target = null;
		if (entityFromStringUUID((entity.getPersistentData().getString("Target")), (Level) world) instanceof LivingEntity) {
			target = entityFromStringUUID((entity.getPersistentData().getString("Target")), (Level) world);
			if (entity.getPersistentData().getDouble("ScareTicks") > 0) {
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((target.getX()), (target.getY()), (target.getZ())));
				if (entity.getPersistentData().getBoolean("Appeared")) {
					if ((entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_anger) : 0) > 120) {
						entity.getPersistentData().putDouble("ScareTicks", (entity.getPersistentData().getDouble("ScareTicks") - 1));
						if (entity.getPersistentData().getDouble("ScareTicks") == 35) {
							if (target instanceof ServerPlayer player15)
								PacketDistributor.sendToPlayer(player15, new FreezeClientMessage(""));
							{
								JimsmineshaftModVariables.PlayerVariables _vars = target.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.analogScreenInx = "alea_iacta_est";
								_vars.syncPlayerVariables(target);
							}
						}
						if (entity.getPersistentData().getDouble("ScareTicks") <= 0) {
							{
								JimsmineshaftModVariables.PlayerVariables _vars = target.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.analogScreenInx = "";
								_vars.syncPlayerVariables(target);
							}
							if (world instanceof ServerLevel _serverLevel)
								_serverLevel.getGameRules().getRule(GameRules.RULE_DO_IMMEDIATE_RESPAWN).set(true, world.getServer());
							{
								JimsmineshaftModVariables.PlayerVariables _vars = target.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
								_vars.banishedToParadise = true;
								_vars.syncPlayerVariables(target);
							}
							{
								Entity _ent = target;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill");
								}
							}
							entity.getPersistentData().putDouble("Cooldown", 0);
							{
								Entity _ent = entity;
								_ent.teleportTo(x, (y + 200), z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(x, (y + 200), z, _ent.getYRot(), _ent.getXRot());
							}
							JimsmineshaftMod.queueServerWork(1, () -> {
								if (world instanceof ServerLevel _serverLevel)
									_serverLevel.getGameRules().getRule(GameRules.RULE_DO_IMMEDIATE_RESPAWN).set(false, world.getServer());
								if (!entity.level().isClientSide())
									entity.discard();
							});
						}
					} else {
						if (entity instanceof VisionEntity _datEntSetI)
							_datEntSetI.getEntityData().set(VisionEntity.DATA_anger, (int) ((entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_anger) : 0) + 0.5));
						entity.getPersistentData().putDouble("ScareTicks", (entity.getPersistentData().getDouble("ScareTicks") - 1));
						if (entity.getPersistentData().getDouble("ScareTicks") <= 0) {
							if (entity instanceof VisionEntity _datEntSetI)
								_datEntSetI.getEntityData().set(VisionEntity.DATA_anger, (int) ((entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_anger) : 0) + 130));
							entity.getPersistentData().putDouble("Cooldown", 0);
							{
								Entity _ent = entity;
								_ent.teleportTo(x, (y + 200), z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(x, (y + 200), z, _ent.getYRot(), _ent.getXRot());
							}
						}
						if (!IsEntityBeingLookedAtProcedure.execute(world, entity)) {
							{
								Entity _ent = target;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a * jimsmineshaft:vision_stare_calm");
								}
							}
							{
								Entity _ent = target;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a * jimsmineshaft:vision_stare_angry");
								}
							}
							entity.getPersistentData().putDouble("ScareTicks", 0);
							entity.getPersistentData().putDouble("Cooldown", 0);
							{
								Entity _ent = entity;
								_ent.teleportTo(x, (y + 200), z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(x, (y + 200), z, _ent.getYRot(), _ent.getXRot());
							}
						}
					}
					entity.getPersistentData().putDouble("DespawnTicks", (entity.getPersistentData().getDouble("DespawnTicks") + 1));
					if (entity.getPersistentData().getDouble("DespawnTicks") > 600) {
						{
							Entity _ent = target;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a * jimsmineshaft:vision_stare_calm");
							}
						}
						{
							Entity _ent = target;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @a * jimsmineshaft:vision_stare_angry");
							}
						}
						entity.getPersistentData().putDouble("ScareTicks", 0);
						entity.getPersistentData().putDouble("Cooldown", 400);
						{
							Entity _ent = entity;
							_ent.teleportTo(x, (y + 200), z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, (y + 200), z, _ent.getYRot(), _ent.getXRot());
						}
					}
				} else {
					if (IsEntityBeingLookedAtProcedure.execute(world, entity)) {
						entity.getPersistentData().putBoolean("Appeared", true);
						if (entity instanceof VisionEntity _datEntSetI)
							_datEntSetI.getEntityData().set(VisionEntity.DATA_tweakPose, Mth.nextInt(RandomSource.create(), 1, 4));
						if ((entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_anger) : 0) > 120) {
							{
								Entity _ent = target;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @s *");
								}
							}
							if (!world.isClientSide()) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:vision_glitch")), SoundSource.MASTER, 2, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:vision_glitch")), SoundSource.MASTER, 2, 1, false);
									}
								}
							}
						} else if ((entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_anger) : 0) > 60) {
							if (!world.isClientSide()) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:vision_stare_angry")), SoundSource.MASTER, 2, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:vision_stare_angry")), SoundSource.MASTER, 2, 1, false);
									}
								}
							}
							if (entity instanceof VisionEntity _datEntSetI)
								_datEntSetI.getEntityData().set(VisionEntity.DATA_spasmPose, Mth.nextInt(RandomSource.create(), 1, 2));
						} else {
							if (!world.isClientSide()) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:vision_stare_calm")), SoundSource.MASTER, 2, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:vision_stare_calm")), SoundSource.MASTER, 2, 1, false);
									}
								}
							}
						}
					}
				}
				if (entity instanceof VisionEntity _datEntSetL)
					_datEntSetL.getEntityData().set(VisionEntity.DATA_gone, false);
			} else {
				if (entity instanceof VisionEntity _datEntSetL)
					_datEntSetL.getEntityData().set(VisionEntity.DATA_gone, true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 5, 0, false, false));
				entity.getPersistentData().putDouble("Cooldown", (entity.getPersistentData().getDouble("Cooldown") + 1));
				if (entity.getPersistentData().getDouble("Cooldown") > Mth.nextInt(RandomSource.create(), 600, 10000)) {
					testX = target.getX() + target.getLookAngle().x * (-10);
					testY = Math.floor(target.getY() + target.getLookAngle().y * (-10));
					testZ = target.getZ() + target.getLookAngle().z * (-10);
					while (world.getBlockState(BlockPos.containing(testX, testY, testZ)).canOcclude() || !world.getBlockState(BlockPos.containing(testX, testY + -1, testZ)).canOcclude()
							|| world.getBlockState(BlockPos.containing(testX, testY + 1, testZ)).canOcclude() || world.getBlockState(BlockPos.containing(testX, testY + 2, testZ)).canOcclude()) {
						if (!world.getBlockState(BlockPos.containing(testX, testY + -1, testZ)).canOcclude()) {
							testY = testY + -1;
						} else {
							testY = testY + 1;
						}
					}
					if (UnobstructedLineProcedure.execute(world, target.getX(), target.getY() + 1.3, target.getZ(), testX, testY + 1.3, testZ)) {
						{
							Entity _ent = entity;
							_ent.teleportTo(testX, testY, testZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(testX, testY, testZ, _ent.getYRot(), _ent.getXRot());
						}
						entity.getPersistentData().putDouble("ScareTicks", 40);
						entity.getPersistentData().putBoolean("Appeared", false);
					}
				}
			}
		} else {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				{
					possibleTargets.add(entityiterator);
				}
			}
			if (possibleTargets.size() > 0) {
				entity.getPersistentData().putString("Target", ((new Object() {
					public Entity get(ArrayList<?> list, int index) {
						if (list.get(index) instanceof Entity ent) {
							return ent;
						}
						return null;
					}
				}.get(possibleTargets, Mth.nextInt(RandomSource.create(), 0, (int) (possibleTargets.size() - 1)))).getStringUUID()));
			}
		}
	}

	public static Entity entityFromStringUUID(String uuid, Level world) {
		Entity _uuidentity = null;
		if (world instanceof ServerLevel _server) {
			try {
				_uuidentity = _server.getEntity(UUID.fromString(uuid));
			} catch (Exception e) {
			}
		}
		return _uuidentity;
	}
}