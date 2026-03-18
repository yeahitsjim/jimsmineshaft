package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.LeechEntity;

public class LeechWalkProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LeechEntity _datEntI ? _datEntI.getEntityData().get(LeechEntity.DATA_animationcycle) : 0) == 3;
	}
}