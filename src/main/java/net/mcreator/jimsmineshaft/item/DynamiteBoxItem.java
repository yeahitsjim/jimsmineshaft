package net.mcreator.jimsmineshaft.item;

public class DynamiteBoxItem extends Item {
	public DynamiteBoxItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		DynamiteBoxItemIsDroppedByPlayerProcedure.execute(entity.level(), itemstack);
		return true;
	}
}