package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.entity.PressureDrillEntity;
import net.mcreator.jimsmineshaft.client.model.animations.PressureDrillAnimation;
import net.mcreator.jimsmineshaft.client.model.animations.PressureDrill2Animation;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrill;

public class PressureDrillRenderer extends MobRenderer<PressureDrillEntity, LivingEntityRenderState, ModelPressureDrill> {
	private PressureDrillEntity entity = null;

	public PressureDrillRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelPressureDrill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PressureDrillEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturepressuredrill2.png");
	}

	private static final class AnimatedModel extends ModelPressureDrill {
		private PressureDrillEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(PressureDrillEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, PressureDrillAnimation.activate, state.ageInTicks, 1f);
			this.animate(entity.animationState1, PressureDrill2Animation.mine, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}