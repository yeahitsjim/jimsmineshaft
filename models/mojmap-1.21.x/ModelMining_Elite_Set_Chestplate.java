// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMining_Elite_Set_Chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mining_elite_set_chestplate"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public ModelMining_Elite_Set_Chestplate(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 27)
						.addBox(-4.5F, -0.5F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(19, 77)
						.addBox(2.5F, -0.75F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(19, 46)
						.addBox(2.5F, -0.65F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(24, 46)
						.addBox(-3.5F, -0.55F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(56, 24)
						.addBox(-3.9F, 4.45F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(54, 46)
						.addBox(2.8F, 4.35F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(29, 36)
						.addBox(-3.5F, 2.75F, -3.0F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(78, 0)
						.addBox(-3.5F, 4.75F, 3.0F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 64)
						.addBox(-3.5F, 10.25F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(15, 67)
						.addBox(2.5F, 10.25F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(66, 16)
						.addBox(4.0F, 8.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(59, 70)
						.addBox(-5.0F, 8.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(32, 77)
						.addBox(-3.5F, -0.75F, -3.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r1 = Body.addOrReplaceChild("BodyLayer_r1",
				CubeListBuilder.create().texOffs(77, 39).addBox(-3.5F, -1.5F, -0.5F, 7.0F, 3.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 14.25F, 2.75F, 0.1745F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r2 = Body.addOrReplaceChild("BodyLayer_r2",
				CubeListBuilder.create().texOffs(77, 34).addBox(-3.5F, -1.5F, -0.5F, 7.0F, 3.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 14.25F, -2.75F, -0.1745F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r3 = Body.addOrReplaceChild("BodyLayer_r3",
				CubeListBuilder.create().texOffs(45, 77).addBox(-2.0F, -4.75F, 1.0F, 1.0F, 0.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.6F, 4.1F, -3.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition BodyLayer_r4 = Body.addOrReplaceChild("BodyLayer_r4",
				CubeListBuilder.create().texOffs(49, 71).addBox(-2.0F, -4.75F, 1.0F, 1.0F, 5.0F, 0.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.75F, 4.2F, -3.9F, 0.0F, 0.2618F, 0.0F));

		PartDefinition BodyLayer_r5 = Body.addOrReplaceChild("BodyLayer_r5",
				CubeListBuilder.create().texOffs(58, 78)
						.addBox(-2.0F, -1.75F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(78, 6)
						.addBox(-1.5F, -1.25F, -0.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-4.0F, 4.0F, -3.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition BodyLayer_r6 = Body.addOrReplaceChild("BodyLayer_r6",
				CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.5F, 0.85F, 2.3F, 0.0F, 0.0F, -0.829F));

		PartDefinition BodyLayer_r7 = Body
				.addOrReplaceChild("BodyLayer_r7",
						CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 8.0F, 1.0F,
								new CubeDeformation(0.25F)),
						PartPose.offsetAndRotation(1.5F, 0.75F, 2.4F, 0.0F, 0.0F, 0.829F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(57, 0)
						.addBox(-3.5F, -2.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(59, 63)
						.addBox(-4.0F, 8.1F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(38, 49)
						.addBox(-1.5F, -2.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(62, 24)
						.addBox(-2.0F, 8.1F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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