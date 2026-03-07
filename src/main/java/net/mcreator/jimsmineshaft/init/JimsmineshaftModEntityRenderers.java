/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jimsmineshaft.client.renderer.RightgateRenderer;
import net.mcreator.jimsmineshaft.client.renderer.LeftgateRenderer;
import net.mcreator.jimsmineshaft.client.renderer.FlashlightentityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.BigIronGateRightRenderer;
import net.mcreator.jimsmineshaft.client.renderer.BigIronGateLeftRenderer;
import net.mcreator.jimsmineshaft.client.renderer.BigIronGateFrameRenderer;
import net.mcreator.jimsmineshaft.client.renderer.BigGateRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JimsmineshaftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JimsmineshaftModEntities.FLASHLIGHTENTITY.get(), FlashlightentityRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.BIG_IRON_GATE_FRAME.get(), BigIronGateFrameRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.BIG_IRON_GATE_RIGHT.get(), BigIronGateRightRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.BIG_IRON_GATE_LEFT.get(), BigIronGateLeftRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.BIG_GATE.get(), BigGateRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.LEFTGATE.get(), LeftgateRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.RIGHTGATE.get(), RightgateRenderer::new);
	}
}