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

import net.mcreator.jimsmineshaft.procedures.StalkerPlaybackConditionTransformedProcedure;
import net.mcreator.jimsmineshaft.procedures.StalkerDisplayCondition2Procedure;
import net.mcreator.jimsmineshaft.procedures.StalkerDisplayCondition1Procedure;
import net.mcreator.jimsmineshaft.procedures.StalkerDisplayCondition0Procedure;
import net.mcreator.jimsmineshaft.entity.StalkerEntity;
import net.mcreator.jimsmineshaft.client.model.animations.stalkerAnimation;
import net.mcreator.jimsmineshaft.client.model.Modelstalker;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StalkerRenderer extends MobRenderer<StalkerEntity, LivingEntityRenderState, Modelstalker> {
	private StalkerEntity entity = null;

	public StalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelstalker.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/stalker_texture_mimicing.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StalkerDisplayCondition0Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/stalker_texture_split.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StalkerDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/stalker_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StalkerDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
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
	public void extractRenderState(StalkerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/nothing.png");
	}

	private static final class AnimatedModel extends Modelstalker {
		private StalkerEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(StalkerEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			if (StalkerDisplayCondition0Procedure.execute(entity))
				this.animateWalk(stalkerAnimation.villager_walk, state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.animate(entity.animationState1, stalkerAnimation.transformed_pose, state.ageInTicks, 1f);
			this.animate(entity.animationState2, stalkerAnimation.transform, state.ageInTicks, 1f);
			if (StalkerPlaybackConditionTransformedProcedure.execute(entity))
				this.animateWalk(stalkerAnimation.transform_walk, state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.animate(entity.animationState4, stalkerAnimation.impale_start, state.ageInTicks, 1f);
			this.animate(entity.animationState5, stalkerAnimation.impale_hit, state.ageInTicks, 1f);
			this.animate(entity.animationState6, stalkerAnimation.impale_fail, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}