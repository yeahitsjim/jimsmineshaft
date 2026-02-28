/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.jimsmineshaft.client.model.ModeltheCart;
import net.mcreator.jimsmineshaft.client.model.ModelrawCopperDrilledNorth_Converted;
import net.mcreator.jimsmineshaft.client.model.ModelrawCopperDrilledNorth4;
import net.mcreator.jimsmineshaft.client.model.ModelrawCopperDrilledEast;
import net.mcreator.jimsmineshaft.client.model.ModelnorthHole;
import net.mcreator.jimsmineshaft.client.model.Modeldetonator;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockModel;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded4;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded3;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded2;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrill;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JimsmineshaftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldetonator.LAYER_LOCATION, Modeldetonator::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded4.LAYER_LOCATION, ModelPressureDrillBlockFolded4::createBodyLayer);
		event.registerLayerDefinition(ModelnorthHole.LAYER_LOCATION, ModelnorthHole::createBodyLayer);
		event.registerLayerDefinition(ModelrawCopperDrilledEast.LAYER_LOCATION, ModelrawCopperDrilledEast::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockModel.LAYER_LOCATION, ModelPressureDrillBlockModel::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrill.LAYER_LOCATION, ModelPressureDrill::createBodyLayer);
		event.registerLayerDefinition(ModelrawCopperDrilledNorth4.LAYER_LOCATION, ModelrawCopperDrilledNorth4::createBodyLayer);
		event.registerLayerDefinition(ModeltheCart.LAYER_LOCATION, ModeltheCart::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded.LAYER_LOCATION, ModelPressureDrillBlockFolded::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded3.LAYER_LOCATION, ModelPressureDrillBlockFolded3::createBodyLayer);
		event.registerLayerDefinition(ModelrawCopperDrilledNorth_Converted.LAYER_LOCATION, ModelrawCopperDrilledNorth_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded2.LAYER_LOCATION, ModelPressureDrillBlockFolded2::createBodyLayer);
	}
}