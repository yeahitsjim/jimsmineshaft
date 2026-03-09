package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.StalkerInsidesEntity;

public class StalkerInsidesDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof StalkerInsidesEntity _datEntL0 && _datEntL0.getEntityData().get(StalkerInsidesEntity.DATA_snapped);
	}
}