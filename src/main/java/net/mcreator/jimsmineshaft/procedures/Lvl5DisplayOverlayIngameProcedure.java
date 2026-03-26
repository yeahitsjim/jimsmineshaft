package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class Lvl5DisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay > 40
				&& (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension()) && 5 == JimsmineshaftModVariables.MapVariables.get(world).currentLevel && entity.getY() < 215
						|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_5_dimension")) == (entity.level().dimension()) && entity.getY() > 217)) {
			return true;
		}
		return false;
	}
}