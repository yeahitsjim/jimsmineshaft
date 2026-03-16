// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMining_Veteran_Heavy_Greaves<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mining_veteran_heavy_greaves"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelMining_Veteran_Heavy_Greaves(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(-1.75F, 1.0F, -3.5F, 5.0F, 11.0F, 7.0F, new CubeDeformation(0.25F)).texOffs(96, 77)
						.addBox(2.75F, 2.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(42, 96)
						.addBox(0.25F, 1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(77, 60)
						.addBox(-2.15F, 11.4F, -3.5F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLegLayer_r1 = LeftLeg.addOrReplaceChild("LeftLegLayer_r1",
				CubeListBuilder.create().texOffs(99, 97).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.75F, 3.0F, -3.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition LeftLegLayer_r2 = LeftLeg.addOrReplaceChild("LeftLegLayer_r2",
				CubeListBuilder.create().texOffs(54, 70).addBox(-0.5F, -2.5F, -0.5F, 6.0F, 1.0F, 8.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.75F, 2.5F, -3.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(25, 38)
						.addBox(-3.25F, 1.0F, -3.5F, 5.0F, 11.0F, 7.0F, new CubeDeformation(0.25F)).texOffs(80, 96)
						.addBox(-3.75F, 2.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(61, 96)
						.addBox(-1.25F, 1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLegLayer_r1 = RightLeg.addOrReplaceChild("RightLegLayer_r1",
				CubeListBuilder.create().texOffs(99, 87).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.75F, 3.0F, -3.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition RightLegLayer_r2 = RightLeg.addOrReplaceChild("RightLegLayer_r2",
				CubeListBuilder.create().texOffs(77, 38).addBox(-5.5F, -2.5F, -0.5F, 6.0F, 1.0F, 8.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.75F, 2.5F, -3.5F, 0.0F, 0.0F, -0.1745F));

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