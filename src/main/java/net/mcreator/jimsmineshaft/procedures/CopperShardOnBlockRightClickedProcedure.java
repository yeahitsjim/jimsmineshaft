package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CopperShardOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double letsgogambling = 0;
		letsgogambling = Mth.nextInt(RandomSource.create(), 1, 6);
		if (letsgogambling == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup7")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup7")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (letsgogambling == 2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup8")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup8")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (letsgogambling == 3) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup9")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup9")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (letsgogambling == 4) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup10")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup10")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (letsgogambling == 5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup11")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup11")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (letsgogambling == 6) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup12")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickup12")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
	}
}