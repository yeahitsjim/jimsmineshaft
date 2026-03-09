// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelplayerStalker3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "playerstalker2"), "main");
	private final ModelPart main;
	private final ModelPart torso;
	private final ModelPart left_torso;
	private final ModelPart left_head;
	private final ModelPart left_arm;
	private final ModelPart bone;
	private final ModelPart right_torso;
	private final ModelPart head;
	private final ModelPart right_head;
	private final ModelPart right_arm;
	private final ModelPart legs;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelplayerStalker3(ModelPart root) {
		this.main = root.getChild("main");
		this.torso = this.main.getChild("torso");
		this.left_torso = this.torso.getChild("left_torso");
		this.left_head = this.left_torso.getChild("left_head");
		this.left_arm = this.left_torso.getChild("left_arm");
		this.bone = this.left_arm.getChild("bone");
		this.right_torso = this.torso.getChild("right_torso");
		this.head = this.right_torso.getChild("head");
		this.right_head = this.right_torso.getChild("right_head");
		this.right_arm = this.right_torso.getChild("right_arm");
		this.legs = this.main.getChild("legs");
		this.left_leg = this.legs.getChild("left_leg");
		this.right_leg = this.legs.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition torso = main.addOrReplaceChild("torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition left_torso = torso.addOrReplaceChild("left_torso",
				CubeListBuilder.create().texOffs(20, 32)
						.addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(20, 16)
						.addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_head = left_torso.addOrReplaceChild("left_head",
				CubeListBuilder.create().texOffs(4, 0)
						.addBox(0.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(0.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition left_arm = left_torso.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, -10.0F, 0.0F));

		PartDefinition bone = left_arm.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(2.0F, 10.0F, 0.0F));

		PartDefinition right_torso = torso.addOrReplaceChild("right_torso",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = right_torso.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition right_head = right_torso.addOrReplaceChild("right_head",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition right_arm = right_torso.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, -10.0F, 0.0F));

		PartDefinition legs = main.addOrReplaceChild("legs", CubeListBuilder.create(),
				PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition left_leg = legs.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition right_leg = legs.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, -12.0F, 0.0F));

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