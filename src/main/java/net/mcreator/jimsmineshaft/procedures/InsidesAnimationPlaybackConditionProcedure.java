package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class InsidesAnimationPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof StalkerInsides2Entity _datEntL0 && _datEntL0.getEntityData().get(StalkerInsides2Entity.DATA_snapped);
	}
}