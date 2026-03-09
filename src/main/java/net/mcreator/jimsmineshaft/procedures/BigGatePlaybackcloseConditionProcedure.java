package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigGatePlaybackcloseConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("open") == false && entity.getPersistentData().getBoolean("opening2") == false) {
			return true;
		}
		return false;
	}
}