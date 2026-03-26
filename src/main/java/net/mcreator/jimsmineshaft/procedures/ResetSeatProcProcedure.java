package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

import java.util.ArrayList;

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