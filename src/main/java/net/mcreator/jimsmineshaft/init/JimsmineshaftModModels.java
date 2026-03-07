/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jimsmineshaft.client.model.Modelmining_gtrenchcoat;
import net.mcreator.jimsmineshaft.client.model.Modelmining_goon_trenchcoat;
import net.mcreator.jimsmineshaft.client.model.Modelmining_goon_pants;
import net.mcreator.jimsmineshaft.client.model.Modelmining_goon_hat;
import net.mcreator.jimsmineshaft.client.model.Modelmining_goon_boots;
import net.mcreator.jimsmineshaft.client.model.Modelmining_gjeans;
import net.mcreator.jimsmineshaft.client.model.Modelmining_ghat;
import net.mcreator.jimsmineshaft.client.model.Modelmining_gboots;
import net.mcreator.jimsmineshaft.client.model.Modelbigirongateright;
import net.mcreator.jimsmineshaft.client.model.Modelbigirongateleft;
import net.mcreator.jimsmineshaft.client.model.Modelbigirongateframe;
import net.mcreator.jimsmineshaft.client.model.Modelbiggate;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JimsmineshaftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbigirongateright.LAYER_LOCATION, Modelbigirongateright::createBodyLayer);
		event.registerLayerDefinition(Modelmining_goon_hat.LAYER_LOCATION, Modelmining_goon_hat::createBodyLayer);
		event.registerLayerDefinition(Modelbigirongateleft.LAYER_LOCATION, Modelbigirongateleft::createBodyLayer);
		event.registerLayerDefinition(Modelmining_goon_pants.LAYER_LOCATION, Modelmining_goon_pants::createBodyLayer);
		event.registerLayerDefinition(Modelbiggate.LAYER_LOCATION, Modelbiggate::createBodyLayer);
		event.registerLayerDefinition(Modelmining_goon_trenchcoat.LAYER_LOCATION, Modelmining_goon_trenchcoat::createBodyLayer);
		event.registerLayerDefinition(Modelmining_ghat.LAYER_LOCATION, Modelmining_ghat::createBodyLayer);
		event.registerLayerDefinition(Modelmining_gtrenchcoat.LAYER_LOCATION, Modelmining_gtrenchcoat::createBodyLayer);
		event.registerLayerDefinition(Modelmining_goon_boots.LAYER_LOCATION, Modelmining_goon_boots::createBodyLayer);
		event.registerLayerDefinition(Modelmining_gboots.LAYER_LOCATION, Modelmining_gboots::createBodyLayer);
		event.registerLayerDefinition(Modelbigirongateframe.LAYER_LOCATION, Modelbigirongateframe::createBodyLayer);
		event.registerLayerDefinition(Modelmining_gjeans.LAYER_LOCATION, Modelmining_gjeans::createBodyLayer);
	}
}