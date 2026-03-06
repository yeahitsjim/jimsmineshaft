package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class GenCheckDirectionProcedure {
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
		Direction usableDirection = Direction.NORTH;
		com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch1 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch2 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch3 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch4 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch5 = new com.google.gson.JsonObject();
		double workingX = 0;
		double workingY = 0;
		double workingZ = 0;
		double letsGoGambling = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double gambling1 = 0;
		double currentSavedBranchCount = 0;
		double branchOddsGambling = 0;
		boolean isEndBit = false;
		boolean repeatRoom = false;
		boolean workingDirectionChangeBoolean = false;
		String workingRoomPick = "";
		String selectedRoom = "";
		String stringWorkingDirection = "";
		String stringCurrentDirection = "";
	}
}