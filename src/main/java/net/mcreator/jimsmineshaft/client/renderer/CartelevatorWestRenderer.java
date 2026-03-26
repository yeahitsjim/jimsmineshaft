package net.mcreator.jimsmineshaft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jimsmineshaft.entity.CartelevatorWestEntity;
import net.mcreator.jimsmineshaft.client.model.ModelCartElevator;

public class CartelevatorWestRenderer extends MobRenderer<CartelevatorWestEntity, LivingEntityRenderState, ModelCartElevator> {
	private CartelevatorWestEntity entity = null;

	public CartelevatorWestRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCartElevator(context.bakeLayer(ModelCartElevator.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CartelevatorWestEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("jimsmineshaft:textures/entities/texturecartelevatorfinished4.png");
	}
}