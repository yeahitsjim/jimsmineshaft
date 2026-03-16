package net.mcreator.jimsmineshaft.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.jimsmineshaft.procedures.DynamiteBoxItemIsDroppedByPlayerProcedure;

public class DynamiteBoxItem extends Item {
	public DynamiteBoxItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		DynamiteBoxItemIsDroppedByPlayerProcedure.execute(entity.level(), itemstack);
		return true;
	}
}