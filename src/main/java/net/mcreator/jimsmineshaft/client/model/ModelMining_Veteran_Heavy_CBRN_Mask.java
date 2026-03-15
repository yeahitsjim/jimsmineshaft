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
public class ModelMining_Veteran_Heavy_CBRN_Mask extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "model_mining_veteran_heavy_cbrn_mask"), "main");
	public final ModelPart Head;

	public ModelMining_Veteran_Heavy_CBRN_Mask(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.3F, -4.6F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(104, 59).addBox(-4.0F, -6.3F, 4.4F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HatLayer_r1 = Head.addOrReplaceChild("HatLayer_r1", CubeListBuilder.create().texOffs(31, 121).addBox(0.0859F, -2.4606F, -1.8964F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, -0.9163F, 0.3491F));
		PartDefinition HatLayer_r2 = Head.addOrReplaceChild("HatLayer_r2", CubeListBuilder.create().texOffs(109, 120).addBox(-0.1578F, -2.4312F, -2.1933F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, -1.4835F, 0.3491F));
		PartDefinition HatLayer_r3 = Head.addOrReplaceChild("HatLayer_r3", CubeListBuilder.create().texOffs(43, 121).addBox(-1.1578F, -2.4312F, -3.1933F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 1.1762F, -5.4523F, 0.0F, -1.4835F, 0.3491F));
		PartDefinition HatLayer_r4 = Head.addOrReplaceChild("HatLayer_r4", CubeListBuilder.create().texOffs(121, 48).addBox(-0.1578F, -1.4312F, -2.1933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.6762F, -5.9523F, 0.0F, -1.4835F, 0.3491F));
		PartDefinition HatLayer_r5 = Head.addOrReplaceChild("HatLayer_r5", CubeListBuilder.create().texOffs(36, 121).addBox(-0.8422F, -1.4312F, -2.1933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.6762F, -5.9523F, 0.0F, 1.4835F, -0.3491F));
		PartDefinition HatLayer_r6 = Head.addOrReplaceChild("HatLayer_r6", CubeListBuilder.create().texOffs(73, 113).addBox(-0.8422F, -2.4312F, -3.1933F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 1.1762F, -5.4523F, 0.0F, 1.4835F, -0.3491F));
		PartDefinition HatLayer_r7 = Head.addOrReplaceChild("HatLayer_r7", CubeListBuilder.create().texOffs(102, 120).addBox(-1.8422F, -2.4312F, -2.1933F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, 1.4835F, -0.3491F));
		PartDefinition HatLayer_r8 = Head.addOrReplaceChild("HatLayer_r8", CubeListBuilder.create().texOffs(26, 121).addBox(-1.0859F, -2.4606F, -1.8964F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, 0.9163F, -0.3491F));
		PartDefinition HatLayer_r9 = Head.addOrReplaceChild("HatLayer_r9", CubeListBuilder.create().texOffs(95, 120).addBox(-1.5388F, -2.4434F, -1.0787F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, 0.0F, -0.3491F));
		PartDefinition HatLayer_r10 = Head.addOrReplaceChild("HatLayer_r10", CubeListBuilder.create().texOffs(119, 34).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8982F, -5.3636F, -4.5701F, -0.3043F, -0.0262F, -0.0832F));
		PartDefinition HatLayer_r11 = Head.addOrReplaceChild("HatLayer_r11", CubeListBuilder.create().texOffs(116, 120).addBox(-1.5F, 3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8982F, -5.3636F, -4.4701F, -0.3043F, -0.0262F, -0.0832F));
		PartDefinition HatLayer_r12 = Head.addOrReplaceChild("HatLayer_r12", CubeListBuilder.create().texOffs(0, 121).addBox(-2.5F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3982F, -5.3636F, -4.4701F, -0.3043F, -0.0262F, -0.0832F));
		PartDefinition HatLayer_r13 = Head.addOrReplaceChild("HatLayer_r13", CubeListBuilder.create().texOffs(19, 50).addBox(1.5F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3982F, -5.3636F, -4.4701F, -0.3043F, 0.0262F, 0.0832F));
		PartDefinition HatLayer_r14 = Head.addOrReplaceChild("HatLayer_r14", CubeListBuilder.create().texOffs(117, 45).addBox(-1.5F, 3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8982F, -5.3636F, -4.4701F, -0.3043F, 0.0262F, 0.0832F));
		PartDefinition HatLayer_r15 = Head.addOrReplaceChild("HatLayer_r15", CubeListBuilder.create().texOffs(110, 34).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8982F, -5.3636F, -4.5701F, -0.3043F, 0.0262F, 0.0832F));
		PartDefinition HatLayer_r16 = Head.addOrReplaceChild("HatLayer_r16", CubeListBuilder.create().texOffs(121, 52).addBox(0.4612F, -2.4434F, -1.0787F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.1238F, -5.4523F, 0.0F, 0.0F, -0.3491F));
		PartDefinition HatLayer_r17 = Head.addOrReplaceChild("HatLayer_r17", CubeListBuilder.create().texOffs(50, 121).addBox(-1.4612F, -2.4434F, -1.0787F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -0.1238F, -5.4523F, 0.0F, 0.0F, 0.3491F));
		PartDefinition HatLayer_r18 = Head.addOrReplaceChild("HatLayer_r18", CubeListBuilder.create().texOffs(26, 115).addBox(-0.4612F, -2.4434F, -1.0787F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, 0.0F, 0.3491F));
		PartDefinition HatLayer_r19 = Head.addOrReplaceChild("HatLayer_r19",
				CubeListBuilder.create().texOffs(6, 121).addBox(0.0F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 121).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -4.0F, -5.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition HatLayer_r20 = Head.addOrReplaceChild("HatLayer_r20", CubeListBuilder.create().texOffs(72, 107).addBox(-1.0F, -2.142F, -1.1741F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3238F, -5.4523F, 0.0F, 0.0F, 0.0F));
		PartDefinition HatLayer_r21 = Head.addOrReplaceChild("HatLayer_r21", CubeListBuilder.create().texOffs(80, 124).addBox(-1.0F, -2.0F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r22 = Head.addOrReplaceChild("HatLayer_r22", CubeListBuilder.create().texOffs(85, 124).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7681F, -2.564F, 6.5F, -0.8727F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r23 = Head.addOrReplaceChild("HatLayer_r23", CubeListBuilder.create().texOffs(125, 29).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.635F, -1.8096F, 7.1428F, -1.3526F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r24 = Head.addOrReplaceChild("HatLayer_r24", CubeListBuilder.create().texOffs(116, 123).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4655F, -0.8482F, 7.3592F, -1.6144F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r25 = Head.addOrReplaceChild("HatLayer_r25", CubeListBuilder.create().texOffs(36, 125).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.292F, 0.1357F, 7.3156F, -1.9635F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r26 = Head.addOrReplaceChild("HatLayer_r26", CubeListBuilder.create().texOffs(123, 117).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1316F, 1.0455F, 6.9329F, -2.3126F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r27 = Head.addOrReplaceChild("HatLayer_r27", CubeListBuilder.create().texOffs(121, 123).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0036F, 1.7716F, 6.2573F, -2.5744F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r28 = Head.addOrReplaceChild("HatLayer_r28", CubeListBuilder.create().texOffs(110, 67).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9103F, 2.3008F, 5.4139F, -3.0543F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r29 = Head.addOrReplaceChild("HatLayer_r29", CubeListBuilder.create().texOffs(110, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9103F, 2.3008F, 5.4139F, -3.0543F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r30 = Head.addOrReplaceChild("HatLayer_r30", CubeListBuilder.create().texOffs(123, 114).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0036F, 1.7716F, 6.2573F, -2.5744F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r31 = Head.addOrReplaceChild("HatLayer_r31", CubeListBuilder.create().texOffs(123, 111).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1316F, 1.0455F, 6.9329F, -2.3126F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r32 = Head.addOrReplaceChild("HatLayer_r32", CubeListBuilder.create().texOffs(125, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.292F, 0.1357F, 7.3156F, -1.9635F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r33 = Head.addOrReplaceChild("HatLayer_r33", CubeListBuilder.create().texOffs(34, 104).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4655F, -0.8482F, 7.3592F, -1.6144F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r34 = Head.addOrReplaceChild("HatLayer_r34", CubeListBuilder.create().texOffs(90, 124).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.635F, -1.8096F, 7.1428F, -1.3526F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r35 = Head.addOrReplaceChild("HatLayer_r35", CubeListBuilder.create().texOffs(75, 124).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7681F, -2.564F, 6.5F, -0.8727F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r36 = Head.addOrReplaceChild("HatLayer_r36", CubeListBuilder.create().texOffs(70, 124).addBox(0.0F, -2.0F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r37 = Head.addOrReplaceChild("HatLayer_r37", CubeListBuilder.create().texOffs(50, 38).mirror().addBox(-1.0F, -3.0F, -5.5F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.5F, -1.5F, 0.2F, 0.0F, 0.0F, -0.1745F));
		PartDefinition HatLayer_r38 = Head.addOrReplaceChild("HatLayer_r38", CubeListBuilder.create().texOffs(50, 38).addBox(-1.0F, -3.0F, -5.5F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -1.5F, 0.2F, 0.0F, 0.0F, 0.1745F));
		PartDefinition HatLayer_r39 = Head.addOrReplaceChild("HatLayer_r39",
				CubeListBuilder.create().texOffs(29, 25).addBox(-1.0F, -1.0F, -5.0F, 6.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(27, 82).addBox(3.0F, 2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -6.0F, 0.25F, 0.0F, 0.0F, -0.2618F));
		PartDefinition HatLayer_r40 = Head.addOrReplaceChild("HatLayer_r40",
				CubeListBuilder.create().texOffs(37, 0).addBox(-5.0F, 2.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(29, 12).addBox(-5.0F, -1.0F, -5.0F, 6.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -6.0F, 0.25F, 0.0F, 0.0F, 0.2618F));
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