package net.mcreator.jimsmineshaft.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
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

import net.mcreator.jimsmineshaft.procedures.VisionPlaybackConditionTweak4Procedure;
import net.mcreator.jimsmineshaft.procedures.VisionPlaybackConditionTweak3Procedure;
import net.mcreator.jimsmineshaft.procedures.VisionPlaybackConditionTweak2Procedure;
import net.mcreator.jimsmineshaft.procedures.VisionPlaybackConditionTweak1Procedure;
import net.mcreator.jimsmineshaft.procedures.VisionPlaybackConditionSpasm2Procedure;
import net.mcreator.jimsmineshaft.procedures.VisionPlaybackConditionSpasm1Procedure;
import net.mcreator.jimsmineshaft.procedures.VisionOnEntityTickUpdateProcedure;

public class VisionEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_tweakPose = SynchedEntityData.defineId(VisionEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_spasmPose = SynchedEntityData.defineId(VisionEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_gone = SynchedEntityData.defineId(VisionEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_anger = SynchedEntityData.defineId(VisionEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState1 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	public final AnimationState animationState4 = new AnimationState();
	public final AnimationState animationState5 = new AnimationState();

	public VisionEntity(EntityType<VisionEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_tweakPose, 0);
		builder.define(DATA_spasmPose, 0);
		builder.define(DATA_gone, false);
		builder.define(DATA_anger, 0);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {
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
		compound.putInt("DatatweakPose", this.entityData.get(DATA_tweakPose));
		compound.putInt("DataspasmPose", this.entityData.get(DATA_spasmPose));
		compound.putBoolean("Datagone", this.entityData.get(DATA_gone));
		compound.putInt("Dataanger", this.entityData.get(DATA_anger));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DatatweakPose"))
			this.entityData.set(DATA_tweakPose, compound.getInt("DatatweakPose"));
		if (compound.contains("DataspasmPose"))
			this.entityData.set(DATA_spasmPose, compound.getInt("DataspasmPose"));
		if (compound.contains("Datagone"))
			this.entityData.set(DATA_gone, compound.getBoolean("Datagone"));
		if (compound.contains("Dataanger"))
			this.entityData.set(DATA_anger, compound.getInt("Dataanger"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(VisionPlaybackConditionTweak1Procedure.execute(this), this.tickCount);
			this.animationState1.animateWhen(VisionPlaybackConditionTweak2Procedure.execute(this), this.tickCount);
			this.animationState2.animateWhen(VisionPlaybackConditionTweak3Procedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(VisionPlaybackConditionTweak4Procedure.execute(this), this.tickCount);
			this.animationState4.animateWhen(VisionPlaybackConditionSpasm1Procedure.execute(this), this.tickCount);
			this.animationState5.animateWhen(VisionPlaybackConditionSpasm2Procedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		VisionOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 666);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 48);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}