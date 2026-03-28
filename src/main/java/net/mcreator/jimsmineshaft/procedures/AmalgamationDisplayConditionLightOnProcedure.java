package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class AmalgamationDisplayConditionLightOnProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof AmalgamationEntity _datEntL0 && _datEntL0.getEntityData().get(AmalgamationEntity.DATA_lightOn);
	}
}