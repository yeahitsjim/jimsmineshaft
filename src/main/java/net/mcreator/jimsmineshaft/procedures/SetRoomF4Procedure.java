package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetRoomF4Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantfroom4";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}