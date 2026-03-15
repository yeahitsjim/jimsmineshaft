package net.mcreator.jimsmineshaft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.CoreShaders;
import net.minecraft.client.Minecraft;

import net.mcreator.jimsmineshaft.procedures.Staminabar9Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar8Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar7Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar6Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar5Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar4Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar3Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar2Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar1Procedure;
import net.mcreator.jimsmineshaft.procedures.Staminabar10Procedure;
import net.mcreator.jimsmineshaft.procedures.ReturnInvValueProcedure;
import net.mcreator.jimsmineshaft.procedures.InteractdisplayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(CoreShaders.POSITION_TEX);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (InteractdisplayProcedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/e.png"), w / 2 + -8, h - 68, 0, 0, 16, 16, 16, 16);
			}
			if (Staminabar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabarleft.png"), 6, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 15, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 24, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 33, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 42, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 51, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 60, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 69, h - 16, 0, 0, 9, 10, 9, 10);
			}
			if (Staminabar10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabarright.png"), 87, h - 16, 0, 0, 9, 10, 9, 10);
			}
			event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabaroutline.png"), 6, h - 16, 0, 0, 90, 10, 90, 10);

			if (Staminabar9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.parse("jimsmineshaft:textures/screens/staminabar.png"), 78, h - 16, 0, 0, 9, 10, 9, 10);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnInvValueProcedure.execute(entity), w / 2 + -90, h - 36, -16777216, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnInvValueProcedure.execute(entity), w / 2 + -91, h - 36, -16777216, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnInvValueProcedure.execute(entity), w / 2 + -90, h - 37, -29184, false);
			if (InteractdisplayProcedure.execute(world, x, y, z))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.jimsmineshaft.mainoverlay.label_c_to_interact"), w / 2 + 6, h - 65, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}