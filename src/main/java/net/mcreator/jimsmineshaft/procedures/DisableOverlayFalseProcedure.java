package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class DisableOverlayFalseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
			_vars.overlay = true;
			_vars.syncPlayerVariables(entity);
		}
	}
}