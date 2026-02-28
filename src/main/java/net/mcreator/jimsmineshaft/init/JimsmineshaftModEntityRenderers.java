/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jimsmineshaft.client.renderer.ThecartRenderer;
import net.mcreator.jimsmineshaft.client.renderer.PressureDrillRenderer;
import net.mcreator.jimsmineshaft.client.renderer.PressureDrillFoldedRenderer;
import net.mcreator.jimsmineshaft.client.renderer.HoleEntityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.CopperDrilledNorthRenderer;
import net.mcreator.jimsmineshaft.client.renderer.CopperDrilledEastRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JimsmineshaftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JimsmineshaftModEntities.THECART.get(), ThecartRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.PRESSURE_DRILL.get(), PressureDrillRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.PRESSURE_DRILL_FOLDED.get(), PressureDrillFoldedRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.COPPER_DRILLED_EAST.get(), CopperDrilledEastRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.COPPER_DRILLED_NORTH.get(), CopperDrilledNorthRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.HOLE_ENTITY.get(), HoleEntityRenderer::new);
	}
}