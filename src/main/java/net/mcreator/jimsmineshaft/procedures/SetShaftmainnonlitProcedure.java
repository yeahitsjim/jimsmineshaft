package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetShaftmainnonlitProcedure {
	public static void execute(LevelAccessor world) {
		JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft = "variantashaftmainnonlit";
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
	}
}