package net.mcreator.jimsmineshaft.item;

public class SmallPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 100, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("jimsmineshaft:small_pickaxe_repair_items")));

	public SmallPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -3f, properties);
	}
}