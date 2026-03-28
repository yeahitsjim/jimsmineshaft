package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SmallSlideUpGateEntityPlaybackCon1ditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SmallSlideUpGateEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SmallSlideUpGateEntityEntity.DATA_open)) == true
				&& (entity instanceof SmallSlideUpGateEntityEntity _datEntL1 && _datEntL1.getEntityData().get(SmallSlideUpGateEntityEntity.DATA_opening)) == false) {
			return true;
		}
		return false;
	}
}