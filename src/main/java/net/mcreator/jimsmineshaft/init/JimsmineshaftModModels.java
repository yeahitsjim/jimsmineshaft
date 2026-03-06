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
import net.mcreator.jimsmineshaft.client.model.ModelcartVariant3;
import net.mcreator.jimsmineshaft.client.model.ModelcartVariant2;
import net.mcreator.jimsmineshaft.client.model.ModelcartVariant1;
import net.mcreator.jimsmineshaft.client.model.ModelcartRocks5;
import net.mcreator.jimsmineshaft.client.model.ModelcartRocks4test;
import net.mcreator.jimsmineshaft.client.model.ModelcartRocks3;
import net.mcreator.jimsmineshaft.client.model.ModelcartRocks2;
import net.mcreator.jimsmineshaft.client.model.ModelcartRocks1;
import net.mcreator.jimsmineshaft.client.model.ModelcartPushable;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase9;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase8;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase7;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase6;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase5;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase4;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase3;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase2;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase12;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase11;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase10;
import net.mcreator.jimsmineshaft.client.model.ModelcartPhase1;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockModel;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded4;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded3;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded2;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrillBlockFolded;
import net.mcreator.jimsmineshaft.client.model.ModelPressureDrill;
import net.mcreator.jimsmineshaft.client.model.ModelElevator3;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JimsmineshaftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldetonator.LAYER_LOCATION, Modeldetonator::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase1.LAYER_LOCATION, ModelcartPhase1::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase12.LAYER_LOCATION, ModelcartPhase12::createBodyLayer);
		event.registerLayerDefinition(ModelElevator3.LAYER_LOCATION, ModelElevator3::createBodyLayer);
		event.registerLayerDefinition(ModelrawCopperDrilledEast.LAYER_LOCATION, ModelrawCopperDrilledEast::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase3.LAYER_LOCATION, ModelcartPhase3::createBodyLayer);
		event.registerLayerDefinition(ModelcartRocks2.LAYER_LOCATION, ModelcartRocks2::createBodyLayer);
		event.registerLayerDefinition(ModelcartRocks4test.LAYER_LOCATION, ModelcartRocks4test::createBodyLayer);
		event.registerLayerDefinition(ModelcartPushable.LAYER_LOCATION, ModelcartPushable::createBodyLayer);
		event.registerLayerDefinition(ModelrawCopperDrilledNorth4.LAYER_LOCATION, ModelrawCopperDrilledNorth4::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase6.LAYER_LOCATION, ModelcartPhase6::createBodyLayer);
		event.registerLayerDefinition(ModelcartVariant3.LAYER_LOCATION, ModelcartVariant3::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded3.LAYER_LOCATION, ModelPressureDrillBlockFolded3::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase8.LAYER_LOCATION, ModelcartPhase8::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase11.LAYER_LOCATION, ModelcartPhase11::createBodyLayer);
		event.registerLayerDefinition(ModelcartVariant1.LAYER_LOCATION, ModelcartVariant1::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded4.LAYER_LOCATION, ModelPressureDrillBlockFolded4::createBodyLayer);
		event.registerLayerDefinition(ModelnorthHole.LAYER_LOCATION, ModelnorthHole::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase2.LAYER_LOCATION, ModelcartPhase2::createBodyLayer);
		event.registerLayerDefinition(ModelcartRocks5.LAYER_LOCATION, ModelcartRocks5::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockModel.LAYER_LOCATION, ModelPressureDrillBlockModel::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase4.LAYER_LOCATION, ModelcartPhase4::createBodyLayer);
		event.registerLayerDefinition(ModelcartRocks3.LAYER_LOCATION, ModelcartRocks3::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase5.LAYER_LOCATION, ModelcartPhase5::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrill.LAYER_LOCATION, ModelPressureDrill::createBodyLayer);
		event.registerLayerDefinition(ModeltheCart.LAYER_LOCATION, ModeltheCart::createBodyLayer);
		event.registerLayerDefinition(ModelcartRocks1.LAYER_LOCATION, ModelcartRocks1::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded.LAYER_LOCATION, ModelPressureDrillBlockFolded::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase10.LAYER_LOCATION, ModelcartPhase10::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase7.LAYER_LOCATION, ModelcartPhase7::createBodyLayer);
		event.registerLayerDefinition(ModelcartVariant2.LAYER_LOCATION, ModelcartVariant2::createBodyLayer);
		event.registerLayerDefinition(ModelrawCopperDrilledNorth_Converted.LAYER_LOCATION, ModelrawCopperDrilledNorth_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelcartPhase9.LAYER_LOCATION, ModelcartPhase9::createBodyLayer);
		event.registerLayerDefinition(ModelPressureDrillBlockFolded2.LAYER_LOCATION, ModelPressureDrillBlockFolded2::createBodyLayer);
	}
}