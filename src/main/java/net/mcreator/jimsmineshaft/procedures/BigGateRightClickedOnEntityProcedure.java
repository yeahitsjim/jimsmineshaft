package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigGateRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}