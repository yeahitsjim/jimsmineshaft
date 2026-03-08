package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

public class GSMPpickRoomProcedure {
	public static com.google.gson.JsonObject execute(LevelAccessor world, boolean pc_localWorkingRoomIsBitpass, double pr_variantTokenspass, String pr_localCurrentVariantpass, String pr_localLastGeneratedStructurepass) {
		if (pr_localCurrentVariantpass == null || pr_localLastGeneratedStructurepass == null)
			return new com.google.gson.JsonObject();
		Direction workingDirection = Direction.NORTH;
		com.google.gson.JsonObject passedDependency = new com.google.gson.JsonObject();
		double letsGoGambling = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double gambling1 = 0;
		double localVariantTokens = 0;
		boolean repeatRoom = false;
		boolean localWorkingRoomIsBit = false;
		String workingRoomPick = "";
		String selectedRoom = "";
		String localCurrentVariant = "";
		String localLastGeneratedStructure = "";
		localVariantTokens = pr_variantTokenspass;
		localCurrentVariant = pr_localCurrentVariantpass;
		localLastGeneratedStructure = pr_localLastGeneratedStructurepass;
		localWorkingRoomIsBit = pc_localWorkingRoomIsBitpass;
		workingRoomPick = "\u00A77\u00A7onull";
		if (localVariantTokens > 0) {
			localVariantTokens = localVariantTokens - 1;
			if (true == localWorkingRoomIsBit) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oRoom identified as bit"), false);
				if (("a").equals(localCurrentVariant)) {
					if ((localLastGeneratedStructure).equals("variantabitmain")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 2);
						if (1 == letsGoGambling) {
							selectedRoom = "variantashaftmain";
							workingRoomPick = selectedRoom;
						}
						if (2 == letsGoGambling) {
							selectedRoom = "variantashaftmainnonlit";
							workingRoomPick = selectedRoom;
						}
					}
					if ((localLastGeneratedStructure).equals("variantabitmain")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 2);
						if (1 == letsGoGambling) {
							selectedRoom = "variantashaftmain";
							workingRoomPick = selectedRoom;
						}
						if (1 == letsGoGambling) {
							selectedRoom = "variantashaftmainnonlit";
							workingRoomPick = selectedRoom;
						}
					}
				}
				if (("b").equals(localCurrentVariant)) {
					if ((localLastGeneratedStructure).equals("variantbbit4")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 5);
						if (1 == letsGoGambling) {
							selectedRoom = "variantbshaft1";
							workingRoomPick = selectedRoom;
						}
						if (2 == letsGoGambling) {
							selectedRoom = "variantbshaft2";
							workingRoomPick = selectedRoom;
						}
						if (3 == letsGoGambling) {
							selectedRoom = "variantbshaft3";
							workingRoomPick = selectedRoom;
						}
						if (4 == letsGoGambling) {
							selectedRoom = "variantbshaft4";
							workingRoomPick = selectedRoom;
						}
						if (5 == letsGoGambling) {
							selectedRoom = "variantbshaft5";
							workingRoomPick = selectedRoom;
						}
					}
				}
				if (("c").equals(localCurrentVariant)) {
					if ((localLastGeneratedStructure).equals("variantcbit4")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 5);
						if (1 == letsGoGambling) {
							selectedRoom = "variantcshaft1";
							workingRoomPick = selectedRoom;
						}
						if (2 == letsGoGambling) {
							selectedRoom = "variantcshaft2";
							workingRoomPick = selectedRoom;
						}
						if (3 == letsGoGambling) {
							selectedRoom = "variantcshaft3";
							workingRoomPick = selectedRoom;
						}
						if (4 == letsGoGambling) {
							selectedRoom = "variantcshaft4";
							workingRoomPick = selectedRoom;
						}
						if (5 == letsGoGambling) {
							selectedRoom = "variantcshaft5";
							workingRoomPick = selectedRoom;
						}
					}
				}
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oRoom not identified as bit. Last Room: " + localLastGeneratedStructure)), false);
				repeatGambling = Mth.nextInt(RandomSource.create(), 1, 10);
				if (("mainelevator").equals(localLastGeneratedStructure)) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oMain elevator detected, not repeating"), false);
					repeatGambling = 1;
				}
				roomPickGambling = Mth.nextInt(RandomSource.create(), 1, 9);
				gambling1 = Mth.nextInt(RandomSource.create(), 1, 3);
				if (4 <= repeatGambling) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oDecided to repeat"), false);
					repeatRoom = true;
					workingRoomPick = localLastGeneratedStructure;
				} else {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A77\u00A7oDecided not to repeat, picking random room from variant"), false);
					if (("a").equals(localCurrentVariant)) {
						if (1 == gambling1) {
							workingRoomPick = "variantashaftmain";
						}
						if (2 == gambling1) {
							workingRoomPick = "variantashaftmainnonlit";
						}
						if (3 == gambling1) {
							workingRoomPick = "variantabitmain";
						}
					}
					if (("b").equals(localCurrentVariant)) {
						if (1 == roomPickGambling) {
							workingRoomPick = "variantbshaft1";
						}
						if (2 == roomPickGambling) {
							workingRoomPick = "variantbshaft2";
						}
						if (3 == roomPickGambling) {
							workingRoomPick = "variantbshaft3";
						}
						if (4 == roomPickGambling) {
							workingRoomPick = "variantbshaft4";
						}
						if (5 == roomPickGambling) {
							workingRoomPick = "variantbshaft5";
						}
						if (6 == roomPickGambling) {
							workingRoomPick = "variantbbit1";
						}
						if (7 == roomPickGambling) {
							workingRoomPick = "variantbbit2";
						}
						if (8 == roomPickGambling) {
							workingRoomPick = "variantbbit3";
						}
						if (9 == roomPickGambling) {
							workingRoomPick = "variantbbit4";
						}
					}
					if (("c").equals(localCurrentVariant)) {
						if (1 == roomPickGambling) {
							workingRoomPick = "variantcshaft1";
						}
						if (2 == roomPickGambling) {
							workingRoomPick = "variantcshaft2";
						}
						if (3 == roomPickGambling) {
							workingRoomPick = "variantcshaft3";
						}
						if (4 == roomPickGambling) {
							workingRoomPick = "variantcshaft4";
						}
						if (5 == roomPickGambling) {
							workingRoomPick = "variantcshaft5";
						}
						if (6 == roomPickGambling) {
							workingRoomPick = "variantcbit1";
						}
						if (7 == roomPickGambling) {
							workingRoomPick = "variantcbit2";
						}
						if (8 == roomPickGambling) {
							workingRoomPick = "variantcbit3";
						}
						if (9 == roomPickGambling) {
							workingRoomPick = "variantcbit4";
						}
					}
				}
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7lOut of variant tokens, resetting"), false);
			localVariantTokens = Mth.nextInt(RandomSource.create(), 8, 20);
			variantGambling = Mth.nextInt(RandomSource.create(), 1, 3);
			if (1 == variantGambling) {
				localCurrentVariant = "a";
			}
			if (2 == variantGambling) {
				localCurrentVariant = "b";
			}
			if (3 == variantGambling) {
				localCurrentVariant = "c";
			}
			repeatGambling = Mth.nextInt(RandomSource.create(), 1, 10);
			roomPickGambling = Mth.nextInt(RandomSource.create(), 1, 9);
			gambling1 = Mth.nextInt(RandomSource.create(), 1, 3);
			if (("a").equals(localCurrentVariant)) {
				if (1 == gambling1) {
					workingRoomPick = "variantashaftmain";
				}
				if (2 == gambling1) {
					workingRoomPick = "variantashaftmainnonlit";
				}
				if (3 == gambling1) {
					workingRoomPick = "variantabitmain";
				}
			}
			if (("b").equals(localCurrentVariant)) {
				if (1 == roomPickGambling) {
					workingRoomPick = "variantbshaft1";
				}
				if (2 == roomPickGambling) {
					workingRoomPick = "variantbshaft2";
				}
				if (3 == roomPickGambling) {
					workingRoomPick = "variantbshaft3";
				}
				if (4 == roomPickGambling) {
					workingRoomPick = "variantbshaft4";
				}
				if (5 == roomPickGambling) {
					workingRoomPick = "variantbshaft5";
				}
				if (6 == roomPickGambling) {
					workingRoomPick = "variantbbit1";
				}
				if (7 == roomPickGambling) {
					workingRoomPick = "variantbbit2";
				}
				if (8 == roomPickGambling) {
					workingRoomPick = "variantbbit3";
				}
				if (9 == roomPickGambling) {
					workingRoomPick = "variantbbit4";
				}
			}
			if (("c").equals(localCurrentVariant)) {
				if (1 == roomPickGambling) {
					workingRoomPick = "variantcshaft1";
				}
				if (2 == roomPickGambling) {
					workingRoomPick = "variantcshaft2";
				}
				if (3 == roomPickGambling) {
					workingRoomPick = "variantcshaft3";
				}
				if (4 == roomPickGambling) {
					workingRoomPick = "variantcshaft4";
				}
				if (5 == roomPickGambling) {
					workingRoomPick = "variantcshaft5";
				}
				if (6 == roomPickGambling) {
					workingRoomPick = "variantcbit1";
				}
				if (7 == roomPickGambling) {
					workingRoomPick = "variantcbit2";
				}
				if (8 == roomPickGambling) {
					workingRoomPick = "variantcbit3";
				}
				if (9 == roomPickGambling) {
					workingRoomPick = "variantcbit4";
				}
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76Room Picked:\u00A7l " + workingRoomPick)), false);
		passedDependency.addProperty("workingRoomPick", workingRoomPick);
		passedDependency.addProperty("variantTokens", localVariantTokens);
		passedDependency.addProperty("currentVariant", localCurrentVariant);
		return passedDependency;
	}
}