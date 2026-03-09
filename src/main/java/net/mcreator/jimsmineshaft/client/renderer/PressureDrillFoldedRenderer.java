package net.mcreator.jimsmineshaft.client.renderer;

public class PressureDrillFoldedRenderer extends MobRenderer<PressureDrillFoldedEntity, LivingEntityRenderState, ModelPressureDrillBlockFolded4> {
	private PressureDrillFoldedEntity entity = null;

	public PressureDrillFoldedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPressureDrillBlockFolded4(context.bakeLayer(ModelPressureDrillBlockFolded4.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PressureDrillFoldedEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturepressuredrillfolded.png");
	}
}