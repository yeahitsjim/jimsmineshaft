package net.mcreator.jimsmineshaft.client.renderer;

public class ElevatorRenderer extends MobRenderer<ElevatorEntity, LivingEntityRenderState, ModelElevator3> {
	private ElevatorEntity entity = null;

	public ElevatorRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelElevator3.LAYER_LOCATION)), 2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ElevatorEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/textureelevatorcarwip98.png");
	}

	private static final class AnimatedModel extends ModelElevator3 {
		private ElevatorEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(ElevatorEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, theElevator1Animation.open4, state.ageInTicks, 1f);
			this.animate(entity.animationState1, theElevator1Animation.close1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}