package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
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
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

public class MysteryLOOTOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean fuckoff = false;
		double letsGoGambling = 0;
		double variantGambling2 = 0;
		if (JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning == true) {
			letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 10);
			variantGambling2 = Mth.nextInt(RandomSource.create(), -49, 15);
			if (Level.OVERWORLD == (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))) {
				if (letsGoGambling > 2) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 0.5);
					if (variantGambling2 == 7) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B.get().defaultBlockState();
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
					}
					if (variantGambling2 == 8) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C.get().defaultBlockState();
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
					}
					if (variantGambling2 == 9) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D.get().defaultBlockState();
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
					}
					if (variantGambling2 == 10) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E.get().defaultBlockState();
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
					}
					if (variantGambling2 == 11) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A.get().defaultBlockState();
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
					}
					if (variantGambling2 == 12) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.BOTTLE.get().defaultBlockState();
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
					}
					if (variantGambling2 == 13) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CANARY_CAGE.get().defaultBlockState();
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
					}
					if (variantGambling2 == 14) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CANDLE_HOLDER.get().defaultBlockState();
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
					}
					if (variantGambling2 == 15) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CANTEEN.get().defaultBlockState();
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
					}
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			if (ResourceKey.create(Registries.DIMENSION,
					ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))) {
				if (letsGoGambling > 2) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 0.5);
					if (variantGambling2 == 7) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B.get().defaultBlockState();
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
					}
					if (variantGambling2 == 8) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C.get().defaultBlockState();
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
					}
					if (variantGambling2 == 9) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D.get().defaultBlockState();
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
					}
					if (variantGambling2 == 10) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E.get().defaultBlockState();
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
					}
					if (variantGambling2 == 11) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A.get().defaultBlockState();
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
					}
					if (variantGambling2 == 12) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.BOTTLE.get().defaultBlockState();
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
					}
					if (variantGambling2 == 13) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CANARY_CAGE.get().defaultBlockState();
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
					}
					if (variantGambling2 == 14) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CANDLE_HOLDER.get().defaultBlockState();
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
					}
					if (variantGambling2 == 15) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CANTEEN.get().defaultBlockState();
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
					}
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		}
	}
}