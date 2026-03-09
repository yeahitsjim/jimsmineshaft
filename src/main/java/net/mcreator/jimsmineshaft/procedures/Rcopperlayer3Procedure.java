package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class Rcopperlayer3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof CopperDrilledNorthEntity _datEntI ? _datEntI.getEntityData().get(CopperDrilledNorthEntity.DATA_SkinID) : 0) == 3;
	}
}