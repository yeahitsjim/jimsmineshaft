package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.entity.LeechEntity;
import net.mcreator.jimsmineshaft.client.model.animations.LeechAnimation;
import net.mcreator.jimsmineshaft.client.model.ModelLeech;

public class LeechRenderer extends MobRenderer<LeechEntity, LivingEntityRenderState, ModelLeech> {
	private LeechEntity entity = null;

	public LeechRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLeech.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LeechEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/leech.png");
	}

	private static final class AnimatedModel extends ModelLeech {
		private LeechEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(LeechEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, LeechAnimation.idle, state.ageInTicks, 1f);
			this.animate(entity.animationState1, LeechAnimation.drop, state.ageInTicks, 1f);
			this.animate(entity.animationState2, LeechAnimation.grab, state.ageInTicks, 1f);
			this.animate(entity.animationState3, LeechAnimation.walk, state.ageInTicks, 1f);
			this.animate(entity.animationState4, LeechAnimation.attack, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}