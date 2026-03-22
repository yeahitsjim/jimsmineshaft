package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.StalkerPoseSetPacketMessage;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;
import net.mcreator.jimsmineshaft.entity.BulletProjectileEntity;
import net.mcreator.jimsmineshaft.entity.AmalgamationEntity;

public class AmalgamationOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		if (!world.isClientSide()) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				distance = Math.sqrt(Math.pow((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX(), 2) + Math
						.pow(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() * 0.7) - (entity.getY() + entity.getBbHeight() * 0.7), 2)
						+ Math.pow((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ(), 2));
				if (entity instanceof AmalgamationEntity _datEntSetI)
					_datEntSetI.getEntityData().set(AmalgamationEntity.DATA_attackTicks, (int) ((entity instanceof AmalgamationEntity _datEntI ? _datEntI.getEntityData().get(AmalgamationEntity.DATA_attackTicks) : 0) + 1));
				if ((entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_attack) : "").equals("slice")) {
					if (entity instanceof AmalgamationEntity _datEntSetS)
						_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_pose, "slice");
					if ((entity instanceof AmalgamationEntity _datEntI ? _datEntI.getEntityData().get(AmalgamationEntity.DATA_attackTicks) : 0) == 9) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:amalgamation.slice")), SoundSource.HOSTILE, (float) 1.5,
										(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:amalgamation.slice")), SoundSource.HOSTILE, (float) 1.5,
										(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2), false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:amalgamation.melee")), SoundSource.HOSTILE, (float) 1.5,
										(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:amalgamation.melee")), SoundSource.HOSTILE, (float) 1.5,
										(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2), false);
							}
						}
					}
					if ((entity instanceof AmalgamationEntity _datEntI ? _datEntI.getEntityData().get(AmalgamationEntity.DATA_attackTicks) : 0) == 10) {
						if (distance < 4.5) {
							(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).hurt(new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK)), 15);
						}
					}
					if ((entity instanceof AmalgamationEntity _datEntI ? _datEntI.getEntityData().get(AmalgamationEntity.DATA_attackTicks) : 0) > 20) {
						if (entity instanceof AmalgamationEntity _datEntSetS)
							_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_attack, "");
					}
				}
				if ((entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_attack) : "").equals("shoot")) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3, 0, false, false));
					if (entity instanceof AmalgamationEntity _datEntSetS)
						_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_pose, "shoot");
					if ((entity instanceof AmalgamationEntity _datEntI ? _datEntI.getEntityData().get(AmalgamationEntity.DATA_attackTicks) : 0) == 28) {
						if (!world.isClientSide()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:flintlock_pistol_fire")), SoundSource.HOSTILE, 4,
											(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2));
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:flintlock_pistol_fire")), SoundSource.HOSTILE, 4, (float) Mth.nextDouble(RandomSource.create(), 0.8, 1.2),
											false);
								}
							}
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = initArrowProjectile(new BulletProjectileEntity(JimsmineshaftModEntities.BULLET_PROJECTILE.get(), projectileLevel), entity, 2, true, false, false, AbstractArrow.Pickup.DISALLOWED);
							_entityToSpawn.setPos(x, (entity.getY() + entity.getBbHeight() * 0.7), z);
							_entityToSpawn.shoot((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / distance),
									((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() * 0.7)
											- (entity.getY() + entity.getBbHeight() * 0.7)) / distance),
									(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / distance), 10, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if ((entity instanceof AmalgamationEntity _datEntI ? _datEntI.getEntityData().get(AmalgamationEntity.DATA_attackTicks) : 0) > 50) {
						if (entity instanceof AmalgamationEntity _datEntSetS)
							_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_attack, "");
					}
				}
				if ((entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_attack) : "").equals("")) {
					if (entity instanceof AmalgamationEntity _datEntSetS)
						_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_pose, "none");
					if (entity instanceof AmalgamationEntity _datEntSetI)
						_datEntSetI.getEntityData().set(AmalgamationEntity.DATA_attackTicks, 0);
					if (UnobstructedLineProcedure.execute(world, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(),
							(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() * 0.7,
							(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), entity.getX(), entity.getY() + entity.getBbHeight() * 0.7, entity.getZ())) {
						if (distance < 6) {
							if (entity instanceof AmalgamationEntity _datEntSetS)
								_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_attack, "slice");
						} else {
							if (entity instanceof AmalgamationEntity _datEntSetS)
								_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_attack, "shoot");
						}
					}
				}
			} else {
				if (entity instanceof AmalgamationEntity _datEntSetI)
					_datEntSetI.getEntityData().set(AmalgamationEntity.DATA_attackTicks, 0);
				if (entity instanceof AmalgamationEntity _datEntSetS)
					_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_attack, "");
				if (entity instanceof AmalgamationEntity _datEntSetS)
					_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_pose, "none");
			}
		}
		if (!((entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_pose) : "")
				.equals(entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_lastPose) : ""))) {
			PacketDistributor.sendToAllPlayers(new StalkerPoseSetPacketMessage((entity.getStringUUID() + "," + (entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_pose) : ""))));
			if (entity instanceof AmalgamationEntity _datEntSetS)
				_datEntSetS.getEntityData().set(AmalgamationEntity.DATA_lastPose, (entity instanceof AmalgamationEntity _datEntS ? _datEntS.getEntityData().get(AmalgamationEntity.DATA_pose) : ""));
		}
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}
}