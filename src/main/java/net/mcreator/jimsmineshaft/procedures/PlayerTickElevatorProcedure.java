package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class PlayerTickElevatorProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity ) {
if (
entity == null ) return ;
boolean detectedElevator = false;boolean elevatorExist = false;
{
final Vec3 _center = new Vec3(x, y, z);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorEntity) {{
JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
_vars.nearElevator = true;
_vars.syncPlayerVariables(entity);
}detectedElevator = true;}
}
}if (!detectedElevator) {{
JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
_vars.nearElevator = false;
_vars.syncPlayerVariables(entity);
}{
JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
_vars.inElevator = false;
_vars.syncPlayerVariables(entity);
}}if (entity.getPersistentData().getBoolean("hasJustChangedDimension")) {entity.getPersistentData().putBoolean("hasJustChangedDimension", false);if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())) {JimsmineshaftMod.queueServerWork(20, () -> {
entity.getPersistentData().putBoolean("canLowerOverlay", true);
});
JimsmineshaftMod.queueServerWork(5, () -> {
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
}}JimsmineshaftMod.queueServerWork(20, () -> {
{
final Vec3 _center = new Vec3(0, 250, 0);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof ElevatorEntity) {entityiterator.getPersistentData().putString("movement", "down");entityiterator.getPersistentData().putString("stage", "lvl1start");}
}
}
});
JimsmineshaftMod.queueServerWork(12, () -> {
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
}}if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())) {if (entity.getPersistentData().getBoolean("canLowerOverlay")) {if (>0) {}}}
}
}