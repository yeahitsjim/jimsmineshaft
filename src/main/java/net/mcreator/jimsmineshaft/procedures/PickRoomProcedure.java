package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class PickRoomProcedure {
	public static String execute(LevelAccessor world) {
		com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();
		String selectedRoom = "";
		boolean repeatRoom = false;
		double letsGoGambling = 0;
		double variantGambling = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double gambling1 = 0;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Pickroom called"), false);
		letsGoGambling = 1;
		selectedRoom = "null";
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Starting VariantTokens: " + new java.text.DecimalFormat("##").format(JimsmineshaftModVariables.MapVariables.get(world).variantTokens))), false);
		if (JimsmineshaftModVariables.MapVariables.get(world).variantTokens > 0) {
			JimsmineshaftModVariables.MapVariables.get(world).variantTokens = JimsmineshaftModVariables.MapVariables.get(world).variantTokens - 1;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			if (JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit == true) {
				if (("a").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
					if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantabitmain")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 2);
						if (1 == letsGoGambling) {
							selectedRoom = "variantashaftmain";
							return selectedRoom;
						}
						if (2 == letsGoGambling) {
							selectedRoom = "variantashaftmainnonlit";
							return selectedRoom;
						}
					}
					if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantabitmain")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 2);
						if (1 == letsGoGambling) {
							selectedRoom = "variantashaftmain";
							return selectedRoom;
						}
						if (1 == letsGoGambling) {
							selectedRoom = "variantashaftmainnonlit";
							return selectedRoom;
						}
					}
				}
				if (("b").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
					if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit4")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 5);
						if (1 == letsGoGambling) {
							selectedRoom = "variantbshaft1";
							return selectedRoom;
						}
						if (2 == letsGoGambling) {
							selectedRoom = "variantbshaft2";
							return selectedRoom;
						}
						if (3 == letsGoGambling) {
							selectedRoom = "variantbshaft3";
							return selectedRoom;
						}
						if (4 == letsGoGambling) {
							selectedRoom = "variantbshaft4";
							return selectedRoom;
						}
						if (5 == letsGoGambling) {
							selectedRoom = "variantbshaft5";
							return selectedRoom;
						}
					}
				}
				if (("c").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
					if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit4")) {
						letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 5);
						if (1 == letsGoGambling) {
							selectedRoom = "variantcshaft1";
							return selectedRoom;
						}
						if (2 == letsGoGambling) {
							selectedRoom = "variantcshaft2";
							return selectedRoom;
						}
						if (3 == letsGoGambling) {
							selectedRoom = "variantcshaft3";
							return selectedRoom;
						}
						if (4 == letsGoGambling) {
							selectedRoom = "variantcshaft4";
							return selectedRoom;
						}
						if (5 == letsGoGambling) {
							selectedRoom = "variantcshaft5";
							return selectedRoom;
						}
					}
				}
			}
			repeatGambling = Mth.nextInt(RandomSource.create(), 1, 10);
			roomPickGambling = Mth.nextInt(RandomSource.create(), 1, 5);
			gambling1 = Mth.nextInt(RandomSource.create(), 1, 2);
			if (4 <= repeatGambling) {
				repeatRoom = true;
				return JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure;
			} else {
				if (("a").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
					if (1 == gambling1) {
						return "variantashaftmain";
					}
					if (2 == gambling1) {
						return "variantashaftmainnonlit";
					}
				}
				if (("b").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
					if (1 == roomPickGambling) {
						return "variantbshaft1";
					}
					if (2 == roomPickGambling) {
						return "variantbshaft2";
					}
					if (3 == roomPickGambling) {
						return "variantbshaft3";
					}
					if (4 == roomPickGambling) {
						return "variantbshaft4";
					}
					if (5 == roomPickGambling) {
						return "variantbshaft5";
					}
				}
				if (("c").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
					if (1 == roomPickGambling) {
						return "variantcshaft1";
					}
					if (2 == roomPickGambling) {
						return "variantcshaft2";
					}
					if (3 == roomPickGambling) {
						return "variantcshaft3";
					}
					if (4 == roomPickGambling) {
						return "variantcshaft4";
					}
					if (5 == roomPickGambling) {
						return "variantcshaft5";
					}
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Error in assigning room pickroom"), false);
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Error in assigning room pickroom2"), false);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Pickroom error Random assignment "), false);
		} else {
			JimsmineshaftModVariables.MapVariables.get(world).variantTokens = Mth.nextInt(RandomSource.create(), 8, 20);
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			variantGambling = Mth.nextInt(RandomSource.create(), 1, 3);
			if (1 == variantGambling) {
				JimsmineshaftModVariables.MapVariables.get(world).currentVariant = "a";
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
			if (2 == variantGambling) {
				JimsmineshaftModVariables.MapVariables.get(world).currentVariant = "b";
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
			if (3 == variantGambling) {
				JimsmineshaftModVariables.MapVariables.get(world).currentVariant = "c";
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
			repeatGambling = Mth.nextInt(RandomSource.create(), 1, 10);
			roomPickGambling = Mth.nextInt(RandomSource.create(), 1, 5);
			gambling1 = Mth.nextInt(RandomSource.create(), 1, 2);
			if (("a").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
				if (1 == gambling1) {
					return "variantashaftmain";
				}
				if (2 == gambling1) {
					return "variantashaftmainnonlit";
				}
			}
			if (("b").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
				if (1 == roomPickGambling) {
					return "variantbshaft1";
				}
				if (2 == roomPickGambling) {
					return "variantbshaft2";
				}
				if (3 == roomPickGambling) {
					return "variantbshaft3";
				}
				if (4 == roomPickGambling) {
					return "variantbshaft4";
				}
				if (5 == roomPickGambling) {
					return "variantbshaft5";
				}
			}
			if (("c").equals(JimsmineshaftModVariables.MapVariables.get(world).currentVariant)) {
				if (1 == roomPickGambling) {
					return "variantcshaft1";
				}
				if (2 == roomPickGambling) {
					return "variantcshaft2";
				}
				if (3 == roomPickGambling) {
					return "variantcshaft3";
				}
				if (4 == roomPickGambling) {
					return "variantcshaft4";
				}
				if (5 == roomPickGambling) {
					return "variantcshaft5";
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Error in assigning room pickroom after variant switch"), false);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Error occured after switching variant, unable to choose room"), false);
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Bottom Pickroom Error"), false);
		return selectedRoom;
	}
}