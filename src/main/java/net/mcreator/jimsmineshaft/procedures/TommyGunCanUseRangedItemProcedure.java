package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class TommyGunCanUseRangedItemProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("ammo") > 0;
	}
}