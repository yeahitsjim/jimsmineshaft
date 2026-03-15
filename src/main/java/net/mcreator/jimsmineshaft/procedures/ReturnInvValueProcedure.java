package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ReturnInvValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Inv: $" + new java.text.DecimalFormat("##.##").format(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerInvValue);
	}
}