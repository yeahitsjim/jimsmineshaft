package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SmallSideOpenGateEntityPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_opening2)) == true) {
			return true;
		}
		return false;
	}
}