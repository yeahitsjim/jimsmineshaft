package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ElevatorRightClickedOnEntityProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity sourceentity ) {
if (
entity == null ||
sourceentity == null ) return ;
if (entity.getPersistentData().getDouble("doorCooldown")<=0) {if (entity.getPersistentData().getBoolean("doorOpen")) {{
final Vec3 _center = new Vec3(x, y, z);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
sourceentity.getPersistentData().putBoolean("inElevator", true);if (entityiterator instanceof ElevatorSeat1Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat2Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat3Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat4Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat5Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat6Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat7Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat8Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}
}
}}else{entity.getPersistentData().putBoolean("doorOpen", true);entity.getPersistentData().putDouble("doorCooldown", 60);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoropen")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoropen")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
JimsmineshaftMod.queueServerWork(30, () -> {
sourceentity.getPersistentData().putBoolean("inElevator", true);world.setBlock(BlockPos.containing(x,y,z+3), Blocks.AIR.defaultBlockState(), 3);{
final Vec3 _center = new Vec3(x, y, z);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat1Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat2Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat3Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat4Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat5Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat6Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat7Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}if (entityiterator instanceof ElevatorSeat8Entity) {if (!entityiterator.isVehicle()) {sourceentity.startRiding(entityiterator);}}
}
}
});
}}if (!) {entity.getPersistentData().putDouble("playerCount", (entity.getPersistentData().getDouble("playerCount")+1));if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Message"), false);}
}
}