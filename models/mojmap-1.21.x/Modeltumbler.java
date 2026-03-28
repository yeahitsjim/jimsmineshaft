// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltumbler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tumbler"), "main");
	private final ModelPart tumbler;
	private final ModelPart tumbler_backpart;
	private final ModelPart other_backpart2;
	private final ModelPart other_backpart3;
	private final ModelPart other_backpart4;
	private final ModelPart other_backpart;
	private final ModelPart backpart2;
	private final ModelPart backpart3;
	private final ModelPart backpart4;
	private final ModelPart backpart;
	private final ModelPart tumbler_middle;
	private final ModelPart tumbler_middle_smaller;
	private final ModelPart tumbler_front;
	private final ModelPart other_tumbler;

	public Modeltumbler(ModelPart root) {
		this.tumbler = root.getChild("tumbler");
		this.tumbler_backpart = this.tumbler.getChild("tumbler_backpart");
		this.other_backpart2 = this.tumbler_backpart.getChild("other_backpart2");
		this.other_backpart3 = this.tumbler_backpart.getChild("other_backpart3");
		this.other_backpart4 = this.tumbler_backpart.getChild("other_backpart4");
		this.other_backpart = this.tumbler_backpart.getChild("other_backpart");
		this.backpart2 = this.tumbler_backpart.getChild("backpart2");
		this.backpart3 = this.tumbler_backpart.getChild("backpart3");
		this.backpart4 = this.tumbler_backpart.getChild("backpart4");
		this.backpart = this.tumbler_backpart.getChild("backpart");
		this.tumbler_middle = this.tumbler.getChild("tumbler_middle");
		this.tumbler_middle_smaller = this.tumbler.getChild("tumbler_middle_smaller");
		this.tumbler_front = this.tumbler.getChild("tumbler_front");
		this.other_tumbler = this.tumbler.getChild("other_tumbler");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tumbler = partdefinition.addOrReplaceChild("tumbler", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tumbler_backpart = tumbler.addOrReplaceChild("tumbler_backpart",
				CubeListBuilder.create().texOffs(321, 74)
						.addBox(-18.0F, 18.0F, 28.35F, 36.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(375, 248)
						.addBox(-15.0F, 3.0F, 30.15F, 30.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(321, 138)
						.addBox(-18.0F, -63.0F, 28.35F, 36.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(322, 365)
						.addBox(-15.0F, -48.0F, 30.15F, 30.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition cube_r1 = tumbler_backpart.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(435, 147).addBox(-13.25F, 0.0F, 0.0F, 20.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, 0.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r2 = tumbler_backpart.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(435, 134).addBox(-7.25F, 0.0F, 0.0F, 20.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, 0.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r3 = tumbler_backpart.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(435, 108).addBox(-7.25F, -6.0F, 0.15F, 20.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, -39.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r4 = tumbler_backpart.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(435, 121).addBox(-13.25F, -6.0F, 0.0F, 20.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, -39.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r5 = tumbler_backpart.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(321, 122).addBox(-21.0F, -6.0F, -1.5F, 36.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.0F, -48.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r6 = tumbler_backpart.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(375, 261).addBox(-12.0F, -6.0F, 0.15F, 30.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.5F, -16.5F, 30.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r7 = tumbler_backpart.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(321, 170).addBox(-15.0F, -6.0F, -1.65F, 36.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.5F, -16.5F, 30.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r8 = tumbler_backpart.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(375, 235).addBox(-18.0F, -6.0F, 0.15F, 30.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.5F, -16.5F, 30.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = tumbler_backpart.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(321, 106).addBox(-21.0F, -6.0F, -1.65F, 36.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.5F, -16.5F, 30.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = tumbler_backpart.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(321, 186).addBox(-15.0F, -6.0F, -1.5F, 36.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.5F, 13.5F, 30.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r11 = tumbler_backpart.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(321, 90).addBox(-21.0F, -6.0F, -1.5F, 36.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.5F, 13.5F, 30.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r12 = tumbler_backpart.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(321, 154).addBox(-15.0F, -6.0F, -1.5F, 36.0F, 6.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -48.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition other_backpart2 = tumbler_backpart.addOrReplaceChild("other_backpart2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = other_backpart2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(463, 471)
						.addBox(2.5F, -6.875F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(440, 471)
						.addBox(-13.25F, -6.875F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, -48.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r14 = other_backpart2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(484, 386).addBox(-12.5F, -5.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, -60.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r15 = other_backpart2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(263, 482).addBox(-12.5F, -5.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, -54.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r16 = other_backpart2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(482, 436).addBox(-12.5F, -6.125F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -57.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r17 = other_backpart2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(246, 482).addBox(-12.5F, -6.125F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -51.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition other_backpart3 = tumbler_backpart.addOrReplaceChild("other_backpart3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = other_backpart3.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(23, 472)
						.addBox(-7.25F, -6.875F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 472)
						.addBox(8.5F, -6.875F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, -48.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r19 = other_backpart3.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(484, 422).addBox(10.75F, -5.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, -60.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r20 = other_backpart3.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(484, 413).addBox(10.75F, -5.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, -54.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r21 = other_backpart3.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(484, 404).addBox(10.75F, -6.125F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -57.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r22 = other_backpart3.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(484, 395).addBox(10.75F, -6.125F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -51.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition other_backpart4 = tumbler_backpart.addOrReplaceChild("other_backpart4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r23 = other_backpart4.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(69, 476)
						.addBox(-7.25F, -1.625F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 474)
						.addBox(8.5F, -1.625F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, 9.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r24 = other_backpart4.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(486, 57).addBox(10.75F, 3.625F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, 21.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r25 = other_backpart4.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(172, 485).addBox(10.75F, 3.625F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, 15.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r26 = other_backpart4.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(155, 485).addBox(10.75F, 4.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, 18.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r27 = other_backpart4.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(138, 485).addBox(10.75F, 4.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, 12.0F, 30.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition other_backpart = tumbler_backpart.addOrReplaceChild("other_backpart", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r28 = other_backpart.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(115, 476)
						.addBox(2.5F, -1.625F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 476)
						.addBox(-13.25F, -1.625F, 0.15F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, 9.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r29 = other_backpart.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(486, 178).addBox(-12.5F, 3.625F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, 21.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r30 = other_backpart.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(486, 169).addBox(-12.5F, 3.625F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0F, 15.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r31 = other_backpart.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(486, 160).addBox(-12.5F, 4.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 18.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r32 = other_backpart.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(486, 66).addBox(-12.5F, 4.375F, 0.15F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, 12.0F, 30.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition backpart2 = tumbler_backpart.addOrReplaceChild("backpart2",
				CubeListBuilder.create().texOffs(108, 460)
						.addBox(7.75F, -9.0F, -14.85F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(131, 460)
						.addBox(-5.75F, -9.0F, -14.85F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(394, 54)
						.addBox(-8.0F, -9.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(480, 82)
						.addBox(5.5F, -9.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(394, 64)
						.addBox(-14.0F, -9.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(480, 92)
						.addBox(-0.5F, -9.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(85, 460)
						.addBox(-19.25F, -9.0F, -14.85F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(477, 238)
						.addBox(-14.0F, -3.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(481, 258)
						.addBox(-0.5F, -3.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(477, 248)
						.addBox(-8.0F, -3.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(477, 447)
						.addBox(5.5F, -3.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -48.0F, 45.0F));

		PartDefinition backpart3 = tumbler_backpart.addOrReplaceChild("backpart3",
				CubeListBuilder.create().texOffs(154, 460)
						.addBox(7.75F, 57.0F, -14.85F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(177, 460)
						.addBox(-5.75F, 57.0F, -14.85F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(481, 268)
						.addBox(-8.0F, 63.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(481, 278)
						.addBox(5.5F, 63.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(481, 288)
						.addBox(-14.0F, 63.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(481, 298)
						.addBox(-0.5F, 63.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(417, 471)
						.addBox(-19.25F, 57.0F, -14.85F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(481, 308)
						.addBox(-14.0F, 57.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(195, 482)
						.addBox(-0.5F, 57.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(212, 482)
						.addBox(-8.0F, 57.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(229, 482)
						.addBox(5.5F, 57.0F, -14.85F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -48.0F, 45.0F));

		PartDefinition backpart4 = tumbler_backpart.addOrReplaceChild("backpart4",
				CubeListBuilder.create().texOffs(417, 447)
						.addBox(-40.5F, 39.25F, -14.85F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 448)
						.addBox(-40.5F, 25.75F, -14.85F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(195, 12)
						.addBox(-40.5F, 23.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(195, 21)
						.addBox(-40.5F, 37.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(392, 202)
						.addBox(-40.5F, 17.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(392, 211)
						.addBox(-40.5F, 31.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 448)
						.addBox(-40.5F, 12.25F, -14.85F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(392, 220)
						.addBox(-34.5F, 17.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(411, 225)
						.addBox(-34.5F, 31.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(184, 448)
						.addBox(-34.5F, 23.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(457, 220)
						.addBox(-34.5F, 37.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -48.0F, 45.0F));

		PartDefinition backpart = tumbler_backpart.addOrReplaceChild("backpart",
				CubeListBuilder.create().texOffs(62, 448)
						.addBox(25.5F, 39.25F, -14.85F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(93, 448)
						.addBox(25.5F, 25.75F, -14.85F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(458, 48)
						.addBox(31.5F, 23.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(475, 459)
						.addBox(31.5F, 37.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(138, 476)
						.addBox(31.5F, 17.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(157, 476)
						.addBox(31.5F, 31.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 448)
						.addBox(25.5F, 12.25F, -14.85F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 476)
						.addBox(25.5F, 17.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(476, 220)
						.addBox(25.5F, 31.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(477, 48)
						.addBox(25.5F, 23.5F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(477, 229)
						.addBox(25.5F, 37.0F, -14.85F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -48.0F, 45.0F));

		PartDefinition tumbler_middle = tumbler.addOrReplaceChild("tumbler_middle", CubeListBuilder.create()
				.texOffs(375, 274).addBox(-3.0F, -42.0F, 26.25F, 6.0F, 45.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition cube_r33 = tumbler_middle.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(145, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -1.8326F));

		PartDefinition cube_r34 = tumbler_middle.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(116, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -2.0944F));

		PartDefinition cube_r35 = tumbler_middle.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(351, 378).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r36 = tumbler_middle.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(396, 0).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r37 = tumbler_middle.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(174, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -1.309F));

		PartDefinition cube_r38 = tumbler_middle.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(322, 378).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r39 = tumbler_middle.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(380, 378)
						.addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(404, 274)
						.addBox(-2.75F, -25.25F, -4.5F, 5.0F, 50.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r40 = tumbler_middle.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(0, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r41 = tumbler_middle.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(29, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r42 = tumbler_middle.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(87, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r43 = tumbler_middle.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(58, 394).addBox(-3.0F, -22.5F, -5.25F, 6.0F, 45.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r44 = tumbler_middle.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(409, 332).addBox(-2.75F, -25.25F, -4.5F, 5.0F, 50.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 31.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition tumbler_middle_smaller = tumbler.addOrReplaceChild("tumbler_middle_smaller", CubeListBuilder
				.create().texOffs(0, 34).addBox(-3.0F, -40.5F, -20.25F, 6.0F, 42.0F, 47.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition cube_r45 = tumbler_middle_smaller.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(107, 304).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -1.8326F));

		PartDefinition cube_r46 = tumbler_middle_smaller.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 304).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -2.0944F));

		PartDefinition cube_r47 = tumbler_middle_smaller.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(214, 270).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r48 = tumbler_middle_smaller.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(214, 180).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r49 = tumbler_middle_smaller.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(107, 214).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -1.309F));

		PartDefinition cube_r50 = tumbler_middle_smaller.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(214, 90).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r51 = tumbler_middle_smaller.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(214, 0).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r52 = tumbler_middle_smaller.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(0, 214).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r53 = tumbler_middle_smaller.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(107, 124).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r54 = tumbler_middle_smaller.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(0, 124).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r55 = tumbler_middle_smaller.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(107, 34).addBox(-3.0F, -21.0F, -43.5F, 6.0F, 42.0F, 47.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, 23.25F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tumbler_front = tumbler.addOrReplaceChild("tumbler_front",
				CubeListBuilder.create().texOffs(409, 390)
						.addBox(-3.0F, -45.0F, -25.5F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(457, 184)
						.addBox(-3.0F, 3.0F, -27.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(155, 448)
						.addBox(-3.0F, -45.0F, -27.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(321, 235)
						.addBox(-1.25F, -46.25F, -28.5F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition cube_r56 = tumbler_front.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(448, 254)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 326)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(364, 432)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -2.5307F));

		PartDefinition cube_r57 = tumbler_front.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(452, 266)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 350)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(432, 390)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, -0.001F, -0.0094F, -2.1382F));

		PartDefinition cube_r58 = tumbler_front.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(448, 447)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 338)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(412, 54)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r59 = tumbler_front.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(452, 314)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(458, 12)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(318, 432)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -1.3526F));

		PartDefinition cube_r60 = tumbler_front.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(455, 388)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(458, 24)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(226, 425)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(295, 365)
						.addBox(-1.25F, -26.75F, -3.75F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -1.1781F));

		PartDefinition cube_r61 = tumbler_front.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(452, 278)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 362)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(249, 425)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(268, 360)
						.addBox(-1.25F, -26.75F, -3.75F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -1.9635F));

		PartDefinition cube_r62 = tumbler_front.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(455, 424)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(446, 459)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(429, 274)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r63 = tumbler_front.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(452, 290)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 374)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(341, 432)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -1.7453F));

		PartDefinition cube_r64 = tumbler_front.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(387, 432)
						.addBox(-3.0F, -25.5F, 1.5F, 6.0F, 51.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(452, 302)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(458, 0)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(434, 331)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(321, 300)
						.addBox(-1.25F, -26.75F, -3.75F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r65 = tumbler_front.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(455, 400)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(458, 36)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(295, 430)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -0.9599F));

		PartDefinition cube_r66 = tumbler_front.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(455, 412)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(417, 459)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(412, 111)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(348, 235)
						.addBox(-1.25F, -26.75F, -3.75F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r67 = tumbler_front.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(457, 160)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 460)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(412, 168)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(214, 360)
						.addBox(-1.25F, -26.75F, -3.75F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r68 = tumbler_front.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(448, 242)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 208)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(203, 425)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(241, 360)
						.addBox(-1.25F, -26.75F, -3.75F, 2.0F, 53.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r69 = tumbler_front.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(448, 230)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(457, 196)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(272, 425)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r70 = tumbler_front.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(457, 172)
						.addBox(-3.0F, 22.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(29, 460)
						.addBox(-3.0F, -25.5F, -2.25F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(435, 0)
						.addBox(-3.0F, -25.5F, -0.75F, 6.0F, 51.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -24.75F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r71 = tumbler_front.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(348, 300).addBox(-1.25F, -26.75F, 4.5F, 2.0F, 53.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.5F, -33.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition other_tumbler = tumbler.addOrReplaceChild("other_tumbler",
				CubeListBuilder.create().texOffs(435, 82)
						.addBox(-5.75F, -17.0F, -37.5F, 11.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(435, 57)
						.addBox(-4.5F, -25.25F, -36.75F, 9.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(58, 460)
						.addBox(-5.75F, -26.75F, -39.0F, 11.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(321, 0)
						.addBox(-13.25F, -3.0F, -37.5F, 26.0F, 27.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition cube_r72 = other_tumbler.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(321, 202).addBox(-4.25F, -2.75F, -19.875F, 8.0F, 5.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.75F, -49.875F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r73 = other_tumbler.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(321, 39).addBox(-4.5F, -3.25F, -16.875F, 9.0F, 7.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.75F, -46.875F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		tumbler.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}