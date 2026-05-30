package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class PlayerRespawnsAfterDeathProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity ) {
if (
entity == null ) return ;
if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("1"), false);if () {JimsmineshaftMod.queueServerWork(40, () -> {
});
if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("2"), false);if (("level1").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}if (("level2").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}if (("level3").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}if (("level4").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}if (("level5").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}if (("level6").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}if (("shop").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);JimsmineshaftMod.queueServerWork(20, () -> {
if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"));
if (_player.level().dimension() == destinationType) return;
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
_ent.teleportTo(,,);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(, , , _ent.getYRot(), _ent.getXRot());
}
});
});
}}
}
}