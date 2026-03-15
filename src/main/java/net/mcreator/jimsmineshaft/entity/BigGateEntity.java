package net.mcreator.jimsmineshaft.entity;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.jimsmineshaft.procedures.BigGatePlaybackclosedConditionProcedure;
import net.mcreator.jimsmineshaft.procedures.BigGatePlaybackcloseConditionProcedure;
import net.mcreator.jimsmineshaft.procedures.BigGatePlaybackConditionProcedure;
import net.mcreator.jimsmineshaft.procedures.BigGateOnEntityTickUpdateProcedure;
import net.mcreator.jimsmineshaft.procedures.BigGateClosePlaybackConditionProcedure;

public class BigGateEntity extends Monster {
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();

	public BigGateEntity(EntityType<BigGateEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BigGateEntity.this.isInWater())
					BigGateEntity.this.setDeltaMovement(BigGateEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !BigGateEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BigGateEntity.this.getX();
					double dy = this.wantedY - BigGateEntity.this.getY();
					double dz = this.wantedZ - BigGateEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BigGateEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					BigGateEntity.this.setYRot(this.rotlerp(BigGateEntity.this.getYRot(), f, 10));
					BigGateEntity.this.yBodyRot = BigGateEntity.this.getYRot();
					BigGateEntity.this.yHeadRot = BigGateEntity.this.getYRot();
					if (BigGateEntity.this.isInWater()) {
						BigGateEntity.this.setSpeed((float) BigGateEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BigGateEntity.this.setXRot(this.rotlerp(BigGateEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BigGateEntity.this.getXRot() * (float) (Math.PI / 180.0));
						BigGateEntity.this.setZza(f3 * f1);
						BigGateEntity.this.setYya((float) (f1 * dy));
					} else {
						BigGateEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BigGateEntity.this.setSpeed(0);
					BigGateEntity.this.setYya(0);
					BigGateEntity.this.setZza(0);
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
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(BigGatePlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState1.animateWhen(BigGateClosePlaybackConditionProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(BigGatePlaybackclosedConditionProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(BigGatePlaybackcloseConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BigGateOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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