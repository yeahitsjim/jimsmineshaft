package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BigIronGateRightOnEntityTickUpdateProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = true;
			_player.onUpdateAbilities();
		}
		if (entity.getPersistentData().getBoolean("open") == true) {
			entity.getPersistentData().putDouble("size", 0.0001);
		} else {
			entity.getPersistentData().putDouble("size", 1);
		}
		if (entity instanceof RightgateEntity) {
			if ((entity instanceof RightgateEntity _datEntL5 && _datEntL5.getEntityData().get(RightgateEntity.DATA_open)) == true) {
				if (entity instanceof RightgateEntity _datEntSetI)
					_datEntSetI.getEntityData().set(RightgateEntity.DATA_size, (int) 0.0001);
			} else {
				if (entity instanceof RightgateEntity _datEntSetI)
					_datEntSetI.getEntityData().set(RightgateEntity.DATA_size, 1);
			}
		}
		if (entity instanceof LeftgateEntity) {
			if ((entity instanceof LeftgateEntity _datEntL9 && _datEntL9.getEntityData().get(LeftgateEntity.DATA_open)) == true) {
				if (entity instanceof LeftgateEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LeftgateEntity.DATA_size, (int) 0.0001);
			} else {
				if (entity instanceof LeftgateEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LeftgateEntity.DATA_size, 1);
			}
		}
		if (!world.getEntitiesOfClass(SmallSideOpenGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			return true;
		} else {
			if (!world.getEntitiesOfClass(SmallSlideUpGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
				return true;
			} else {
				if (!world.getEntitiesOfClass(BigGateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
					return true;
				} else {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
		}
		JimsmineshaftMod.queueServerWork(3, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
		return false;
	}
}