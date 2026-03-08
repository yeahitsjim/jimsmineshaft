package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class Rightclicks2Procedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(BigIronGateFrameEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if ((findEntityInWorldRange(world, BigIronGateFrameEntity.class, x, y, z, 7)).getPersistentData().getBoolean("open") == false) {
				(findEntityInWorldRange(world, BigIronGateFrameEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
			} else {
				(findEntityInWorldRange(world, BigIronGateFrameEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
			}
		}
		if (!world.getEntitiesOfClass(BigGateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if ((findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).getPersistentData().getBoolean("open") == false) {
				(findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", true);
			} else {
				(findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).getPersistentData().putBoolean("open", false);
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}