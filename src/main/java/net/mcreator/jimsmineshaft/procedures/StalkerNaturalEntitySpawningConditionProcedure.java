package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

public class StalkerNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double LETSGOGAMBLING = 0;
		boolean detectedExistingStalker = false;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jimsmineshaft:level_1_test_biome"))) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 6000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 600);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (6000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 12000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 500);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (12000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 18000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 400);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (18000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 300);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jimsmineshaft:level_2_biomje"))) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 6000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 500);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (6000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 12000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 400);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (12000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 18000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 300);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (18000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 200);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jimsmineshaft:level_3_biome"))) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 6000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 450);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (6000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 12000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 350);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (12000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 18000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 250);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (18000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 150);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jimsmineshaft:level_4_biome"))) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 6000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 400);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (6000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 12000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 350);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (12000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 18000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 250);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (18000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 150);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jimsmineshaft:level_5_biome"))) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 6000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 200);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (6000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 12000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 175);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (12000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 18000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 150);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (18000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 100);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jimsmineshaft:level_6_biome"))) {
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 6000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 160);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (6000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 12000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 140);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (12000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick && 18000 > JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 110);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
			if (18000 < JimsmineshaftModVariables.MapVariables.get(world).levelDurationTick) {
				if (y < 250 && y > 180) {
					LETSGOGAMBLING = Mth.nextInt(RandomSource.create(), 1, 90);
					if (LETSGOGAMBLING < 2) {
						return true;
					}
				}
			}
		}
		return false;
	}
}