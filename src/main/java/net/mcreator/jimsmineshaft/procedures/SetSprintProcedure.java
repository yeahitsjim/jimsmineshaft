package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

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