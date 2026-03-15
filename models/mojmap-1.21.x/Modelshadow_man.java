// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelshadow_man<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shadow_man"), "main");
	private final ModelPart all;
	private final ModelPart legR;
	private final ModelPart calfR;
	private final ModelPart legL;
	private final ModelPart calfL;
	private final ModelPart torso;
	private final ModelPart waist;
	private final ModelPart midsection;
	private final ModelPart chest;
	private final ModelPart head;
	private final ModelPart bottomJaw;
	private final ModelPart shoulderR;
	private final ModelPart bicepR;
	private final ModelPart forearmR;
	private final ModelPart shoulderL;
	private final ModelPart bicepL;
	private final ModelPart forearmL;

	public Modelshadow_man(ModelPart root) {
		this.all = root.getChild("all");
		this.legR = this.all.getChild("legR");
		this.calfR = this.legR.getChild("calfR");
		this.legL = this.all.getChild("legL");
		this.calfL = this.legL.getChild("calfL");
		this.torso = this.all.getChild("torso");
		this.waist = this.torso.getChild("waist");
		this.midsection = this.waist.getChild("midsection");
		this.chest = this.midsection.getChild("chest");
		this.head = this.chest.getChild("head");
		this.bottomJaw = this.head.getChild("bottomJaw");
		this.shoulderR = this.chest.getChild("shoulderR");
		this.bicepR = this.shoulderR.getChild("bicepR");
		this.forearmR = this.bicepR.getChild("forearmR");
		this.shoulderL = this.chest.getChild("shoulderL");
		this.bicepL = this.shoulderL.getChild("bicepL");
		this.forearmL = this.bicepL.getChild("forearmL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition legR = all.addOrReplaceChild("legR",
				CubeListBuilder.create().texOffs(74, 56)
						.addBox(-1.75F, 0.0F, -1.0F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 20)
						.addBox(-2.0F, 9.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition calfR = legR.addOrReplaceChild("calfR", CubeListBuilder.create().texOffs(56, 75).addBox(-1.0F,
				0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 2.0F));

		PartDefinition legL = all.addOrReplaceChild("legL",
				CubeListBuilder.create().texOffs(74, 73)
						.addBox(-1.25F, 0.0F, -1.0F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 29)
						.addBox(-1.0F, 9.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition calfL = legL.addOrReplaceChild("calfL", CubeListBuilder.create().texOffs(64, 75).addBox(-1.0F,
				0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 2.0F));

		PartDefinition torso = all.addOrReplaceChild("torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition waist = torso.addOrReplaceChild("waist", CubeListBuilder.create().texOffs(32, 56).addBox(-4.0F,
				-8.0F, -2.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition midsection = waist.addOrReplaceChild("midsection", CubeListBuilder.create().texOffs(0, 54)
				.addBox(-5.0F, -8.0F, -2.75F, 10.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition chest = midsection.addOrReplaceChild("chest",
				CubeListBuilder.create().texOffs(44, 0)
						.addBox(-5.5F, -12.0F, -4.0F, 11.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -25.0F, -3.0F, 0.0F, 32.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition head = chest.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(44, 20)
						.addBox(-4.0F, -8.0F, -6.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-16.0F, -19.0F, -2.0F, 32.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, -2.0F));

		PartDefinition bottomJaw = head.addOrReplaceChild("bottomJaw", CubeListBuilder.create().texOffs(44, 38).addBox(
				-4.0F, -7.0F, -8.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 2.0F));

		PartDefinition shoulderR = chest.addOrReplaceChild("shoulderR", CubeListBuilder.create().texOffs(58, 56)
				.addBox(-4.0F, -3.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -10.0F, 1.0F));

		PartDefinition bicepR = shoulderR.addOrReplaceChild("bicepR", CubeListBuilder.create().texOffs(16, 68)
				.addBox(-1.0F, 0.0F, -1.0F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 12.0F, -1.0F));

		PartDefinition forearmR = bicepR.addOrReplaceChild("forearmR", CubeListBuilder.create().texOffs(40, 69).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition shoulderL = chest.addOrReplaceChild("shoulderL", CubeListBuilder.create().texOffs(0, 68).addBox(
				0.0F, -3.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -10.0F, 1.0F));

		PartDefinition bicepL = shoulderL.addOrReplaceChild("bicepL", CubeListBuilder.create().texOffs(28, 69).addBox(
				-2.0F, 0.0F, -1.0F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 12.0F, -1.0F));

		PartDefinition forearmL = bicepL.addOrReplaceChild("forearmL", CubeListBuilder.create().texOffs(48, 69).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.all.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}