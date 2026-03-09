package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class HoleEntityRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("right clicked"), false);
	}
}