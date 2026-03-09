package net.mcreator.jimsmineshaft.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class BigIronGateRightEntity extends Monster {

	public BigIronGateRightEntity(EntityType<BigIronGateRightEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		setPersistenceRequired();

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BigIronGateRightEntity.this.isInWater())
					BigIronGateRightEntity.this.setDeltaMovement(BigIronGateRightEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !BigIronGateRightEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BigIronGateRightEntity.this.getX();
					double dy = this.wantedY - BigIronGateRightEntity.this.getY();
					double dz = this.wantedZ - BigIronGateRightEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BigIronGateRightEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					BigIronGateRightEntity.this.setYRot(this.rotlerp(BigIronGateRightEntity.this.getYRot(), f, 10));
					BigIronGateRightEntity.this.yBodyRot = BigIronGateRightEntity.this.getYRot();
					BigIronGateRightEntity.this.yHeadRot = BigIronGateRightEntity.this.getYRot();

					if (BigIronGateRightEntity.this.isInWater()) {
						BigIronGateRightEntity.this.setSpeed((float) BigIronGateRightEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BigIronGateRightEntity.this.setXRot(this.rotlerp(BigIronGateRightEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BigIronGateRightEntity.this.getXRot() * (float) (Math.PI / 180.0));

						BigIronGateRightEntity.this.setZza(f3 * f1);
						BigIronGateRightEntity.this.setYya((float) (f1 * dy));
					} else {
						BigIronGateRightEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BigIronGateRightEntity.this.setSpeed(0);
					BigIronGateRightEntity.this.setYya(0);
					BigIronGateRightEntity.this.setZza(0);
				}
			}
		};

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
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.death"));
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