package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.entity.SmallSlideUpGateEntityEntity;
import net.mcreator.jimsmineshaft.client.model.animations.slideupgateAnimation;
import net.mcreator.jimsmineshaft.client.model.Modelslideupgate;

public class SmallSlideUpGateEntityRenderer extends MobRenderer<SmallSlideUpGateEntityEntity, LivingEntityRenderState, Modelslideupgate> {
	private SmallSlideUpGateEntityEntity entity = null;

	public SmallSlideUpGateEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelslideupgate.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SmallSlideUpGateEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/slideupgate.png");
	}

	private static final class AnimatedModel extends Modelslideupgate {
		private SmallSlideUpGateEntityEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(SmallSlideUpGateEntityEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, slideupgateAnimation.gateopen, state.ageInTicks, 1f);
			this.animate(entity.animationState1, slideupgateAnimation.gateclose, state.ageInTicks, 1f);
			this.animate(entity.animationState2, slideupgateAnimation.open, state.ageInTicks, 1f);
			this.animate(entity.animationState3, slideupgateAnimation.close, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}