package net.mcreator.jimsmineshaft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import net.mcreator.jimsmineshaft.procedures.FlashlightRightclickedProcedure;
import net.mcreator.jimsmineshaft.procedures.FlashlightPropertyValueProviderProcedure;
import net.mcreator.jimsmineshaft.procedures.FlashlightItemInInventoryTickProcedure;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

public class FlashlightItem extends Item {
	public FlashlightItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		FlashlightRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, entity.getItemInHand(hand));
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FlashlightItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		FlashlightRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, entity.getItemInHand(hand));
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FlashlightItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}

	public record FlashlightonfullProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<FlashlightonfullProperty> MAP_CODEC = MapCodec.unit(new FlashlightonfullProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) FlashlightPropertyValueProviderProcedure.execute(itemStackToRender);
		}

		@Override
		public MapCodec<FlashlightonfullProperty> type() {
			return MAP_CODEC;
		}
	}
}