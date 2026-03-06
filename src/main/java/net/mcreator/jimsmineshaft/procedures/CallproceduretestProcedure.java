package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CallproceduretestProcedure {
	public static com.google.gson.JsonObject execute(LevelAccessor world, double testNumber) {
		com.google.gson.JsonObject passedDependency = new com.google.gson.JsonObject();
		String testchat = "";
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("number I was passed: " + testNumber)), false);
		passedDependency.addProperty("hi", "value within hi");
		return passedDependency;
	}
}