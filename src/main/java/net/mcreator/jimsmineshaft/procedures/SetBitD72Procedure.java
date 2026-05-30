package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetBitD72Procedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantd7bit2";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}