package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class BigGatePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("opening") == true) {
			return true;
		}
		return false;
	}
}