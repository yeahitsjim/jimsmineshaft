package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Thecart9DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 3500) {
			if (entity.getPersistentData().getDouble("value") >= 2200) {
				return true;
			}
		}
		return false;
	}
}