package net.mcreator.jimsmineshaft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.jimsmineshaft.procedures.ReturnInvValueProcedure;

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
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnInvValueProcedure.execute(entity), w / 2 + 214, h / 2 + 140, -29184, false);
		}
	}
}