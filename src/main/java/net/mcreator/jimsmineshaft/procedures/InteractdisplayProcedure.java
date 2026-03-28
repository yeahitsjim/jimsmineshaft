package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class InteractdisplayProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(BigGateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).getPersistentData().getBoolean("open") == false) {
				(findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
				return true;
			} else {
				(findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
				return true;
			}
		}
		if (!world.getEntitiesOfClass(SmallSlideUpGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)).getPersistentData().getBoolean("open") == false) {
				(findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
				return true;
			} else {
				(findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
				return true;
			}
		}
		if (!world.getEntitiesOfClass(SmallSideOpenGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if ((findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)).getPersistentData().getBoolean("open") == false) {
				(findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
				return true;
			} else {
				(findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
				return true;
			}
		}
		return false;
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}