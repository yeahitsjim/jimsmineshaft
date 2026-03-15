// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMining_Veteran_Heavy_Sabatons<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mining_veteran_heavy_sabatons"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelMining_Veteran_Heavy_Sabatons(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(77, 60)
				.addBox(-2.15F, 11.4F, -3.5F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLegLayer_r1 = LeftLeg.addOrReplaceChild("LeftLegLayer_r1",
				CubeListBuilder.create().texOffs(27, 70).addBox(-2.5F, 1.5F, -3.5F, 6.0F, 4.0F, 7.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.35F, 6.5F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition LeftLegLayer_r2 = LeftLeg.addOrReplaceChild("LeftLegLayer_r2",
				CubeListBuilder.create().texOffs(65, 121)
						.addBox(2.5F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(12, 122)
						.addBox(-2.5F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.25F, 6.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition LeftLegLayer_r3 = LeftLeg.addOrReplaceChild("LeftLegLayer_r3",
				CubeListBuilder.create().texOffs(60, 121)
						.addBox(2.5F, -0.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(55, 121)
						.addBox(7.5F, -0.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-4.75F, 6.0F, -1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition LeftLegLayer_r4 = LeftLeg.addOrReplaceChild("LeftLegLayer_r4",
				CubeListBuilder.create().texOffs(62, 26).addBox(-2.5F, 1.5F, -3.5F, 6.0F, 4.0F, 7.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.25F, 6.5F, -1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(77, 60).mirror()
						.addBox(-3.85F, 11.4F, -3.5F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLegLayer_r1 = RightLeg.addOrReplaceChild("RightLegLayer_r1",
				CubeListBuilder.create().texOffs(77, 48).addBox(-3.5F, 1.5F, -3.5F, 6.0F, 4.0F, 7.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.35F, 6.5F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RightLegLayer_r2 = RightLeg.addOrReplaceChild("RightLegLayer_r2",
				CubeListBuilder.create().texOffs(123, 107)
						.addBox(-3.5F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(123, 61)
						.addBox(1.5F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.25F, 6.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition RightLegLayer_r3 = RightLeg.addOrReplaceChild("RightLegLayer_r3",
				CubeListBuilder.create().texOffs(123, 57)
						.addBox(-3.5F, -0.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(17, 122)
						.addBox(-8.5F, -0.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(4.75F, 6.0F, -1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition RightLegLayer_r4 = RightLeg.addOrReplaceChild("RightLegLayer_r4",
				CubeListBuilder.create().texOffs(0, 73).addBox(-3.5F, 1.5F, -3.5F, 6.0F, 4.0F, 7.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.25F, 6.5F, -1.0F, 0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}