package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class WakeUpDisplayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).paradise_ticks > 680
				&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:paradise"));
	}
}