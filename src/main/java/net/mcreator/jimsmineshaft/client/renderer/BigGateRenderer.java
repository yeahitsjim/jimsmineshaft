package net.mcreator.jimsmineshaft.client.renderer;

public class BigGateRenderer extends MobRenderer<BigGateEntity, LivingEntityRenderState, Modelbiggate> {
	private BigGateEntity entity = null;

	public BigGateRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbiggate.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BigGateEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/bigirongateentity.png");
	}

	private static final class AnimatedModel extends Modelbiggate {
		private BigGateEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(BigGateEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, biggateAnimation.gateopen, state.ageInTicks, 1f);
			this.animate(entity.animationState1, biggateAnimation.gateclose, state.ageInTicks, 1f);
			this.animate(entity.animationState2, biggateAnimation.open, state.ageInTicks, 1f);
			this.animate(entity.animationState3, biggateAnimation.close, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}