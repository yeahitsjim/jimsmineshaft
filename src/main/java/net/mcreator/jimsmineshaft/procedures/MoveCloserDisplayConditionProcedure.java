package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class MoveCloserDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerDrillMoveCloser) {
			return true;
		}
		return false;
	}
}