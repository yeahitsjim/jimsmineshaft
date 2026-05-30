package net.mcreator.jimsmineshaft.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class SkinStealerEntityEntity extends PathfinderMob {

	public static final EntityDataAccessor<Boolean> DATA_snapped = SynchedEntityData.defineId(SkinStealerEntityEntity.class, EntityDataSerializers.BOOLEAN);

	public final AnimationState animationState0 = new AnimationState();

	public SkinStealerEntityEntity(EntityType<SkinStealerEntityEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		setPersistenceRequired();

	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_snapped, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}

			@Override
			public boolean canContinueToUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canContinueToUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}
		});
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, (float) 15) {
			@Override
			public boolean canUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}

			@Override
			public boolean canContinueToUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canContinueToUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}
		});
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 15) {
			@Override
			public boolean canUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}

			@Override
			public boolean canContinueToUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canContinueToUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}
		});
		this.goalSelector.addGoal(6, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}

			@Override
			public boolean canContinueToUse() {
				double x = SkinStealerEntityEntity.this.getX();
				double y = SkinStealerEntityEntity.this.getY();
				double z = SkinStealerEntityEntity.this.getZ();
				Entity entity = SkinStealerEntityEntity.this;
				Level world = SkinStealerEntityEntity.this.level();
				return super.canContinueToUse() &&

						SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity)

				;
			}
		});
		this.goalSelector.addGoal(8, new FloatGoal(this));

	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.death"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		SkinStealerEntityEntityIsHurtProcedure.execute(world, x, y, z, entity, sourceentity);
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, EntitySpawnReason reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		SkinStealerEntityOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Datasnapped", this.entityData.get(DATA_snapped));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datasnapped"))
			this.entityData.set(DATA_snapped, compound.getBoolean("Datasnapped"));
	}

	@Override
	public void tick() {
		super.tick();

		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(SkinStealeranimationPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		SkinStealerEntityOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		return builder;
	}

}