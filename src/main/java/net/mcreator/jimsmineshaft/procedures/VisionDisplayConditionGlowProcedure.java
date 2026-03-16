package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class VisionDisplayConditionGlowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity instanceof VisionEntity _datEntL0 && _datEntL0.getEntityData().get(VisionEntity.DATA_gone));
	}
}