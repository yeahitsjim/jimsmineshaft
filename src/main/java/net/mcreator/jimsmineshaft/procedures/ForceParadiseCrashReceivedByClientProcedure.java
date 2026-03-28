package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ForceParadiseCrashReceivedByClientProcedure {
	public static void execute() {
		Minecraft.getInstance().stop();
	}
}