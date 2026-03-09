// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbiggate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "biggate"), "main");
	private final ModelPart rightdoor;
	private final ModelPart leftdoor;
	private final ModelPart bone;
	private final ModelPart frame;
	private final ModelPart group2;
	private final ModelPart group;

	public Modelbiggate(ModelPart root) {
		this.rightdoor = root.getChild("rightdoor");
		this.leftdoor = root.getChild("leftdoor");
		this.bone = root.getChild("bone");
		this.frame = this.bone.getChild("frame");
		this.group2 = this.bone.getChild("group2");
		this.group = this.bone.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightdoor = partdefinition.addOrReplaceChild("rightdoor",
				CubeListBuilder.create().texOffs(32, 16)
						.addBox(-39.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 102)
						.addBox(-39.0F, -54.0F, -2.0F, 42.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(-38.5F, -32.0F, -1.5F, 41.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(-39.0F, 30.0F, -2.0F, 40.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 53)
						.addBox(-40.0F, 31.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 16)
						.addBox(-33.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 16)
						.addBox(-27.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 16)
						.addBox(-21.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 16)
						.addBox(-15.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 16)
						.addBox(-9.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 102)
						.addBox(-3.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(39.0F, -7.75F, 0.0F));

		PartDefinition leftdoor = partdefinition.addOrReplaceChild("leftdoor", CubeListBuilder.create().texOffs(32, 16)
				.mirror().addBox(37.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 102).mirror().addBox(-3.0F, -54.0F, -2.0F, 42.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(104, 22).mirror()
				.addBox(-3.0F, -32.0F, -1.5F, 41.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 16).mirror().addBox(-1.0F, 30.0F, -2.0F, 40.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(104, 53).mirror()
				.addBox(36.0F, 31.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 16)
				.mirror().addBox(31.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 16).mirror().addBox(25.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(68, 16).mirror()
				.addBox(19.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 16).mirror().addBox(13.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(92, 16).mirror()
				.addBox(7.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 102).mirror().addBox(1.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(-39.0F, -7.75F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(39.0F, -7.75F, 0.0F));

		PartDefinition frame = bone.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(0, 16)
				.addBox(40.0F, -9.5805F, -2.3333F, 8.0F, 88.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16).mirror()
				.addBox(-48.0F, -9.5805F, -2.3333F, 8.0F, 88.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-39.0F, -46.4195F, -1.6667F));

		PartDefinition cube_r1 = frame.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(14.5084F, -53.1576F, -4.0F, 51.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(104, 58).mirror()
						.addBox(58.5084F, -49.1576F, -4.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(104, 58).mirror()
						.addBox(58.5084F, -49.1576F, 6.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-40.0F, 46.4195F, -0.3333F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r2 = frame.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 58)
				.addBox(-61.5084F, -49.1576F, -4.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 58)
				.addBox(-61.5084F, -49.1576F, 6.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-65.5084F, -53.1576F, -4.0F, 51.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0F, 46.4195F, -0.3333F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group2 = bone.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(104, 95)
						.addBox(-1.0F, 9.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 43)
						.addBox(-1.0F, 7.0F, 6.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 68)
						.addBox(-1.0F, 13.0F, 12.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 77)
						.addBox(2.5F, 11.0F, 16.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 86)
						.addBox(2.5F, 11.0F, 9.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108)
						.addBox(-3.5F, 11.0F, 9.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 108)
						.addBox(-3.5F, 11.0F, 16.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 27)
						.addBox(-3.5F, 11.0F, 9.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 35)
						.addBox(-3.5F, 19.0F, 9.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-39.0F, -69.0F, -2.0F));

		PartDefinition group = bone.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(104, 95)
						.addBox(-1.0F, 9.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 43)
						.addBox(-1.0F, 7.0F, -14.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 68)
						.addBox(-1.0F, 13.0F, -14.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 77)
						.addBox(2.5F, 11.0F, -17.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 86)
						.addBox(2.5F, 11.0F, -10.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108)
						.addBox(-3.5F, 11.0F, -10.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 108)
						.addBox(-3.5F, 11.0F, -17.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 27)
						.addBox(-3.5F, 11.0F, -17.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 35)
						.addBox(-3.5F, 19.0F, -17.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-39.0F, -69.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightdoor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftdoor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}