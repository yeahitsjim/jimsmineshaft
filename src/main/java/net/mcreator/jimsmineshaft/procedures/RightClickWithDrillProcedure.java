package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class RightClickWithDrillProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity ) {
if (
entity == null ) return ;
double savedX = 0;double savedY = 0;double savedZ = 0;
if () {if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get().asItem()) {if (JimsmineshaftModBlocks.RAW_COPPER_2.get() == (world.getBlockState(new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))).getBlock()) {if (3.3>new Vec3((entity.getX()), (entity.getY()), (entity.getZ())).distanceTo(new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))) {if (==false) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(entity.getX(),entity.getY(),entity.getZ()),
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pressuredrillshortened")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pressuredrillshortened")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 1, 1, 1, 1);if (Direction.EAST == (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getDirection())) {JimsmineshaftMod.queueServerWork(10, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((entity.getX()),(entity.getY()),(entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
}if (world instanceof ServerLevel _level) {
Entity entityToSpawn = JimsmineshaftModEntities.COPPER_DRILLED_EAST.get().spawn(_level, new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), EntitySpawnReason.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
}
}
world.setBlock(new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), Blocks.AIR.defaultBlockState(), 3);JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
}if (Direction.WEST == (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getDirection())) {JimsmineshaftMod.queueServerWork(10, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((entity.getX()),(entity.getY()),(entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
}if (world instanceof ServerLevel _level) {
Entity entityToSpawn = JimsmineshaftModEntities.COPPER_DRILLED_EAST.get().spawn(_level, new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), EntitySpawnReason.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
}
}
world.setBlock(new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), Blocks.AIR.defaultBlockState(), 3);JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
}if (Direction.SOUTH == (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getDirection())) {JimsmineshaftMod.queueServerWork(10, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((entity.getX()),(entity.getY()),(entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
}if (world instanceof ServerLevel _level) {
Entity entityToSpawn = JimsmineshaftModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), EntitySpawnReason.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
}
}
world.setBlock(new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), Blocks.AIR.defaultBlockState(), 3);JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
}if (Direction.NORTH == (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getDirection())) {JimsmineshaftMod.queueServerWork(10, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((entity.getX()),(entity.getY()),(entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
}if (world instanceof ServerLevel _level) {
Entity entityToSpawn = JimsmineshaftModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), EntitySpawnReason.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
}
}
world.setBlock(new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), Blocks.AIR.defaultBlockState(), 3);JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));JimsmineshaftMod.queueServerWork(2, () -> {
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getX()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getY()), (entity.level().clip(new ClipContext(entity.getEyePosition(1f),entity.getEyePosition(1f)
.add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE,
ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 15, 0.5, 0.5, 0.5, 1);{
Entity _ent = entity;
_ent.teleportTo((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()),(entity.getY()),(Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getX()), (entity.getY()), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)+entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((+0.5),(+0.5),(+0.5)));
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
});
}}}else{JimsmineshaftMod.queueServerWork(80, () -> {
});
}}}}
}
}