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
public class Modelopengate extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelopengate"), "main");
	public final ModelPart leftdoor;
	public final ModelPart bone;
	public final ModelPart frame;

	public Modelopengate(ModelPart root) {
		super(root);
		this.leftdoor = root.getChild("leftdoor");
		this.bone = root.getChild("bone");
		this.frame = this.bone.getChild("frame");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftdoor = partdefinition.addOrReplaceChild("leftdoor",
				CubeListBuilder.create().texOffs(32, 16).mirror().addBox(-4.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 102).mirror()
						.addBox(-44.5455F, -45.0455F, -2.0F, 44.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 22).mirror().addBox(-44.5455F, -23.0455F, -1.5F, 45.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(104, 16).mirror().addBox(-42.5455F, 38.9545F, -2.0F, 43.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 53).mirror().addBox(-5.5455F, 39.9545F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(44, 16).mirror().addBox(-10.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 16).mirror()
						.addBox(-16.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 16).mirror().addBox(-22.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(80, 16).mirror().addBox(-28.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 16).mirror()
						.addBox(-34.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 102).mirror().addBox(-40.5455F, -43.0455F, -2.0F, 2.0F, 82.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(21.5455F, -16.7045F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(19.0F, -54.1695F, -1.6667F));
		PartDefinition frame = bone.addOrReplaceChild(
				"frame", CubeListBuilder.create().texOffs(0, 16).addBox(21.0381F, -28.8087F, -4.0F, 8.0F, 88.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
						.addBox(-29.0761F, -32.3827F, -6.0F, 58.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 16).mirror().addBox(-28.9619F, -28.8087F, -4.0F, 8.0F, 88.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-19.0381F, 19.2281F, 1.6667F));
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