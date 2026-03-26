package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.entity.CartelevatorEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.Comparator;

public class SendCartOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double totalAmountReturned = 0;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).nearCartElevator) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof CartelevatorEntity) {
						if (entityiterator.getPersistentData().getBoolean("detectedCart")) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7c\u00A7lCART HAS BEEN SENT TO SURFACE: \u00A74\u00A7lRETURN TO THE ELEVATOR"), false);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ASH, x, (y + 3), z, 25, 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:elevatoractivatemain")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							JimsmineshaftMod.queueServerWork(20, () -> {
								entityiterator.getPersistentData().putBoolean("submitted", true);
							});
						}
						CalculateTotalCashReturnedProcedure.execute(world, x, y, z);
					}
				}
			}
		}
	}
}