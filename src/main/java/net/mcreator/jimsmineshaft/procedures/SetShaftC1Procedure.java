package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class SetShaftC1Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantcshaft1";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}