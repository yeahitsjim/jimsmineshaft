package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Thecart8DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 2200) {
			if (entity.getPersistentData().getDouble("value") >= 1500) {
				return true;
			}
		}
		return false;
	}
}