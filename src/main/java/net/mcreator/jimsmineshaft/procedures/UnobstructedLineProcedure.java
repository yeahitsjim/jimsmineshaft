package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class UnobstructedLineProcedure {
	public static boolean execute(LevelAccessor world, double endX, double endY, double endZ, double startX, double startY, double startZ) {
		double trailStartX = 0;
		double trailStartY = 0;
		double trailStartZ = 0;
		double trailEndX = 0;
		double trailEndY = 0;
		double trailEndZ = 0;
		double trailCurrentX = 0;
		double trailCurrentY = 0;
		double trailCurrentZ = 0;
		double trailA = 0;
		double repeats = 0;
		trailStartX = startX;
		trailStartY = startY;
		trailStartZ = startZ;
		trailEndX = endX;
		trailEndY = endY;
		trailEndZ = endZ;
		trailA = 0;
		repeats = Math.round(Math.sqrt(Math.pow(trailStartX - trailEndX, 2) + Math.pow(trailStartY - trailEndY, 2) + Math.pow(trailStartZ - trailEndZ, 2)) * 4);
		for (int index0 = 0; index0 < (int) repeats; index0++) {
			trailCurrentX = trailStartX + (trailEndX - trailStartX) * trailA;
			trailCurrentY = trailStartY + (trailEndY - trailStartY) * trailA;
			trailCurrentZ = trailStartZ + (trailEndZ - trailStartZ) * trailA;
			if (world.getBlockState(BlockPos.containing(trailCurrentX, trailCurrentY, trailCurrentZ)).canOcclude()) {
				return false;
			}
			trailA = trailA + 1 / repeats;
		}
		return true;
	}
}