package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class BulletProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		double trailStartX = 0;
		double trailStartY = 0;
		double trailStartZ = 0;
		double trailEndX = 0;
		double trailEndY = 0;
		double trailEndZ = 0;
		double trailCurrentX = 0;
		double trailCurrentY = 0;
		double trailCurrentZ = 0;
		double trailA = 0;
		double repeats = 0;
		trailStartX = immediatesourceentity.getX() - immediatesourceentity.getDeltaMovement().x();
		trailStartY = immediatesourceentity.getY() - immediatesourceentity.getDeltaMovement().y();
		trailStartZ = immediatesourceentity.getZ() - immediatesourceentity.getDeltaMovement().z();
		trailEndX = immediatesourceentity.getX();
		trailEndY = immediatesourceentity.getY();
		trailEndZ = immediatesourceentity.getZ();
		trailA = 0;
		repeats = Math.round(Math.sqrt(Math.pow(trailStartX - trailEndX, 2) + Math.pow(trailStartY - trailEndY, 2) + Math.pow(trailStartZ - trailEndZ, 2)) * 2);
		for (int index0 = 0; index0 < (int) repeats; index0++) {
			trailCurrentX = trailStartX + (trailEndX - trailStartX) * trailA;
			trailCurrentY = trailStartY + (trailEndY - trailStartY) * trailA;
			trailCurrentZ = trailStartZ + (trailEndZ - trailStartZ) * trailA;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMOKE, trailCurrentX, trailCurrentY, trailCurrentZ, 1, 0, 0, 0, 0);
			trailA = trailA + 1 / repeats;
		}
	}
}