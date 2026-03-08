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
public class Modelbigirongateleft extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelbigirongateleft"), "main");
	public final ModelPart leftdoor;

	public Modelbigirongateleft(ModelPart root) {
		super(root);
		this.leftdoor = root.getChild("leftdoor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftdoor = partdefinition.addOrReplaceChild("leftdoor", CubeListBuilder.create().texOffs(32, 16).mirror().addBox(39.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 102).mirror()
				.addBox(-1.0F, -54.0F, -2.0F, 42.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 22).mirror().addBox(-1.0F, -32.0F, -1.5F, 41.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 16).mirror()
				.addBox(1.0F, 30.0F, -2.0F, 40.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 53).mirror().addBox(38.0F, 31.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 16).mirror()
				.addBox(33.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 16).mirror().addBox(27.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 16).mirror()
				.addBox(21.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 16).mirror().addBox(15.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 16).mirror()
				.addBox(9.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 102).mirror().addBox(3.0F, -52.0F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-22.0F, -7.75F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.leftdoor.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.leftdoor.xRot = headPitch / (180F / (float) Math.PI);
	}
}