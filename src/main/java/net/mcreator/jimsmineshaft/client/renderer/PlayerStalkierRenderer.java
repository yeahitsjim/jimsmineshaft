package net.mcreator.jimsmineshaft.client.renderer;

public class PlayerStalkierRenderer extends MobRenderer<PlayerStalkierEntity, LivingEntityRenderState, ModelplayerStalker> {
	private PlayerStalkierEntity entity = null;

	public PlayerStalkierRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelplayerStalker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PlayerStalkierEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/itsjim_.png");
	}

	private static final class AnimatedModel extends ModelplayerStalker {
		private PlayerStalkierEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(PlayerStalkierEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, playerStalkerAnimation.snap, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}