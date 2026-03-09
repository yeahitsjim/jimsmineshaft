package net.mcreator.jimsmineshaft.item;

public class FlashlightItem extends Item {
	public FlashlightItem(Item.Properties properties) {
		super(properties);
	}

	public record FlashlightonfullProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<FlashlightonfullProperty> MAP_CODEC = MapCodec.unit(new FlashlightonfullProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return 0;
		}

		@Override
		public MapCodec<FlashlightonfullProperty> type() {
			return MAP_CODEC;
		}
	}
}