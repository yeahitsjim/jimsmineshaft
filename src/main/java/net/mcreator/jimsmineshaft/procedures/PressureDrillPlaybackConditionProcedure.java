package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.PressureDrillEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PressureDrillPlaybackConditionProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof PressureDrillEntity) {
			if (entity.getPersistentData().getBoolean("drilling")) {
				return true;
			}
		}
		return false;
	}
}