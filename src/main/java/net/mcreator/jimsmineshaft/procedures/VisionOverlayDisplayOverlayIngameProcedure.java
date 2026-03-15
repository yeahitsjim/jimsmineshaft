package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class VisionOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).analogScreenInx).equals("alea_iacta_est");
	}
}