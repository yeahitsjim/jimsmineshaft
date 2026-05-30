package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Dark10DisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).darknessOverlay > 36) {
			return true;
		}
		return false;
	}
}