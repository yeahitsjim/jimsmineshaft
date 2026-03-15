package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class NearElevatorDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).inElevator) {
			return entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).nearElevator;
		}
		return false;
	}
}