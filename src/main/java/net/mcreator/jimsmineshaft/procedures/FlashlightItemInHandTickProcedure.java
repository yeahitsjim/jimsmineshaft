package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class FlashlightItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		{
			final String _tagName = "inhand";
			final double _tagValue = 1;
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
		}
	}
}