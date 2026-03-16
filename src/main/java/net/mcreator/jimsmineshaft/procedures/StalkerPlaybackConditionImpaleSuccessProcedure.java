package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class StalkerPlaybackConditionImpaleSuccessProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getPersistentData().getString("ClientPose")).equals("impale_hit");
	}
}