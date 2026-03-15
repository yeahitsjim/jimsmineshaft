package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.entity.CopperDrilledEastEntity;
import net.mcreator.jimsmineshaft.client.model.animations.rawCopperDrilledNorthAnimations4;
import net.mcreator.jimsmineshaft.client.model.ModelrawCopperDrilledEast;

public class CopperDrilledEastRenderer extends MobRenderer<CopperDrilledEastEntity, LivingEntityRenderState, ModelrawCopperDrilledEast> {
	private CopperDrilledEastEntity entity = null;

	public CopperDrilledEastRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelrawCopperDrilledEast.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CopperDrilledEastEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/rcopper_0.png");
	}

	private static final class AnimatedModel extends ModelrawCopperDrilledEast {
		private CopperDrilledEastEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(CopperDrilledEastEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, rawCopperDrilledNorthAnimations4.mining2, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}