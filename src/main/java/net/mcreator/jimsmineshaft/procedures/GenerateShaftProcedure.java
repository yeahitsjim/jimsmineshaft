package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class GenerateShaftProcedure {
	public static void execute(LevelAccessor world) {
		Direction workingDirection = Direction.NORTH;
		JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining = 50;
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
		JimsmineshaftModVariables.MapVariables.get(world).levelTokens = 25;
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
		JimsmineshaftModVariables.cuurentCoords.remove("x");
		JimsmineshaftModVariables.cuurentCoords.remove("y");
		JimsmineshaftModVariables.cuurentCoords.remove("z");
		if (0 < JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelTokens) {
				workingDirection = CheckgenerationsideProcedure.execute(world);
				JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure = "mainelevator";
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7lSpawning Main Elevator"), false);
			}
		}
	}
}