package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftB2Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantbshaft2";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}