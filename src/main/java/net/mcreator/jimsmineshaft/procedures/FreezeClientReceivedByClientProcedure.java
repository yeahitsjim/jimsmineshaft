package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class FreezeClientReceivedByClientProcedure {
	public static void execute() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}