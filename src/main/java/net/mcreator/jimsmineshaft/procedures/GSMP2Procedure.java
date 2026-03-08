package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class GSMP2Procedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Direction workingDirection = Direction.NORTH;
		Direction localCurrentDirection = Direction.NORTH;
		String stringWorkingDirection = "";
		String workingRoomPick = "";
		String stringCurrentDirection = "";
		String selectedRoom = "";
		String localCurrentVariant = "";
		String lastGeneratedStructure = "";
		boolean repeatRoom = false;
		boolean workingDirectionChangeBoolean = false;
		boolean localWorkingRoomisBit = false;
		com.google.gson.JsonObject returnedCoordJSON = new com.google.gson.JsonObject();
		com.google.gson.JsonObject returnedPickRoomJSON = new com.google.gson.JsonObject();
		com.google.gson.JsonObject localFilledSpaces = new com.google.gson.JsonObject();
		com.google.gson.JsonObject localCurrentCoords = new com.google.gson.JsonObject();
		com.google.gson.JsonObject branchSave0 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject branchSave1 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject branchSave3 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject branchSave2 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject branchSave4 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject branchSave5 = new com.google.gson.JsonObject();
		double currentSavedBranchCount = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double branchOddsGambling = 0;
		double gambling1 = 0;
		double letsGoGambling = 0;
		double localVariantTokens = 0;
		double localTotalTokens = 0;
		double localLevelTokens = 0;
		if (JimsmineshaftModItems.WOE_MINESHAFT_BE_UPON_THE_2.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(JimsmineshaftModItems.DELETED_MOD_ELEMENT.get()));
			currentSavedBranchCount = 0;
			localFilledSpaces.addProperty("x", x);
			localFilledSpaces.addProperty("y", (y - 48));
			localFilledSpaces.addProperty("z", z);
			returnedPickRoomJSON.addProperty("workingRoomPick", "null");
			returnedPickRoomJSON.addProperty("currentVariant", "null");
			returnedPickRoomJSON.addProperty("variantTokens", 696969);
			branchSave0.addProperty("xPass", 696969);
			branchSave0.addProperty("yPass", 696969);
			branchSave0.addProperty("zPass", 696969);
			branchSave0.addProperty("lastGeneratedStructurePass", "null");
			branchSave0.addProperty("workingDirectionPass", "null");
			branchSave0.addProperty("currentDirectionPass", "null");
			branchSave0.addProperty("currentVariantPass", "null");
			branchSave0.addProperty("variantTokensPass", 696969);
			branchSave0.addProperty("levelTokens", 696969);
			branchSave0.addProperty("totalTokens", 696969);
			branchSave1.addProperty("xPass", 696969);
			branchSave1.addProperty("yPass", 696969);
			branchSave1.addProperty("zPass", 696969);
			branchSave1.addProperty("lastGeneratedStructurePass", "null");
			branchSave1.addProperty("workingDirectionPass", "null");
			branchSave1.addProperty("currentDirectionPass", "null");
			branchSave1.addProperty("currentVariantPass", "null");
			branchSave1.addProperty("variantTokensPass", 696969);
			branchSave1.addProperty("levelTokens", 696969);
			branchSave1.addProperty("totalTokens", 696969);
			branchSave2.addProperty("xPass", 696969);
			branchSave2.addProperty("yPass", 696969);
			branchSave2.addProperty("zPass", 696969);
			branchSave2.addProperty("lastGeneratedStructurePass", "null");
			branchSave2.addProperty("workingDirectionPass", "null");
			branchSave2.addProperty("currentDirectionPass", "null");
			branchSave2.addProperty("currentVariantPass", "null");
			branchSave2.addProperty("variantTokensPass", 696969);
			branchSave2.addProperty("levelTokens", 696969);
			branchSave2.addProperty("totalTokens", 696969);
			branchSave3.addProperty("xPass", 696969);
			branchSave3.addProperty("yPass", 696969);
			branchSave3.addProperty("zPass", 696969);
			branchSave3.addProperty("lastGeneratedStructurePass", "null");
			branchSave3.addProperty("workingDirectionPass", "null");
			branchSave3.addProperty("currentDirectionPass", "null");
			branchSave3.addProperty("currentVariantPass", "null");
			branchSave3.addProperty("variantTokensPass", 696969);
			branchSave3.addProperty("levelTokens", 696969);
			branchSave3.addProperty("totalTokens", 696969);
			branchSave4.addProperty("xPass", 696969);
			branchSave4.addProperty("yPass", 696969);
			branchSave4.addProperty("zPass", 696969);
			branchSave4.addProperty("lastGeneratedStructurePass", "null");
			branchSave4.addProperty("workingDirectionPass", "null");
			branchSave4.addProperty("currentDirectionPass", "null");
			branchSave4.addProperty("currentVariantPass", "null");
			branchSave4.addProperty("variantTokensPass", 696969);
			branchSave4.addProperty("levelTokens", 696969);
			branchSave4.addProperty("totalTokens", 696969);
			branchSave5.addProperty("xPass", 696969);
			branchSave5.addProperty("yPass", 696969);
			branchSave5.addProperty("zPass", 696969);
			branchSave5.addProperty("lastGeneratedStructurePass", "null");
			branchSave5.addProperty("workingDirectionPass", "null");
			branchSave5.addProperty("currentDirectionPass", "null");
			branchSave5.addProperty("currentVariantPass", "null");
			branchSave5.addProperty("variantTokensPass", 696969);
			branchSave5.addProperty("levelTokens", 696969);
			branchSave5.addProperty("totalTokens", 696969);
			localTotalTokens = 20;
			localLevelTokens = 20;
			localVariantTokens = 6;
			localCurrentDirection = Direction.EAST;
			lastGeneratedStructure = "mainelevator";
			localCurrentVariant = "a";
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "mainelevator"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(localFilledSpaces.get("x").getAsDouble(), localFilledSpaces.get("y").getAsDouble(), localFilledSpaces.get("z").getAsDouble()),
							BlockPos.containing(localFilledSpaces.get("x").getAsDouble(), localFilledSpaces.get("y").getAsDouble(), localFilledSpaces.get("z").getAsDouble()),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7l======================================="), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7a\u00A7l=========Beginning Shaft Gen========="), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7l======================================="), false);
			if (0 < localTotalTokens) {
				if (0 < localLevelTokens) {
					while (localTotalTokens > 0) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76==============New Room=============="), false);
						if (currentSavedBranchCount >= 4) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Branch cap reached, returning to 1st branch. Coords: X: "), false);
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Full JSON sending: " + branchSave0)), false);
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList()
										.broadcastSystemMessage(Component.literal(("Total Tokens remaining: " + new java.text.DecimalFormat("##.##").format(JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining))), false);
						}
						localTotalTokens = localTotalTokens - 1;
						localVariantTokens = localVariantTokens - 1;
						localWorkingRoomisBit = false;
						if ((lastGeneratedStructure).equals("variantabitmain")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantbbit1")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantbbit2")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantbbit3")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantbbit4")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantcbit1")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantcbit2")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantcbit3")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if ((lastGeneratedStructure).equals("variantcbit4")) {
							if (false == localWorkingRoomisBit) {
								localWorkingRoomisBit = true;
							}
						}
						if (true == localWorkingRoomisBit) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was a bit. Last room: " + lastGeneratedStructure)), false);
							branchOddsGambling = Mth.nextDouble(RandomSource.create(), 1, 10);
							workingDirectionChangeBoolean = false;
							if (4 > branchOddsGambling) {
								workingDirectionChangeBoolean = true;
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was a bit. Rotating 90. Last room: " + lastGeneratedStructure)), false);
								workingDirection = localCurrentDirection.getCounterClockWise(Direction.Axis.Y);
							}
							if (4 > branchOddsGambling) {
								if (workingDirectionChangeBoolean == true) {
									if (!world.isClientSide() && world.getServer() != null)
										world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A74Saving branch position. Count: " + new java.text.DecimalFormat("##.##").format(currentSavedBranchCount))), false);
									if (currentSavedBranchCount < 6) {
										if (currentSavedBranchCount == 0) {
											branchSave0.remove("xPass");
											branchSave0.addProperty("xPass", localCurrentCoords.get("x").getAsDouble());
											branchSave0.remove("yPass");
											branchSave0.addProperty("yPass", localCurrentCoords.get("y").getAsDouble());
											branchSave0.remove("zPass");
											branchSave0.addProperty("zPass", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											branchSave0.remove("workingDirectionPass");
											branchSave0.addProperty("workingDirectionPass", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											branchSave0.remove("currentDirectionPass");
											branchSave0.addProperty("currentDirectionPass", stringCurrentDirection);
											branchSave0.remove("lastGeneratedStructurePass");
											branchSave0.addProperty("lastGeneratedStructurePass", lastGeneratedStructure);
											branchSave0.remove("currentVariantPass");
											branchSave0.addProperty("currentVariantPass", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											branchSave0.remove("variantTokensPass");
											branchSave0.addProperty("variantTokensPass", localVariantTokens);
											branchSave0.remove("totalTokens");
											branchSave0.addProperty("totalTokens", localTotalTokens);
											branchSave0.remove("levelTokens");
											branchSave0.addProperty("levelTokens", localLevelTokens);
										}
										if (currentSavedBranchCount == 1) {
											branchSave1.remove("xPass");
											branchSave1.addProperty("xPass", localCurrentCoords.get("x").getAsDouble());
											branchSave1.remove("yPass");
											branchSave1.addProperty("yPass", localCurrentCoords.get("y").getAsDouble());
											branchSave1.remove("zPass");
											branchSave1.addProperty("zPass", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											branchSave1.remove("workingDirectionPass");
											branchSave1.addProperty("workingDirectionPass", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											branchSave1.remove("currentDirectionPass");
											branchSave1.addProperty("currentDirectionPass", stringCurrentDirection);
											branchSave1.remove("lastGeneratedStructurePass");
											branchSave1.addProperty("lastGeneratedStructurePass", lastGeneratedStructure);
											branchSave1.remove("currentVariantPass");
											branchSave1.addProperty("currentVariantPass", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											branchSave1.remove("variantTokensPass");
											branchSave1.addProperty("variantTokensPass", localVariantTokens);
											branchSave1.remove("totalTokens");
											branchSave1.addProperty("totalTokens", localTotalTokens);
											branchSave1.remove("levelTokens");
											branchSave1.addProperty("levelTokens", localLevelTokens);
										}
										if (currentSavedBranchCount == 2) {
											branchSave2.remove("xPass");
											branchSave2.addProperty("xPass", localCurrentCoords.get("x").getAsDouble());
											branchSave2.remove("yPass");
											branchSave2.addProperty("yPass", localCurrentCoords.get("y").getAsDouble());
											branchSave2.remove("zPass");
											branchSave2.addProperty("zPass", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											branchSave2.remove("workingDirectionPass");
											branchSave2.addProperty("workingDirectionPass", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											branchSave2.remove("currentDirectionPass");
											branchSave2.addProperty("currentDirectionPass", stringCurrentDirection);
											branchSave2.remove("lastGeneratedStructurePass");
											branchSave2.addProperty("lastGeneratedStructurePass", lastGeneratedStructure);
											branchSave2.remove("currentVariantPass");
											branchSave2.addProperty("currentVariantPass", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											branchSave2.remove("levelTokensPass");
											branchSave2.addProperty("levelTokensPass", JimsmineshaftModVariables.MapVariables.get(world).levelTokens);
											branchSave2.remove("variantTokensPass");
											branchSave2.addProperty("variantTokensPass", localVariantTokens);
											branchSave2.remove("totalTokensRemainingPass");
											branchSave2.addProperty("totalTokensRemainingPass", JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining);
											branchSave2.remove("totalTokens");
											branchSave2.addProperty("totalTokens", localTotalTokens);
											branchSave2.remove("levelTokens");
											branchSave2.addProperty("levelTokens", localLevelTokens);
										}
										if (currentSavedBranchCount == 3) {
											branchSave3.remove("xPass");
											branchSave3.addProperty("xPass", localCurrentCoords.get("x").getAsDouble());
											branchSave3.remove("yPass");
											branchSave3.addProperty("yPass", localCurrentCoords.get("y").getAsDouble());
											branchSave3.remove("zPass");
											branchSave3.addProperty("zPass", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											branchSave3.remove("workingDirectionPass");
											branchSave3.addProperty("workingDirectionPass", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											branchSave3.remove("currentDirectionPass");
											branchSave3.addProperty("currentDirectionPass", stringCurrentDirection);
											branchSave3.remove("lastGeneratedStructurePass");
											branchSave3.addProperty("lastGeneratedStructurePass", lastGeneratedStructure);
											branchSave3.remove("currentVariantPass");
											branchSave3.addProperty("currentVariantPass", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											branchSave3.remove("variantTokensPass");
											branchSave3.addProperty("variantTokensPass", localVariantTokens);
											branchSave3.remove("totalTokens");
											branchSave3.addProperty("totalTokens", localTotalTokens);
											branchSave3.remove("levelTokens");
											branchSave3.addProperty("levelTokens", localLevelTokens);
										}
										if (currentSavedBranchCount == 4) {
											branchSave4.remove("xPass");
											branchSave4.addProperty("xPass", localCurrentCoords.get("x").getAsDouble());
											branchSave4.remove("yPass");
											branchSave4.addProperty("yPass", localCurrentCoords.get("y").getAsDouble());
											branchSave4.remove("zPass");
											branchSave4.addProperty("zPass", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											branchSave4.remove("workingDirectionPass");
											branchSave4.addProperty("workingDirectionPass", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											branchSave4.remove("currentDirectionPass");
											branchSave4.addProperty("currentDirectionPass", stringCurrentDirection);
											branchSave4.remove("lastGeneratedStructurePass");
											branchSave4.addProperty("lastGeneratedStructurePass", lastGeneratedStructure);
											branchSave4.remove("currentVariantPass");
											branchSave4.addProperty("currentVariantPass", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											branchSave4.remove("variantTokensPass");
											branchSave4.addProperty("variantTokensPass", localVariantTokens);
											branchSave4.remove("totalTokens");
											branchSave4.addProperty("totalTokens", localTotalTokens);
											branchSave4.remove("levelTokens");
											branchSave4.addProperty("levelTokens", localLevelTokens);
										}
										if (currentSavedBranchCount == 5) {
											branchSave5.remove("xPass");
											branchSave5.addProperty("xPass", localCurrentCoords.get("x").getAsDouble());
											branchSave5.remove("yPass");
											branchSave5.addProperty("yPass", localCurrentCoords.get("y").getAsDouble());
											branchSave5.remove("zPass");
											branchSave5.addProperty("zPass", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											branchSave5.remove("workingDirectionPass");
											branchSave5.addProperty("workingDirectionPass", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											branchSave5.remove("currentDirectionPass");
											branchSave5.addProperty("currentDirectionPass", stringCurrentDirection);
											branchSave5.remove("lastGeneratedStructurePass");
											branchSave5.addProperty("lastGeneratedStructurePass", lastGeneratedStructure);
											branchSave5.remove("currentVariantPass");
											branchSave5.addProperty("currentVariantPass", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											branchSave5.remove("variantTokensPass");
											branchSave5.addProperty("variantTokensPass", localVariantTokens);
											branchSave5.remove("totalTokens");
											branchSave5.addProperty("totalTokens", localTotalTokens);
											branchSave5.remove("levelTokens");
											branchSave5.addProperty("levelTokens", localLevelTokens);
										}
										currentSavedBranchCount = currentSavedBranchCount + 1;
									}
								} else {
									if (!world.isClientSide() && world.getServer() != null)
										world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was a bit. Rotating 180. Last room: " + lastGeneratedStructure)), false);
									workingDirection = localCurrentDirection.getCounterClockWise(Direction.Axis.Y);
									workingDirection = workingDirection.getCounterClockWise(Direction.Axis.Y);
									workingDirectionChangeBoolean = true;
								}
							}
						}
						if (false == localWorkingRoomisBit) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oThe last room was NOT a bit. Returning the CurrentDirection; " + lastGeneratedStructure)), false);
							workingDirection = localCurrentDirection;
							workingDirectionChangeBoolean = true;
						}
						localFilledSpaces = GSMPpickCoords2Procedure.execute(world, localFilledSpaces.get("x").getAsDouble(), localFilledSpaces.get("y").getAsDouble(), localFilledSpaces.get("z").getAsDouble(), localCurrentDirection + "",
								lastGeneratedStructure, workingDirection + "");
						localCurrentCoords.remove("x");
						localCurrentCoords.remove("y");
						localCurrentCoords.remove("z");
						localCurrentCoords.addProperty("x", localFilledSpaces.get("x").getAsDouble());
						localCurrentCoords.addProperty("y", localFilledSpaces.get("y").getAsDouble());
						localCurrentCoords.addProperty("z", localFilledSpaces.get("z").getAsDouble());
						localCurrentDirection = workingDirection;
						letsGoGambling = 1;
						selectedRoom = "null";
						returnedPickRoomJSON = GSMPpickRoomProcedure.execute(world, JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit, localVariantTokens, localCurrentVariant, lastGeneratedStructure);
						workingRoomPick = returnedPickRoomJSON.get("workingRoomPick").getAsString();
						localCurrentVariant = returnedPickRoomJSON.get("currentVariant").getAsString();
						if ((workingRoomPick).equals("null")) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A74\u00A7lNull room returned. Setting current branch count to 4 to kill main branch. Current branch count: " + currentSavedBranchCount)),
										false);
							if (currentSavedBranchCount == 0) {
								break;
							}
							if (currentSavedBranchCount == 1) {
								break;
							}
							if (currentSavedBranchCount == 2) {
								break;
							}
							if (currentSavedBranchCount == 3) {
								break;
							}
							if (currentSavedBranchCount == 4) {
								break;
							}
							if (currentSavedBranchCount == 5) {
								break;
							}
							if (currentSavedBranchCount == 6) {
								break;
							}
						}
						localVariantTokens = returnedPickRoomJSON.get("variantTokens").getAsDouble();
						GSMPplaceRoomProcedure.execute(world, localCurrentCoords.get("x").getAsDouble(), localCurrentCoords.get("y").getAsDouble(), localCurrentCoords.get("z").getAsDouble(), workingRoomPick, workingDirection + "");
						lastGeneratedStructure = workingRoomPick;
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76Room coords: \u00A7lX: " + (localFilledSpaces.get("x").getAsDouble() + ""
									+ (" Y: " + (localFilledSpaces.get("y").getAsDouble() + "" + (localFilledSpaces.get("y").getAsDouble() + "" + (" Z: " + localFilledSpaces.get("z").getAsDouble()))))))), false);
					}
				}
			}
		}
	}
}