package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

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