package net.mcreator.jimsmineshaft.client.renderer;

public class CartelevatorEastRenderer extends MobRenderer<CartelevatorEastEntity, LivingEntityRenderState, ModelCartElevator> {
	private CartelevatorEastEntity entity = null;

	public CartelevatorEastRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCartElevator(context.bakeLayer(ModelCartElevator.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CartelevatorEastEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturecartelevatorfinished4.png");
	}
}