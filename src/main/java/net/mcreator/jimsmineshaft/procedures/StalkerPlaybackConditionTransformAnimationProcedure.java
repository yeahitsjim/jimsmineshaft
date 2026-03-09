package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StalkerPlaybackConditionTransformAnimationProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StalkerEntity _datEntS ? _datEntS.getEntityData().get(StalkerEntity.DATA_pose) : "").equals("transform");
	}
}