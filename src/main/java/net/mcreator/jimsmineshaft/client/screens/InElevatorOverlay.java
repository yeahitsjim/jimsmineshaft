package net.mcreator.jimsmineshaft.client.screens;

@EventBusSubscriber({Dist.CLIENT})
public class InElevatorOverlay {

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

		InElevatorDisplayOverlayIngameProcedure.execute()

		) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.in_elevator.label_press_p_to_start_elevator"), w / 2 + -64, h / 2 + 60, -26368, false);

		}

	}

}