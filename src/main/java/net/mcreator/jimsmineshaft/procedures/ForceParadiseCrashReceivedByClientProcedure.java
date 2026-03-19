package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.client.Minecraft;

public class ForceParadiseCrashReceivedByClientProcedure {
	public static void execute() {
		Minecraft.getInstance().stop();
	}
}