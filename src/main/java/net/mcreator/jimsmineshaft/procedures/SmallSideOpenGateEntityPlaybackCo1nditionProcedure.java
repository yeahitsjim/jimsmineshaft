package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SmallSideOpenGateEntityPlaybackCo1nditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SmallSideOpenGateEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == true
				&& (entity instanceof SmallSideOpenGateEntityEntity _datEntL1 && _datEntL1.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_opening)) == false) {
			return true;
		}
		return false;
	}
}