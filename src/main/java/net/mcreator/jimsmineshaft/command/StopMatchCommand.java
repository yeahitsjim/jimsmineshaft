package net.mcreator.jimsmineshaft.command;

@EventBusSubscriber
public class StopMatchCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("matchtoggle")

		);
	}

}