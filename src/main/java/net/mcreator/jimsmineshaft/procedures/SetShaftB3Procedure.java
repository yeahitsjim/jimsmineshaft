package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftB3Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantbshaft3";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}