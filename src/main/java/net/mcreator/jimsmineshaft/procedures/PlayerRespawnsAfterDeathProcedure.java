package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

import java.util.Set;

@EventBusSubscriber
public class PlayerRespawnsAfterDeathProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("1"), false);
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).hadDiedInMatch) {
			JimsmineshaftMod.queueServerWork(40, () -> {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = false;
					_vars.syncPlayerVariables(entity);
				}
			});
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("2"), false);
			if (("level1").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
			if (("level2").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension"));
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
			if (("level3").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension"));
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
			if (("level4").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_4_dimension"));
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
			if (("level5").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_5_dimension"));
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
			if (("level6").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_6_dimension"));
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
			if (("shop").equals(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathLevel)) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
				JimsmineshaftMod.queueServerWork(20, () -> {
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension"));
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
					JimsmineshaftMod.queueServerWork(40, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathX, entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathY,
										entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).deathZ, _ent.getYRot(), _ent.getXRot());
						}
					});
				});
			}
		}
	}
}