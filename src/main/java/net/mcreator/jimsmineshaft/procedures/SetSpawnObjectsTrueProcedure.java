package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class SetSpawnObjectsTrueProcedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning = true;
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}