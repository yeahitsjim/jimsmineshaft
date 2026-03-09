package net.mcreator.jimsmineshaft.client.renderer;

public class Cart4Renderer extends MobRenderer<Cart4Entity, LivingEntityRenderState, ModelcartVariant3> {
	private Cart4Entity entity = null;

	public Cart4Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelcartVariant3(context.bakeLayer(ModelcartVariant3.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Cart4Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturecartvariant3png.png");
	}
}