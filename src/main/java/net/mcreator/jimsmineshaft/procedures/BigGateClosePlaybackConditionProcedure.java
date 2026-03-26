package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.BigGateEntity;

public class BigGateClosePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof BigGateEntity _datEntL0 && _datEntL0.getEntityData().get(BigGateEntity.DATA_opening2)) == true) {
			return true;
		}
		return false;
	}
}