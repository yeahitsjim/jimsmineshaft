package net.mcreator.jimsmineshaft.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelcartPhase5 extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelcart_phase_5"), "main");
	public final ModelPart main;
	public final ModelPart hold;

	public ModelcartPhase5(ModelPart root) {
		super(root);
		this.main = root.getChild("main");
		this.hold = this.main.getChild("hold");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(-1.0F, 8.0F, 0.0F));
		PartDefinition hold = main.addOrReplaceChild("hold", CubeListBuilder.create().texOffs(3, 0).addBox(6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition cube_r1 = hold.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 3).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -3.0F, 9.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r2 = hold.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -2.0F, 10.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r3 = hold.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 2).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r4 = hold.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-1, 2).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 12.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r5 = hold.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 7.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r6 = hold.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r7 = hold.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, -4.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r8 = hold.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, -6.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r9 = hold.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -3.0F, -10.0F, 0.0F, 1.6144F, 0.0F));
		PartDefinition cube_r10 = hold.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.0F, -6.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r11 = hold.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(3, 3).addBox(-2.0F, -2.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, -3.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r12 = hold.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 5).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -3.0F, -1.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r13 = hold.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(2, 3).addBox(-3.0F, -3.0F, -6.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, 1.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r14 = hold.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(6, 5).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -3.0F, 7.0F, 0.0F, -0.8727F, 0.0F));
		PartDefinition cube_r15 = hold.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(3, 3).addBox(-5.0F, -1.0F, -5.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -3.0F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r16 = hold.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, 7.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r17 = hold.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 6.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r18 = hold.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.0F, 6.0F, 0.0F, 1.2217F, 0.0F));
		PartDefinition cube_r19 = hold.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.0F, 5.0F, 0.0F, 1.2217F, 0.0F));
		PartDefinition cube_r20 = hold.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(3, 3).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 10.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r21 = hold.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(3, 3).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, 10.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r22 = hold.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 2).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0F, 11.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r23 = hold.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 9.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r24 = hold.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 0.0F, 0.0F, -2.0508F, 0.0F));
		PartDefinition cube_r25 = hold.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(-2, -2).addBox(-4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, 13.0F, 0.0F, -2.0508F, 0.0F));
		PartDefinition cube_r26 = hold.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -2.0F, 6.0F, 0.0F, -2.0508F, 0.0F));
		PartDefinition cube_r27 = hold.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-1, 0).addBox(-5.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -6.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r28 = hold.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 1).addBox(-5.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r29 = hold.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -4.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r30 = hold.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(1, 0).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -8.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r31 = hold.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r32 = hold.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 3).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, -4.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r33 = hold.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 2).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r34 = hold.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 1).addBox(-6.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -3.0F, 3.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r35 = hold.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(4, 7).addBox(-5.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, 2.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r36 = hold.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 7).addBox(-4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r37 = hold.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -4.0F, 0.0F, 1.7453F, 0.0F));
		PartDefinition cube_r38 = hold.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -2.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r39 = hold.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}