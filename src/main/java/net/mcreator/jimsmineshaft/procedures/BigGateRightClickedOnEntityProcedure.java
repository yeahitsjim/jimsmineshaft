package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

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