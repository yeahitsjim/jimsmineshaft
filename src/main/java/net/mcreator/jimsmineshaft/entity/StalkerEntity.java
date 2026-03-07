package net.mcreator.jimsmineshaft.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.jimsmineshaft.procedures.StalkerPlaybackConditionTransformedProcedure;
import net.mcreator.jimsmineshaft.procedures.StalkerPlaybackConditionTransformAnimationProcedure;
import net.mcreator.jimsmineshaft.procedures.StalkerPlaybackConditionImpaleSuccessProcedure;
import net.mcreator.jimsmineshaft.procedures.StalkerPlaybackConditionImpaleStartPoseProcedure;
import net.mcreator.jimsmineshaft.procedures.StalkerOnEntityTickUpdateProcedure;
import net.mcreator.jimsmineshaft.procedures.StalkerDisplayCondition0Procedure;

public class StalkerEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_transition = SynchedEntityData.defineId(StalkerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<String> DATA_pose = SynchedEntityData.defineId(StalkerEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> DATA_attack = SynchedEntityData.defineId(StalkerEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_attackTicks = SynchedEntityData.defineId(StalkerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_transformed = SynchedEntityData.defineId(StalkerEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> DATA_lastPose = SynchedEntityData.defineId(StalkerEntity.class, EntityDataSerializers.STRING);
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();

	public StalkerEntity(EntityType<StalkerEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_transition, 0);
		builder.define(DATA_pose, "");
		builder.define(DATA_attack, "");
		builder.define(DATA_attackTicks, 0);
		builder.define(DATA_transformed, false);
		builder.define(DATA_lastPose, "");
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = StalkerEntity.this.getX();
				double y = StalkerEntity.this.getY();
				double z = StalkerEntity.this.getZ();
				Entity entity = StalkerEntity.this;
				Level world = StalkerEntity.this.level();
				return super.canUse() && StalkerPlaybackConditionTransformedProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StalkerEntity.this.getX();
				double y = StalkerEntity.this.getY();
				double z = StalkerEntity.this.getZ();
				Entity entity = StalkerEntity.this;
				Level world = StalkerEntity.this.level();
				return super.canContinueToUse() && StalkerPlaybackConditionTransformedProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = StalkerEntity.this.getX();
				double y = StalkerEntity.this.getY();
				double z = StalkerEntity.this.getZ();
				Entity entity = StalkerEntity.this;
				Level world = StalkerEntity.this.level();
				return super.canUse() && StalkerDisplayCondition0Procedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StalkerEntity.this.getX();
				double y = StalkerEntity.this.getY();
				double z = StalkerEntity.this.getZ();
				Entity entity = StalkerEntity.this;
				Level world = StalkerEntity.this.level();
				return super.canContinueToUse() && StalkerDisplayCondition0Procedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Villager.class, false, false));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.villager.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.villager.death"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Datatransition", this.entityData.get(DATA_transition));
		compound.putString("Datapose", this.entityData.get(DATA_pose));
		compound.putString("Dataattack", this.entityData.get(DATA_attack));
		compound.putInt("DataattackTicks", this.entityData.get(DATA_attackTicks));
		compound.putBoolean("Datatransformed", this.entityData.get(DATA_transformed));
		compound.putString("DatalastPose", this.entityData.get(DATA_lastPose));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datatransition"))
			this.entityData.set(DATA_transition, compound.getInt("Datatransition"));
		if (compound.contains("Datapose"))
			this.entityData.set(DATA_pose, compound.getString("Datapose"));
		if (compound.contains("Dataattack"))
			this.entityData.set(DATA_attack, compound.getString("Dataattack"));
		if (compound.contains("DataattackTicks"))
			this.entityData.set(DATA_attackTicks, compound.getInt("DataattackTicks"));
		if (compound.contains("Datatransformed"))
			this.entityData.set(DATA_transformed, compound.getBoolean("Datatransformed"));
		if (compound.contains("DatalastPose"))
			this.entityData.set(DATA_lastPose, compound.getString("DatalastPose"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState1.animateWhen(StalkerPlaybackConditionTransformedProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(StalkerPlaybackConditionTransformAnimationProcedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(StalkerPlaybackConditionImpaleStartPoseProcedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(StalkerPlaybackConditionImpaleSuccessProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		StalkerOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}