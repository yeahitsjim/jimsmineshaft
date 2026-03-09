package net.mcreator.jimsmineshaft.item;

public class BatteryItem extends Item {
	public BatteryItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.jimsmineshaft.battery.description_0"));
	}
}