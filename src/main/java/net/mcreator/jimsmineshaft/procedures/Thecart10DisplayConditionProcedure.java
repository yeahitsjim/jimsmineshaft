package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Thecart10DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 5500) {
			if (entity.getPersistentData().getDouble("value") >= 3500) {
				return true;
			}
		}
		return false;
	}
}