package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class ReturnCartValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double totalValue = 0;
		return "\u00A78\u00A7lCart Value: \u00A72$" + new java.text.DecimalFormat("##.##").format(entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue);
	}
}