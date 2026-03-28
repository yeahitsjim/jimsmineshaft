package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class TommyGunEntitySwingsItemProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double loaded = 0;
		if (entity.isShiftKeyDown()) {
			loaded = 0;
			for (int index0 = 0; index0 < 10; index0++) {
				if (hasEntityInInventory(entity, new ItemStack(JimsmineshaftModItems.IRON_BULLET.get())) && itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("ammo") + loaded < 60) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(JimsmineshaftModItems.IRON_BULLET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					loaded = loaded + 1;
				} else {
					break;
				}
			}
			{
				final String _tagName = "ammo";
				final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("ammo") + loaded);
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Gun contains " + Math.round(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("ammo")) + " rounds")), true);
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}