package net.mcreator.jimsmineshaft.client.renderer;

public class BigIronGateLeftRenderer extends MobRenderer<BigIronGateLeftEntity, LivingEntityRenderState, Modelbigirongateleft> {
	private BigIronGateLeftEntity entity = null;

	public BigIronGateLeftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigirongateleft(context.bakeLayer(Modelbigirongateleft.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BigIronGateLeftEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/bigirongateentity.png");
	}
}