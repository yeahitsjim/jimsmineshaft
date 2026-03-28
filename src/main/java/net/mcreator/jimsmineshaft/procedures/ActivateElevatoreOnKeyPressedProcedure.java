package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ActivateElevatoreOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("1"), false);
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("2"), false);
				if (entityiterator instanceof ElevatorEntity) {
					if ((entityiterator.getPersistentData().getString("stage")).equals("start")) {
						entityiterator.getPersistentData().putString("movement", "down");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y + 4, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatealt")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, (y + 4), z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatealt")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						JimsmineshaftMod.queueServerWork(10, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 4, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 4), z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						});
					}
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("3"), false);
					if ((entityiterator.getPersistentData().getString("stage")).equals("lvl1start")) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("4"), false);
						entityiterator.getPersistentData().putString("movement", "down");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y + 4, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatealt")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, (y + 4), z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatealt")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						JimsmineshaftMod.queueServerWork(10, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 4, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 4), z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						});
					}
				}
			}
		}
	}
}