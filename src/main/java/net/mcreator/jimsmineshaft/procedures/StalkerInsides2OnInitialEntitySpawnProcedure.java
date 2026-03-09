package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StalkerInsides2OnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 1));
	}
}