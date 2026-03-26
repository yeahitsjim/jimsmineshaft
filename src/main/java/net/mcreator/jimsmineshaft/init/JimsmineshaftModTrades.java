/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class JimsmineshaftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_WEAPONS_LIGHT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 2), new ItemStack(JimsmineshaftModItems.OLD_KNIFE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_WEAPONS_LIGHT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 5), new ItemStack(JimsmineshaftModItems.FIRE_AXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_WEAPONS_HEAVY.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 15), new ItemStack(JimsmineshaftModItems.FLINTLOCK_PISTOL.get()), 10, 25, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_WEAPONS_HEAVY.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 60), new ItemStack(JimsmineshaftModItems.TOMMY_GUN.get()), 10, 25, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_WEAPONS_HEAVY.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 64), new ItemStack(JimsmineshaftModItems.GREASE_GUN.get()), 10, 25, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_AMMO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 2), new ItemStack(JimsmineshaftModItems.IRON_BULLET.get(), 30), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_BASIC.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 2), new ItemStack(Items.WOODEN_PICKAXE), 16, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_BASIC.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get()), new ItemStack(Items.BREAD, 8), 256, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_TOOLS.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 20), new ItemStack(JimsmineshaftModItems.SMALL_PICKAXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_TOOLS.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 60), new ItemStack(JimsmineshaftModItems.RUSTY_PICKAXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_HUNDREDS.get(), 25), new ItemStack(JimsmineshaftModBlocks.VETERAN_ARMOR_BAG.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 60), new ItemStack(JimsmineshaftModBlocks.CLOTHES_BAG.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 20), new ItemStack(JimsmineshaftModBlocks.BASIC_CLOTHES_BAG.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_DRILLER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 16), new ItemStack(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_DRILLER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get(), 4), new ItemStack(JimsmineshaftModItems.DYNAMITE_BOX.get()), 10, 5, 0.05f));
		}
		if (event.getType() == JimsmineshaftModVillagerProfessions.COMPANY_STORE_CLERK_AMMO.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JimsmineshaftModItems.CASH_STACK_REGULAR.get()), new ItemStack(JimsmineshaftModItems.BATTERY.get()), 10, 5, 0.05f));
		}
	}
}