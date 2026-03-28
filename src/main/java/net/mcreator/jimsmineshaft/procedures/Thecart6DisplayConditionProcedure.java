package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class Thecart6DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 1000) {
			if (entity.getPersistentData().getDouble("value") >= 700) {
				return true;
			}
		}
		return false;
	}
}