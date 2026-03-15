package net.mcreator.jimsmineshaft.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class RightgateEntity extends PathfinderMob {

	public static final EntityDataAccessor<Boolean> DATA_open = SynchedEntityData.defineId(RightgateEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_size = SynchedEntityData.defineId(RightgateEntity.class, EntityDataSerializers.INT);

	public RightgateEntity(EntityType<RightgateEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		setPersistenceRequired();

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (RightgateEntity.this.isInWater())
					RightgateEntity.this.setDeltaMovement(RightgateEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !RightgateEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - RightgateEntity.this.getX();
					double dy = this.wantedY - RightgateEntity.this.getY();
					double dz = this.wantedZ - RightgateEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * RightgateEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					RightgateEntity.this.setYRot(this.rotlerp(RightgateEntity.this.getYRot(), f, 10));
					RightgateEntity.this.yBodyRot = RightgateEntity.this.getYRot();
					RightgateEntity.this.yHeadRot = RightgateEntity.this.getYRot();

					if (RightgateEntity.this.isInWater()) {
						RightgateEntity.this.setSpeed((float) RightgateEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						RightgateEntity.this.setXRot(this.rotlerp(RightgateEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(RightgateEntity.this.getXRot() * (float) (Math.PI / 180.0));

						RightgateEntity.this.setZza(f3 * f1);
						RightgateEntity.this.setYya((float) (f1 * dy));
					} else {
						RightgateEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					RightgateEntity.this.setSpeed(0);
					RightgateEntity.this.setYya(0);
					RightgateEntity.this.setZza(0);
				}
			}
		};

	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_open, false);
		builder.define(DATA_size, 0);
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
	public Vec3 getPassengerRidingPosition(Entity entity) {
		return super.getPassengerRidingPosition(entity).add(0, -0.35F, 0);
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
		compound.putInt("Datasize", this.entityData.get(DATA_size));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataopen"))
			this.entityData.set(DATA_open, compound.getBoolean("Dataopen"));
		if (compound.contains("Datasize"))
			this.entityData.set(DATA_size, compound.getInt("Datasize"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.SUCCESS;

		super.mobInteract(sourceentity, hand);

		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		LeftgateRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BigIronGateRightOnEntityTickUpdateProcedure.execute(this);
		this.refreshDimensions();
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
	public boolean canCollideWith(Entity entity) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	@Override
	public EntityDimensions getDefaultDimensions(Pose pose) {
		Entity entity = this;
		Level world = this.level();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		return super.getDefaultDimensions(pose).scale((float)

		OpentrueProcedure.execute(entity));
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