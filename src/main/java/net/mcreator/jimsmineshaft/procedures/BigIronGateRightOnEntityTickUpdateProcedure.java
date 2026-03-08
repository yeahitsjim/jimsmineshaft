package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigIronGateRightOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		if (entity.getPersistentData().getBoolean("open") == true) {
			entity.getPersistentData().putDouble("size", 0.1);
		} else {
			entity.getPersistentData().putDouble("size", 1);
		}
	}
}