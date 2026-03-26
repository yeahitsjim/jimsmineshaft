package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MatchTickEventProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (JimsmineshaftModVariables.MapVariables.get(world).matchInProgress == true) {
			JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick = JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick + 1;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
		}
	}
}