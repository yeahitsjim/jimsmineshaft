package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jimsmineshaft.entity.BigIronGateFrameEntity;
import net.mcreator.jimsmineshaft.client.model.Modelbigirongateframe;

public class BigIronGateFrameRenderer extends MobRenderer<BigIronGateFrameEntity, LivingEntityRenderState, Modelbigirongateframe> {
	private BigIronGateFrameEntity entity = null;

	public BigIronGateFrameRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigirongateframe(context.bakeLayer(Modelbigirongateframe.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BigIronGateFrameEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/bigirongateentity.png");
	}
}