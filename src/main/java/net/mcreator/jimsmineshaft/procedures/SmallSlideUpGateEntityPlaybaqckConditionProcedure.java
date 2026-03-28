package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SmallSlideUpGateEntityPlaybaqckConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SmallSlideUpGateEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SmallSlideUpGateEntityEntity.DATA_opening2)) == true) {
			return true;
		}
		return false;
	}
}