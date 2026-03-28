package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class Thecart11DisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 9500) {
			if (entity.getPersistentData().getDouble("value") >= 5500) {
				return true;
			}
		}
		return false;
	}
}