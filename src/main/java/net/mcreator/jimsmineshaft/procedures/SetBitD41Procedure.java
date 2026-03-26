package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class SetBitD41Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantd4bit1";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}