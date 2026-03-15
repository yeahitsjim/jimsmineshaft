package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.CopperDrilledNorthEntity;

public class Rcopperlayer2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof CopperDrilledNorthEntity _datEntI ? _datEntI.getEntityData().get(CopperDrilledNorthEntity.DATA_SkinID) : 0) == 2;
	}
}