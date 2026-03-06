package net.mcreator.jimsmineshaft.item;

public class WoeMineshaftBeUponTheItem extends Item {
	public WoeMineshaftBeUponTheItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}