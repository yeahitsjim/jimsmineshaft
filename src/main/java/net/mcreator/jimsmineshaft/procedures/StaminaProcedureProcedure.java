package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StaminaProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity.isSprinting()) {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.stamina = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina - 1;
					_vars.syncPlayerVariables(entity);
				}
				entity.getPersistentData().putBoolean("sprintcooldown", true);
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.13);
			} else {
				if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity4.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.08);
				if (entity.getPersistentData().getBoolean("sprintcooldown") == true) {
					if (entity.getPersistentData().getBoolean("sprintoutcooldown") == true) {
						JimsmineshaftMod.queueServerWork(70, () -> {
							entity.getPersistentData().putBoolean("sprintcooldown", false);
						});
					} else {
						JimsmineshaftMod.queueServerWork(35, () -> {
							entity.getPersistentData().putBoolean("sprintcooldown", false);
						});
					}
				}
				if (entity.getPersistentData().getBoolean("sprintcooldown") == false) {
					if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina < entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).staminamax) {
						{
							JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
							_vars.stamina = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina + 1;
							_vars.syncPlayerVariables(entity);
						}
					}
					if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina > entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).staminamax) {
						{
							JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
							_vars.stamina = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).staminamax;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
			}
			if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).stamina == 0) {
				entity.setSprinting(false);
				entity.getPersistentData().putBoolean("sprintoutcooldown", true);
				entity.getPersistentData().putBoolean("sprintcooldown", true);
			}
		}
	}
}