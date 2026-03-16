package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;
import net.mcreator.jimsmineshaft.entity.RightgateEntity;
import net.mcreator.jimsmineshaft.entity.LeftgateEntity;

import java.util.Comparator;

public class BigGateOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, y, z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
			{
				Entity _ent = entity;
				_ent.setYRot(0);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dx", 2);
			} else {
				entity.getPersistentData().putDouble("dx", 1);
			}
		}
		if ((entity.getDirection()) == Direction.WEST) {
			{
				Entity _ent = entity;
				_ent.setYRot(90);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dz", 2);
			} else {
				entity.getPersistentData().putDouble("dz", 1);
			}
		}
		if ((entity.getDirection()) == Direction.EAST) {
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dz", 2);
			} else {
				entity.getPersistentData().putDouble("dz", 1);
			}
			{
				Entity _ent = entity;
				_ent.setYRot(-90);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
		if ((entity.getDirection()) == Direction.NORTH) {
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dx", 2);
			} else {
				entity.getPersistentData().putDouble("dx", 1);
			}
			{
				Entity _ent = entity;
				_ent.setYRot(180);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
		if (entity.getPersistentData().getBoolean("open") == true) {
			if (entity.getPersistentData().getBoolean("opening") == false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:bigdoor")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:bigdoor")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				entity.getPersistentData().putBoolean("opening", true);
			}
		} else {
			entity.getPersistentData().putBoolean("opening", false);
		}
		if (entity.getPersistentData().getBoolean("open") == false) {
			if (entity.getPersistentData().getBoolean("opening2") == false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:bigdoor")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:bigdoor")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				entity.getPersistentData().putBoolean("opening2", true);
			}
		} else {
			entity.getPersistentData().putBoolean("opening2", false);
		}
		if (!world.getEntitiesOfClass(LeftgateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()
				&& !world.getEntitiesOfClass(RightgateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if (entity.getPersistentData().getBoolean("open") == true) {
				(findEntityInWorldRange(world, RightgateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
				(findEntityInWorldRange(world, LeftgateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
			} else {
				(findEntityInWorldRange(world, RightgateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
				(findEntityInWorldRange(world, LeftgateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
			}
		}
		if (!(!world.getEntitiesOfClass(RightgateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = JimsmineshaftModEntities.RIGHTGATE.get().spawn(_level, BlockPos.containing(entity.getX() + entity.getPersistentData().getDouble("dx"), y, entity.getZ() + entity.getPersistentData().getDouble("dz")),
						EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
				}
			}
		} else {
			if (!world.getEntitiesOfClass(RightgateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
				{
					Entity _ent = (findEntityInWorldRange(world, RightgateEntity.class, x, y, z, 7));
					_ent.teleportTo((entity.getX() + entity.getPersistentData().getDouble("dx")), y, (entity.getZ() + entity.getPersistentData().getDouble("dz")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX() + entity.getPersistentData().getDouble("dx")), y, (entity.getZ() + entity.getPersistentData().getDouble("dz")), _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		if (!(!world.getEntitiesOfClass(LeftgateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = JimsmineshaftModEntities.LEFTGATE.get().spawn(_level, BlockPos.containing(entity.getX() - entity.getPersistentData().getDouble("dx"), y, entity.getZ() - entity.getPersistentData().getDouble("dz")),
						EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
				}
			}
		} else {
			if (!world.getEntitiesOfClass(LeftgateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
				{
					Entity _ent = (findEntityInWorldRange(world, LeftgateEntity.class, x, y, z, 7));
					_ent.teleportTo((entity.getX() - entity.getPersistentData().getDouble("dx")), y, (entity.getZ() - entity.getPersistentData().getDouble("dz")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX() - entity.getPersistentData().getDouble("dx")), y, (entity.getZ() - entity.getPersistentData().getDouble("dz")), _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}