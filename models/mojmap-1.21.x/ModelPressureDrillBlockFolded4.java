// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPressureDrillBlockFolded4<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pressuredrillblockfolded4"), "main");
	private final ModelPart main;
	private final ModelPart bone;
	private final ModelPart toparea;
	private final ModelPart beak;
	private final ModelPart legs;
	private final ModelPart bone2;
	private final ModelPart backright;
	private final ModelPart backleft;

	public ModelPressureDrillBlockFolded4(ModelPart root) {
		this.main = root.getChild("main");
		this.bone = this.main.getChild("bone");
		this.toparea = this.bone.getChild("toparea");
		this.beak = this.toparea.getChild("beak");
		this.legs = this.main.getChild("legs");
		this.bone2 = this.legs.getChild("bone2");
		this.backright = this.legs.getChild("backright");
		this.backleft = this.legs.getChild("backleft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-11.0F, 17.0F, -6.0F, -0.2182F, 0.0F, -1.0908F));

		PartDefinition bone = main.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(0.0F, 0.0F, -1.0F, 17.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(8.0F, 2.0F, -3.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(4.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(0.0F, 2.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(0.0F, 0.0F, -2.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(0.0F, 0.0F, 1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8289F, -6.2493F, 0.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition toparea = bone.addOrReplaceChild("toparea",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -2.0F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 10)
						.addBox(-3.0F, -3.0F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition beak = toparea.addOrReplaceChild("beak",
				CubeListBuilder.create().texOffs(30, 8)
						.addBox(6.0F, -1.0F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 13)
						.addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 30)
						.addBox(4.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, 0.0F, 0.0F));

		PartDefinition legs = main.addOrReplaceChild("legs", CubeListBuilder.create(),
				PartPose.offset(3.8289F, -2.2493F, -2.0F));

		PartDefinition bone2 = legs.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(11.0F, -1.0F, 2.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 30).addBox(0.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition backright = legs.addOrReplaceChild("backright", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition cube_r2 = backright.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -1.0F, -1.2F, 2.0F, 21.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 3.0F, 0.0F, -0.2054F, 0.0741F, 0.6905F));

		PartDefinition backleft = legs.addOrReplaceChild("backleft", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition backleft_r1 = backleft.addOrReplaceChild("backleft_r1",
				CubeListBuilder.create().texOffs(24, 20).addBox(-2.0F, -1.0F, -1.2F, 2.0F, 21.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1415F, 0.1666F, -0.5118F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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