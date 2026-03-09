package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class PressureDrillFoldedModelOnBlockRightClickedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity ) {
if (
entity == null ) return ;
if (false==) {world.setBlock(BlockPos.containing(x,y,z), Blocks.AIR.defaultBlockState(), 3);if (world instanceof ServerLevel _level) {
Entity entityToSpawn = JimsmineshaftModEntities.PRESSURE_DRILL_FOLDED.get().spawn(_level, BlockPos.containing(x,y,z), EntitySpawnReason.MOB_SUMMONED);
if (entityToSpawn != null) {
}
}
{
final Vec3 _center = new Vec3(x, y, z);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof PressureDrillFoldedEntity) {entityiterator.getPersistentData().putString("ownedBy", (entity.getDisplayName().getString()));if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((entity.getDisplayName().getString())), false);}
}
}}else{if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, x, y, z, 15, 1, 1, 1, 0.4);{
final Vec3 _center = new Vec3(x, y, z);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof PressureDrillFoldedEntity) {entityiterator.getPersistentData().putString("ownedBy", (entity.getDisplayName().getString()));}
}
}}
}
}