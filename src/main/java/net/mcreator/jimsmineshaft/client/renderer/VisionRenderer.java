package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.procedures.VisionDisplayConditionGlowProcedure;
import net.mcreator.jimsmineshaft.entity.VisionEntity;
import net.mcreator.jimsmineshaft.client.model.animations.shadow_manAnimation;
import net.mcreator.jimsmineshaft.client.model.Modelshadow_man;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VisionRenderer extends MobRenderer<VisionEntity, LivingEntityRenderState, Modelshadow_man> {
	private VisionEntity entity = null;

	public VisionRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelshadow_man.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/shadow_guy_texture_mask.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (VisionDisplayConditionGlowProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
				}
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(VisionEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/shadow_guy_texture_mask_black.png");
	}

	private static final class AnimatedModel extends Modelshadow_man {
		private VisionEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(VisionEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, shadow_manAnimation.crawl_pose, state.ageInTicks, 1f);
			this.animate(entity.animationState1, shadow_manAnimation.stand_head_tile_pose, state.ageInTicks, 1f);
			this.animate(entity.animationState2, shadow_manAnimation.sobbing_pose, state.ageInTicks, 1f);
			this.animate(entity.animationState3, shadow_manAnimation.decapitated_pose, state.ageInTicks, 1f);
			this.animate(entity.animationState4, shadow_manAnimation.spasm_1, state.ageInTicks, 1f);
			this.animate(entity.animationState5, shadow_manAnimation.spasm_2, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}