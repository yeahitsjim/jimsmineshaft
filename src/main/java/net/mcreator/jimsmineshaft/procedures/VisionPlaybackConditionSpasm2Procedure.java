package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.VisionEntity;

public class VisionPlaybackConditionSpasm2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof VisionEntity _datEntI ? _datEntI.getEntityData().get(VisionEntity.DATA_spasmPose) : 0) == 2;
	}
}