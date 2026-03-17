package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerPickUpBlockProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getItemEntity().getItem());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (JimsmineshaftModBlocks.COPPER_FRAGMENT_1.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 23, 25));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Copper fragment \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_FRAGMENT_2.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 30, 32.5));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Copper fragment \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_FRAGMENT_3.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 21, 23));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Copper fragment \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_FRAGMENT_4.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 33, 35));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Copper fragment \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_FRAGMENT_5.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 37, 39));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Copper fragment \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_SHARD.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 470, 490));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Chalcopyrite Stack \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 940, 960));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Chalcopyrite Stack\u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_SHARD_TRIPLE.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 1410, 1430));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Chalcopyrite Stack \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 43, 46));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Mined Copper Chunk \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 40, 43));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Mined Copper Chunk \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 38, 42));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Mined Copper Chunk \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 40, 43));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Mined Copper Chunk \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
		if (JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B.get().asItem() == itemstack.getItem()) {
			{
				final String _tagName = "value";
				final double _tagValue = (Mth.nextDouble(RandomSource.create(), 43, 46));
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			itemstack.set(DataComponents.CUSTOM_NAME,
					Component.literal(("Mined Copper Chunk \u00A72\u00A7l$" + new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value")))));
		}
	}
}