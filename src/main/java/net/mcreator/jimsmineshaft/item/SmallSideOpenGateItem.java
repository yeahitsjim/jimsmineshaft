package net.mcreator.jimsmineshaft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.jimsmineshaft.procedures.SmallSideOpenGateRightclickedOnBlockProcedure;

public class SmallSideOpenGateItem extends Item {
	public SmallSideOpenGateItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SmallSideOpenGateRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}