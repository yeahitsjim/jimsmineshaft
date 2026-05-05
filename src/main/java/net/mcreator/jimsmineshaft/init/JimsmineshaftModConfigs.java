package net.mcreator.jimsmineshaft.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(modid = JimsmineshaftMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModList.get().getModContainerById("jimsmineshaft").get().registerConfig(ModConfig.Type.COMMON, SetupConfiguration.SPEC, "jimsmine.toml");
		});
	}
}