package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StalkerInsidesDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof StalkerInsidesEntity _datEntL0 && _datEntL0.getEntityData().get(StalkerInsidesEntity.DATA_snapped);
	}
}