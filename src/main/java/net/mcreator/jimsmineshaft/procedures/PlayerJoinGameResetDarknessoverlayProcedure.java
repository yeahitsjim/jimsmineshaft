package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerJoinGameResetDarknessoverlayProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		JimsmineshaftMod.queueServerWork(80, () -> {
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.darknessOverlay = 0;
				_vars.syncPlayerVariables(entity);
			}
		});
	}
}