// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLeech<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "leech"), "main");
	private final ModelPart head;
	private final ModelPart section1;
	private final ModelPart section2;
	private final ModelPart section3;

	public ModelLeech(ModelPart root) {
		this.head = root.getChild("head");
		this.section1 = this.head.getChild("section1");
		this.section2 = this.section1.getChild("section2");
		this.section3 = this.section2.getChild("section3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-7.5F, 8.1F, -3.0F, 15.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(31, 102)
						.addBox(-6.5F, 2.0F, 8.0F, 13.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, -16.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 102)
						.addBox(-7.0F, 1.0F, 10.0F, 14.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -1.0F, -1.0F, 16.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(70, 104).mirror()
						.addBox(2.3473F, -4.0F, -3.1946F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.8404F, -3.5904F, 1.3225F, -0.3432F, 0.7083F, 0.1561F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(78, 61).mirror()
						.addBox(-1.9096F, -4.0F, -3.9632F, 2.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.8404F, -3.5904F, 1.3225F, -0.2604F, 0.123F, 0.3518F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 76)
						.addBox(-1.7627F, -4.0F, 11.4256F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 61)
						.addBox(0.2373F, -4.0F, -3.5744F, 2.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2627F, 3.1F, 0.5744F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 76).mirror()
						.addBox(-0.2373F, -4.0F, 11.4256F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(39, 61).mirror()
						.addBox(-2.2373F, -4.0F, -3.5744F, 2.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2627F, 3.1F, 0.5744F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(92, 104).mirror()
						.addBox(2.2399F, -4.0F, -2.7956F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2627F, 3.1F, 0.5744F, 0.0F, 0.7418F, -0.3927F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(78, 61).addBox(-0.0904F, -4.0F, -3.9632F, 2.0F, 9.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8404F, -3.5904F, 1.3225F, -0.2604F, -0.123F, -0.3518F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(67, 104).mirror()
						.addBox(-1.5F, -0.3079F, 0.3759F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(67, 104).addBox(3.0F, -0.3079F, 0.3759F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, -8.6664F, -1.2055F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(92, 111).mirror()
						.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(92, 111).addBox(5.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 8.1F, -3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(92, 104).addBox(-6.2399F, -4.0F, -2.7956F, 4.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2627F, 3.1F, 0.5744F, 0.0F, -0.7418F, 0.3927F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(70, 104).addBox(-4.3473F, -4.0F, -3.1946F, 2.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8404F, -3.5904F, 1.3225F, -0.3432F, -0.7083F, -0.1561F));

		PartDefinition section1 = head.addOrReplaceChild("section1", CubeListBuilder.create().texOffs(55, 40)
				.addBox(-6.6667F, -1.8317F, -1.9354F, 13.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1667F, 3.8317F, 10.9354F));

		PartDefinition cube_r12 = section1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 40).addBox(-7.0F, 1.0F, 11.0F, 14.0F, 7.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1667F, -12.8317F, -10.9354F, -0.3054F, 0.0F, 0.0F));

		PartDefinition section2 = section1.addOrReplaceChild("section2", CubeListBuilder.create(),
				PartPose.offset(0.3333F, 1.1093F, 9.5339F));

		PartDefinition cube_r13 = section2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(65, 26).addBox(-6.0F, -3.0F, -2.5F, 12.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.25F, 3.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = section2
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(0, 88).addBox(-6.0F, -3.0F, -2.5F, 11.0F, 5.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition section3 = section2.addOrReplaceChild("section3", CubeListBuilder.create(),
				PartPose.offset(0.5F, 1.0F, 8.0F));

		PartDefinition cube_r15 = section3.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(39, 88).addBox(-5.0F, -2.0F, 5.5F, 9.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.25F, -7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r16 = section3.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(78, 87).addBox(-5.0F, -2.0F, 5.5F, 8.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -7.0F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}