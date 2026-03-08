package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ReturnCartValueProcedure {
	public static String execute() {
		double totalValue = 0;
		return "\u00A78\u00A7lCart Value: \u00A72$" + new java.text.DecimalFormat("##.##").format();
	}
}