package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.LeftgateEntity;

public class LeftgateBoundingBoxScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof LeftgateEntity _datEntI ? _datEntI.getEntityData().get(LeftgateEntity.DATA_size) : 0;
	}
}