package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class OpentrueProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return entity.getPersistentData().getDouble("size");
	}
}