package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.procedures.SkinStealerEntityWalkPlaybackConditionProcedure;
import net.mcreator.jimsmineshaft.entity.SkinStealerEntityEntity;
import net.mcreator.jimsmineshaft.client.model.animations.playerStalkerAnimations2;
import net.mcreator.jimsmineshaft.client.model.ModelplayerStalker3;

public class SkinStealerEntityRenderer extends MobRenderer<SkinStealerEntityEntity, LivingEntityRenderState, ModelplayerStalker3> {
	private SkinStealerEntityEntity entity = null;

	public SkinStealerEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelplayerStalker3.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SkinStealerEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/itsjim_.png");
	}

	private static final class AnimatedModel extends ModelplayerStalker3 {
		private SkinStealerEntityEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(SkinStealerEntityEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, playerStalkerAnimations2.snap, state.ageInTicks, 1f);
			if (SkinStealerEntityWalkPlaybackConditionProcedure.execute(entity))
				this.animateWalk(playerStalkerAnimations2.walk3, state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			super.setupAnim(state);
		}
	}
}