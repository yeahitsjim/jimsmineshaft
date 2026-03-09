package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigGatePlaybackclosedConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("open") == true && entity.getPersistentData().getBoolean("opening") == false) {
			return true;
		}
		return false;
	}
}