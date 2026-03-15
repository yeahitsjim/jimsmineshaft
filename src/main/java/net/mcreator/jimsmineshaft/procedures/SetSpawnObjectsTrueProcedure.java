package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetSpawnObjectsTrueProcedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning = true;
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}