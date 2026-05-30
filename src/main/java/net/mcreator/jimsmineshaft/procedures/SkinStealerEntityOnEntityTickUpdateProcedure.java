package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SkinStealerEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entity instanceof TamableAnimal _toTame && entityiterator instanceof Player _owner)
					_toTame.tame(_owner);
			}
		}
	}
}