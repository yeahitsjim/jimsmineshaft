// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmining_gtrenchcoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mining_gtrenchcoat"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelmining_gtrenchcoat(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-2.4F, 3.23F, -2.6F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(2.4F, -1.52F, -3.12F, 2.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 10)
						.addBox(-4.32F, -1.52F, -3.12F, 2.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(15, 56)
						.addBox(-2.42F, -1.52F, 1.04F, 5.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.076F, -0.48F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(16, 45).addBox(-2.0F, -2.92F, -3.12F, 2.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.38F, 15.08F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -2.96F, -3.12F, 2.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.62F, 2.6F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(56, 10).addBox(-2.0F, -0.88F, -3.12F, 2.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.62F, 3.38F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(52, 0).addBox(0.08F, -0.88F, -3.12F, 2.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.62F, 3.38F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(32, 51).addBox(0.08F, -2.92F, -3.12F, 2.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.38F, 15.08F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(48, 51).addBox(0.08F, -2.96F, -3.12F, 2.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.62F, 2.6F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(40, 40).addBox(-1.96F, -6.0F, -2.6F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.12F, 6.24F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(0, 45).addBox(-0.92F, -6.0F, -2.6F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.12F, 6.24F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(40, 28).addBox(-3.88F, -4.8F, -1.56F, 7.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.52F, 12.48F, 3.12F, 0.2182F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 21)
						.addBox(-3.92F, 7.32F, -3.12F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
						.addBox(-3.44F, -2.2F, -2.6F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.124F, 1.6F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 30)
						.addBox(-1.36F, -2.2F, -2.6F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 14)
						.addBox(-1.84F, 7.32F, -3.12F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.276F, 1.6F, 0.0F));

		return LayerDefinition.create(meshdefinition, 129, 129);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}