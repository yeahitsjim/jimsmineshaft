package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigGatePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof BigGateEntity _datEntL0 && _datEntL0.getEntityData().get(BigGateEntity.DATA_opening)) == true) {
			return true;
		}
		return false;
	}
}