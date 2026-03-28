package net.mcreator.jimsmineshaft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.jimsmineshaft.procedures.DetonatorBlockItemRightclickedProcedure;

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