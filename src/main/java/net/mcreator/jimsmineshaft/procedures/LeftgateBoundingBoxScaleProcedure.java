package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class LeftgateBoundingBoxScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity instanceof LeftgateEntity _datEntI ? _datEntI.getEntityData().get(LeftgateEntity.DATA_size) : 0;
	}
}