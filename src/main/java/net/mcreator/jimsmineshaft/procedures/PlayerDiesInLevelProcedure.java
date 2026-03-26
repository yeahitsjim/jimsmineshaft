package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerDiesInLevelProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("chat"), false);
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathLevel = "level1";
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathX = x;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathY = y;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathZ = z;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathLevel = "level2";
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathX = x;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathY = y;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathZ = z;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathLevel = "level3";
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathX = x;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathY = y;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathZ = z;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_4_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathLevel = "level4";
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathX = x;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathY = y;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathZ = z;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_5_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathLevel = "level5";
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathX = x;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathY = y;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathZ = z;
					_vars.syncPlayerVariables(entity);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_6_dimension")) == (entity.level().dimension())) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("uh"), false);
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.hadDiedInMatch = true;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathLevel = "level6";
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathX = x;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathY = y;
					_vars.syncPlayerVariables(entity);
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.deathZ = z;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}