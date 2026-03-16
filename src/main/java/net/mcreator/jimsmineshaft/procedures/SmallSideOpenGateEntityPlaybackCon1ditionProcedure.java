package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.SmallSideOpenGateEntityEntity;

public class SmallSideOpenGateEntityPlaybackCon1ditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == false
				&& (entity instanceof SmallSideOpenGateEntityEntity _datEntL1 && _datEntL1.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_opening2)) == false) {
			return true;
		}
		return false;
	}
}