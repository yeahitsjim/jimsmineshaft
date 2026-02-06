package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class CheckgenerationsideProcedure {
	public static Direction execute(LevelAccessor world) {
		boolean isEndBit = false;
		Direction usableDirection = Direction.NORTH;
		isEndBit = false;
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit1")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit2")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit3")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantbbit4")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit1")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit2")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit3")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if ((JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure).equals("variantcbit4")) {
			if (false == isEndBit) {
				isEndBit = true;
			}
		}
		if (true == isEndBit) {
			usableDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection.getClockWise(Direction.Axis.Y);
			return usableDirection;
		}
		if (false == isEndBit) {
			usableDirection = JimsmineshaftModVariables.MapVariables.get(world).currentDirection.getClockWise(Direction.Axis.Y);
			return usableDirection;
		}
		return JimsmineshaftModVariables.MapVariables.get(world).currentDirection;
	}
}