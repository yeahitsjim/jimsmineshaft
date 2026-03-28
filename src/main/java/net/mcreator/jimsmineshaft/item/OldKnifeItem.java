package net.mcreator.jimsmineshaft.item;

public class OldKnifeItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 100, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("jimsmineshaft:old_knife_repair_items")));

	public OldKnifeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -2f, properties);
	}
}