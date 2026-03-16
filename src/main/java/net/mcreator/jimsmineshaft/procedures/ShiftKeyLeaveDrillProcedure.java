package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModEntities;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

public class ShiftKeyLeaveDrillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerDrillMode) {
			if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerIsDrilling == false) {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.playerDrillMode = false;
					_vars.syncPlayerVariables(entity);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JimsmineshaftModEntities.PRESSURE_DRILL.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot() + 90);
						entityToSpawn.setYBodyRot(entity.getYRot() + 90);
						entityToSpawn.setYHeadRot(entity.getYRot() + 90);
						entityToSpawn.setXRot(entity.getXRot());
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.playerIsDrilling = false;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}