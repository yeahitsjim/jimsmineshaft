// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelcartRocks1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cartRocks1"), "main");
	private final ModelPart main;
	private final ModelPart hold;
	private final ModelPart bottom;
	private final ModelPart bottomBrace;
	private final ModelPart leftWheel;
	private final ModelPart leftBackWheel;
	private final ModelPart rightWheel;
	private final ModelPart rightBackWheel;

	public ModelcartRocks1(ModelPart root) {
		this.main = root.getChild("main");
		this.hold = this.main.getChild("hold");
		this.bottom = this.main.getChild("bottom");
		this.bottomBrace = this.bottom.getChild("bottomBrace");
		this.leftWheel = this.bottom.getChild("leftWheel");
		this.leftBackWheel = this.bottom.getChild("leftBackWheel");
		this.rightWheel = this.bottom.getChild("rightWheel");
		this.rightBackWheel = this.bottom.getChild("rightBackWheel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 8.0F, 0.0F));

		PartDefinition hold = main.addOrReplaceChild("hold",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -2.0F, -14.0F, 16.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(116, 53)
						.addBox(-6.0F, -7.0F, -13.0F, 14.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 59)
						.addBox(-6.0F, -7.0F, -14.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 124)
						.addBox(9.0F, -8.0F, -14.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(8.0F, -9.0F, -14.0F, 1.0F, 7.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(58, 65)
						.addBox(9.0F, -2.0F, -14.0F, 1.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
						.addBox(9.0F, -9.0F, -14.0F, 1.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(52, 124)
						.addBox(9.0F, -8.0F, 12.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 62)
						.addBox(-6.0F, -9.0F, 13.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 45)
						.addBox(-6.0F, -9.0F, 12.0F, 14.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 30)
						.addBox(-7.0F, -9.0F, -14.0F, 1.0F, 7.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(40, 124)
						.addBox(-8.0F, -8.0F, 12.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-8.0F, -2.0F, -14.0F, 1.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(34, 124)
						.addBox(-8.0F, -8.0F, -14.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
						.addBox(-8.0F, -9.0F, -14.0F, 1.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition cube_r1 = hold.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -2.0F, -6.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = hold.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(1, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, -3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = hold
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(1, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 9.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r4 = hold.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(1, 0).addBox(-4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -4.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r5 = hold
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(1, 2).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(7.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r6 = hold.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(6, 7).addBox(-4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = hold
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(1, 0).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bottom = main.addOrReplaceChild("bottom", CubeListBuilder.create(),
				PartPose.offset(1.0F, 12.0F, 0.0F));

		PartDefinition bottomBrace = bottom.addOrReplaceChild("bottomBrace",
				CubeListBuilder.create().texOffs(116, 29)
						.addBox(-3.0F, -2.0F, -7.0F, 6.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(58, 95)
						.addBox(-4.0F, 0.0F, -11.0F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(24, 124)
						.addBox(-1.0F, 2.0F, 9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition leftWheel = bottom.addOrReplaceChild("leftWheel",
				CubeListBuilder.create().texOffs(116, 64)
						.addBox(-2.0F, -3.0F, -3.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 125)
						.addBox(-1.0F, -3.0F, 3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 125)
						.addBox(-1.0F, -3.0F, -3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 119)
						.addBox(-1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 119)
						.addBox(-1.0F, 3.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, -7.0F));

		PartDefinition leftBackWheel = bottom.addOrReplaceChild("leftBackWheel",
				CubeListBuilder.create().texOffs(94, 119)
						.addBox(-1.0F, 3.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(116, 78)
						.addBox(-2.0F, -3.0F, -3.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(70, 125)
						.addBox(-1.0F, -3.0F, 3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 125)
						.addBox(-1.0F, -3.0F, -3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 119)
						.addBox(-1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, 6.0F));

		PartDefinition rightWheel = bottom.addOrReplaceChild("rightWheel",
				CubeListBuilder.create().texOffs(118, 106)
						.addBox(0.0F, -3.0F, -4.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(86, 125)
						.addBox(-1.0F, -3.0F, 2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 125)
						.addBox(-1.0F, -3.0F, -4.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 124)
						.addBox(-1.0F, -3.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 124)
						.addBox(-1.0F, 3.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 0.0F, -6.0F));

		PartDefinition rightBackWheel = bottom.addOrReplaceChild("rightBackWheel",
				CubeListBuilder.create().texOffs(118, 120)
						.addBox(-1.0F, 3.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(118, 92)
						.addBox(0.0F, -3.0F, -4.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(78, 125)
						.addBox(-1.0F, -3.0F, 2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 125)
						.addBox(-1.0F, -3.0F, -4.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 119)
						.addBox(-1.0F, -3.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 0.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}