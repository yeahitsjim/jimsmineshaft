package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SendCartOnKeyPressedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z ) {
double totalAmountReturned = 0;
if () {{
final Vec3 _center = new Vec3(x, y, z);
for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
if (entityiterator instanceof CartelevatorEntity) {if (entityiterator.getPersistentData().getBoolean("detectedCart")) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7c\u00A7lCART HAS BEEN SENT TO SURFACE: \u00A74\u00A7lRETURN TO THE ELEVATOR"), false);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.ASH, x, (y+3), z, 25, 3, 3, 3, 1);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y+5,z),
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, (y+5), z,
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
JimsmineshaftMod.queueServerWork(20, () -> {
entityiterator.getPersistentData().putBoolean("submitted", true);
});
}
CalculateTotalCashReturnedProcedure.execute(world,x,y,z)
;
}
}
}}
}
}