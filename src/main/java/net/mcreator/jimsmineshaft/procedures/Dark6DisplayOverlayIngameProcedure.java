package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Dark6DisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay > 5) {
			return true;
		}
		return false;
	}
}