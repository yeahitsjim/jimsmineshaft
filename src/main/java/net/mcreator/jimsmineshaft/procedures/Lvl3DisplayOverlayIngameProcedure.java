package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Lvl3DisplayOverlayIngameProcedure {
public static boolean execute(
Entity entity ) {
if (
entity == null ) return false;
if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay>40&&(ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())&&3==&&entity.getY()<215||ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())&&entity.getY()>217)) {return
true;}return
false;
}
}