package net.mcreator.jimsmineshaft.client.screens;

@EventBusSubscriber({Dist.CLIENT})
public class NearElevatorOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		if (

		NearElevatorDisplayOverlayIngameProcedure.execute()

		) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.near_elevator.label_right_click_in_elevator_to_join"), w / 2 + -68, h / 2 + 62, -3355444, false);

		}

	}

}