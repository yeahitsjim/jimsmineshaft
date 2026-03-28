package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class VisionPlaybackConditionSpasm1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_spasmPose) : 0) == 1;
	}
}