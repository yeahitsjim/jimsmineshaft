package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class RespawnInParadiseProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity ) {
if (
entity == null ) return ;
if () {{
Entity _ent = entity;
if(!_ent.level().isClientSide() && _ent.getServer() != null) {
_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(
CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent
), "execute in jimsmineshaft:paradise run spreadplayers 0 0 0 50 false @s");
}
}}
}
}