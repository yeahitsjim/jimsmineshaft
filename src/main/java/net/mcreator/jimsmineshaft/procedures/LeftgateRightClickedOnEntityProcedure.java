package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.jimsmineshaft.entity.SmallSlideUpGateEntityEntity;
import net.mcreator.jimsmineshaft.entity.SmallSideOpenGateEntityEntity;
import net.mcreator.jimsmineshaft.entity.BigGateEntity;

import java.util.Comparator;

public class LeftgateRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			if (!world.getEntitiesOfClass(BigGateEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).level().isClientSide())
					(findEntityInWorldRange(world, BigGateEntity.class, x, y, z, 7)).discard();
			}
			if (!world.getEntitiesOfClass(SmallSlideUpGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)).level().isClientSide())
					(findEntityInWorldRange(world, SmallSlideUpGateEntityEntity.class, x, y, z, 7)).discard();
			}
			if (!world.getEntitiesOfClass(SmallSideOpenGateEntityEntity.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(7 / 2d), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (!(findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)).level().isClientSide())
					(findEntityInWorldRange(world, SmallSideOpenGateEntityEntity.class, x, y, z, 7)).discard();
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}