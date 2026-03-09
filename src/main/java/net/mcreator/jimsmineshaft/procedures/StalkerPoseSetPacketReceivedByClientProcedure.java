package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StalkerPoseSetPacketReceivedByClientProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, String inboundString) {
		if (inboundString == null)
			return;
		double pose_a = 0;
		Entity stalker = null;
		pose_a = 0;
		{
			String[] _array = inboundString.split(Pattern.quote(","));
			if (_array.length != 0) {
				for (String stringiterator : _array) {
					if (pose_a == 0) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.toList()) {
								if ((entityiterator.getStringUUID()).equals(stringiterator)) {
									stalker = entityiterator;
									break;
								}
							}
						}
					}
					if (pose_a == 1) {
						if (stalker instanceof StalkerEntity) {
							stalker.getPersistentData().putString("ClientPose", stringiterator);
						}
					}
					pose_a = pose_a + 1;
				}
			} else {
				String stringiterator = inboundString;
				for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
					if (pose_a == 0) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.toList()) {
								if ((entityiterator.getStringUUID()).equals(stringiterator)) {
									stalker = entityiterator;
									break;
								}
							}
						}
					}
					if (pose_a == 1) {
						if (stalker instanceof StalkerEntity) {
							stalker.getPersistentData().putString("ClientPose", stringiterator);
						}
					}
					pose_a = pose_a + 1;
				}
			}
		}
	}
}