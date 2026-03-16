package net.mcreator.jimsmineshaft.item;

import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class MiningEliteSetItem extends ArmorItem {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(15, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 3, ArmorType.BODY, 6), 9,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("jimsmineshaft:mining_elite_set_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("jimsmineshaft:mining_elite_set")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("head",
								new ModelPart(Collections.emptyList(),
										Map.of("head", new ModelMining_Elite_Set_Brodie_Helmet(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Brodie_Helmet.LAYER_LOCATION)).Head, "hat",
												new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/elite_mining_set.png");
			}
		}, JimsmineshaftModItems.MINING_ELITE_SET_HELMET.get());

		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("body", new ModelMining_Elite_Set_Chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Chestplate.LAYER_LOCATION)).Body, "left_arm",
								new ModelMining_Elite_Set_Chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Chestplate.LAYER_LOCATION)).LeftArm, "right_arm",
								new ModelMining_Elite_Set_Chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Chestplate.LAYER_LOCATION)).RightArm, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/elite_mining_set.png");
			}
		}, JimsmineshaftModItems.MINING_ELITE_SET_CHESTPLATE.get());

		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new ModelMining_Elite_Set_Cargo_Pants(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Cargo_Pants.LAYER_LOCATION)).LeftLeg, "right_leg",
								new ModelMining_Elite_Set_Cargo_Pants(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Cargo_Pants.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/elite_mining_set.png");
			}
		}, JimsmineshaftModItems.MINING_ELITE_SET_LEGGINGS.get());

		event.registerItem(new IClientItemExtensions() {
			@Override
			@OnlyIn(Dist.CLIENT)
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("left_leg", new ModelMining_Elite_Set_Steel_Toe_Boots(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Steel_Toe_Boots.LAYER_LOCATION)).LeftLeg, "right_leg",
								new ModelMining_Elite_Set_Steel_Toe_Boots(Minecraft.getInstance().getEntityModels().bakeLayer(ModelMining_Elite_Set_Steel_Toe_Boots.LAYER_LOCATION)).RightLeg, "head",
								new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("jimsmineshaft:textures/entities/elite_mining_set.png");
			}
		}, JimsmineshaftModItems.MINING_ELITE_SET_BOOTS.get());
	}

	private MiningEliteSetItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends MiningEliteSetItem {

		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}

	}

	public static class Chestplate extends MiningEliteSetItem {

		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}

	}

	public static class Leggings extends MiningEliteSetItem {

		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}

	}

	public static class Boots extends MiningEliteSetItem {

		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}

	}

}