package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class ThecartDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("value") < 300) {
			if (entity.getPersistentData().getDouble("value") >= 200) {
				return true;
			}
		}
		return false;
	}
}