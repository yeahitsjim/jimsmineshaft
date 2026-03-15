package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftBbit3Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantbbit3";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}