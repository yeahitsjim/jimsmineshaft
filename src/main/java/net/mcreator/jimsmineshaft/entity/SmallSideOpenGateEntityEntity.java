package net.mcreator.jimsmineshaft.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class SmallSideOpenGateEntityEntity extends PathfinderMob {

	public static final EntityDataAccessor<Boolean> DATA_open = SynchedEntityData.defineId(SmallSideOpenGateEntityEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_opening = SynchedEntityData.defineId(SmallSideOpenGateEntityEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_opening2 = SynchedEntityData.defineId(SmallSideOpenGateEntityEntity.class, EntityDataSerializers.BOOLEAN);

	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();

	public SmallSideOpenGateEntityEntity(EntityType<SmallSideOpenGateEntityEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		setPersistenceRequired();

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SmallSideOpenGateEntityEntity.this.isInWater())
					SmallSideOpenGateEntityEntity.this.setDeltaMovement(SmallSideOpenGateEntityEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !SmallSideOpenGateEntityEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SmallSideOpenGateEntityEntity.this.getX();
					double dy = this.wantedY - SmallSideOpenGateEntityEntity.this.getY();
					double dz = this.wantedZ - SmallSideOpenGateEntityEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SmallSideOpenGateEntityEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					SmallSideOpenGateEntityEntity.this.setYRot(this.rotlerp(SmallSideOpenGateEntityEntity.this.getYRot(), f, 10));
					SmallSideOpenGateEntityEntity.this.yBodyRot = SmallSideOpenGateEntityEntity.this.getYRot();
					SmallSideOpenGateEntityEntity.this.yHeadRot = SmallSideOpenGateEntityEntity.this.getYRot();

					if (SmallSideOpenGateEntityEntity.this.isInWater()) {
						SmallSideOpenGateEntityEntity.this.setSpeed((float) SmallSideOpenGateEntityEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SmallSideOpenGateEntityEntity.this.setXRot(this.rotlerp(SmallSideOpenGateEntityEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SmallSideOpenGateEntityEntity.this.getXRot() * (float) (Math.PI / 180.0));

						SmallSideOpenGateEntityEntity.this.setZza(f3 * f1);
						SmallSideOpenGateEntityEntity.this.setYya((float) (f1 * dy));
					} else {
						SmallSideOpenGateEntityEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SmallSideOpenGateEntityEntity.this.setSpeed(0);
					SmallSideOpenGateEntityEntity.this.setYya(0);
					SmallSideOpenGateEntityEntity.this.setZza(0);
				}
			}
		};

	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_open, false);
		builder.define(DATA_opening, false);
		builder.define(DATA_opening2, false);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof Player)
			return false;
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud || damagesource.typeHolder().is(NeoForgeMod.POISON_DAMAGE))
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Dataopen", this.entityData.get(DATA_open));
		compound.putBoolean("Dataopening", this.entityData.get(DATA_opening));
		compound.putBoolean("Dataopening2", this.entityData.get(DATA_opening2));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataopen"))
			this.entityData.set(DATA_open, compound.getBoolean("Dataopen"));
		if (compound.contains("Dataopening"))
			this.entityData.set(DATA_opening, compound.getBoolean("Dataopening"));
		if (compound.contains("Dataopening2"))
			this.entityData.set(DATA_opening2, compound.getBoolean("Dataopening2"));
	}

	@Override
	public void tick() {
		super.tick();

		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
			this.animationState1.animateWhen(true, this.tickCount);
			this.animationState2.animateWhen(true, this.tickCount);
			this.animationState3.animateWhen(SmallSideOpenGateEntityPlaybackCon1ditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
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
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);

		return builder;
	}

}