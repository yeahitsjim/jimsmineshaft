package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Rightclicks2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(BigGateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (((findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)) instanceof BigGateEntity _datEntL3 && _datEntL3.getEntityData().get(BigGateEntity.DATA_open)) == false) {
				if ((findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)) instanceof BigGateEntity _datEntSetL)
					_datEntSetL.getEntityData().set(BigGateEntity.DATA_open, true);
			} else {
				if ((findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)) instanceof BigGateEntity _datEntSetL)
					_datEntSetL.getEntityData().set(BigGateEntity.DATA_open, false);
			}
		}
		if (!world.getEntitiesOfClass(SmallSlideUpGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (((findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)) instanceof SmallSlideUpGateEntityEntity _datEntL11 && _datEntL11.getEntityData().get(SmallSlideUpGateEntityEntity.DATA_open)) == false) {
				if ((findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)) instanceof SmallSlideUpGateEntityEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SmallSlideUpGateEntityEntity.DATA_open, true);
			} else {
				if ((findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)) instanceof SmallSlideUpGateEntityEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SmallSlideUpGateEntityEntity.DATA_open, false);
			}
		}
		if (!world.getEntitiesOfClass(SmallSideOpenGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (((findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)) instanceof SmallSideOpenGateEntityEntity _datEntL19 && _datEntL19.getEntityData().get(SmallSideOpenGateEntityEntity.DATA_open)) == false) {
				if ((findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)) instanceof SmallSideOpenGateEntityEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_open, true);
			} else {
				if ((findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)) instanceof SmallSideOpenGateEntityEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SmallSideOpenGateEntityEntity.DATA_open, false);
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}