package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jimsmineshaft.entity.RustedTumblerEntity;
import net.mcreator.jimsmineshaft.client.model.Modeltumbler;

import com.mojang.blaze3d.vertex.PoseStack;

public class RustedTumblerRenderer extends MobRenderer<RustedTumblerEntity, LivingEntityRenderState, Modeltumbler> {
	private RustedTumblerEntity entity = null;

	public RustedTumblerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltumbler(context.bakeLayer(Modeltumbler.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RustedTumblerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/rusted_tumbler_texturenew.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}
}