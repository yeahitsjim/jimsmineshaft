package net.mcreator.jimsmineshaft.item;

import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class MiningVeteranSetItem extends ArmorItem {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(33, Map.of(ArmorType.BOOTS, 4, ArmorType.LEGGINGS, 8, ArmorType.CHESTPLATE, 12, ArmorType.HELMET, 6, ArmorType.BODY, 12), 9,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 2f, 0.2f, TagKey.create(Registries.ITEM, ResourceLocation.parse("jimsmineshaft:mining_veteran_set_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("jimsmineshaft:mining_veteran_set")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("head",
								new ModelPart(Collections.emptyList(),
										Map.of("head", new ModelMining_Veteran_Heavy_CBRN_Mask(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_CBRN_Mask.LAYER_LOCATION)).Head, "hat",
												new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/mining_veteran.png");
			}
		}, JimsmineshaftModItems.MINING_VETERAN_SET_HELMET.get());

		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("body", new ModelMining_Veteran_Heavy_Chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Chestplate.LAYER_LOCATION)).Body, "left_arm",
								new ModelMining_Veteran_Heavy_Chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Chestplate.LAYER_LOCATION)).LeftArm, "right_arm",
								new ModelMining_Veteran_Heavy_Chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Chestplate.LAYER_LOCATION)).RightArm, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/mining_veteran.png");
			}
		}, JimsmineshaftModItems.MINING_VETERAN_SET_CHESTPLATE.get());

		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new ModelMining_Veteran_Heavy_Greaves(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Greaves.LAYER_LOCATION)).LeftLeg, "right_leg",
								new ModelMining_Veteran_Heavy_Greaves(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Greaves.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/mining_veteran.png");
			}
		}, JimsmineshaftModItems.MINING_VETERAN_SET_LEGGINGS.get());

		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new ModelMining_Veteran_Heavy_Sabatons(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Sabatons.LAYER_LOCATION)).LeftLeg, "right_leg",
								new ModelMining_Veteran_Heavy_Sabatons(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Veteran_Heavy_Sabatons.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/mining_veteran.png");
			}
		}, JimsmineshaftModItems.MINING_VETERAN_SET_BOOTS.get());
	}

	private MiningVeteranSetItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends MiningVeteranSetItem {

		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}

	}

	public static class Chestplate extends MiningVeteranSetItem {

		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}

	}

	public static class Leggings extends MiningVeteranSetItem {

		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}

	}

	public static class Boots extends MiningVeteranSetItem {

		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}

	}

}