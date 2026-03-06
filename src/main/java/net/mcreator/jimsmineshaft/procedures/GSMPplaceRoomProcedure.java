package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class GSMPplaceRoomProcedure {
	public static void execute(LevelAccessor world, double pr_x, double pr_y, double pr_z, String pr_workingRoomPick, String prwd) {
		if (pr_workingRoomPick == null || prwd == null)
			return;
		Direction workingDirection = Direction.NORTH;
		boolean repeatRoom = false;
		String workingRoomPick = "";
		String selectedRoom = "";
		double letsGoGambling = 0;
		double repeatGambling = 0;
		double roomPickGambling = 0;
		double variantGambling = 0;
		double gambling1 = 0;
		com.google.gson.JsonObject passedDependency = new com.google.gson.JsonObject();
		passedDependency.addProperty("x", pr_x);
		passedDependency.addProperty("y", pr_y);
		passedDependency.addProperty("z", pr_z);
		if (("north").equals(prwd)) {
			workingDirection = Direction.NORTH;
		}
		if (("east").equals(prwd)) {
			workingDirection = Direction.EAST;
		}
		if (("south").equals(prwd)) {
			workingDirection = Direction.SOUTH;
		}
		if (("west").equals(prwd)) {
			workingDirection = Direction.WEST;
		}
		workingRoomPick = pr_workingRoomPick;
		if (Direction.SOUTH == workingDirection) {
			if (("elevator2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantabitmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmainnonlit").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
		if (Direction.WEST == workingDirection) {
			if (("elevator2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantabitmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmainnonlit").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
		if (Direction.EAST == workingDirection) {
			if (("elevator2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantabitmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmainnonlit").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
		if (Direction.NORTH == workingDirection) {
			if (("elevator2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "elevator2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantabitmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantabitmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmain").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmain"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantashaftmainnonlit").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantashaftmainnonlit"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbroom2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbroom2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantbshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantbshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcbit4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcbit4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft1").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft2").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft3").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft4").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			if (("variantcshaft5").equals(workingRoomPick)) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "variantcshaft5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								BlockPos.containing(passedDependency.get("x").getAsDouble(), passedDependency.get("y").getAsDouble(), passedDependency.get("z").getAsDouble()),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
	}
}