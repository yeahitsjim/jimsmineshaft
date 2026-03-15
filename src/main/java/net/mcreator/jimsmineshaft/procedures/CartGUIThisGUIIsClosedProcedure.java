package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CartGUIThisGUIIsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
			_vars.LookingInventoryValue = 0;
			_vars.syncPlayerVariables(entity);
		}
		entity.getPersistentData().putDouble("savedCartValue", 0);
	}
}