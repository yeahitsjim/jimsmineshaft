package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;

import javax.annotation.Nullable;

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
		double currentSavedBranchCount = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double branchOddsGambling = 0;
		double gambling1 = 0;
		double letsGoGambling = 0;
		double localVariantTokens = 0;
		com.google.gson.JsonObject returnedCoordJSON = new com.google.gson.JsonObject();
		com.google.gson.JsonObject returnedPickRoomJSON = new com.google.gson.JsonObject();
		com.google.gson.JsonObject localFilledSpaces = new com.google.gson.JsonObject();
		com.google.gson.JsonObject localCurrentCoords = new com.google.gson.JsonObject();
		if (JimsmineshaftModItems.WOE_MINESHAFT_BE_UPON_THE_2.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			currentSavedBranchCount = 0;
			localFilledSpaces.addProperty("x", x);
			localFilledSpaces.addProperty("y", (y - 48));
			localFilledSpaces.addProperty("z", z);
			returnedPickRoomJSON.addProperty("workingRoomPick", "null");
			JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining = 25;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).levelTokens = 25;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).variantTokens = 3;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
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
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining) {
				if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelTokens) {
					while (JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining > 0) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76==============New Room=============="), false);
						if (currentSavedBranchCount >= 4) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Branch cap reached, returning to 1st branch. Coords: X: "), false);
						}
						JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining = JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining - 1;
						JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
						JimsmineshaftModVariables.MapVariables.get(world).levelTokens = JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining - 1;
						JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
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
										currentSavedBranchCount = currentSavedBranchCount + 1;
										if (currentSavedBranchCount == 0) {
											localFilledSpaces.remove("x");
											localFilledSpaces.addProperty("x", localCurrentCoords.get("x").getAsDouble());
											localFilledSpaces.remove("y");
											localFilledSpaces.addProperty("y", localCurrentCoords.get("y").getAsDouble());
											localFilledSpaces.remove("z");
											localFilledSpaces.addProperty("z", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											localFilledSpaces.remove("workingDirection");
											localFilledSpaces.addProperty("workingDirection", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											localFilledSpaces.remove("currentDirection");
											localFilledSpaces.addProperty("currentDirection", stringCurrentDirection);
											localFilledSpaces.remove("lastGeneratedStructure");
											localFilledSpaces.addProperty("lastGeneratedStructure", lastGeneratedStructure);
											localFilledSpaces.remove("currentVariant");
											localFilledSpaces.addProperty("currentVariant", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											localFilledSpaces.remove("levelTokens");
											localFilledSpaces.addProperty("levelTokens", JimsmineshaftModVariables.MapVariables.get(world).levelTokens);
											localFilledSpaces.remove("variantTokens");
											localFilledSpaces.addProperty("variantTokens", localVariantTokens);
											localFilledSpaces.remove("totalTokensRemaining");
											localFilledSpaces.addProperty("totalTokensRemaining", JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining);
										}
										if (currentSavedBranchCount == 1) {
											localFilledSpaces.remove("x");
											localFilledSpaces.addProperty("x", localCurrentCoords.get("x").getAsDouble());
											localFilledSpaces.remove("y");
											localFilledSpaces.addProperty("y", localCurrentCoords.get("y").getAsDouble());
											localFilledSpaces.remove("z");
											localFilledSpaces.addProperty("z", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											localFilledSpaces.remove("workingDirection");
											localFilledSpaces.addProperty("workingDirection", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											localFilledSpaces.remove("currentDirection");
											localFilledSpaces.addProperty("currentDirection", stringCurrentDirection);
											localFilledSpaces.remove("lastGeneratedStructure");
											localFilledSpaces.addProperty("lastGeneratedStructure", lastGeneratedStructure);
											localFilledSpaces.remove("currentVariant");
											localFilledSpaces.addProperty("currentVariant", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											localFilledSpaces.remove("levelTokens");
											localFilledSpaces.addProperty("levelTokens", JimsmineshaftModVariables.MapVariables.get(world).levelTokens);
											localFilledSpaces.remove("variantTokens");
											localFilledSpaces.addProperty("variantTokens", localVariantTokens);
											localFilledSpaces.remove("totalTokensRemaining");
											localFilledSpaces.addProperty("totalTokensRemaining", JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining);
										}
										if (currentSavedBranchCount == 2) {
											localFilledSpaces.remove("x");
											localFilledSpaces.addProperty("x", localCurrentCoords.get("x").getAsDouble());
											localFilledSpaces.remove("y");
											localFilledSpaces.addProperty("y", localCurrentCoords.get("y").getAsDouble());
											localFilledSpaces.remove("z");
											localFilledSpaces.addProperty("z", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											localFilledSpaces.remove("workingDirection");
											localFilledSpaces.addProperty("workingDirection", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											localFilledSpaces.remove("currentDirection");
											localFilledSpaces.addProperty("currentDirection", stringCurrentDirection);
											localFilledSpaces.remove("lastGeneratedStructure");
											localFilledSpaces.addProperty("lastGeneratedStructure", lastGeneratedStructure);
											localFilledSpaces.remove("currentVariant");
											localFilledSpaces.addProperty("currentVariant", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											localFilledSpaces.remove("levelTokens");
											localFilledSpaces.addProperty("levelTokens", JimsmineshaftModVariables.MapVariables.get(world).levelTokens);
											localFilledSpaces.remove("variantTokens");
											localFilledSpaces.addProperty("variantTokens", localVariantTokens);
											localFilledSpaces.remove("totalTokensRemaining");
											localFilledSpaces.addProperty("totalTokensRemaining", JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining);
										}
										if (currentSavedBranchCount == 3) {
											localFilledSpaces.remove("x");
											localFilledSpaces.addProperty("x", localCurrentCoords.get("x").getAsDouble());
											localFilledSpaces.remove("y");
											localFilledSpaces.addProperty("y", localCurrentCoords.get("y").getAsDouble());
											localFilledSpaces.remove("z");
											localFilledSpaces.addProperty("z", localCurrentCoords.get("z").getAsDouble());
											stringWorkingDirection = workingDirection + "";
											localFilledSpaces.remove("workingDirection");
											localFilledSpaces.addProperty("workingDirection", stringWorkingDirection);
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											localFilledSpaces.remove("currentDirection");
											localFilledSpaces.addProperty("currentDirection", stringCurrentDirection);
											localFilledSpaces.remove("lastGeneratedStructure");
											localFilledSpaces.addProperty("lastGeneratedStructure", lastGeneratedStructure);
											localFilledSpaces.remove("currentVariant");
											localFilledSpaces.addProperty("currentVariant", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											localFilledSpaces.remove("levelTokens");
											localFilledSpaces.addProperty("levelTokens", JimsmineshaftModVariables.MapVariables.get(world).levelTokens);
											localFilledSpaces.remove("variantTokens");
											localFilledSpaces.addProperty("variantTokens", localVariantTokens);
											localFilledSpaces.remove("totalTokensRemaining");
											localFilledSpaces.addProperty("totalTokensRemaining", JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining);
										}
										if (currentSavedBranchCount == 4) {
											localFilledSpaces.remove("x");
											localFilledSpaces.addProperty("x", localCurrentCoords.get("x").getAsDouble());
											localFilledSpaces.remove("y");
											localFilledSpaces.addProperty("y", localCurrentCoords.get("y").getAsDouble());
											localFilledSpaces.remove("z");
											localFilledSpaces.addProperty("z", localCurrentCoords.get("z").getAsDouble());
											localFilledSpaces.remove("workingDirection");
											stringWorkingDirection = workingDirection + "";
											localFilledSpaces.addProperty("workingDirection", stringWorkingDirection);
											localFilledSpaces.remove("currentDirection");
											stringCurrentDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection + "";
											localFilledSpaces.addProperty("currentDirection", stringCurrentDirection);
											localFilledSpaces.remove("lastGeneratedStructure");
											localFilledSpaces.addProperty("lastGeneratedStructure", lastGeneratedStructure);
											localFilledSpaces.remove("currentVariant");
											localFilledSpaces.addProperty("currentVariant", JimsmineshaftModVariables.MapVariables.get(world).currentVariant);
											localFilledSpaces.remove("levelTokens");
											localFilledSpaces.addProperty("levelTokens", JimsmineshaftModVariables.MapVariables.get(world).levelTokens);
											localFilledSpaces.remove("variantTokens");
											localFilledSpaces.addProperty("variantTokens", localVariantTokens);
											localFilledSpaces.remove("totalTokensRemaining");
											localFilledSpaces.addProperty("totalTokensRemaining", JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining);
										}
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
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(
									Component.literal(("\u00A76\u00A7ISetting working coords to: X: " + (new java.text.DecimalFormat("##.##").format(localFilledSpaces.get("x").getAsDouble()) + ""
											+ (" Y: "
													+ (new java.text.DecimalFormat("##.##").format(localFilledSpaces.get("y").getAsDouble()) + "" + (" Z: " + new java.text.DecimalFormat("##.##").format(localFilledSpaces.get("z").getAsDouble()))))))),
									false);
						localCurrentCoords.remove("x");
						localCurrentCoords.remove("y");
						localCurrentCoords.remove("z");
						localCurrentCoords.addProperty("x", localFilledSpaces.get("x").getAsDouble());
						localCurrentCoords.addProperty("y", localFilledSpaces.get("y").getAsDouble());
						localCurrentCoords.addProperty("z", localFilledSpaces.get("z").getAsDouble());
						localCurrentDirection = workingDirection;
						letsGoGambling = 1;
						selectedRoom = "null";
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76\u00A7IRoom I am sending to pickroom: " + lastGeneratedStructure)), false);
						returnedPickRoomJSON = GSMPpickRoomProcedure.execute(world, JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit, JimsmineshaftModVariables.MapVariables.get(world).variantTokens, localCurrentVariant,
								lastGeneratedStructure);
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76\u00A7IRoom picked from returned JSON: " + returnedPickRoomJSON.get("workingRoomPick").getAsString())), false);
						workingRoomPick = returnedPickRoomJSON.get("workingRoomPick").getAsString();
						GSMPplaceRoomProcedure.execute(world, localCurrentCoords.get("x").getAsDouble(), localCurrentCoords.get("y").getAsDouble(), localCurrentCoords.get("z").getAsDouble(), workingRoomPick, workingDirection + "");
						lastGeneratedStructure = workingRoomPick;
					}
				}
			}
		}
	}
}