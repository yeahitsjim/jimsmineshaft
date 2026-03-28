package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class WakeUpDisplayProcedure {
public static boolean execute(
LevelAccessor world ) {
return
>680&&(world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:paradise"));
}
}