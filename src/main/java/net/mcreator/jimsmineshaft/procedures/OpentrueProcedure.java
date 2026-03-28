package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

public class OpentrueProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity.getPersistentData().getDouble("size");
	}
}