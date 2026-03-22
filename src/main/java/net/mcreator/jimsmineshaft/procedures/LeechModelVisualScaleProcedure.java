package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.LeechEntity;

public class LeechModelVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof LeechEntity _datEntI ? _datEntI.getEntityData().get(LeechEntity.DATA_size) : 0;
	}
}