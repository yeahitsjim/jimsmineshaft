package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ThecartEntityIsHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).cartPushing) {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.cartPushing = false;
					_vars.syncPlayerVariables(sourceentity);
				}
				entity.getPersistentData().putString("ownedBy", " ");
			} else {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.cartPushing = true;
					_vars.syncPlayerVariables(sourceentity);
				}
				entity.getPersistentData().putString("ownedBy", (sourceentity.getDisplayName().getString()));
			}
			entity.getPersistentData().putBoolean("shake", true);
			JimsmineshaftMod.queueServerWork(20, () -> {
				entity.getPersistentData().putBoolean("shake", false);
			});
		}
	}
}