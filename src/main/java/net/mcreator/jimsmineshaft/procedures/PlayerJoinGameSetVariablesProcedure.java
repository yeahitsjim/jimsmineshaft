package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class PlayerJoinGameSetVariablesProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
			_vars.playerIsDrilling = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
			_vars.playerIsDrilling = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}