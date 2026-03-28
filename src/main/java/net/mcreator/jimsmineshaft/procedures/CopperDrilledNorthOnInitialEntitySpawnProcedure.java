package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.entity.CopperDrilledNorthEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class CopperDrilledNorthOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		JimsmineshaftMod.queueServerWork(106, () -> {
			if (entity instanceof CopperDrilledNorthEntity _datEntSetI)
				_datEntSetI.getEntityData().set(CopperDrilledNorthEntity.DATA_SkinID, 3);
		});
	}
}