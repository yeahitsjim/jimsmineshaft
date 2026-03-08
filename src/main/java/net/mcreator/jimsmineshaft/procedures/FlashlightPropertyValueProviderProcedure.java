package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class FlashlightPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("flashlightstate");
	}
}