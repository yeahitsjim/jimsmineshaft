package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftG3BigProcedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantgshaft3big";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}