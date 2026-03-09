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
public class ModelplayerStalker extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelplayer_stalker"), "main");
	public final ModelPart main;
	public final ModelPart legs;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart head;
	public final ModelPart torso;
	public final ModelPart left_torso;
	public final ModelPart left_head;
	public final ModelPart left_arm;
	public final ModelPart bone;
	public final ModelPart right_torso;
	public final ModelPart right_head;
	public final ModelPart right_arm;

	public ModelplayerStalker(ModelPart root) {
		super(root);
		this.main = root.getChild("main");
		this.legs = this.main.getChild("legs");
		this.left_leg = this.legs.getChild("left_leg");
		this.right_leg = this.legs.getChild("right_leg");
		this.head = this.right_leg.getChild("head");
		this.torso = this.right_leg.getChild("torso");
		this.left_torso = this.torso.getChild("left_torso");
		this.left_head = this.left_torso.getChild("left_head");
		this.left_arm = this.left_torso.getChild("left_arm");
		this.bone = this.left_arm.getChild("bone");
		this.right_torso = this.torso.getChild("right_torso");
		this.right_head = this.right_torso.getChild("right_head");
		this.right_arm = this.right_torso.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition legs = main.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition left_leg = legs.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_leg = legs.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 0.0F, 0.0F));
		PartDefinition head = right_leg.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition torso = right_leg.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition left_torso = torso.addOrReplaceChild("left_torso",
				CubeListBuilder.create().texOffs(20, 32).addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(20, 16).addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_head = left_torso.addOrReplaceChild("left_head",
				CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(0.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition left_arm = left_torso.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(32, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, -10.0F, 0.0F));
		PartDefinition bone = left_arm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0F, 10.0F, 0.0F));
		PartDefinition right_torso = torso.addOrReplaceChild("right_torso",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_head = right_torso.addOrReplaceChild("right_head",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition right_arm = right_torso.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, -10.0F, 0.0F));
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