package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Thecart7DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 1500) {
			if (entity.getPersistentData().getDouble("value") >= 1000) {
				return true;
			}
		}
		return false;
	}
}