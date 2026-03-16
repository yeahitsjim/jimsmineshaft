package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

public class CopperVeinSpawnerOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean fuckoff = false;
		double letsGoGambling = 0;
		double variantGambling2 = 0;
		if (JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning == true) {
			letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 10);
			variantGambling2 = Mth.nextInt(RandomSource.create(), 1, 3);
			if (Level.OVERWORLD == (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))) {
				if (letsGoGambling >= 6) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 0.5);
					if (JimsmineshaftModBlocks.MYSTERY_ORE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (Direction.SOUTH == (getBlockDirection(world, BlockPos.containing(x, y, z)))) {
							if (variantGambling2 == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z), BlockPos.containing(x + 4, y - 2, z),
												new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z), BlockPos.containing(x + 4, y - 2, z),
												new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z), BlockPos.containing(x + 4, y - 2, z),
												new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (JimsmineshaftModBlocks.MYSTERY_ORE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (Direction.NORTH == (getBlockDirection(world, BlockPos.containing(x, y, z)))) {
							if (variantGambling2 == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z), BlockPos.containing(x - 4, y - 2, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z), BlockPos.containing(x - 4, y - 2, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z), BlockPos.containing(x - 4, y - 2, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (JimsmineshaftModBlocks.MYSTERY_ORE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (Direction.EAST == (getBlockDirection(world, BlockPos.containing(x, y, z)))) {
							if (variantGambling2 == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 0, y - 2, z - 4), BlockPos.containing(x - 0, y - 2, z - 4),
												new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 0, y - 2, z - 4), BlockPos.containing(x - 0, y - 2, z - 4),
												new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 0, y - 2, z - 4), BlockPos.containing(x - 0, y - 2, z - 4),
												new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (JimsmineshaftModBlocks.MYSTERY_ORE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
						if (Direction.WEST == (getBlockDirection(world, BlockPos.containing(x, y, z)))) {
							if (variantGambling2 == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 0, y - 2, z + 4), BlockPos.containing(x - 0, y - 2, z + 4),
												new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 0, y - 2, z + 4), BlockPos.containing(x - 0, y - 2, z + 4),
												new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							if (variantGambling2 == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "copperore3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 0, y - 2, z + 4), BlockPos.containing(x - 0, y - 2, z + 4),
												new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION,
					ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))) {
				if (letsGoGambling > 1) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = JimsmineshaftModBlocks.CART_RAIL.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 0.5);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		}
	}

	private static Direction getBlockDirection(LevelAccessor world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos);
		Property<?> property = blockState.getBlock().getStateDefinition().getProperty("facing");
		if (property != null && blockState.getValue(property) instanceof Direction direction)
			return direction;
		else if (blockState.hasProperty(BlockStateProperties.AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
		else if (blockState.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}
}