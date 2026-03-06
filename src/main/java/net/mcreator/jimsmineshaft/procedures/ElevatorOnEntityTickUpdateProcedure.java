package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ElevatorOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("doorCooldown", (entity.getPersistentData().getDouble("doorCooldown") - 1));
		{
			Entity _ent = entity;
			_ent.setYRot(0);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}