package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.component.DataComponents;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class DetonatorExplosionProcProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstackPass) {
		if (entity == null)
			return;
		ItemStack providedItemstack = ItemStack.EMPTY;
		double coord1x = 0;
		double coord2y = 0;
		double coord3z = 0;
		double coord1y = 0;
		double coord2z = 0;
		double coord1z = 0;
		double coord3x = 0;
		double coord2x = 0;
		double coord3y = 0;
		JimsmineshaftMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1x")), (itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1y")),
						(itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1z")), 8, Level.ExplosionInteraction.BLOCK);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord2x")), (itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord2y")),
						(itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord2z")), 8, Level.ExplosionInteraction.BLOCK);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord3x")), (itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord3y")),
						(itemstackPass.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord3z")), 8, Level.ExplosionInteraction.BLOCK);
		});
	}
}