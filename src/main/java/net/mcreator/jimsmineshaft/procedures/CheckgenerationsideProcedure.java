package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class CheckgenerationsideProcedure {
	public static Direction execute(LevelAccessor world) {
		boolean isEndBit = false;
		Direction usableDirection = Direction.NORTH;
		JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = false;
		JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit1")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit2")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit3")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit4")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit1")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit2")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit3")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit4")) {
			if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
				JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit = true;
				JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (true == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("CheckGeneration Room is a bit. Rotating 90"), false);
			usableDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection.getClockWise(Direction.Axis.Y);
			return usableDirection;
		}
		if (false == JimsmineshaftModVariables.MapVariables.get(world).workingRoomIsBit) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("CheckGeneration Room is NOT a bit. Returning the CurrentDirection"), false);
			usableDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection;
			return usableDirection;
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("BOTTOM DIRECTION ERROR"), false);
		return JimsmineshaftModVariables.MapVariables.get(world).currentDirection;
	}
}