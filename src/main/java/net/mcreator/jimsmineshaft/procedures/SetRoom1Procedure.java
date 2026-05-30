package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetRoom1Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "varianteshaft4";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}