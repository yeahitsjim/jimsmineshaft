package net.mcreator.jimsmineshaft.client.renderer;

public class StalkerInsidesRenderer extends MobRenderer<StalkerInsidesEntity, LivingEntityRenderState, ModelstalkerInsides> {
	private StalkerInsidesEntity entity = null;

	public StalkerInsidesRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelstalkerInsides.LAYER_LOCATION)), 0.02f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/texturestalkerinsides.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelstalkerInsides(Minecraft.getInstance().getEntityModels().bakeLayer(ModelstalkerInsides.LAYER_LOCATION));
				model.setupAnim(state);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StalkerInsidesEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/blankltexture.png");
	}

	private static final class AnimatedModel extends ModelstalkerInsides {
		private StalkerInsidesEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(StalkerInsidesEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, stalkerInsidesAnimation.snap, state.ageInTicks, 1f);
			this.animateWalk(stalkerInsidesAnimation.walk3, state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			super.setupAnim(state);
		}
	}
}