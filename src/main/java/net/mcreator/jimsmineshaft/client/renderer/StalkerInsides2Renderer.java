package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.procedures.InsidesWalkAnimationPlaybackConditionProcedure;
import net.mcreator.jimsmineshaft.entity.StalkerInsides2Entity;
import net.mcreator.jimsmineshaft.client.model.animations.stalkerInsidesAnimation;
import net.mcreator.jimsmineshaft.client.model.ModelstalkerInsides;

public class StalkerInsides2Renderer extends MobRenderer<StalkerInsides2Entity, LivingEntityRenderState, ModelstalkerInsides> {
	private StalkerInsides2Entity entity = null;

	public StalkerInsides2Renderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelstalkerInsides.LAYER_LOCATION)), 0.02f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StalkerInsides2Entity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturestalkerinsides.png");
	}

	private static final class AnimatedModel extends ModelstalkerInsides {
		private StalkerInsides2Entity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(StalkerInsides2Entity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, stalkerInsidesAnimation.snap, state.ageInTicks, 1f);
			if (InsidesWalkAnimationPlaybackConditionProcedure.execute(entity))
				this.animateWalk(stalkerInsidesAnimation.walk3, state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			super.setupAnim(state);
		}
	}
}