package net.mcreator.jimsmineshaft.client.renderer;

public class ElevatorSeat4Renderer extends MobRenderer<ElevatorSeat4Entity, ChickenRenderState, ChickenModel> {
	private ElevatorSeat4Entity entity = null;

	public ElevatorSeat4Renderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ChickenRenderState createRenderState() {
		return new ChickenRenderState();
	}

	@Override
	public void extractRenderState(ElevatorSeat4Entity entity, ChickenRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(ChickenRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/blankltexture.png");
	}
}