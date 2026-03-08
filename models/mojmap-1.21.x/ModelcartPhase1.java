// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelcartPhase1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cartPhase1"), "main");
	private final ModelPart main;
	private final ModelPart hold;

	public ModelcartPhase1(ModelPart root) {
		this.main = root.getChild("main");
		this.hold = this.main.getChild("hold");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 8.0F, 0.0F));

		PartDefinition hold = main.addOrReplaceChild("hold", CubeListBuilder.create().texOffs(3, 0).addBox(4.0F, -3.0F,
				2.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition cube_r1 = hold
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r2 = hold.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -2.0F, -6.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r3 = hold.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r4 = hold.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 6.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r5 = hold.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 2).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, 11.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r6 = hold.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r7 = hold.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(5, 7).addBox(-4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r8 = hold
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

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