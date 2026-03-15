package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class ReturnInvValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Inv: $" + new java.text.DecimalFormat("##.##").format(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerInvValue);
	}
}