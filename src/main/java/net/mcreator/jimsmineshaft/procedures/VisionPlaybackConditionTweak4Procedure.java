package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class VisionPlaybackConditionTweak4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_tweakPose) : 0) == 4;
	}
}