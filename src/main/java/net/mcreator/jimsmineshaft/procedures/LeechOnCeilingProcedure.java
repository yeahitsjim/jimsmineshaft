package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class LeechOnCeilingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LeechEntity _datEntI ? _datEntI.getEntityData().get(LeechEntity.DATA_animationcycle) : 0) == 1;
	}
}