package net.mcreator.jimsmineshaft.client.renderer;

public class ThecartRenderer extends MobRenderer<ThecartEntity, LivingEntityRenderState, ModeltheCart> {
	private ThecartEntity entity = null;

	public ThecartRenderer(EntityRendererProvider.Context context) {
		super(context, new ModeltheCart(context.bakeLayer(ModeltheCart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ThecartEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturecart1.png");
	}
}