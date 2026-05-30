package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StoreGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof StoreGUIMenu) {
			if (entity instanceof Player _player && _player.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(Items.WOODEN_PICKAXE).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(0).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.SMALL_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(1).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.RUSTY_PICKAXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(2).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.OLD_KNIFE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(3).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.FIRE_AXE.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(4).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.FLINTLOCK_PISTOL.get()).copy();
				_setstack.setCount(1);
				_menu.getSlots().get(5).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}