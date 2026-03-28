package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModParticleTypes;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class FlashlightentityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 2), (entity.getXRot() * (-0.2)), (Math.cos(Math.toRadians(entity.getYRot())) * 2)));
		entity.getPersistentData().putDouble("beamsize", (entity.getPersistentData().getDouble("beamsize") + 1));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (JimsmineshaftModParticleTypes.LIGHTPARTICLE.get()), x, y, z, (int) (entity.getPersistentData().getDouble("beamsize") * 10), (entity.getPersistentData().getDouble("beamsize") * 0.1),
					(entity.getPersistentData().getDouble("beamsize") * 0.1), (entity.getPersistentData().getDouble("beamsize") * 0.1), 0);
		JimsmineshaftMod.queueServerWork(20, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
		int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("beamsize") * 0.1) - 1;
		int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("beamsize") * 0.1) - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (world.isEmptyBlock(BlockPos.containing(x + xi, y + i, z + zi))) {
							if (!world.isClientSide()) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), JimsmineshaftModBlocks.LIGHTBLOCK.get().defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}