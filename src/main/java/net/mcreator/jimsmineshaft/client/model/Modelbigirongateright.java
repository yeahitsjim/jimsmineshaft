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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbigirongateright extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelbigirongateright"), "main");
	public final ModelPart rightdoor;

	public Modelbigirongateright(ModelPart root) {
		super(root);
		this.rightdoor = root.getChild("rightdoor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightdoor = partdefinition.addOrReplaceChild("rightdoor",
				CubeListBuilder.create().texOffs(32, 16).addBox(-41.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 102).addBox(-41.0F, -54.0F, -2.0F, 42.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
						.addBox(-40.5F, -32.0F, -1.5F, 41.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(104, 16).addBox(-41.0F, 30.0F, -2.0F, 40.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 53)
						.addBox(-42.0F, 31.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 16).addBox(-35.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 16)
						.addBox(-29.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 16).addBox(-23.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 16)
						.addBox(-17.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 16).addBox(-11.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 102)
						.addBox(-5.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(22.0F, -7.75F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.rightdoor.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.rightdoor.xRot = headPitch / (180F / (float) Math.PI);
	}
}