package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jimsmineshaft.entity.BigIronGateLeftEntity;
import net.mcreator.jimsmineshaft.client.model.Modelbigirongateleft;

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