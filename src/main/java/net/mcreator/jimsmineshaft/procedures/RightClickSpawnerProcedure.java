package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class RightClickSpawnerProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		Direction workingDirection = Direction.NORTH;
		String workingRoomPick = "";
		com.google.gson.JsonObject freshCoordsJSON = new com.google.gson.JsonObject();
	}
}