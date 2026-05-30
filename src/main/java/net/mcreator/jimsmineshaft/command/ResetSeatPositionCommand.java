package net.mcreator.jimsmineshaft.command;

@EventBusSubscriber
public class ResetSeatPositionCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("resetseatposition")

		);
	}

}