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
public class ModelstalkerInsides extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelstalker_insides"), "main");
	public final ModelPart main;
	public final ModelPart torso;
	public final ModelPart left_torso;
	public final ModelPart left_head;
	public final ModelPart left_arm;
	public final ModelPart bone;
	public final ModelPart right_torso;
	public final ModelPart right_head;
	public final ModelPart right_arm;
	public final ModelPart legs;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelstalkerInsides(ModelPart root) {
		super(root);
		this.main = root.getChild("main");
		this.torso = this.main.getChild("torso");
		this.left_torso = this.torso.getChild("left_torso");
		this.left_head = this.left_torso.getChild("left_head");
		this.left_arm = this.left_torso.getChild("left_arm");
		this.bone = this.left_arm.getChild("bone");
		this.right_torso = this.torso.getChild("right_torso");
		this.right_head = this.right_torso.getChild("right_head");
		this.right_arm = this.right_torso.getChild("right_arm");
		this.legs = this.main.getChild("legs");
		this.left_leg = this.legs.getChild("left_leg");
		this.right_leg = this.legs.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition torso = main.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition left_torso = torso.addOrReplaceChild("left_torso", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -11.0F, -1.0F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(22, 6)
				.addBox(-2.0F, -9.0F, -0.5F, 6.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(21, 8).addBox(-2.0F, -7.0F, 0.5F, 6.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_head = left_torso.addOrReplaceChild("left_head",
				CubeListBuilder.create().texOffs(15, 5).addBox(0.0F, -7.0F, -2.6F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(10, 23).addBox(0.0F, -7.0F, 2.8F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(18, 0)
						.addBox(0.0F, -7.0F, -2.1F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(0, 23).addBox(-0.5F, -6.6F, -2.1F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-1.0F, -3.0F, -3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-1.0F, -6.0F, -3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-1.0F, -3.0F, 3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-1.0F, -5.0F, 3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-1.0F, -6.0F, 3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-1.0F, -7.2F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition left_brain_r1 = left_head.addOrReplaceChild("left_brain_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -25.2F, -3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, 5.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition left_brain_r2 = left_head.addOrReplaceChild("left_brain_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 1.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition left_brain_r3 = left_head.addOrReplaceChild("left_brain_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -1.0F, 0.0F, 0.1745F, -0.0873F));
		PartDefinition left_brain_r4 = left_head.addOrReplaceChild("left_brain_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -2.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition left_brain_r5 = left_head.addOrReplaceChild("left_brain_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 3.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_brain_r6 = left_head.addOrReplaceChild("left_brain_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 3.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition left_brain_r7 = left_head.addOrReplaceChild("left_brain_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_brain_r8 = left_head.addOrReplaceChild("left_brain_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -25.0F, -3.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, 0.0F, -0.0873F, 0.0F));
		PartDefinition left_brain_r9 = left_head.addOrReplaceChild("left_brain_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -3.0F, 0.0F, -0.2618F, -0.0436F));
		PartDefinition left_arm = left_torso.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(4.0F, -10.0F, 0.0F));
		PartDefinition bone = left_arm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0F, 10.0F, 0.0F));
		PartDefinition right_torso = torso.addOrReplaceChild("right_torso", CubeListBuilder.create().texOffs(14, 11).addBox(-3.0F, -11.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_head = right_torso.addOrReplaceChild("right_head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -2.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(1.0F, -6.5F, -2.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(1.0F, -4.5F, -2.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(1.0F, -3.5F, -2.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(1.0F, -2.5F, -2.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(1.0F, -1.5F, -2.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(1.0F, -5.5F, 3.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition right_brain_r1 = right_head.addOrReplaceChild("right_brain_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, -1.0F, 3.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_brain_r2 = right_head.addOrReplaceChild("right_brain_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_brain_r3 = right_head.addOrReplaceChild("right_brain_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, -3.0F, 3.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition right_brain_r4 = right_head.addOrReplaceChild("right_brain_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, 3.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_brain_r5 = right_head.addOrReplaceChild("right_brain_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.2F, 0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.0F, -7.0F, 0.0F, 0.0F, 0.5672F, 0.0F));
		PartDefinition right_brain_r6 = right_head.addOrReplaceChild("right_brain_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.2F, 0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.0F, -7.0F, 2.0F, 0.0F, -0.0873F, 0.0F));
		PartDefinition right_brain_r7 = right_head.addOrReplaceChild("right_brain_r7", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -31.5F, -1.8F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 25.0F, 5.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition right_brain_r8 = right_head.addOrReplaceChild("right_brain_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.2F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.0F, -5.0F, -2.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition right_arm = right_torso.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-4.0F, -10.0F, 0.0F));
		PartDefinition legs = main.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition left_leg = legs.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition right_leg = legs.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-4.0F, -12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}