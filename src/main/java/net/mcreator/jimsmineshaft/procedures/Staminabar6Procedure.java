package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Staminabar6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina > 0.5 && entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina > entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).staminamax * 0.6) {
			return true;
		}
		return false;
	}
}