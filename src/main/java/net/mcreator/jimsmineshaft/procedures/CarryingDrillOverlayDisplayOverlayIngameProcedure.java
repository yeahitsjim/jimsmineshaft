package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CarryingDrillOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerHoldingDrill == true) {
			return true;
		}
		return false;
	}
}