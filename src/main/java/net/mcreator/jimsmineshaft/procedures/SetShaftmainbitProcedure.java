package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftmainbitProcedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantabitmain";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}