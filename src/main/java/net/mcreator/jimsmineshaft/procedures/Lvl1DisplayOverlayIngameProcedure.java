package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Lvl1DisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay > 40
				&& (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension()) && 1 == JimsmineshaftModVariables.MapVariables.get(world).currentLevel && entity.getY() < 60
						|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension()) && entity.getY() > 217)) {
			return true;
		}
		return false;
	}
}