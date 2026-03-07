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
public class Modelbigirongateframe extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "modelbigirongateframe"), "main");
	public final ModelPart bone;
	public final ModelPart frame;
	public final ModelPart group2;
	public final ModelPart group;

	public Modelbigirongateframe(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.frame = this.bone.getChild("frame");
		this.group2 = this.bone.getChild("group2");
		this.group = this.bone.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -69.2232F, -0.5556F));
		PartDefinition frame = bone.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(0, 16).addBox(40.0F, -9.5805F, -2.3333F, 8.0F, 88.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16).mirror()
				.addBox(-48.0F, -9.5805F, -2.3333F, 8.0F, 88.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 15.0537F, -1.1111F));
		PartDefinition cube_r1 = frame.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(14.5084F, -53.1576F, -4.0F, 51.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 58).mirror()
						.addBox(58.5084F, -49.1576F, -4.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 58).mirror().addBox(58.5084F, -49.1576F, 6.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-40.0F, 46.4195F, -0.3333F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r2 = frame
				.addOrReplaceChild(
						"cube_r2", CubeListBuilder.create().texOffs(104, 58).addBox(-61.5084F, -49.1576F, -4.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 58)
								.addBox(-61.5084F, -49.1576F, 6.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-65.5084F, -53.1576F, -4.0F, 51.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(40.0F, 46.4195F, -0.3333F, 0.0F, 0.0F, 0.3927F));
		PartDefinition group2 = bone.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(104, 95).addBox(-1.0F, 9.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 43).addBox(-1.0F, 7.0F, 6.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 68)
						.addBox(-1.0F, 13.0F, 12.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 77).addBox(2.5F, 11.0F, 16.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 86)
						.addBox(2.5F, 11.0F, 9.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108).addBox(-3.5F, 11.0F, 9.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 108)
						.addBox(-3.5F, 11.0F, 16.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 27).addBox(-3.5F, 11.0F, 9.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 35)
						.addBox(-3.5F, 19.0F, 9.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.5268F, -1.4444F));
		PartDefinition group = bone.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(104, 95).addBox(-1.0F, 9.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 43).addBox(-1.0F, 7.0F, -14.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 68)
						.addBox(-1.0F, 13.0F, -14.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 77).addBox(2.5F, 11.0F, -17.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 86)
						.addBox(2.5F, 11.0F, -10.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 108).addBox(-3.5F, 11.0F, -10.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 108)
						.addBox(-3.5F, 11.0F, -17.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 27).addBox(-3.5F, 11.0F, -17.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 35)
						.addBox(-3.5F, 19.0F, -17.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.5268F, 2.5556F));
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