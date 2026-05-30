package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CartGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double letsGoGambling = 0;
		JimsmineshaftMod.queueServerWork(2, () -> {
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(4).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(5).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(6).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(7).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(8).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(9).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(10).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(11).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(12).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(13).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu28 ? _menu28.getSlots().get(14).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(15).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(16).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(17).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(18).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(19).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(20).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu42 ? _menu42.getSlots().get(21).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(22).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(23).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(24).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(25).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(26).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(27).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(28).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(29).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu60 ? _menu60.getSlots().get(30).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu62 ? _menu62.getSlots().get(31).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu64 ? _menu64.getSlots().get(32).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu66 ? _menu66.getSlots().get(33).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu68 ? _menu68.getSlots().get(34).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu70 ? _menu70.getSlots().get(35).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(36).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu74 ? _menu74.getSlots().get(37).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(38).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(39).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(40).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(41).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(42).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(43).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(44).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(45).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu92 ? _menu92.getSlots().get(46).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu94 ? _menu94.getSlots().get(47).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu96 ? _menu96.getSlots().get(48).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu98 ? _menu98.getSlots().get(49).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu100 ? _menu100.getSlots().get(50).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu102 ? _menu102.getSlots().get(51).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu104 ? _menu104.getSlots().get(52).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu106 ? _menu106.getSlots().get(53).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu108 ? _menu108.getSlots().get(54).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu110 ? _menu110.getSlots().get(55).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu112 ? _menu112.getSlots().get(56).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu114 ? _menu114.getSlots().get(57).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu116 ? _menu116.getSlots().get(58).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu118 ? _menu118.getSlots().get(59).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu120 ? _menu120.getSlots().get(60).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu122 ? _menu122.getSlots().get(61).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu124 ? _menu124.getSlots().get(62).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu126 ? _menu126.getSlots().get(63).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu128 ? _menu128.getSlots().get(64).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu130 ? _menu130.getSlots().get(65).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu132 ? _menu132.getSlots().get(66).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu134 ? _menu134.getSlots().get(67).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu136 ? _menu136.getSlots().get(68).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu138 ? _menu138.getSlots().get(69).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu140 ? _menu140.getSlots().get(70).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu142 ? _menu142.getSlots().get(71).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu144 ? _menu144.getSlots().get(72).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu146 ? _menu146.getSlots().get(73).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu148 ? _menu148.getSlots().get(74).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu150 ? _menu150.getSlots().get(75).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu152 ? _menu152.getSlots().get(76).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu154 ? _menu154.getSlots().get(77).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu156 ? _menu156.getSlots().get(78).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu158 ? _menu158.getSlots().get(79).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu160 ? _menu160.getSlots().get(80).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu162 ? _menu162.getSlots().get(81).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu164 ? _menu164.getSlots().get(82).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu166 ? _menu166.getSlots().get(83).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu168 ? _menu168.getSlots().get(84).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu170 ? _menu170.getSlots().get(85).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu172 ? _menu172.getSlots().get(86).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu174 ? _menu174.getSlots().get(87).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu176 ? _menu176.getSlots().get(88).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu178 ? _menu178.getSlots().get(89).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu180 ? _menu180.getSlots().get(90).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu182 ? _menu182.getSlots().get(91).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu184 ? _menu184.getSlots().get(92).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu186 ? _menu186.getSlots().get(93).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu188 ? _menu188.getSlots().get(94).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu190 ? _menu190.getSlots().get(95).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu192 ? _menu192.getSlots().get(96).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu194 ? _menu194.getSlots().get(97).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu196 ? _menu196.getSlots().get(98).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu198 ? _menu198.getSlots().get(99).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu200 ? _menu200.getSlots().get(100).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu202 ? _menu202.getSlots().get(101).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu204 ? _menu204.getSlots().get(102).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu206 ? _menu206.getSlots().get(103).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu208 ? _menu208.getSlots().get(104).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu210 ? _menu210.getSlots().get(105).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu212 ? _menu212.getSlots().get(106).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu214 ? _menu214.getSlots().get(107).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu216 ? _menu216.getSlots().get(108).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu218 ? _menu218.getSlots().get(109).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu220 ? _menu220.getSlots().get(110).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu222 ? _menu222.getSlots().get(111).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu224 ? _menu224.getSlots().get(112).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.LookingInventoryValue = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue
						+ (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof JimsmineshaftModMenus.MenuAccessor _menu226 ? _menu226.getSlots().get(113).getItem() : ItemStack.EMPTY)
								.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
				_vars.syncPlayerVariables(entity);
			}
			{
				JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.throwAwayVariable = Mth.nextInt(RandomSource.create(), 1, 2);
				_vars.syncPlayerVariables(entity);
			}
			if (entity.getPersistentData().getDouble("savedCartValue") != 0) {
				if (entity.getPersistentData().getDouble("savedCartValue") < entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue) {
					if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).throwAwayVariable == 1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud1")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud1")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud2")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:cartthud2")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				}
			}
			entity.getPersistentData().putDouble("savedCartValue", entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).LookingInventoryValue);
		});
	}
}