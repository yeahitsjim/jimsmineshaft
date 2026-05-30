package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class GSMP3Procedure {
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
		com.google.gson.JsonObject branchSave0 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject localFilledSpaces = new com.google.gson.JsonObject();
		com.google.gson.JsonObject returnedPickRoomJSON = new com.google.gson.JsonObject();
		Direction workingDirection = Direction.NORTH;
		Direction localCurrentDirection = Direction.NORTH;
		boolean localWorkingRoomisBit = false;
		boolean workingDirectionChangeBoolean = false;
		double currentSavedBranchCount = 0;
		double branchOddsGambling = 0;
		double localTotalTokens = 0;
		double letsGoGambling = 0;
		double localVariantTokens = 0;
		double localLevelTokens = 0;
		String stringWorkingDirection = "";
		String workingRoomPick = "";
		String stringCurrentDirection = "";
		String lastGeneratedStructure = "";
		String selectedRoom = "";
		String localCurrentVariant = "";
	}
}