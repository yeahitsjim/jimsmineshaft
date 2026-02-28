package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class ExplosioncodeProcedure {
	public static void execute(LevelAccessor world, double passX, double passY, double passZ) {
		double coordX = 0;
		double coordY = 0;
		double coordZ = 0;
		double fx = 0;
		double fy = 0;
		double fz = 0;
		coordX = passX;
		coordY = passY;
		coordZ = passZ;
		fx = passX - 4;
		fy = passY - 4;
		fz = passZ - 4;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, coordX, coordY, coordZ, 4, Level.ExplosionInteraction.TNT);
	}
}