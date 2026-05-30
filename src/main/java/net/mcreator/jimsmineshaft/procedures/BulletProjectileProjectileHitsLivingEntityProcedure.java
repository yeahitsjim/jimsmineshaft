package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BulletProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
	}
}