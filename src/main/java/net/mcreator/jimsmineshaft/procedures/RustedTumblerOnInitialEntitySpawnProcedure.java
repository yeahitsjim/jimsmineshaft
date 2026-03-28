package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class RustedTumblerOnInitialEntitySpawnProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, y, z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
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
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dx", 2);
			} else {
				entity.getPersistentData().putDouble("dx", 1);
			}
		}
		if ((entity.getDirection()) == Direction.WEST) {
			{
				Entity _ent = entity;
				_ent.setYRot(90);
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
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dz", 2);
			} else {
				entity.getPersistentData().putDouble("dz", 1);
			}
		}
		if ((entity.getDirection()) == Direction.EAST) {
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dz", 2);
			} else {
				entity.getPersistentData().putDouble("dz", 1);
			}
			{
				Entity _ent = entity;
				_ent.setYRot(-90);
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
		if ((entity.getDirection()) == Direction.NORTH) {
			if (entity.getPersistentData().getBoolean("open") == true) {
				entity.getPersistentData().putDouble("dx", 2);
			} else {
				entity.getPersistentData().putDouble("dx", 1);
			}
			{
				Entity _ent = entity;
				_ent.setYRot(180);
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
}