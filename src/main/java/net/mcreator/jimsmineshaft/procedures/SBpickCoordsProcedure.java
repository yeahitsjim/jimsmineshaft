package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SBpickCoordsProcedure {
	public static void execute(LevelAccessor world, double SB_x, double SB_y, double SB_z, String SB_currentDirection, String SB_lastGen, String SB_wDirection) {
		if (SB_currentDirection == null || SB_lastGen == null || SB_wDirection == null)
			return;
		boolean repeatRoom = false;
		boolean workingDirectionChangeBoolean = false;
		double currentSavedBranchCount = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double branchOddsGambling = 0;
		double gambling1 = 0;
		double letsGoGambling = 0;
		double localVariantTokens = 0;
		double pc_currentx = 0;
		double pc_currenty = 0;
		double pc_currentz = 0;
		Direction workingDirection = Direction.NORTH;
		Direction localCurrentDirection = Direction.NORTH;
		Direction pc_currentDirection = Direction.NORTH;
		String stringWorkingDirection = "";
		String workingRoomPick = "";
		String localLastGeneratedStructure = "";
		String stringCurrentDirection = "";
		String selectedRoom = "";
		String localCurrentVariant = "";
		com.google.gson.JsonObject pc_filledSpaces = new com.google.gson.JsonObject();
		JimsmineshaftModVariables.filledSpaces.addProperty("x", SB_x);
		JimsmineshaftModVariables.filledSpaces.addProperty("y", SB_y);
		JimsmineshaftModVariables.filledSpaces.addProperty("z", SB_z);
		pc_filledSpaces.addProperty("x", SB_x);
		pc_filledSpaces.addProperty("y", SB_y);
		pc_filledSpaces.addProperty("z", SB_z);
		pc_currentx = SB_x;
		pc_currenty = SB_y;
		pc_currentz = SB_z;
		localLastGeneratedStructure = SB_lastGen;
		if ((SB_currentDirection).equals("north")) {
			pc_currentDirection = Direction.NORTH;
		}
		if ((SB_currentDirection).equals("east")) {
			pc_currentDirection = Direction.EAST;
		}
		if ((SB_currentDirection).equals("west")) {
			pc_currentDirection = Direction.WEST;
		}
		if ((SB_currentDirection).equals("south")) {
			pc_currentDirection = Direction.SOUTH;
		}
		if ((SB_wDirection).equals("north")) {
			workingDirection = Direction.NORTH;
		}
		if ((SB_wDirection).equals("east")) {
			workingDirection = Direction.EAST;
		}
		if ((SB_wDirection).equals("west")) {
			workingDirection = Direction.WEST;
		}
		if ((SB_wDirection).equals("south")) {
			workingDirection = Direction.SOUTH;
		}
		if ((localLastGeneratedStructure).equals("variantbbit1")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantbbit2")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantbbit3")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantbbit4")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantcbit1")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == JimsmineshaftModVariables.MapVariables.get(world).currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantcbit2")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.DOWN == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentz + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantcbit3")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantcbit4")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 5));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.DOWN == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 5));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 5));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("mainelevator")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("y");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				pc_filledSpaces.addProperty("y", pc_currenty);
				pc_filledSpaces.addProperty("z", (pc_currentz - 14));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("y");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("x", (pc_currentx - 14));
				pc_filledSpaces.addProperty("y", (pc_currenty - 0));
				pc_filledSpaces.addProperty("z", (pc_currentz - 1));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("y");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				pc_filledSpaces.addProperty("y", (pc_currenty - 0));
				pc_filledSpaces.addProperty("z", (pc_currentz + 14));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("y");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("x", (pc_currentx + 14));
				pc_filledSpaces.addProperty("y", (pc_currenty - 0));
				pc_filledSpaces.addProperty("z", (pc_currentz + 1));
			}
		}
		if ((localLastGeneratedStructure).equals("variantabitmain")) {
			if (Direction.NORTH == workingDirection) {
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 12));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 12));
				}
				if (Direction.DOWN == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 1));
				}
			}
			if (Direction.WEST == workingDirection) {
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 12));
				}
				if (Direction.SOUTH == localCurrentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 12));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 12));
				}
				if (Direction.NORTH == localCurrentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx - 1));
				}
			}
			if (Direction.SOUTH == workingDirection) {
				if (Direction.SOUTH == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 12));
				}
				if (Direction.WEST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 1));
				}
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz + 12));
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 12));
				}
			}
			if (Direction.EAST == workingDirection) {
				if (Direction.EAST == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 12));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 12));
					pc_filledSpaces.remove("z");
					pc_filledSpaces.addProperty("z", (pc_currentz - 12));
				}
				if (Direction.NORTH == pc_currentDirection) {
					pc_filledSpaces.remove("x");
					pc_filledSpaces.addProperty("x", (pc_currentx + 1));
				}
			}
		}
		if ((localLastGeneratedStructure).equals("variantashaftmain")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 20));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 20));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 20));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 20));
			}
		}
		if ((localLastGeneratedStructure).equals("variantashaftmainnonlit")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 20));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 20));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 20));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 20));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbshaft1")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbshaft2")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbshaft3")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.DOWN == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbshaft4")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbshaft5")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantcshaft1")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantcshaft1")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantcshaft2")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantcshaft3")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantcshaft4")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantcshaft5")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbroom1")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
				pc_filledSpaces.addProperty("x", (pc_currentx + 1));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
				pc_filledSpaces.addProperty("z", (pc_currentz - 1));
			}
			if (Direction.SOUTH == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
				pc_filledSpaces.addProperty("x", (pc_currentx - 1));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
				pc_filledSpaces.addProperty("z", (pc_currentz + 1));
			}
		}
		if ((localLastGeneratedStructure).equals("variantbroom2")) {
			if (Direction.NORTH == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("z", (pc_currentz - 21));
				pc_filledSpaces.addProperty("x", (pc_currentx + 1));
			}
			if (Direction.WEST == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("x", (pc_currentx - 21));
				pc_filledSpaces.addProperty("z", (pc_currentz - 1));
			}
			if (Direction.DOWN == workingDirection) {
				pc_filledSpaces.remove("z");
				pc_filledSpaces.remove("x");
				pc_filledSpaces.addProperty("z", (pc_currentz + 21));
				pc_filledSpaces.addProperty("x", (pc_currentx - 1));
			}
			if (Direction.EAST == workingDirection) {
				pc_filledSpaces.remove("x");
				pc_filledSpaces.remove("z");
				pc_filledSpaces.addProperty("x", (pc_currentx + 21));
				pc_filledSpaces.addProperty("z", (pc_currentz + 1));
			}
		}
		JimsmineshaftModVariables.filledSpaces.addProperty("x", pc_filledSpaces.get("x").getAsDouble());
		JimsmineshaftModVariables.filledSpaces.addProperty("y", pc_filledSpaces.get("y").getAsDouble());
		JimsmineshaftModVariables.filledSpaces.addProperty("z", pc_filledSpaces.get("z").getAsDouble());
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.COMPOSTER, pc_filledSpaces.get("x").getAsDouble(), pc_filledSpaces.get("y").getAsDouble(), pc_filledSpaces.get("z").getAsDouble(), 50, 0.2, 0.2, 0.2, 1);
	}
}