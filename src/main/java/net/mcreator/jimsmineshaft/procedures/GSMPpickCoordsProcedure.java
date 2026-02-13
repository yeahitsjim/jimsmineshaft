package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class GSMPpickCoordsProcedure {
	public static void execute(LevelAccessor world) {
		boolean isEndBit = false;
		boolean repeatRoom = false;
		boolean workingDirectionChangeBoolean = false;
		Direction workingDirection = Direction.NORTH;
		Direction usableDirection = Direction.NORTH;
		Direction localCurrentDirection = Direction.NORTH;
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
		double localVariantTokens = 0;
		String workingRoomPick = "";
		String selectedRoom = "";
		String stringWorkingDirection = "";
		String stringCurrentDirection = "";
		String localCurrentVariant = "";
		String localLastGeneratedStructure = "";
		com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch1 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch2 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch3 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch4 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject savedBranch5 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject passedDependency = new com.google.gson.JsonObject();
		com.google.gson.JsonObject localCurrentCoords = new com.google.gson.JsonObject();
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit1")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit2")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit3")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit4")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit1")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit2")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.DOWN == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit3")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit4")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.DOWN == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 5));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 5));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("mainelevator")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 14));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 14));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 14));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 14));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantabitmain")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 12));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 12));
				}
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 12));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 12));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
				if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				}
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 12));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 12));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 12));
					workingCoords.remove("z");
					workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 12));
				}
				if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					workingCoords.remove("x");
					workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				}
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantashaftmain")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 20));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 20));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 20));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 20));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantashaftmainnonlit")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 20));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 20));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 20));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 20));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft1")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft2")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft3")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft4")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft5")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft1")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft1")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft2")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft3")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft4")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft5")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbroom1")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
			}
			if (Direction.SOUTH == workingDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbroom2")) {
			if (Direction.NORTH == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 21));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
			}
			if (Direction.WEST == workingDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 21));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
			}
			if (Direction.DOWN == workingDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 21));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
			}
			if (Direction.EAST == workingDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 21));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76\u00A7ISetting working coords to: X: " + (new java.text.DecimalFormat("##.##").format(workingCoords.get("x").getAsDouble()) + ""
					+ (" Y: " + (new java.text.DecimalFormat("##.##").format(workingCoords.get("y").getAsDouble()) + "" + (" Z: " + new java.text.DecimalFormat("##.##").format(workingCoords.get("z").getAsDouble()))))))), false);
		JimsmineshaftModVariables.cuurentCoords.remove("x");
		JimsmineshaftModVariables.cuurentCoords.remove("y");
		JimsmineshaftModVariables.cuurentCoords.remove("z");
		JimsmineshaftModVariables.cuurentCoords.addProperty("x", workingCoords.get("x").getAsDouble());
		JimsmineshaftModVariables.cuurentCoords.addProperty("y", workingCoords.get("y").getAsDouble());
		JimsmineshaftModVariables.cuurentCoords.addProperty("z", workingCoords.get("z").getAsDouble());
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oStarting VariantTokens: " + new java.text.DecimalFormat("##").format(JimsmineshaftModVariables.MapVariables.get(world).variantTokens))), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A79\u00A7eWorking direction: " + workingDirection)), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76Room Picked:\u00A7l " + workingRoomPick)), false);
	}
}