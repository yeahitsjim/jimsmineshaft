package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class CalculateTotalCashReturnedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double totalCashReturned = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof ThecartEntity) {
					totalCashReturned = totalCashReturned + entityiterator.getPersistentData().getDouble("value");
				}
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A7c\u00A7lAMOUNT RETURNED: \u00A7a\u00A7l$" + new java.text.DecimalFormat("##.##").format(totalCashReturned))), false);
	}
}