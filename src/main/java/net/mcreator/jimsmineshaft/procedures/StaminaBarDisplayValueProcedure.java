package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class StaminaBarDisplayValueProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return Math.floor((1 - entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina / entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).staminamax) * 36) + 0;
	}
}