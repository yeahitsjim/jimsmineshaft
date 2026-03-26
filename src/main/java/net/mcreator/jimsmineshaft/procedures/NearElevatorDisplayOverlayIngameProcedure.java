package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class NearElevatorDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).inElevator) {
			if (!entity.isPassenger()) {
				return entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).nearElevator;
			}
		}
		return false;
	}
}