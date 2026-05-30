package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetBitD33Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantd3bit3";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}