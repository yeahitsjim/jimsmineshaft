package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class GenerateShaftMEGAPROCEDUREsaveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();
		Direction workingDirection = Direction.NORTH;
		Direction usableDirection = Direction.NORTH;
		boolean isEndBit = false;
		boolean repeatRoom = false;
		String workingRoomPick = "";
		String selectedRoom = "";
		double workingX = 0;
		double workingY = 0;
		double workingZ = 0;
		double letsGoGambling = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double gambling1 = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WEEPING_VINES.asItem()) {
			JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining = 5;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).levelTokens = 5;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).variantTokens = 5;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.cuurentCoords.addProperty("x", (entity.getX()));
			JimsmineshaftModVariables.cuurentCoords.addProperty("y", (entity.getY()));
			JimsmineshaftModVariables.cuurentCoords.addProperty("z", (entity.getZ()));
			JimsmineshaftModVariables.MapVariables.get(world).currentDirection = Direction.EAST;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure = "mainelevator";
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).currentVariant = "a";
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7lSpawning Main Elevator"), false);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "mainelevator"));
				if (template != null) {
					template.placeInWorld(_serverworld,
							BlockPos.containing(JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble(), JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48, JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()),
							BlockPos.containing(JimsmineshaftModVariables.cuurentCoords.get("x").getAsDouble(), JimsmineshaftModVariables.cuurentCoords.get("y").getAsDouble() - 48, JimsmineshaftModVariables.cuurentCoords.get("z").getAsDouble()),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining) {
				if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelTokens) {
				}
			}
		}
	}
}