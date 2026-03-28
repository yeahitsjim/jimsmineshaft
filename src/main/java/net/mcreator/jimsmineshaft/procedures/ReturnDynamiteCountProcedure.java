package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;

public class ReturnDynamiteCountProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (JimsmineshaftModItems.DYNAMITE_BOX.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			return "Box count: " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("count"));
		}
		return " ";
	}
}