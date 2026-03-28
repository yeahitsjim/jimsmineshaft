package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SkinStealeranimationPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof SkinStealerEntityEntity _datEntL0 && _datEntL0.getEntityData().get(SkinStealerEntityEntity.DATA_snapped);
	}
}