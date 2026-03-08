package net.mcreator.jimsmineshaft.client.renderer;

public class BigIronGateRightRenderer extends MobRenderer<BigIronGateRightEntity, LivingEntityRenderState, Modelbigirongateright> {
	private BigIronGateRightEntity entity = null;

	public BigIronGateRightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigirongateright(context.bakeLayer(Modelbigirongateright.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BigIronGateRightEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/bigirongateentity.png");
	}
}