package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.StalkerInsides2Entity;

public class InsidesAnimationPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof StalkerInsides2Entity _datEntL0 && _datEntL0.getEntityData().get(StalkerInsides2Entity.DATA_snapped);
	}
}