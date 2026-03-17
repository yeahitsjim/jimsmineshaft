package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class Thecart4DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 500) {
			if (entity.getPersistentData().getDouble("value") >= 400) {
				return true;
			}
		}
		return false;
	}
}