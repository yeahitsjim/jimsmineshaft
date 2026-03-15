package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ThecartPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("shake");
	}
}