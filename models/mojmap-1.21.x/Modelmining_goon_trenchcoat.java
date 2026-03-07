// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmining_goon_trenchcoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mining_goon_trenchcoat"), "main");
	private final ModelPart Waist;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelmining_goon_trenchcoat(ModelPart root) {
		this.Waist = root.getChild("Waist");
		this.Body = this.Waist.getChild("Body");
		this.RightArm = this.Waist.getChild("RightArm");
		this.LeftArm = this.Waist.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-2.5F, 3.0F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(1.75F, -1.0F, -3.0F, 2.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-3.75F, -1.0F, -3.0F, 2.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 56)
						.addBox(-2.0F, -1.0F, 1.0F, 4.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(16, 45).addBox(-2.0F, -3.0F, -3.0F, 2.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 14.5F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r2 = Body
				.addOrReplaceChild("Body_r2",
						CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -3.0F, -3.0F, 2.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(56, 10).addBox(-2.0F, -1.0F, -3.0F, 2.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 3.25F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r4 = Body
				.addOrReplaceChild("Body_r4",
						CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, -1.0F, -3.0F, 2.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(32, 51).addBox(0.0F, -3.0F, -3.0F, 2.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, 14.5F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r6 = Body
				.addOrReplaceChild("Body_r6",
						CubeListBuilder.create().texOffs(48, 51).addBox(0.0F, -3.0F, -3.0F, 2.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 2.5F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Body_r7 = Body
				.addOrReplaceChild("Body_r7",
						CubeListBuilder.create().texOffs(40, 40).addBox(-2.0F, -6.0F, -2.5F, 3.0F, 6.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Body_r8 = Body
				.addOrReplaceChild("Body_r8",
						CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -6.0F, -2.5F, 3.0F, 6.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Body_r9 = Body
				.addOrReplaceChild("Body_r9",
						CubeListBuilder.create().texOffs(40, 28).addBox(-4.0F, -5.0F, -1.5F, 7.0F, 10.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 12.0F, 3.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 21)
						.addBox(-4.0F, 7.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
						.addBox(-3.5F, -2.5F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -10.0F, 0.0F));

		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 30)
						.addBox(-1.5F, -2.5F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 14)
						.addBox(-2.0F, 7.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -10.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}