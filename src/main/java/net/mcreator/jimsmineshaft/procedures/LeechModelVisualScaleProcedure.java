package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class LeechModelVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof LeechEntity _datEntI ? _datEntI.getEntityData().get(LeechEntity.DATA_size) : 0;
	}
}