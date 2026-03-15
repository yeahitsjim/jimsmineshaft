package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class InElevatorDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).inElevator;
	}
}