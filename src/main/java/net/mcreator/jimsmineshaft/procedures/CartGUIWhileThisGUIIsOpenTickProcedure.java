package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CartGUIWhileThisGUIIsOpenTickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity ) {
if (
entity == null ) return ;
double letsGoGambling = 0;
JimsmineshaftMod.queueServerWork(2, () -> {
if (entity.getPersistentData().getDouble("savedCartValue")!=0) {if (entity.getPersistentData().getDouble("savedCartValue")<) {if (==1) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud1")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud1")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
}else{if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud2")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud2")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
}}}entity.getPersistentData().putDouble("savedCartValue", );
});
}
}