package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ActivateElevatoreOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof ElevatorEntity) {
					if (!("down").equals(entityiterator.getPersistentData().getString("movement"))) {
						if (!("up").equals(entityiterator.getPersistentData().getString("movement"))) {
							entityiterator.getPersistentData().putBoolean("doorOpen", false);
							JimsmineshaftModVariables.MapVariables.get(world).currentLevel = JimsmineshaftModVariables.MapVariables.get(world).currentLevel + 1;
							JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Current level moved to: " + JimsmineshaftModVariables.MapVariables.get(world).currentLevel)), false);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 4, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoropen")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 4), z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoropen")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							JimsmineshaftMod.queueServerWork(60, () -> {
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
								if ((entityiterator.getPersistentData().getString("stage")).equals("lvl1end")) {
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
							});
						}
					}
				}
			}
		}
	}
}