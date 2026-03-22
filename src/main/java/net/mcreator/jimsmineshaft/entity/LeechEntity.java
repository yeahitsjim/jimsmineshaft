package net.mcreator.jimsmineshaft.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.procedures.LeechfallingProcedure;
import net.mcreator.jimsmineshaft.procedures.LeechWalkProcedure;
import net.mcreator.jimsmineshaft.procedures.LeechOnEntityTickUpdateProcedure;
import net.mcreator.jimsmineshaft.procedures.LeechOnCeilingProcedure;
import net.mcreator.jimsmineshaft.procedures.LeechGrabProcedure;
import net.mcreator.jimsmineshaft.procedures.LeechAttackProcedure;

public class LeechEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_animationcycle = SynchedEntityData.defineId(LeechEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();

	public LeechEntity(EntityType<LeechEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_animationcycle, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, true, true) {
			@Override
			public boolean canUse() {
				double x = LeechEntity.this.getX();
				double y = LeechEntity.this.getY();
				double z = LeechEntity.this.getZ();
				Entity entity = LeechEntity.this;
				Level world = LeechEntity.this.level();
				return super.canUse() && LeechWalkProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LeechEntity.this.getX();
				double y = LeechEntity.this.getY();
				double z = LeechEntity.this.getZ();
				Entity entity = LeechEntity.this;
				Level world = LeechEntity.this.level();
				return super.canContinueToUse() && LeechWalkProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.4, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = LeechEntity.this.getX();
				double y = LeechEntity.this.getY();
				double z = LeechEntity.this.getZ();
				Entity entity = LeechEntity.this;
				Level world = LeechEntity.this.level();
				return super.canUse() && LeechWalkProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = LeechEntity.this.getX();
				double y = LeechEntity.this.getY();
				double z = LeechEntity.this.getZ();
				Entity entity = LeechEntity.this;
				Level world = LeechEntity.this.level();
				return super.canContinueToUse() && LeechWalkProcedure.execute(entity);
			}

		});
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:squishwalk")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:splat"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:splat"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Dataanimationcycle", this.entityData.get(DATA_animationcycle));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataanimationcycle"))
			this.entityData.set(DATA_animationcycle, compound.getInt("Dataanimationcycle"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(LeechOnCeilingProcedure.execute(this), this.tickCount);
			this.animationState1.animateWhen(LeechfallingProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(LeechGrabProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(LeechWalkProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(LeechAttackProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		LeechOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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