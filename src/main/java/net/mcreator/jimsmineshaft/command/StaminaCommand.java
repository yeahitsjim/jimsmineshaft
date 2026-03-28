package net.mcreator.jimsmineshaft.command;

@EventBusSubscriber
public class StaminaCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("stamina")

				.then(Commands.argument("players", EntityArgument.players()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(0, 6400)))));
	}

}