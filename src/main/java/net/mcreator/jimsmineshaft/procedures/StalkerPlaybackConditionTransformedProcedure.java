package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.StalkerEntity;

public class StalkerPlaybackConditionTransformedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof StalkerEntity _datEntL0 && _datEntL0.getEntityData().get(StalkerEntity.DATA_transformed);
	}
}