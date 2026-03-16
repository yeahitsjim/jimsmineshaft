package net.mcreator.jimsmineshaft.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.jimsmineshaft.procedures.TommyGunCanUseRangedItemProcedure;
import net.mcreator.jimsmineshaft.procedures.GreaseGunRangedItemShootsProjectileProcedure;
import net.mcreator.jimsmineshaft.procedures.GreaseGunEntitySwingsItemProcedure;
import net.mcreator.jimsmineshaft.entity.BulletProjectileEntity;

import java.util.List;

public class GreaseGunItem extends Item {
	public GreaseGunItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 1;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.jimsmineshaft.grease_gun.description_0"));
		list.add(Component.translatable("item.jimsmineshaft.grease_gun.description_1"));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = InteractionResult.FAIL;
		if (TommyGunCanUseRangedItemProcedure.execute(entity.getItemInHand(hand)))
			if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
				ar = InteractionResult.SUCCESS;
				entity.startUsingItem(hand);
			}
		return ar;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity, InteractionHand hand) {
		boolean retval = super.onEntitySwing(itemstack, entity, hand);
		GreaseGunEntitySwingsItemProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void onUseTick(Level world, LivingEntity entity, ItemStack itemstack, int count) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				BulletProjectileEntity projectile = BulletProjectileEntity.shoot(world, entity, world.getRandom());
				if (player.getAbilities().instabuild) {
					projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
				} else {
					if (stack.isDamageableItem()) {
						if (world instanceof ServerLevel serverLevel)
							stack.hurtAndBreak(1, serverLevel, player, _stkprov -> {
							});
					} else {
						stack.shrink(1);
					}
				}
				GreaseGunRangedItemShootsProjectileProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
			}
			entity.releaseUsingItem();
		}
	}

	private ItemStack findAmmo(Player player) {
		return new ItemStack(BulletProjectileEntity.PROJECTILE_ITEM.getItem());
	}
}