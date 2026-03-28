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
public class Modelanimal_amalgamation extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelanimal_amalgamation"), "main");
	public final ModelPart all;
	public final ModelPart body;
	public final ModelPart waist;
	public final ModelPart chest;
	public final ModelPart armR;
	public final ModelPart armControlR;
	public final ModelPart forearmR;
	public final ModelPart weapon;
	public final ModelPart armL;
	public final ModelPart forearmL;
	public final ModelPart scyth;
	public final ModelPart head;
	public final ModelPart tail;
	public final ModelPart legFR;
	public final ModelPart legFL;
	public final ModelPart legBR;
	public final ModelPart legBL;

	public Modelanimal_amalgamation(ModelPart root) {
		super(root);
		this.all = root.getChild("all");
		this.body = this.all.getChild("body");
		this.waist = this.body.getChild("waist");
		this.chest = this.waist.getChild("chest");
		this.armR = this.chest.getChild("armR");
		this.armControlR = this.armR.getChild("armControlR");
		this.forearmR = this.armControlR.getChild("forearmR");
		this.weapon = this.forearmR.getChild("weapon");
		this.armL = this.chest.getChild("armL");
		this.forearmL = this.armL.getChild("forearmL");
		this.scyth = this.forearmL.getChild("scyth");
		this.head = this.chest.getChild("head");
		this.tail = this.body.getChild("tail");
		this.legFR = this.body.getChild("legFR");
		this.legFL = this.body.getChild("legFL");
		this.legBR = this.body.getChild("legBR");
		this.legBL = this.body.getChild("legBL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -20.0F, -10.0F, 10.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition waist = body.addOrReplaceChild("waist",
				CubeListBuilder.create().texOffs(24, 59).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(24, 47).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -20.0F, -6.0F));
		PartDefinition chest = waist.addOrReplaceChild("chest",
				CubeListBuilder.create().texOffs(0, 60).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(48, 59).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition armR = chest.addOrReplaceChild("armR",
				CubeListBuilder.create().texOffs(32, 71).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 71).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -5.0F, 0.0F));
		PartDefinition armControlR = armR.addOrReplaceChild("armControlR", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition forearmR = armControlR.addOrReplaceChild("forearmR",
				CubeListBuilder.create().texOffs(72, 57).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition weapon = forearmR.addOrReplaceChild("weapon",
				CubeListBuilder.create().texOffs(80, 10).addBox(0.0F, -6.5F, -8.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(80, 75).addBox(-1.0F, -2.5F, -11.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-0.5F, -1.5F, -11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21).addBox(-1.0F, -2.5F, -8.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(80, 36)
						.addBox(0.0F, -0.5F, -6.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -1.5F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r1 = weapon.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 29).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = weapon.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 79).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition armL = chest.addOrReplaceChild("armL",
				CubeListBuilder.create().texOffs(16, 71).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 46).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(6.0F, -5.0F, 0.0F));
		PartDefinition forearmL = armL.addOrReplaceChild("forearmL", CubeListBuilder.create().texOffs(80, 67).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition scyth = forearmL.addOrReplaceChild("scyth", CubeListBuilder.create().texOffs(0, 47).addBox(-7.0F, -1.0F, 0.0F, 12.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition head = chest.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 31).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(48, 47)
				.addBox(-2.0F, -9.5F, -6.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(62, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 11.0F));
		PartDefinition legFR = body.addOrReplaceChild("legFR", CubeListBuilder.create().texOffs(64, 18).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -10.0F, -7.0F));
		PartDefinition legFL = body.addOrReplaceChild("legFL", CubeListBuilder.create().texOffs(64, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -10.0F, -7.0F));
		PartDefinition legBR = body.addOrReplaceChild("legBR", CubeListBuilder.create().texOffs(48, 70).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -10.0F, 9.0F));
		PartDefinition legBL = body.addOrReplaceChild("legBL", CubeListBuilder.create().texOffs(64, 70).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -10.0F, 9.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.armControlR.xRot = headPitch / (180F / (float) Math.PI);
	}
}