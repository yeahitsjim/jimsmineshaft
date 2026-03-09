package net.mcreator.jimsmineshaft.command;

@EventBusSubscriber
public class EngagespawningCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("spawnloot")

		);
	}

}