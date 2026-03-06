// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelstalker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "stalker"), "main");
	private final ModelPart all;
	private final ModelPart body;
	private final ModelPart villagerArms;
	private final ModelPart bodyHalfR;
	private final ModelPart headHalfR;
	private final ModelPart armR;
	private final ModelPart forearmR;
	private final ModelPart bodyHalfL;
	private final ModelPart headHalfL;
	private final ModelPart armL;
	private final ModelPart forearmL;
	private final ModelPart tounge;
	private final ModelPart legR;
	private final ModelPart calfR;
	private final ModelPart legL;
	private final ModelPart calfL;

	public Modelstalker(ModelPart root) {
		this.all = root.getChild("all");
		this.body = this.all.getChild("body");
		this.villagerArms = this.body.getChild("villagerArms");
		this.bodyHalfR = this.body.getChild("bodyHalfR");
		this.headHalfR = this.bodyHalfR.getChild("headHalfR");
		this.armR = this.bodyHalfR.getChild("armR");
		this.forearmR = this.armR.getChild("forearmR");
		this.bodyHalfL = this.body.getChild("bodyHalfL");
		this.headHalfL = this.bodyHalfL.getChild("headHalfL");
		this.armL = this.bodyHalfL.getChild("armL");
		this.forearmL = this.armL.getChild("forearmL");
		this.tounge = this.body.getChild("tounge");
		this.legR = this.all.getChild("legR");
		this.calfR = this.legR.getChild("calfR");
		this.legL = this.all.getChild("legL");
		this.calfL = this.legL.getChild("calfL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F,
				-3.0F, 8.0F, 20.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition villagerArms = body.addOrReplaceChild("villagerArms",
				CubeListBuilder.create().texOffs(60, 36)
						.addBox(-8.0F, -2.95F, -0.95F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(4.0F, -2.95F, -0.95F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-4.0F, 1.05F, -0.95F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.05F, -2.55F, -0.7505F, 0.0F, 0.0F));

		PartDefinition bodyHalfR = body.addOrReplaceChild("bodyHalfR",
				CubeListBuilder.create().texOffs(0, 44)
						.addBox(0.0F, -12.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(32, 36)
						.addBox(0.0F, -12.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition headHalfR = bodyHalfR.addOrReplaceChild("headHalfR",
				CubeListBuilder.create().texOffs(60, 48)
						.addBox(3.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(0.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 18)
						.addBox(0.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition armR = bodyHalfR.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(16, 72).addBox(-2.0F,
				-2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -10.0F, 0.0F));

		PartDefinition forearmR = armR.addOrReplaceChild("forearmR", CubeListBuilder.create().texOffs(48, 72).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition bodyHalfL = body.addOrReplaceChild("bodyHalfL",
				CubeListBuilder.create().texOffs(28, 54)
						.addBox(-8.0F, -12.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-8.0F, -12.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition headHalfL = bodyHalfL.addOrReplaceChild("headHalfL",
				CubeListBuilder.create().texOffs(28, 0)
						.addBox(-8.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 18)
						.addBox(-8.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition armL = bodyHalfL.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(32, 72).addBox(-2.0F,
				-2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -10.0F, 0.0F));

		PartDefinition forearmL = armL.addOrReplaceChild("forearmL", CubeListBuilder.create().texOffs(64, 72).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition tounge = body.addOrReplaceChild("tounge", CubeListBuilder.create().texOffs(0, 102).addBox(-3.0F,
				-12.0F, 0.0F, 6.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = tounge
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 102).addBox(-3.0F, -12.0F, 0.0F, 6.0F, 12.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition legR = all.addOrReplaceChild("legR", CubeListBuilder.create().texOffs(60, 8).addBox(-2.0F, 0.0F,
				-2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition calfR = legR.addOrReplaceChild("calfR", CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F,
				0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition legL = all.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(64, 18).addBox(-2.0F, 0.0F,
				-2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition calfL = legL.addOrReplaceChild("calfL", CubeListBuilder.create().texOffs(76, 8).addBox(-2.0F,
				0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}