package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
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
import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RightClickSpawner2Procedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Direction workingDirection = Direction.NORTH;
		String workingRoomPick = "";
		com.google.gson.JsonObject freshCoordsJSON = new com.google.gson.JsonObject();
		JimsmineshaftModVariables.filledSpaces.addProperty("x", (entity.getX()));
		JimsmineshaftModVariables.filledSpaces.addProperty("y", (entity.getY() - 2));
		JimsmineshaftModVariables.filledSpaces.addProperty("z", (entity.getZ()));
		if (JimsmineshaftModItems.STRUCTURE_SPAWNER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (0 == JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble()) {
				JimsmineshaftModVariables.filledSpaces.addProperty("x", (entity.getX()));
			}
			if (0 == JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble()) {
				JimsmineshaftModVariables.filledSpaces.addProperty("y", (entity.getY()));
			}
			if (0 == JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()) {
				JimsmineshaftModVariables.filledSpaces.addProperty("z", (entity.getZ()));
			}
			workingRoomPick = JimsmineshaftModVariables.MapVariables.get(world).SBselectedShaft;
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(("\u00A76Coords moved to: x: " + (new java.text.DecimalFormat("##.##").format(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble()) + ""
								+ ("y: " + (new java.text.DecimalFormat("##.##").format(JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble()) + ""
										+ ("z: " + new java.text.DecimalFormat("##.##").format(JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()))))))),
								false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76Structure Spawned: \u00A7l" + workingRoomPick)), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oCurrent (past) Direction: " + (JimsmineshaftModVariables.MapVariables.get(world).currentDirection + ""))), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A77\u00A7oWorking Direction: " + (entity.getDirection() + ""))), false);
			JimsmineshaftModVariables.MapVariables.get(world).currentDirection = entity.getDirection();
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).SB_x = entity.getX();
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).SB_y = entity.getY() - 2;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).SB_z = entity.getZ();
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			if (Direction.SOUTH == (entity.getDirection())) {
				if (("elevator2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantabitmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmainnonlit").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
			if (Direction.WEST == (entity.getDirection())) {
				if (("elevator2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantabitmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmainnonlit").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
			if (Direction.EAST == (entity.getDirection())) {
				if (("elevator2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantabitmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmainnonlit").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
			if (Direction.NORTH == (entity.getDirection())) {
				if (("elevator2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantabitmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmain").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantashaftmainnonlit").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantbshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcbit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantcshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}