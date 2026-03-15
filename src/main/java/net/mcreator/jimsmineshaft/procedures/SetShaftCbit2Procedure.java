package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftCbit2Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantcbit2";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}