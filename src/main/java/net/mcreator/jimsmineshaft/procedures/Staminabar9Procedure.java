package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class Staminabar9Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina > 0.5 && entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina > entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).staminamax * 0.9) {
			return true;
		}
		return false;
	}
}