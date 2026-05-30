package net.mcreator.jimsmineshaft.client.renderer;

public class ElevatorSeat8Renderer extends MobRenderer<ElevatorSeat8Entity, ChickenRenderState, ChickenModel> {
	private ElevatorSeat8Entity entity = null;

	public ElevatorSeat8Renderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ChickenRenderState createRenderState() {
		return new ChickenRenderState();
	}

	@Override
	public void extractRenderState(ElevatorSeat8Entity entity, ChickenRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(ChickenRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/blankltexture.png");
	}
}