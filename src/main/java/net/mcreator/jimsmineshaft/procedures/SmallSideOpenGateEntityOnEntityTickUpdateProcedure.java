package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
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
import net.mcreator.jimsmineshaft.entity.SmallSideOpenGateEntityEntity;
import net.mcreator.jimsmineshaft.entity.LeftgateEntity;

import java.util.Comparator;

public class SmallSideOpenGateEntityOnEntityTickUpdateProcedure {
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
		}
		if ((entity.getDirection()) == Direction.EAST) {
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
		if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL13 && _datEntL13.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == true) {
			if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL14 && _datEntL14.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_opening)) == false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:smalldoor")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:smalldoor")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof SmallSideOpenGateEntityEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_opening, true);
			}
		} else {
			if (entity instanceof SmallSideOpenGateEntityEntity _datEntSetL)
				_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_opening, false);
		}
		if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL18 && _datEntL18.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == false) {
			if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL19 && _datEntL19.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_opening2)) == false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:smalldoor")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:smalldoor")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof SmallSideOpenGateEntityEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_opening2, true);
			}
		} else {
			if (entity instanceof SmallSideOpenGateEntityEntity _datEntSetL)
				_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_opening2, false);
		}
		if (entity.getPersistentData().getDouble("spawn") == 0) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = JimsmineshaftModEntities.LEFTGATE.get().spawn(_level, BlockPos.containing(entity.getX() - entity.getPersistentData().getDouble("dx"), y, entity.getZ() - entity.getPersistentData().getDouble("dz")),
						EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
				}
			}
			entity.getPersistentData().putDouble("spawn", 1);
		}
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof Monster) {
					if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL33 && _datEntL33.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == false) {
						entity.getPersistentData().putDouble("maxtime", 20);
						if (entity.getPersistentData().getDouble("timer") < entity.getPersistentData().getDouble("maxtime")) {
							entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:thudd")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:thudd")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							entity.getPersistentData().putDouble("timer", 0);
							entity.getPersistentData().putDouble("hit", (entity.getPersistentData().getDouble("hit") + 1));
							entityiterator.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entityiterator.getYRot() + 180)) * (-1)), 0.2, (Math.cos(Math.toRadians(entityiterator.getYRot())) * (-1))));
						}
						if (entity.getPersistentData().getDouble("hit") == 4) {
							entity.getPersistentData().putDouble("hit", 0);
							if (entity instanceof SmallSideOpenGateEntityEntity _datEntSetL)
								_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_open, true);
						}
					}
				}
			}
		}
		entity.setNoGravity(true);
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof LeftgateEntity) {
					if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL52 && _datEntL52.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == true) {
						if (entityiterator instanceof LeftgateEntity _datEntSetL)
							_datEntSetL.getEntityData().set(LeftgateEntity.DATA_open, true);
					} else {
						if (entityiterator instanceof LeftgateEntity _datEntSetL)
							_datEntSetL.getEntityData().set(LeftgateEntity.DATA_open, false);
					}
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entity.getX() - entity.getPersistentData().getDouble("dx")), y, (entity.getZ() - entity.getPersistentData().getDouble("dz")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX() - entity.getPersistentData().getDouble("dx")), y, (entity.getZ() - entity.getPersistentData().getDouble("dz")), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
	}
}