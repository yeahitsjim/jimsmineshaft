// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelrawCopperDrilledNorth_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rawcopperdrillednorth_converted"), "main");
	private final ModelPart bone;

	public ModelrawCopperDrilledNorth_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -7.0F, -8.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-8.0F, -9.0F, -8.0F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
						.addBox(1.0F, -9.0F, -8.0F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-8.0F, -16.0F, -8.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(64, 0).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 8.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 1.0F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(72, 90).addBox(-2.0F, -7.0F, -7.0F, 1.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -3.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 82).addBox(-2.0F, -8.0F, 0.0F, 1.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(88, 90).addBox(-2.0F, -7.0F, 0.0F, 1.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(94, 72).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(7.0F, 2.0F, -6.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 64).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 8.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -7.0F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(56, 90).addBox(-2.0F, -7.0F, -7.0F, 1.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -9.0F, -3.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(24, 82).addBox(-2.0F, -8.0F, 0.0F, 1.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.0F, -5.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(88, 0).addBox(-2.0F, -7.0F, 0.0F, 1.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -12.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(94, 19).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -13.0F, -6.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(78, 82)
						.addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(86, 38)
						.addBox(-4.0F, -12.0F, -1.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -2.0F, -4.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 83)
						.addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 73)
						.addBox(-4.0F, -6.0F, -1.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -5.0F, -1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(18, 97).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, -6.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(56, 82)
						.addBox(-4.0F, -1.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(82, 64)
						.addBox(-4.0F, -12.0F, -1.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.0F, -4.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 96).addBox(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -8.0F, -6.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(24, 73)
						.addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 38)
						.addBox(-4.0F, 4.0F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -10.0F, -1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 91).addBox(-4.0F, -1.4F, -2.0F, 8.0F, 1.4F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -12.0F, 7.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(54, 64).addBox(-5.0F, -0.9F, -4.0F, 6.0F, 0.9F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.0F, 7.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(94, 29).addBox(-2.0F, -0.9F, -4.0F, 2.0F, 0.9F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -8.0F, 7.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r20 = bone
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(92, 59).addBox(-4.0F, -1.05F, -2.0F, 7.0F, 1.05F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, -6.0F, 6.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(24, 64).addBox(-5.0F, -1.2F, -4.0F, 7.0F, 1.2F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(92, 51).addBox(-5.0F, -1.0F, -3.0F, 3.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -1.0F, 8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(72, 73).addBox(-5.0F, -1.0F, -4.0F, 3.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.0F, -4.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(64, 19).addBox(-5.0F, -1.5F, -4.0F, 7.0F, 1.5F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -4.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(64, 29).addBox(-5.0F, -0.9F, -4.0F, 7.0F, 0.9F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -10.0F, -5.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(36, 97).addBox(-2.0F, -0.9F, -4.0F, 4.0F, 0.9F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -8.0F, -5.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(88, 14).addBox(-4.0F, -1.4F, -2.0F, 8.0F, 1.4F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -12.0F, -7.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(92, 46).addBox(-4.0F, -1.05F, -2.0F, 8.0F, 1.05F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -6.0F, -7.0F, 0.0F, 0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}