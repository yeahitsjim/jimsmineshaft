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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

public class MysteryRailOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean fuckoff = false;
		double letsGoGambling = 0;
		double variantGambling2 = 0;
		if (JimsmineshaftModVariables.MapVariables.get(world).doBlockSpawning == true) {
			letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 10);
			variantGambling2 = Mth.nextInt(RandomSource.create(), -7, 12);
			if (Level.OVERWORLD == (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))) {
				if (letsGoGambling > 2) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 0.5);
					if (variantGambling2 < 7) {
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
					}
					if (variantGambling2 == 7) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_1.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_2.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_3.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_4.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_5.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_6.get().defaultBlockState();
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
			if (Level.OVERWORLD == (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))) {
				if (letsGoGambling > 2) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 0.5);
					if (variantGambling2 < 7) {
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
					}
					if (variantGambling2 == 7) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_1.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_2.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_3.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_4.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_5.get().defaultBlockState();
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
							BlockState _bs = JimsmineshaftModBlocks.CART_RAIL_BROKE_6.get().defaultBlockState();
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