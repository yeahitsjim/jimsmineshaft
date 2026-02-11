package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class CheckGenerationCoordsProcedure {
	public static com.google.gson.JsonObject execute(LevelAccessor world) {
		boolean isEndBit = false;
		com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("CheckGenerationCoords called"), false);
		isEndBit = false;
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit1")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit2")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit3")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit4")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit1")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit2")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit3")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit4")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 6));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 6));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 6));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantabitmain")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 8));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 8));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 8));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 8));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("mainelevator")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 15));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 15));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 15));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("y");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 15));
				workingCoords.addProperty("y", (JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantashaftmain")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantashaftmainnonlit")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft1")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft2")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft3")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft4")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbshaft5")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft1")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft2")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft3")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft4")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcshaft5")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbroom1")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 22));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				return workingCoords;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbroom2")) {
			if (Direction.NORTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 22));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 1));
				return workingCoords;
			}
			if (Direction.WEST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 22));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() - 1));
				return workingCoords;
			}
			if (Direction.SOUTH == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("z");
				workingCoords.remove("x");
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 22));
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() - 1));
				return workingCoords;
			}
			if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
				workingCoords.remove("x");
				workingCoords.remove("z");
				workingCoords.addProperty("x", (JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble() + 22));
				workingCoords.addProperty("z", (JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble() + 1));
				return workingCoords;
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7c\u00A7ICheckgenerationcoords error, unable to find structure picked"), false);
		return workingCoords;
	}
}