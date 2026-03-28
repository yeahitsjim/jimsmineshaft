// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMining_Veteran_Heavy_Chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mining_veteran_heavy_chestplate"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public ModelMining_Veteran_Heavy_Chestplate(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(
				-4.5F, -0.5F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r1 = Body.addOrReplaceChild("BodyLayer_r1",
				CubeListBuilder.create().texOffs(62, 0).addBox(-3.9945F, -1.9055F, -4.9643F, 5.0F, 4.0F, 8.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.6609F, 2.5052F, 0.1281F, -0.3487F, 0.0159F));

		PartDefinition BodyLayer_r2 = Body.addOrReplaceChild("BodyLayer_r2",
				CubeListBuilder.create().texOffs(62, 13).addBox(-1.0055F, -1.9055F, -4.9643F, 5.0F, 4.0F, 8.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.6609F, 2.5052F, 0.1281F, 0.3487F, -0.0159F));

		PartDefinition BodyLayer_r3 = Body.addOrReplaceChild("BodyLayer_r3",
				CubeListBuilder.create().texOffs(0, 93).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.5905F, 4.0891F, 2.5052F, -0.2291F, 0.3435F, -0.0631F));

		PartDefinition BodyLayer_r4 = Body.addOrReplaceChild("BodyLayer_r4",
				CubeListBuilder.create().texOffs(21, 94).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.5905F, 4.0891F, 2.5052F, -0.2291F, -0.3435F, 0.0631F));

		PartDefinition BodyLayer_r5 = Body.addOrReplaceChild("BodyLayer_r5",
				CubeListBuilder.create().texOffs(104, 48).addBox(-0.5F, 3.0F, -2.5F, 3.0F, 5.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.5905F, 3.5891F, 2.5052F, -0.2291F, -0.3435F, 0.0631F));

		PartDefinition BodyLayer_r6 = Body.addOrReplaceChild("BodyLayer_r6",
				CubeListBuilder.create().texOffs(80, 106).addBox(-2.5F, 3.0F, -2.5F, 3.0F, 5.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.5905F, 3.5891F, 2.5052F, -0.2291F, 0.3435F, -0.0631F));

		PartDefinition BodyLayer_r7 = Body.addOrReplaceChild("BodyLayer_r7",
				CubeListBuilder.create().texOffs(89, 18).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.5905F, 4.0891F, -2.5052F, 0.2291F, 0.3435F, 0.0631F));

		PartDefinition BodyLayer_r8 = Body.addOrReplaceChild("BodyLayer_r8",
				CubeListBuilder.create().texOffs(17, 104).addBox(-0.5F, 3.0F, -2.5F, 3.0F, 5.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.5905F, 3.5891F, -2.5052F, 0.2291F, 0.3435F, 0.0631F));

		PartDefinition BodyLayer_r9 = Body.addOrReplaceChild("BodyLayer_r9",
				CubeListBuilder.create().texOffs(0, 103).addBox(-2.5F, 3.0F, -2.5F, 3.0F, 5.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.5905F, 3.5891F, -2.5052F, 0.2291F, -0.3435F, -0.0631F));

		PartDefinition BodyLayer_r10 = Body.addOrReplaceChild("BodyLayer_r10",
				CubeListBuilder.create().texOffs(89, 28).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.5905F, 4.0891F, -2.5052F, 0.2291F, -0.3435F, -0.0631F));

		PartDefinition BodyLayer_r11 = Body.addOrReplaceChild("BodyLayer_r11",
				CubeListBuilder.create().texOffs(89, 8).mirror()
						.addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offsetAndRotation(1.5905F, 1.4109F, -2.5052F, -0.36F, -0.3435F, 0.0631F));

		PartDefinition BodyLayer_r12 = Body.addOrReplaceChild("BodyLayer_r12",
				CubeListBuilder.create().texOffs(89, 8).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.5905F, 1.4109F, -2.5052F, -0.36F, 0.3435F, -0.0631F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(54, 80)
						.addBox(-3.5F, -2.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(0, 85)
						.addBox(-4.0F, 7.6F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArmLayer_r1 = RightArm.addOrReplaceChild("RightArmLayer_r1",
				CubeListBuilder.create().texOffs(73, 117)
						.addBox(1.5F, -1.5F, -0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(34, 107)
						.addBox(-3.0F, -1.5F, -0.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.5F, -1.5F, 0.25F, -0.3491F, 0.0F, 0.0F));

		PartDefinition RightArmLayer_r2 = RightArm.addOrReplaceChild("RightArmLayer_r2",
				CubeListBuilder.create().texOffs(39, 104)
						.addBox(1.5F, -1.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(81, 75)
						.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.3772F, 3.1099F, -1.5708F, 0.0F, 0.0F));

		PartDefinition RightArmLayer_r3 = RightArm.addOrReplaceChild("RightArmLayer_r3",
				CubeListBuilder.create().texOffs(118, 89)
						.addBox(1.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(112, 16)
						.addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.8772F, 3.1099F, -1.5708F, 0.0F, 0.0F));

		PartDefinition RightArmLayer_r4 = RightArm.addOrReplaceChild("RightArmLayer_r4",
				CubeListBuilder.create().texOffs(25, 35)
						.addBox(1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(104, 43)
						.addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.3772F, -2.8599F, 1.5708F, 0.0F, 0.0F));

		PartDefinition RightArmLayer_r5 = RightArm.addOrReplaceChild("RightArmLayer_r5",
				CubeListBuilder.create().texOffs(114, 107)
						.addBox(1.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(112, 22)
						.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.8772F, -2.8599F, 1.5708F, 0.0F, 0.0F));

		PartDefinition RightArmLayer_r6 = RightArm.addOrReplaceChild("RightArmLayer_r6",
				CubeListBuilder.create().texOffs(34, 114).addBox(-1.0F, -1.5833F, -3.6027F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.5839F, 0.8411F, 0.125F, 0.3491F, 0.0F, -1.5708F));

		PartDefinition RightArmLayer_r7 = RightArm.addOrReplaceChild("RightArmLayer_r7",
				CubeListBuilder.create().texOffs(47, 114).addBox(-1.0F, -1.5833F, -0.3973F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.3339F, -0.6589F, 0.125F, -0.3491F, 0.0F, -0.9599F));

		PartDefinition RightArmLayer_r8 = RightArm.addOrReplaceChild("RightArmLayer_r8",
				CubeListBuilder.create().texOffs(60, 114).addBox(-1.0F, -1.5833F, -0.3973F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.5839F, 0.8411F, 0.125F, -0.3491F, 0.0F, -1.5708F));

		PartDefinition RightArmLayer_r9 = RightArm.addOrReplaceChild("RightArmLayer_r9", CubeListBuilder.create()
				.texOffs(96, 91).addBox(-1.0F, -1.5833F, -0.6027F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.25F))
				.texOffs(13, 115).addBox(-3.5F, -1.5833F, -3.6027F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.9F, -2.7068F, 0.125F, 0.3491F, 0.0F, -0.9599F));

		PartDefinition RightArmLayer_r10 = RightArm.addOrReplaceChild("RightArmLayer_r10",
				CubeListBuilder.create().texOffs(115, 82).addBox(-1.0F, -1.5833F, -0.3973F, 0.0F, 2.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.9F, -2.7068F, 0.125F, -0.3491F, 0.0F, -0.9599F));

		PartDefinition RightArmLayer_r11 = RightArm.addOrReplaceChild("RightArmLayer_r11",
				CubeListBuilder.create().texOffs(115, 75)
						.addBox(1.5F, -1.5F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(53, 107)
						.addBox(-3.0F, -1.5F, -3.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.5F, -1.5F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(75, 80)
						.addBox(-1.5F, -2.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(89, 0)
						.addBox(-2.0F, 7.6F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArmLayer_r1 = LeftArm.addOrReplaceChild("LeftArmLayer_r1",
				CubeListBuilder.create().texOffs(84, 117)
						.addBox(-2.5F, -1.5F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(1, 50)
						.addBox(-1.0F, -1.5F, -3.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.5F, -1.5F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArmLayer_r2 = LeftArm.addOrReplaceChild("LeftArmLayer_r2",
				CubeListBuilder.create().texOffs(70, 121)
						.addBox(-2.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(26, 65)
						.addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.5F, 0.3772F, -2.8599F, 1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArmLayer_r3 = LeftArm.addOrReplaceChild("LeftArmLayer_r3",
				CubeListBuilder.create().texOffs(118, 95)
						.addBox(-2.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(100, 109)
						.addBox(-1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.5F, 0.8772F, -2.8599F, 1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArmLayer_r4 = LeftArm.addOrReplaceChild("LeftArmLayer_r4",
				CubeListBuilder.create().texOffs(118, 82)
						.addBox(-2.5F, -1.5F, -0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(107, 38)
						.addBox(-1.0F, -1.5F, -0.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.5F, -1.5F, 0.25F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArmLayer_r5 = LeftArm.addOrReplaceChild("LeftArmLayer_r5",
				CubeListBuilder.create().texOffs(22, 122)
						.addBox(-2.5F, -1.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(37, 65)
						.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.5F, 0.3772F, 3.1099F, -1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArmLayer_r6 = LeftArm.addOrReplaceChild("LeftArmLayer_r6",
				CubeListBuilder.create().texOffs(118, 101)
						.addBox(-2.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(113, 10)
						.addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.5F, 0.8772F, 3.1099F, -1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArmLayer_r7 = LeftArm.addOrReplaceChild("LeftArmLayer_r7",
				CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -1.5833F, -0.3973F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(3.3339F, -0.6589F, 0.125F, -0.3491F, 0.0F, 0.9599F));

		PartDefinition LeftArmLayer_r8 = LeftArm.addOrReplaceChild("LeftArmLayer_r8",
				CubeListBuilder.create().texOffs(114, 0).addBox(-1.0F, -1.5833F, -3.6027F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(3.5839F, 0.8411F, 0.125F, 0.3491F, 0.0F, 1.5708F));

		PartDefinition LeftArmLayer_r9 = LeftArm.addOrReplaceChild("LeftArmLayer_r9",
				CubeListBuilder.create().texOffs(110, 113).addBox(-1.0F, -1.5833F, -0.3973F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(3.5839F, 0.8411F, 0.125F, -0.3491F, 0.0F, 1.5708F));

		PartDefinition LeftArmLayer_r10 = LeftArm.addOrReplaceChild("LeftArmLayer_r10",
				CubeListBuilder.create().texOffs(25, 31).addBox(1.0F, -1.5833F, -0.3973F, 0.0F, 2.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.9F, -2.7068F, 0.125F, -0.3491F, 0.0F, 0.9599F));

		PartDefinition LeftArmLayer_r11 = LeftArm.addOrReplaceChild("LeftArmLayer_r11",
				CubeListBuilder.create().texOffs(96, 87)
						.addBox(1.0F, -1.5833F, -0.6027F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(97, 113)
						.addBox(1.5F, -1.5833F, -3.6027F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.9F, -2.7068F, 0.125F, 0.3491F, 0.0F, 0.9599F));

		return LayerDefinition.create(meshdefinition, 256, 256);
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