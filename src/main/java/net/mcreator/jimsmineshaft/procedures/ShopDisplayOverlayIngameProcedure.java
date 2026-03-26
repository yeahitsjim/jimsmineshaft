package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class ShopDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay > 40 && (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension()) && entity.getY() < 215
				|| ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension()) && entity.getY() > 217)) {
			return true;
		}
		return false;
	}
}