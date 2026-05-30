package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class RightClickSpawner4Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String workingRoomPick = "";
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
				if (("variantd3bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft4wider").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft4wider"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft5wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft5wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft6wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft6wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantf2bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantf2bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft6").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft6"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit2large").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit2large"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft3big").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft3big"));
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
				if (("variantd3bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft4wider").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft4wider"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft5wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft5wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft6wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft6wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantf2bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantf2bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft6").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft6"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit2large").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit2large"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft3big").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft3big"));
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
				if (("variantd3bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft4wider").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft4wider"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft5wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft5wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft6wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft6wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantf2bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantf2bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft6").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft6"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit2large").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit2large"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft3big").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft3big"));
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
				if (("variantd3bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd3bit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd3bit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd4bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd4bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantd7bit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantd7bit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft4wider").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft4wider"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft5wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft5wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantdshaft6wide").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantdshaft6wide"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantebit4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantebit4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("varianteshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "varianteshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantf2bit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantf2bit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfroom4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfroom4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft3").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft3"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft4").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft4"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft5").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft5"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantfshaft6").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantfshaft6"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgbit2large").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgbit2large"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgroom1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgroom1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft1").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft1"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft2").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft2"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									BlockPos.containing(JimsmineshaftModVariables.filledSpaces.get("x").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("y").getAsDouble(), JimsmineshaftModVariables.filledSpaces.get("z").getAsDouble()),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				if (("variantgshaft3big").equals(workingRoomPick)) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantgshaft3big"));
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