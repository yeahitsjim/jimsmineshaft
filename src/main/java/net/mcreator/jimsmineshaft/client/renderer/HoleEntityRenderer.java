package net.mcreator.jimsmineshaft.client.renderer;

public class HoleEntityRenderer extends MobRenderer<HoleEntityEntity, LivingEntityRenderState, ModelnorthHole> {
	private HoleEntityEntity entity = null;

	public HoleEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelnorthHole(context.bakeLayer(ModelnorthHole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HoleEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturehole.png");
	}
}