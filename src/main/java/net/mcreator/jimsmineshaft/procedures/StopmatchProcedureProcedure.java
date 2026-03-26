package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class StopmatchProcedureProcedure {
	public static void execute(LevelAccessor world) {
		if (JimsmineshaftModVariables.MapVariables.get(world).matchInProgress) {
			JimsmineshaftModVariables.MapVariables.get(world).matchInProgress = false;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Match Stopped"), false);
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Match Started"), false);
			JimsmineshaftModVariables.MapVariables.get(world).matchInProgress = true;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
		}
	}
}