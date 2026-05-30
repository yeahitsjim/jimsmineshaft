package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetBitE1Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantebit1";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}