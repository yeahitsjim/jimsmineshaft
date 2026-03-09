package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ReturnInvValueProcedure {
	public static String execute() {
		return "Inv: $" + new java.text.DecimalFormat("##.##").format();
	}
}