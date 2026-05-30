package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ResetSeatProcProcedure {
	public static void execute(LevelAccessor world) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entityiterator.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.elevatorSeatNumber = 0;
				_vars.syncPlayerVariables(entityiterator);
			}
		}
	}
}