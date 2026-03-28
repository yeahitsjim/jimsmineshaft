package net.mcreator.jimsmineshaft.item;

public class DetonatorBlockItemItem extends Item {
	public DetonatorBlockItemItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		DetonatorBlockItemRightclickedProcedure.execute(world, entity);
		return ar;
	}
}