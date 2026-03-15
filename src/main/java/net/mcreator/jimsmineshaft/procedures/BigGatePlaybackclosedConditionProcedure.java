package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigGatePlaybackclosedConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof BigGateEntity _datEntL0 && _datEntL0.getEntityData().get(BigGateEntity.DATA_open)) == true && (entity instanceof BigGateEntity _datEntL1 && _datEntL1.getEntityData().get(BigGateEntity.DATA_opening)) == false) {
			return true;
		}
		return false;
	}
}