package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.jimsmineshaft.entity.AmalgamationEntity;
import net.mcreator.jimsmineshaft.client.model.animations.animal_amalgamationAnimation;
import net.mcreator.jimsmineshaft.client.model.Modelanimal_amalgamation;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AmalgamationRenderer extends MobRenderer<AmalgamationEntity, LivingEntityRenderState, Modelanimal_amalgamation> {
	private AmalgamationEntity entity = null;

	public AmalgamationRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelanimal_amalgamation.LAYER_LOCATION)), 0.8f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("jimsmineshaft:textures/entities/animal_amalgamation_glow_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AmalgamationEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/animal_amalgamation_texture.png");
	}

	private static final class AnimatedModel extends Modelanimal_amalgamation {
		private AmalgamationEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(AmalgamationEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, animal_amalgamationAnimation.shoot, state.ageInTicks, 1f);
			this.animate(entity.animationState1, animal_amalgamationAnimation.slice, state.ageInTicks, 1f);
			this.animate(entity.animationState2, animal_amalgamationAnimation.idle_pose, state.ageInTicks, 1f);
			this.animateWalk(animal_amalgamationAnimation.walk, state.walkAnimationPos, state.walkAnimationSpeed, 2f, 1.5f);
			super.setupAnim(state);
		}
	}
}