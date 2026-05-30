package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetRoomD2Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantdroom2";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}