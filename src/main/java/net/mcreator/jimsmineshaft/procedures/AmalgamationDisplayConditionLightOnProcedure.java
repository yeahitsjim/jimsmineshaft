package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.AmalgamationEntity;

public class AmalgamationDisplayConditionLightOnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof AmalgamationEntity _datEntL0 && _datEntL0.getEntityData().get(AmalgamationEntity.DATA_lightOn);
	}
}