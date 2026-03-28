package net.mcreator.jimsmineshaft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TestSyncTheSecondItem extends Item {
	public TestSyncTheSecondItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1));
	}
}