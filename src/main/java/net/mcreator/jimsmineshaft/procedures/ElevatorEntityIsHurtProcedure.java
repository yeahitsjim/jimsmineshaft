package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ElevatorEntityIsHurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).inElevator) {
			entity.getPersistentData().putDouble("playerCount", (entity.getPersistentData().getDouble("playerCount") + 1));
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.inElevator = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}