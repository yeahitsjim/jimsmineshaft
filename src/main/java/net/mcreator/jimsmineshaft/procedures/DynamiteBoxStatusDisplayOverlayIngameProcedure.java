package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class DynamiteBoxStatusDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (JimsmineshaftModItems.DYNAMITE_BOX.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			return true;
		}
		return false;
	}
}