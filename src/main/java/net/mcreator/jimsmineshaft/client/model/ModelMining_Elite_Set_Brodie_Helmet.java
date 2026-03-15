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
public class ModelMining_Elite_Set_Brodie_Helmet extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "model_mining_elite_set_brodie_helmet"), "main");
	public final ModelPart Head;
	public final ModelPart bone;

	public ModelMining_Elite_Set_Brodie_Helmet(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.bone = this.Head.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(89, 111).addBox(-4.5F, -8.5F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(101, 114).addBox(-4.0F, -8.75F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(104, 115)
						.addBox(-3.5F, -9.0F, -3.5F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.5F)).texOffs(107, 116).addBox(-3.0F, -9.25F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(110, 117)
						.addBox(-2.5F, -9.5F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(83, 108).addBox(-7.0F, 0.5F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.5F)).texOffs(0, 117).addBox(5.0F, 1.5F, -3.0F, 0.0F, 5.0F, 0.0F, new CubeDeformation(0.5F)).texOffs(0, 117)
						.addBox(-5.0F, 1.5F, -3.0F, 0.0F, 5.0F, 0.0F, new CubeDeformation(0.5F)).texOffs(0, 123).addBox(-4.0F, 7.5F, -3.0F, 8.0F, 0.0F, 0.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -6.5F, 0.0F));
		PartDefinition HatLayer_r1 = bone.addOrReplaceChild("HatLayer_r1",
				CubeListBuilder.create().texOffs(109, 120).addBox(-2.0706F, 0.5F, 6.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(109, 108).addBox(-4.9294F, 0.5F, -8.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.309F, 0.0F));
		PartDefinition HatLayer_r2 = bone.addOrReplaceChild("HatLayer_r2",
				CubeListBuilder.create().texOffs(109, 120).addBox(-2.0706F, 0.5F, 6.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(109, 120).addBox(-4.9294F, 0.5F, -8.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition HatLayer_r3 = bone.addOrReplaceChild("HatLayer_r3",
				CubeListBuilder.create().texOffs(109, 120).addBox(-4.9294F, 0.5F, 6.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(109, 120).addBox(-2.0706F, 0.5F, -8.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition HatLayer_r4 = bone.addOrReplaceChild("HatLayer_r4",
				CubeListBuilder.create().texOffs(109, 114).addBox(-4.9294F, 0.5F, 6.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(109, 111).addBox(-2.0706F, 0.5F, -8.7274F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -1.309F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}