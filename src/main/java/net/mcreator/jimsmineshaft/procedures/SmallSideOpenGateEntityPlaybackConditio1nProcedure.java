package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SmallSideOpenGateEntityPlaybackConditio1nProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_opening)) == true) {
			return true;
		}
		return false;
	}
}