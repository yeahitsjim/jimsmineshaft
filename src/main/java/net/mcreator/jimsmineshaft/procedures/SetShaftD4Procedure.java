package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class SetShaftD4Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantdshaft4wider";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}