package net.mcreator.jimsmineshaft.command;

@EventBusSubscriber
public class DisableOverlayCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("disableoverlay")

				.then(Commands.argument("players", EntityArgument.player()).then(Commands.literal("true")).then(Commands.literal("false"))));
	}

}