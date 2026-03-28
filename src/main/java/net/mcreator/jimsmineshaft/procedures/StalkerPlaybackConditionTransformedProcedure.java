package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StalkerPlaybackConditionTransformedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof StalkerEntity _datEntL0 && _datEntL0.getEntityData().get(StalkerEntity.DATA_transformed);
	}
}