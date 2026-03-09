package net.mcreator.jimsmineshaft.client.screens;

@EventBusSubscriber({Dist.CLIENT})
public class MainoverlayOverlay {

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

		if (true) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.mainoverlay.label_proc_return_inv_value2"), w / 2 + -90, h / 2 + 84, -16777216, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.mainoverlay.label_proc_return_inv_value1"), w / 2 + -91, h / 2 + 84, -16777216, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.mainoverlay.label_proc_return_inv_value"), w / 2 + -90, h / 2 + 83, -29184, false);

		}

	}

}