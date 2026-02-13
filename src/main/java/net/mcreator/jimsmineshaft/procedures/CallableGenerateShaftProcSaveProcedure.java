package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CallableGenerateShaftProcSaveProcedure {
public static void execute(
LevelAccessor world ) {
boolean isEndBit = false;boolean repeatRoom = false;boolean workingDirectionChangeBoolean = false;Direction workingDirection = Direction.NORTH;Direction usableDirection = Direction.NORTH;Direction localCurrentDirection = Direction.NORTH;double workingX = 0;double workingY = 0;double workingZ = 0;double letsGoGambling = 0;double repeatGambling = 0;double roomPickGambling = 0;double variantGambling = 0;double gambling1 = 0;double currentSavedBranchCount = 0;double branchOddsGambling = 0;double localVariantTokens = 0;String workingRoomPick = "";String selectedRoom = "";String stringWorkingDirection = "";String stringCurrentDirection = "";String localCurrentVariant = "";String localLastGeneratedStructure = "";com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();com.google.gson.JsonObject savedBranch1 = new com.google.gson.JsonObject();com.google.gson.JsonObject savedBranch2 = new com.google.gson.JsonObject();com.google.gson.JsonObject savedBranch3 = new com.google.gson.JsonObject();com.google.gson.JsonObject savedBranch4 = new com.google.gson.JsonObject();com.google.gson.JsonObject savedBranch5 = new com.google.gson.JsonObject();com.google.gson.JsonObject passedDependency = new com.google.gson.JsonObject();com.google.gson.JsonObject localCurrentCoords = new com.google.gson.JsonObject();
if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("OK we're getting here. What I have been sent: "), false);currentSavedBranchCount = 0;localCurrentCoords.addProperty("x", passedDependency.get("x").getAsDouble());localCurrentCoords.addProperty("y", passedDependency.get("y").getAsDouble());localCurrentCoords.addProperty("z", passedDependency.get("z").getAsDouble());localVariantTokens = passedDependency.get("variantTokens").getAsDouble();if (("east").equals(passedDependency.get("currentDirection").getAsString())) {localCurrentDirection = Direction.EAST;}if (("north").equals(passedDependency.get("currentDirection").getAsString())) {localCurrentDirection = Direction.EAST;}if (("west").equals(passedDependency.get("currentDirection").getAsString())) {localCurrentDirection = Direction.EAST;}if (("south").equals(passedDependency.get("currentDirection").getAsString())) {localCurrentDirection = Direction.EAST;}localLastGeneratedStructure = passedDependency.get("lastGeneratedStructure").getAsString();localCurrentVariant = passedDependency.get("currentVariant").getAsString();if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7l======================================="), false);if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7a\u00A7l=========Starting New Branch========="), false);if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7l======================================="), false);if (0<) {if (0<) {while(>0) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76==============New Room=============="), false);if (currentSavedBranchCount==6) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A74Branch cap reached, returning to 1st branch. Coords: X: "+(savedBranch1.get("x").getAsDouble()+""+(" Y: "+(savedBranch1.get("y").getAsDouble()+""+(" Z: "+savedBranch1.get("z").getAsDouble())))))), false);}if (().equals("variantabitmain")) {if (false==) {}}if (().equals("variantbbit1")) {if (false==) {}}if (().equals("variantbbit2")) {if (false==) {}}if (().equals("variantbbit3")) {if (false==) {}}if (().equals("variantbbit4")) {if (false==) {}}if (().equals("variantcbit1")) {if (false==) {}}if (().equals("variantcbit2")) {if (false==) {}}if (().equals("variantcbit3")) {if (false==) {}}if (().equals("variantcbit4")) {if (false==) {}}if (true==) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was a bit. Last room: "+)), false);branchOddsGambling = Mth.nextDouble(RandomSource.create(), 1, 10);workingDirectionChangeBoolean = false;if (4>branchOddsGambling) {workingDirectionChangeBoolean = true;if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was a bit. Rotating 90. Last room: "+)), false);workingDirection = .getCounterClockWise(Direction.Axis.Y);}if (4>branchOddsGambling) {if (workingDirectionChangeBoolean==true) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A74Saving branch position. Count: "+new java.text.DecimalFormat("##.##").format(currentSavedBranchCount))), false);if (currentSavedBranchCount<6) {currentSavedBranchCount = currentSavedBranchCount+1;if (currentSavedBranchCount==0) {savedBranch1.remove("x");savedBranch1.addProperty("x", JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble());savedBranch1.remove("y");savedBranch1.addProperty("y", JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble());savedBranch1.remove("z");savedBranch1.addProperty("z", JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble());stringWorkingDirection = workingDirection+"";savedBranch1.remove("workingDirection");savedBranch1.addProperty("workingDirection", stringWorkingDirection);stringCurrentDirection = +"";savedBranch1.remove("currentDirection");savedBranch1.addProperty("currentDirection", stringCurrentDirection);savedBranch1.remove("lastGeneratedStructure");savedBranch1.addProperty("lastGeneratedStructure", );savedBranch1.remove("currentVariant");savedBranch1.addProperty("currentVariant", );savedBranch1.remove("levelTokens");savedBranch1.addProperty("levelTokens", );savedBranch1.remove("variantTokens");savedBranch1.addProperty("variantTokens", );savedBranch1.remove("totalTokensRemaining");savedBranch1.addProperty("totalTokensRemaining", );}if (currentSavedBranchCount==1) {savedBranch2.remove("x");savedBranch2.addProperty("x", JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble());savedBranch2.remove("y");savedBranch2.addProperty("y", JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble());savedBranch2.remove("z");savedBranch2.addProperty("z", JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble());stringWorkingDirection = workingDirection+"";savedBranch2.remove("workingDirection");savedBranch2.addProperty("workingDirection", stringWorkingDirection);stringCurrentDirection = +"";savedBranch2.remove("currentDirection");savedBranch2.addProperty("currentDirection", stringCurrentDirection);savedBranch2.remove("lastGeneratedStructure");savedBranch2.addProperty("lastGeneratedStructure", );savedBranch2.remove("currentVariant");savedBranch2.addProperty("currentVariant", );savedBranch2.remove("levelTokens");savedBranch2.addProperty("levelTokens", );savedBranch2.remove("variantTokens");savedBranch2.addProperty("variantTokens", );savedBranch2.remove("totalTokensRemaining");savedBranch2.addProperty("totalTokensRemaining", );}if (currentSavedBranchCount==2) {savedBranch3.remove("x");savedBranch3.addProperty("x", JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble());savedBranch3.remove("y");savedBranch3.addProperty("y", JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble());savedBranch3.remove("z");savedBranch3.addProperty("z", JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble());stringWorkingDirection = workingDirection+"";savedBranch3.remove("workingDirection");savedBranch3.addProperty("workingDirection", stringWorkingDirection);stringCurrentDirection = +"";savedBranch3.remove("currentDirection");savedBranch3.addProperty("currentDirection", stringCurrentDirection);savedBranch3.remove("lastGeneratedStructure");savedBranch3.addProperty("lastGeneratedStructure", );savedBranch3.remove("currentVariant");savedBranch3.addProperty("currentVariant", );savedBranch3.remove("levelTokens");savedBranch3.addProperty("levelTokens", );savedBranch3.remove("variantTokens");savedBranch3.addProperty("variantTokens", );savedBranch3.remove("totalTokensRemaining");savedBranch3.addProperty("totalTokensRemaining", );}if (currentSavedBranchCount==3) {savedBranch4.remove("x");savedBranch4.addProperty("x", JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble());savedBranch4.remove("y");savedBranch4.addProperty("y", JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble());savedBranch4.remove("z");savedBranch4.addProperty("z", JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble());stringWorkingDirection = workingDirection+"";savedBranch4.remove("workingDirection");savedBranch4.addProperty("workingDirection", stringWorkingDirection);stringCurrentDirection = +"";savedBranch4.remove("currentDirection");savedBranch4.addProperty("currentDirection", stringCurrentDirection);savedBranch4.remove("lastGeneratedStructure");savedBranch4.addProperty("lastGeneratedStructure", );savedBranch4.remove("currentVariant");savedBranch4.addProperty("currentVariant", );savedBranch4.remove("levelTokens");savedBranch4.addProperty("levelTokens", );savedBranch4.remove("variantTokens");savedBranch4.addProperty("variantTokens", );savedBranch4.remove("totalTokensRemaining");savedBranch4.addProperty("totalTokensRemaining", );}if (currentSavedBranchCount==4) {savedBranch5.remove("x");savedBranch5.addProperty("x", JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble());savedBranch5.remove("y");savedBranch5.addProperty("y", JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble());savedBranch5.remove("z");savedBranch5.addProperty("z", JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble());savedBranch5.remove("workingDirection");stringWorkingDirection = workingDirection+"";savedBranch4.addProperty("workingDirection", stringWorkingDirection);savedBranch5.remove("currentDirection");stringCurrentDirection = +"";savedBranch4.addProperty("currentDirection", stringCurrentDirection);savedBranch5.remove("lastGeneratedStructure");savedBranch5.addProperty("lastGeneratedStructure", );savedBranch5.remove("currentVariant");savedBranch5.addProperty("currentVariant", );savedBranch5.remove("levelTokens");savedBranch5.addProperty("levelTokens", );savedBranch5.remove("variantTokens");savedBranch5.addProperty("variantTokens", );savedBranch5.remove("totalTokensRemaining");savedBranch5.addProperty("totalTokensRemaining", );}}}else{if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was a bit. Rotating 180. Last room: "+)), false);workingDirection = .getCounterClockWise(Direction.Axis.Y);workingDirection = workingDirection.getCounterClockWise(Direction.Axis.Y);workingDirectionChangeBoolean = true;}}}if (false==) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was NOT a bit. Returning the CurrentDirection; "+)), false);workingDirection = ;workingDirectionChangeBoolean = true;}if (().equals("variantbbit1")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantbbit2")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantbbit3")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantbbit4")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantcbit1")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantcbit2")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.DOWN == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantcbit3")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantcbit4")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+5));}}if (Direction.EAST == workingDirection) {if (Direction.DOWN == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+5));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-5));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("mainelevator")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("x");workingCoords.remove("y");workingCoords.remove("z");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble()-48));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-14));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.remove("y");workingCoords.remove("z");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-14));workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble()-48));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("x");workingCoords.remove("y");workingCoords.remove("z");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble()-48));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+14));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.remove("y");workingCoords.remove("z");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+14));workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble()-48));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}}if (().equals("variantabitmain")) {if (Direction.NORTH == workingDirection) {if (Direction.NORTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-12));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}}if (Direction.WEST == workingDirection) {if (Direction.WEST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+12));}if (Direction.SOUTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+12));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-12));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}}if (Direction.SOUTH == workingDirection) {if (Direction.SOUTH == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}if (Direction.WEST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}if (Direction.EAST == ) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+12));}}if (Direction.EAST == workingDirection) {if (Direction.EAST == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+12));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+12));workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-12));}if (Direction.NORTH == ) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}}}if (().equals("variantashaftmain")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-20));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-20));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+20));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+20));}}if (().equals("variantashaftmainnonlit")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-20));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-20));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+20));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+20));}}if (().equals("variantbshaft1")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantbshaft2")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantbshaft3")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantbshaft4")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantbshaft5")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantcshaft1")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantcshaft1")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantcshaft2")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantcshaft3")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantcshaft4")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantcshaft5")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));}if (Direction.WEST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));}}if (().equals("variantbroom1")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("x");workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}if (Direction.WEST == workingDirection) {workingCoords.remove("z");workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}if (Direction.SOUTH == workingDirection) {workingCoords.remove("z");workingCoords.remove("x");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.remove("z");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}}if (().equals("variantbroom2")) {if (Direction.NORTH == workingDirection) {workingCoords.remove("x");workingCoords.remove("z");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-21));workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+1));}if (Direction.WEST == workingDirection) {workingCoords.remove("z");workingCoords.remove("x");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-21));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()-1));}if (Direction.DOWN == workingDirection) {workingCoords.remove("z");workingCoords.remove("x");workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+21));workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()-1));}if (Direction.EAST == workingDirection) {workingCoords.remove("x");workingCoords.remove("z");workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble()+21));workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()+1));}}if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76\u00A7ISetting working coords to: X: "+(new java.text.DecimalFormat("##.##").format(workingCoords.get("x").getAsDouble())+""+(" Y: "+(new java.text.DecimalFormat("##.##").format(workingCoords.get("y").getAsDouble())+""+(" Z: "+new java.text.DecimalFormat("##.##").format(workingCoords.get("z").getAsDouble()))))))), false);JimsmineshaftModVariables.cuurentCoords.remove("x");JimsmineshaftModVariables.cuurentCoords.remove("y");JimsmineshaftModVariables.cuurentCoords.remove("z");JimsmineshaftModVariables.cuurentCoords.addProperty("x", workingCoords.get("x").getAsDouble());JimsmineshaftModVariables.cuurentCoords.addProperty("y", workingCoords.get("y").getAsDouble());JimsmineshaftModVariables.cuurentCoords.addProperty("z", workingCoords.get("z").getAsDouble());letsGoGambling = 1;selectedRoom = "null";if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oStarting VariantTokens: "+new java.text.DecimalFormat("##").format())), false);if (>0) {if (true==) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oRoom identified as bit"), false);if (("a").equals()) {if (().equals("variantabitmain")) {letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 2);if (1==letsGoGambling) {selectedRoom = "variantashaftmain";workingRoomPick = selectedRoom;}if (2==letsGoGambling) {selectedRoom = "variantashaftmainnonlit";workingRoomPick = selectedRoom;}}if (().equals("variantabitmain")) {letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 2);if (1==letsGoGambling) {selectedRoom = "variantashaftmain";workingRoomPick = selectedRoom;}if (1==letsGoGambling) {selectedRoom = "variantashaftmainnonlit";workingRoomPick = selectedRoom;}}}if (("b").equals()) {if (().equals("variantbbit4")) {letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 5);if (1==letsGoGambling) {selectedRoom = "variantbshaft1";workingRoomPick = selectedRoom;}if (2==letsGoGambling) {selectedRoom = "variantbshaft2";workingRoomPick = selectedRoom;}if (3==letsGoGambling) {selectedRoom = "variantbshaft3";workingRoomPick = selectedRoom;}if (4==letsGoGambling) {selectedRoom = "variantbshaft4";workingRoomPick = selectedRoom;}if (5==letsGoGambling) {selectedRoom = "variantbshaft5";workingRoomPick = selectedRoom;}}}if (("c").equals()) {if (().equals("variantcbit4")) {letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 5);if (1==letsGoGambling) {selectedRoom = "variantcshaft1";workingRoomPick = selectedRoom;}if (2==letsGoGambling) {selectedRoom = "variantcshaft2";workingRoomPick = selectedRoom;}if (3==letsGoGambling) {selectedRoom = "variantcshaft3";workingRoomPick = selectedRoom;}if (4==letsGoGambling) {selectedRoom = "variantcshaft4";workingRoomPick = selectedRoom;}if (5==letsGoGambling) {selectedRoom = "variantcshaft5";workingRoomPick = selectedRoom;}}}}else{if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oRoom not identified as bit"), false);repeatGambling = Mth.nextInt(RandomSource.create(), 1, 10);if (("mainelevator").equals()) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oMain elevator detected, not repeating"), false);repeatGambling = 1;}roomPickGambling = Mth.nextInt(RandomSource.create(), 1, 9);gambling1 = Mth.nextInt(RandomSource.create(), 1, 3);if (4<=repeatGambling) {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oDecided to repeat"), false);repeatRoom = true;workingRoomPick = ;}else{if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oDecided not to repeat, picking random room from variant"), false);if (("a").equals()) {if (1==gambling1) {workingRoomPick = "variantashaftmain";}if (2==gambling1) {workingRoomPick = "variantashaftmainnonlit";}if (3==gambling1) {workingRoomPick = "variantabitmain";}}if (("b").equals()) {if (1==roomPickGambling) {workingRoomPick = "variantbshaft1";}if (2==roomPickGambling) {workingRoomPick = "variantbshaft2";}if (3==roomPickGambling) {workingRoomPick = "variantbshaft3";}if (4==roomPickGambling) {workingRoomPick = "variantbshaft4";}if (5==roomPickGambling) {workingRoomPick = "variantbshaft5";}if (6==roomPickGambling) {workingRoomPick = "variantbbit1";}if (7==roomPickGambling) {workingRoomPick = "variantbbit2";}if (8==roomPickGambling) {workingRoomPick = "variantbbit3";}if (9==roomPickGambling) {workingRoomPick = "variantbbit4";}}if (("c").equals()) {if (1==roomPickGambling) {workingRoomPick = "variantcshaft1";}if (2==roomPickGambling) {workingRoomPick = "variantcshaft2";}if (3==roomPickGambling) {workingRoomPick = "variantcshaft3";}if (4==roomPickGambling) {workingRoomPick = "variantcshaft4";}if (5==roomPickGambling) {workingRoomPick = "variantcshaft5";}if (6==roomPickGambling) {workingRoomPick = "variantcbit1";}if (7==roomPickGambling) {workingRoomPick = "variantcbit2";}if (8==roomPickGambling) {workingRoomPick = "variantcbit3";}if (9==roomPickGambling) {workingRoomPick = "variantcbit4";}}}}}else{if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7lOut of variant tokens, resetting"), false);variantGambling = Mth.nextInt(RandomSource.create(), 1, 3);if (1==variantGambling) {}if (2==variantGambling) {}if (3==variantGambling) {}repeatGambling = Mth.nextInt(RandomSource.create(), 1, 10);roomPickGambling = Mth.nextInt(RandomSource.create(), 1, 9);gambling1 = Mth.nextInt(RandomSource.create(), 1, 3);if (("a").equals()) {if (1==gambling1) {workingRoomPick = "variantashaftmain";}if (2==gambling1) {workingRoomPick = "variantashaftmainnonlit";}if (3==gambling1) {workingRoomPick = "variantabitmain";}}if (("b").equals()) {if (1==roomPickGambling) {workingRoomPick = "variantbshaft1";}if (2==roomPickGambling) {workingRoomPick = "variantbshaft2";}if (3==roomPickGambling) {workingRoomPick = "variantbshaft3";}if (4==roomPickGambling) {workingRoomPick = "variantbshaft4";}if (5==roomPickGambling) {workingRoomPick = "variantbshaft5";}if (6==roomPickGambling) {workingRoomPick = "variantbbit1";}if (7==roomPickGambling) {workingRoomPick = "variantbbit2";}if (8==roomPickGambling) {workingRoomPick = "variantbbit3";}if (9==roomPickGambling) {workingRoomPick = "variantbbit4";}}if (("c").equals()) {if (1==roomPickGambling) {workingRoomPick = "variantcshaft1";}if (2==roomPickGambling) {workingRoomPick = "variantcshaft2";}if (3==roomPickGambling) {workingRoomPick = "variantcshaft3";}if (4==roomPickGambling) {workingRoomPick = "variantcshaft4";}if (5==roomPickGambling) {workingRoomPick = "variantcshaft5";}if (6==roomPickGambling) {workingRoomPick = "variantcbit1";}if (7==roomPickGambling) {workingRoomPick = "variantcbit2";}if (8==roomPickGambling) {workingRoomPick = "variantcbit3";}if (9==roomPickGambling) {workingRoomPick = "variantcbit4";}}}if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A79\u00A7eWorking direction: "+workingDirection)), false);if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76Room Picked:\u00A7l "+workingRoomPick)), false);if (workingDirection == Direction.EAST) {if (("elevator2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantabitmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmainnonlit").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}}if (workingDirection == Direction.NORTH) {if (("elevator2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantabitmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmainnonlit").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.COUNTERCLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}}if (workingDirection == Direction.WEST) {if (("elevator2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantabitmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmainnonlit").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_180)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}}if (workingDirection == Direction.SOUTH) {if (("elevator2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantabitmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmain").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantashaftmainnonlit").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbroom2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantbshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcbit4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft1").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft2").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft3").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft4").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}if (("variantcshaft5").equals(workingRoomPick)) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
BlockPos.containing(workingCoords.get("x").getAsDouble(),workingCoords.get("y").getAsDouble(),workingCoords.get("z").getAsDouble()),
new StructurePlaceSettings()
.setRotation(Rotation.CLOCKWISE_90)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}}}}}}
}
}