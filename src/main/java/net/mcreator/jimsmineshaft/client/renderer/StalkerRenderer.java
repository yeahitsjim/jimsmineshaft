package net.mcreator.jimsmineshaft.client.renderer;

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
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/stalker_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
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
			super.setupAnim(state);
		}
	}
}