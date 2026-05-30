package net.mcreator.jimsmineshaft.client.renderer;

public class CopperDrilledNorthRenderer extends MobRenderer<CopperDrilledNorthEntity, LivingEntityRenderState, ModelrawCopperDrilledNorth4> {
	private CopperDrilledNorthEntity entity = null;

	public CopperDrilledNorthRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelrawCopperDrilledNorth4.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CopperDrilledNorthEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/rcopper_0.png");
	}

	private static final class AnimatedModel extends ModelrawCopperDrilledNorth4 {
		private CopperDrilledNorthEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(CopperDrilledNorthEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, rawCopperDrilledNorthAnimations4.mining2, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}