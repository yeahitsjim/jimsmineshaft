package net.mcreator.jimsmineshaft.client.renderer;

public class Cart2Renderer extends MobRenderer<Cart2Entity, LivingEntityRenderState, ModelcartVariant1> {
	private Cart2Entity entity = null;

	public Cart2Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelcartVariant1(context.bakeLayer(ModelcartVariant1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Cart2Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturecartvariant1png.png");
	}
}