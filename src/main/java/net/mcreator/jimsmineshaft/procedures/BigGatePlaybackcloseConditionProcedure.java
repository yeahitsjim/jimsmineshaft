package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class BigGatePlaybackcloseConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("open") == false && entity.getPersistentData().getBoolean("opening2") == false) {
			return true;
		}
		return false;
	}
}