package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class FlashlightItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		{
			final String _tagName = "inhand";
			final double _tagValue = 1;
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
		}
	}
}