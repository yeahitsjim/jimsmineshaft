package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jimsmineshaft.entity.Cart3Entity;
import net.mcreator.jimsmineshaft.client.model.ModelcartVariant2;

public class Cart3Renderer extends MobRenderer<Cart3Entity, LivingEntityRenderState, ModelcartVariant2> {
	private Cart3Entity entity = null;

	public Cart3Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelcartVariant2(context.bakeLayer(ModelcartVariant2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(Cart3Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturecartvariant2png.png");
	}
}