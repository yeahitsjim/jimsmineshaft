package net.mcreator.jimsmineshaft.client.screens;

@EventBusSubscriber({Dist.CLIENT})
public class DrillModeOverlayOverlay {

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

		DrillModeOverlayDisplayOverlayIngameProcedure.execute()

		) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.drill_mode_overlay.label_press_p_to_place_drill"), w / 2 + -49, h / 2 + 66, -3355444, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.drill_mode_overlay.label_right_click_to_drill"), w / 2 + -47, h / 2 + 53, -3223858, false);

		}

	}

}