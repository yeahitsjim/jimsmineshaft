package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.StalkerEntity;

public class StalkerDisplayCondition0Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StalkerEntity _datEntI ? _datEntI.getEntityData().get(StalkerEntity.DATA_transition) : 0) == 0;
	}
}