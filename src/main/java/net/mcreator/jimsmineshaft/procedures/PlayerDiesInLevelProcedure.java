package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class PlayerDiesInLevelProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("chat"), false);
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:deleted_mod_element")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
			}
		}
	}
}