package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class GunDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JimsmineshaftModItems.DELETED_MOD_ELEMENT.get();
	}
}