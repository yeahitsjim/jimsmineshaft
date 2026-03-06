package net.mcreator.jimsmineshaft.item;

public class WoeMineshaftBeUponThe2Item extends Item {
	public WoeMineshaftBeUponThe2Item(Item.Properties properties) {
		super(properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}