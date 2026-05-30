package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jimsmineshaft.entity.BigIronGateRightEntity;
import net.mcreator.jimsmineshaft.client.model.Modelbigirongateright;

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