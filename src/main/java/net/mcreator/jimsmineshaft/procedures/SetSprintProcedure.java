package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SetSprintProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
			_vars.staminamax = DoubleArgumentType.getDouble(arguments, "amount");
			_vars.syncPlayerVariables(entity);
		}
	}
}