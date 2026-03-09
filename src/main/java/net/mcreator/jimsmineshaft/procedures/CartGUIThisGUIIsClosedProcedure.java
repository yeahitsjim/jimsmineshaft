package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CartGUIThisGUIIsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("savedCartValue", 0);
	}
}