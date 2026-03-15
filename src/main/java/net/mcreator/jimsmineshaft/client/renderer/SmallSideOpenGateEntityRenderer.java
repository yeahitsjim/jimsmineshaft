package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.entity.SmallSideOpenGateEntityEntity;
import net.mcreator.jimsmineshaft.client.model.animations.opengateAnimation;
import net.mcreator.jimsmineshaft.client.model.Modelopengate;

public class SmallSideOpenGateEntityRenderer extends MobRenderer<SmallSideOpenGateEntityEntity, LivingEntityRenderState, Modelopengate> {
	private SmallSideOpenGateEntityEntity entity = null;

	public SmallSideOpenGateEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelopengate.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SmallSideOpenGateEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
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

	private static final class AnimatedModel extends Modelopengate {
		private SmallSideOpenGateEntityEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(SmallSideOpenGateEntityEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, opengateAnimation.gateopen, state.ageInTicks, 1f);
			this.animate(entity.animationState1, opengateAnimation.gateclose, state.ageInTicks, 1f);
			this.animate(entity.animationState2, opengateAnimation.open, state.ageInTicks, 1f);
			this.animate(entity.animationState3, opengateAnimation.close, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}