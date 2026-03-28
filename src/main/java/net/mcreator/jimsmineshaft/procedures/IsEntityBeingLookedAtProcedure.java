package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class IsEntityBeingLookedAtProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		boolean looked = false;
		double distance = 0;
		looked = false;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (UnobstructedLineProcedure.execute(world, entity.getX(), entity.getY() + 1.3, entity.getZ(), entityiterator.getX(), entityiterator.getY() + 1.3, entityiterator.getZ())) {
				distance = Math.sqrt(Math.pow(entityiterator.getX() - entity.getX(), 2) + Math.pow((entityiterator.getY() + 1.3) - (entity.getY() + 1.3), 2) + Math.pow(entityiterator.getZ() - entity.getZ(), 2));
				if (Math.sqrt(Math.pow((entityiterator.getX() + entityiterator.getLookAngle().x * distance) - entity.getX(), 2) + Math.pow((entityiterator.getY() + entityiterator.getLookAngle().y * distance + 1.3) - (entity.getY() + 1.3), 2)
						+ Math.pow((entityiterator.getZ() + entityiterator.getLookAngle().z * distance) - entity.getZ(), 2)) < 1.45 * distance) {
					looked = true;
					break;
				}
			}
		}
		return looked;
	}
}