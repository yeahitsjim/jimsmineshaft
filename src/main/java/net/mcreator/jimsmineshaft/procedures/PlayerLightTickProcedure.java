package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class PlayerLightTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 2, z)) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == JimsmineshaftModBlocks.PLAYER_LIGHT.get()) {
			world.setBlock(BlockPos.containing(x, y + 2, z), JimsmineshaftModBlocks.PLAYER_LIGHT.get().defaultBlockState(), 3);
		}
	}
}