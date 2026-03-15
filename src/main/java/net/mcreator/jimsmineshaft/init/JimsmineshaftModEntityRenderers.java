/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.jimsmineshaft.client.renderer.ThecartRenderer;
import net.mcreator.jimsmineshaft.client.renderer.StalkerRenderer;
import net.mcreator.jimsmineshaft.client.renderer.StalkerInsidesRenderer;
import net.mcreator.jimsmineshaft.client.renderer.StalkerInsides2Renderer;
import net.mcreator.jimsmineshaft.client.renderer.SmallSlideUpGateEntityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.SmallSideOpenGateEntityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.SkinStealerEntityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.RightgateRenderer;
import net.mcreator.jimsmineshaft.client.renderer.PressureDrillRenderer;
import net.mcreator.jimsmineshaft.client.renderer.PressureDrillFoldedRenderer;
import net.mcreator.jimsmineshaft.client.renderer.PlayerStalkierRenderer;
import net.mcreator.jimsmineshaft.client.renderer.LeftgateRenderer;
import net.mcreator.jimsmineshaft.client.renderer.HoleEntityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.FlashlightentityRenderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat8Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat7Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat6Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat5Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat4Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat3Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat2Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorSeat1Renderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorRenderer;
import net.mcreator.jimsmineshaft.client.renderer.ElevatorBoundingBoxRenderer;
import net.mcreator.jimsmineshaft.client.renderer.CopperDrilledNorthRenderer;
import net.mcreator.jimsmineshaft.client.renderer.CopperDrilledEastRenderer;
import net.mcreator.jimsmineshaft.client.renderer.Cart4Renderer;
import net.mcreator.jimsmineshaft.client.renderer.Cart3Renderer;
import net.mcreator.jimsmineshaft.client.renderer.Cart2Renderer;
import net.mcreator.jimsmineshaft.client.renderer.BigGateRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JimsmineshaftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JimsmineshaftModEntities.THECART.get(), ThecartRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.PRESSURE_DRILL.get(), PressureDrillRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.PRESSURE_DRILL_FOLDED.get(), PressureDrillFoldedRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.COPPER_DRILLED_EAST.get(), CopperDrilledEastRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.HOLE_ENTITY.get(), HoleEntityRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR.get(), ElevatorRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_BOUNDING_BOX.get(), ElevatorBoundingBoxRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_5.get(), ElevatorSeat5Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_6.get(), ElevatorSeat6Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_3.get(), ElevatorSeat3Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_4.get(), ElevatorSeat4Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_7.get(), ElevatorSeat7Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_8.get(), ElevatorSeat8Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.CART_4.get(), Cart4Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.CART_3.get(), Cart3Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.CART_2.get(), Cart2Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_1.get(), ElevatorSeat1Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.ELEVATOR_SEAT_2.get(), ElevatorSeat2Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.COPPER_DRILLED_NORTH.get(), CopperDrilledNorthRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.STALKER.get(), StalkerRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.STALKER_INSIDES.get(), StalkerInsidesRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.PLAYER_STALKIER.get(), PlayerStalkierRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.STALKER_INSIDES_2.get(), StalkerInsides2Renderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.SKIN_STEALER_ENTITY.get(), SkinStealerEntityRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.FLASHLIGHTENTITY.get(), FlashlightentityRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.LEFTGATE.get(), LeftgateRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.BIG_GATE.get(), BigGateRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.RIGHTGATE.get(), RightgateRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.SMALL_SIDE_OPEN_GATE_ENTITY.get(), SmallSideOpenGateEntityRenderer::new);
		event.registerEntityRenderer(JimsmineshaftModEntities.SMALL_SLIDE_UP_GATE_ENTITY.get(), SmallSlideUpGateEntityRenderer::new);
	}
}