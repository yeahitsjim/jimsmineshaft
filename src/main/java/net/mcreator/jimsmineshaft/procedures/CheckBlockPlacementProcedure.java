package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CheckBlockPlacementProcedure {
	public static com.google.gson.JsonObject execute(LevelAccessor world, double x_pass2, double y_pass2, double z_pass2, String CBP_direction) {
		if (CBP_direction == null)
			return new com.google.gson.JsonObject();
		com.google.gson.JsonObject spaceJSON = new com.google.gson.JsonObject();
		Direction currentDirection = Direction.NORTH;
		double currentX = 0;
		double currentY = 0;
		double currentZ = 0;
		double fx = 0;
		double fy = 0;
		double fz = 0;
		spaceJSON.addProperty("canPlaceBit", true);
		spaceJSON.addProperty("canPlaceShaft", true);
		spaceJSON.addProperty("canPlaceMainShaft", true);
		spaceJSON.addProperty("canPlaceSRoom", true);
		spaceJSON.addProperty("canPlaceMRoom", true);
		spaceJSON.addProperty("canPlaceLRoom", true);
		spaceJSON.addProperty("canPlaceSElevator", true);
		spaceJSON.addProperty("canPlaceMElevator", true);
		spaceJSON.addProperty("canPlaceLElevator", true);
		currentX = x_pass2;
		currentY = y_pass2;
		currentZ = z_pass2;
		fx = x_pass2;
		fy = y_pass2;
		fz = z_pass2;
		if ((CBP_direction).equals("east")) {
			currentDirection = Direction.EAST;
		}
		if ((CBP_direction).equals("north")) {
			currentDirection = Direction.NORTH;
		}
		if ((CBP_direction).equals("north")) {
			currentDirection = Direction.NORTH;
		}
		if ((CBP_direction).equals("west")) {
			currentDirection = Direction.WEST;
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(("\u00A74We get here. Coords: " + (currentX + "" + ("\u00A74 y: " + (currentY + "" + ("\u00A74 z: " + (currentZ + "" + ("\u00A74 Direction: " + CBP_direction)))))))), false);
		if (Direction.EAST == currentDirection) {
			if (currentX + 21 >= fx) {
				fx = fx + 1;
				if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
					if (currentX + 5 >= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (east)"), false);
						spaceJSON.addProperty("canPlaceBit", false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceMainShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (currentX + 21 >= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (east)"), false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (currentX + 42 >= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (east)"), false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (currentX + 64 >= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (east)"), false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
				}
				if (fz + 64 >= currentZ) {
					fz = fz + 1;
					if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
						if (fz + 5 >= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (east z)"), false);
							spaceJSON.addProperty("canPlaceBit", false);
							spaceJSON.addProperty("canPlaceShaft", false);
							spaceJSON.addProperty("canPlaceSRoom", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz + 12 >= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 12 (east z)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz + 21 >= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (east z)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz + 42 >= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (east z)"), false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz + 64 >= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (east z)"), false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
					}
					if (currentY + 5 >= fy) {
						currentY = currentY + 5;
						if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
							if (currentY + 5 >= fy) {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (east y)"), false);
								spaceJSON.addProperty("canPlaceBit", false);
								spaceJSON.addProperty("canPlaceShaft", false);
								spaceJSON.addProperty("canPlaceMainShaft", false);
								spaceJSON.addProperty("canPlaceSRoom", false);
								spaceJSON.addProperty("canPlaceMRoom", false);
								spaceJSON.addProperty("canPlaceLRoom", false);
								spaceJSON.addProperty("canPlaceSElevator", false);
								spaceJSON.addProperty("canPlaceMElevator", false);
								spaceJSON.addProperty("canPlaceLElevator", false);
							}
						}
					}
				}
			}
		}
		if (Direction.NORTH == currentDirection) {
			if (currentZ - 21 <= fz) {
				fz = fz - 1;
				if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
					if (fz - 5 <= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (north z)"), false);
						spaceJSON.addProperty("canPlaceBit", false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceMainShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (fz - 21 <= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (north z)"), false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (fz - 42 <= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (north z)"), false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (fz - 64 <= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (north z)"), false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
				}
				if (fx + 64 >= fx) {
					fx = fx + 1;
					if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
						if (fx + 5 >= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (north x)"), false);
							spaceJSON.addProperty("canPlaceBit", false);
							spaceJSON.addProperty("canPlaceShaft", false);
							spaceJSON.addProperty("canPlaceSRoom", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx + 12 >= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 12 (north x)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx + 21 >= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (north x)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx + 42 >= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (north x)"), false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx + 64 >= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (north x)"), false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
					}
					if (currentY + 5 >= fy) {
						currentY = currentY + 5;
						if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
							if (currentY + 5 >= fy) {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (north y)"), false);
								spaceJSON.addProperty("canPlaceBit", false);
								spaceJSON.addProperty("canPlaceShaft", false);
								spaceJSON.addProperty("canPlaceMainShaft", false);
								spaceJSON.addProperty("canPlaceSRoom", false);
								spaceJSON.addProperty("canPlaceMRoom", false);
								spaceJSON.addProperty("canPlaceLRoom", false);
								spaceJSON.addProperty("canPlaceSElevator", false);
								spaceJSON.addProperty("canPlaceMElevator", false);
								spaceJSON.addProperty("canPlaceLElevator", false);
							}
						}
					}
				}
			}
		}
		if (Direction.WEST == currentDirection) {
			if (currentX - 21 <= fx) {
				fx = fx - 1;
				if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
					if (currentX + 5 >= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (west x)"), false);
						spaceJSON.addProperty("canPlaceBit", false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceMainShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (currentX - 21 <= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (west x)"), false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (currentX - 42 <= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (west x)"), false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (currentX - 64 <= fx) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (west x)"), false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
				}
				if (fz - 64 <= currentZ) {
					fz = fz - 1;
					if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
						if (fz - 5 <= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (west z)"), false);
							spaceJSON.addProperty("canPlaceBit", false);
							spaceJSON.addProperty("canPlaceShaft", false);
							spaceJSON.addProperty("canPlaceSRoom", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz - 12 <= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 12 (west z)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz - 21 <= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (west z)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz - 42 <= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (west z)"), false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fz - 64 <= fz) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (west z)"), false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
					}
					if (currentY + 5 >= fy) {
						currentY = currentY + 5;
						if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
							if (currentY + 5 >= fy) {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 6 (west y)"), false);
								spaceJSON.addProperty("canPlaceBit", false);
								spaceJSON.addProperty("canPlaceShaft", false);
								spaceJSON.addProperty("canPlaceMainShaft", false);
								spaceJSON.addProperty("canPlaceSRoom", false);
								spaceJSON.addProperty("canPlaceMRoom", false);
								spaceJSON.addProperty("canPlaceLRoom", false);
								spaceJSON.addProperty("canPlaceSElevator", false);
								spaceJSON.addProperty("canPlaceMElevator", false);
								spaceJSON.addProperty("canPlaceLElevator", false);
							}
						}
					}
				}
			}
		}
		if (Direction.SOUTH == currentDirection) {
			if (currentZ + 21 >= fz) {
				fz = fz + 1;
				if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
					if (fz + 5 >= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (south z)"), false);
						spaceJSON.addProperty("canPlaceBit", false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceMainShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (fz + 21 >= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (south z)"), false);
						spaceJSON.addProperty("canPlaceShaft", false);
						spaceJSON.addProperty("canPlaceSRoom", false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceSElevator", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (fz + 42 >= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (south z)"), false);
						spaceJSON.addProperty("canPlaceMRoom", false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceMElevator", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
					if (fz + 64 >= fz) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (south z)"), false);
						spaceJSON.addProperty("canPlaceLRoom", false);
						spaceJSON.addProperty("canPlaceLElevator", false);
					}
				}
				if (fx - 64 <= fx) {
					fx = fx - 1;
					if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
						if (fx - 5 <= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (south x)"), false);
							spaceJSON.addProperty("canPlaceBit", false);
							spaceJSON.addProperty("canPlaceShaft", false);
							spaceJSON.addProperty("canPlaceSRoom", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx - 12 <= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 12 (south x)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx - 21 <= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 21 (south x)"), false);
							spaceJSON.addProperty("canPlaceMainShaft", false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceSElevator", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx - 42 <= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 42 (south x)"), false);
							spaceJSON.addProperty("canPlaceMRoom", false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceMElevator", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
						if (fx - 64 <= fx) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 64 (south x)"), false);
							spaceJSON.addProperty("canPlaceLRoom", false);
							spaceJSON.addProperty("canPlaceLElevator", false);
						}
					}
					if (currentY + 5 >= fy) {
						currentY = currentY + 5;
						if (getBlockNBTLogic(world, BlockPos.containing(fx, fy, fz), "placed")) {
							if (currentY + 5 >= fy) {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Restricting build sub 5 (south y)"), false);
								spaceJSON.addProperty("canPlaceBit", false);
								spaceJSON.addProperty("canPlaceShaft", false);
								spaceJSON.addProperty("canPlaceMainShaft", false);
								spaceJSON.addProperty("canPlaceSRoom", false);
								spaceJSON.addProperty("canPlaceMRoom", false);
								spaceJSON.addProperty("canPlaceLRoom", false);
								spaceJSON.addProperty("canPlaceSElevator", false);
								spaceJSON.addProperty("canPlaceMElevator", false);
								spaceJSON.addProperty("canPlaceLElevator", false);
							}
						}
					}
				}
			}
		}
		return spaceJSON;
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBoolean(tag);
		return false;
	}
}