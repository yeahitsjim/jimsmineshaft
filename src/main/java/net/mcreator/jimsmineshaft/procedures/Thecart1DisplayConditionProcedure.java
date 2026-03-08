package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Thecart1DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 200) {
			if (entity.getPersistentData().getDouble("value") >= 100) {
				return true;
			}
		}
		return false;
	}
}