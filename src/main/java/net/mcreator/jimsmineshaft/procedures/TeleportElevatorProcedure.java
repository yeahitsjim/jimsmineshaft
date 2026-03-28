package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class TeleportElevatorProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
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
boolean elevatorExist = false;
if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {JimsmineshaftMod.queueServerWork(5, () -> {
{
Entity _ent = entity;
_ent.teleportTo(0,250,0);
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport(0, 250, 0, _ent.getYRot(), _ent.getXRot());
}
});
{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorEntity) {elevatorExist = true;entityiterator.getPersistentData().putString("movement", "down");entityiterator.getPersistentData().putString("stage", "lvl1start");}
}
}if (elevatorExist==false) {if (world instanceof ServerLevel _level) {
Entity entityToSpawn = JimsmineshaftModEntities.ELEVATOR.get().spawn(_level, new BlockPos(0,250,0), EntitySpawnReason.MOB_SUMMONED);
if (entityToSpawn != null) {
}
}
{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorEntity) {entityiterator.getPersistentData().putString("movement", "down");entityiterator.getPersistentData().putString("stage", "lvl1start");}
}
}}JimsmineshaftMod.queueServerWork(5, () -> {
if (entity instanceof Player) {if (1==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat1Entity) {entity.startRiding(entityiterator);}
}
}}if (2==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat2Entity) {entity.startRiding(entityiterator);}
}
}}if (3==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat3Entity) {entity.startRiding(entityiterator);}
}
}}if (4==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat4Entity) {entity.startRiding(entityiterator);}
}
}}if (5==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat5Entity) {entity.startRiding(entityiterator);}
}
}}if (6==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat6Entity) {entity.startRiding(entityiterator);}
}
}}if (7==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat7Entity) {entity.startRiding(entityiterator);}
}
}}if (8==) {{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorSeat8Entity) {entity.startRiding(entityiterator);}
}
}}}
});
}
}
}