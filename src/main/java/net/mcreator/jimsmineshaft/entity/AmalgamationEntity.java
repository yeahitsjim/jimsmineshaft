package net.mcreator.jimsmineshaft.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.IronGolem;
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

import net.mcreator.jimsmineshaft.procedures.AmalgamationPlaybackConditionSliceProcedure;
import net.mcreator.jimsmineshaft.procedures.AmalgamationPlaybackConditionShootProcedure;
import net.mcreator.jimsmineshaft.procedures.AmalgamationOnEntityTickUpdateProcedure;

public class AmalgamationEntity extends Monster {
	public static final EntityDataAccessor<String> DATA_pose = SynchedEntityData.defineId(AmalgamationEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> DATA_lastPose = SynchedEntityData.defineId(AmalgamationEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> DATA_attack = SynchedEntityData.defineId(AmalgamationEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_attackTicks = SynchedEntityData.defineId(AmalgamationEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_lightOn = SynchedEntityData.defineId(AmalgamationEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();

	public AmalgamationEntity(EntityType<AmalgamationEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_pose, "");
		builder.define(DATA_lastPose, "");
		builder.define(DATA_attack, "");
		builder.define(DATA_attackTicks, 0);
		builder.define(DATA_lightOn, false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Villager.class, false, false));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.horse.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:amalgamation.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:amalgamation.death"));
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
		compound.putString("Datapose", this.entityData.get(DATA_pose));
		compound.putString("DatalastPose", this.entityData.get(DATA_lastPose));
		compound.putString("Dataattack", this.entityData.get(DATA_attack));
		compound.putInt("DataattackTicks", this.entityData.get(DATA_attackTicks));
		compound.putBoolean("DatalightOn", this.entityData.get(DATA_lightOn));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Datapose"))
			this.entityData.set(DATA_pose, compound.getString("Datapose"));
		if (compound.contains("DatalastPose"))
			this.entityData.set(DATA_lastPose, compound.getString("DatalastPose"));
		if (compound.contains("Dataattack"))
			this.entityData.set(DATA_attack, compound.getString("Dataattack"));
		if (compound.contains("DataattackTicks"))
			this.entityData.set(DATA_attackTicks, compound.getInt("DataattackTicks"));
		if (compound.contains("DatalightOn"))
			this.entityData.set(DATA_lightOn, compound.getBoolean("DatalightOn"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(AmalgamationPlaybackConditionShootProcedure.execute(this), this.tickCount);
			this.animationState1.animateWhen(AmalgamationPlaybackConditionSliceProcedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		AmalgamationOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.33);
		builder = builder.add(Attributes.MAX_HEALTH, 70);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.STEP_HEIGHT, 1);
		return builder;
	}
}