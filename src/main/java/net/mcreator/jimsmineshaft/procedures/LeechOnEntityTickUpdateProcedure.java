package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class LeechOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ycheck = 0;
		double lightY = 0;
		double lightX = 0;
		double lightZ = 0;
		double lightA = 0;
		if (entity.getPersistentData().getBoolean("target") == false) {
			if (entity instanceof LeechEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LeechEntity.DATA_animationcycle, 1);
			if (entity instanceof LeechEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LeechEntity.DATA_size, 1);
			entity.getPersistentData().putDouble("grabID", (Mth.nextInt(RandomSource.create(), 1, 10000)));
			entity.setDeltaMovement(new Vec3(0, 1, 0));
			entity.getPersistentData().putBoolean("falling", false);
			for (int index0 = 0; index0 < 30; index0++) {
				ycheck = ycheck + 1;
				{
					final Vec3 _center = new Vec3(x, (y - ycheck), z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof Player) {
							entity.getPersistentData().putBoolean("target", true);
						}
					}
				}
			}
			ycheck = 0;
		} else {
			if (entity instanceof LeechEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LeechEntity.DATA_size, 6);
			if (entity.getPersistentData().getBoolean("falling") == false) {
				if (entity instanceof LeechEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LeechEntity.DATA_animationcycle, 2);
				entity.setDeltaMovement(new Vec3(0, (-0.7), 0));
				if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:splat")), SoundSource.PLAYERS, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:splat")), SoundSource.PLAYERS, 2, 1, false);
						}
					}
					entity.getPersistentData().putBoolean("falling", true);
				}
			} else {
				if (entity.getPersistentData().getBoolean("grab") == false) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								entityiterator.getPersistentData().putDouble("grabID", (entity.getPersistentData().getDouble("grabID")));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:splat")), SoundSource.PLAYERS, 2, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:splat")), SoundSource.PLAYERS, 2, 1, false);
									}
								}
								entity.getPersistentData().putBoolean("grab", true);
							}
						}
					}
					if (entity.getPersistentData().getBoolean("jumping") == false) {
						if (entity.getPersistentData().getBoolean("jumping2") == false) {
							if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(30 / 2d), e -> true).isEmpty()) {
								lightA = 0;
							}
							if (entity instanceof LeechEntity _datEntSetI)
								_datEntSetI.getEntityData().set(LeechEntity.DATA_animationcycle, 3);
							{
								final Vec3 _center = new Vec3(x, y, z);
								for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.toList()) {
									if (entityiterator instanceof Player) {
										entity.getPersistentData().putBoolean("jumping", true);
										entity.getPersistentData().putBoolean("jumping2", true);
									}
									entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY() + 1.75), (entityiterator.getZ())));
								}
							}
						}
					} else {
						entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), 0.5, (Math.cos(Math.toRadians(entity.getYRot())) * 1)));
						if (entity instanceof LeechEntity _datEntSetI)
							_datEntSetI.getEntityData().set(LeechEntity.DATA_animationcycle, 4);
						entity.getPersistentData().putBoolean("jumping", false);
						JimsmineshaftMod.queueServerWork(30, () -> {
							entity.getPersistentData().putBoolean("jumping2", false);
						});
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("grab") == true) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof Player) {
						if (entityiterator.getPersistentData().getDouble("grabID") == entity.getPersistentData().getDouble("grabID")) {
							entity.getPersistentData().putDouble("maxtime", 3.4);
							if (entity.getPersistentData().getDouble("timer") < entity.getPersistentData().getDouble("maxtime")) {
								entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:slurp")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:slurp")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								entity.getPersistentData().putDouble("timer", 0);
							}
							if (entity instanceof LeechEntity _datEntSetI)
								_datEntSetI.getEntityData().set(LeechEntity.DATA_animationcycle, 5);
							{
								Entity _ent = entity;
								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 1.75), (entityiterator.getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 1.75), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
							}
							entity.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z())));
							entityiterator.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("jimsmineshaft:deleted_mod_element"))), entity), 1);
						}
					}
				}
			}
		}
		if (!(!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(40 / 2d), e -> true).isEmpty())) {
			entity.getPersistentData().putBoolean("target", false);
		}
	}
}