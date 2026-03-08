// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbigirongateright<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bigirongateright"), "main");
	private final ModelPart rightdoor;

	public Modelbigirongateright(ModelPart root) {
		this.rightdoor = root.getChild("rightdoor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightdoor = partdefinition.addOrReplaceChild("rightdoor",
				CubeListBuilder.create().texOffs(32, 16)
						.addBox(-41.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 102)
						.addBox(-41.0F, -54.0F, -2.0F, 42.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(-40.5F, -32.0F, -1.5F, 41.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(-41.0F, 30.0F, -2.0F, 40.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 53)
						.addBox(-42.0F, 31.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 16)
						.addBox(-35.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 16)
						.addBox(-29.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 16)
						.addBox(-23.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 16)
						.addBox(-17.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 16)
						.addBox(-11.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 102)
						.addBox(-5.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(22.0F, -7.75F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightdoor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightdoor.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.rightdoor.xRot = headPitch / (180F / (float) Math.PI);
	}
}