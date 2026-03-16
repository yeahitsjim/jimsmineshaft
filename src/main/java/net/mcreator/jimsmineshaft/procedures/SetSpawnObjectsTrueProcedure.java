package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetSpawnObjectsTrueProcedure {
	public static void execute(LevelAccessor world) {
		if (JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning == true) {
			JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning = false;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76Block Spawning set to \u00A7lfalse"), false);
		} else {
			JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning = true;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76Block Spawning set to \u00A7a\u00A7lTrue"), false);
		}
	}
}