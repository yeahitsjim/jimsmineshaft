package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetRoomF1Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantfroom1";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}