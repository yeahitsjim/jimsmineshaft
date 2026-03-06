package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.jimsmineshaft.entity.ElevatorEntity;

import java.util.Comparator;

public class ElevatorSeat8OnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof ElevatorEntity) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getX() + -1), (entityiterator.getY() + 0), (entityiterator.getZ() + 1.5));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX() + -1), (entityiterator.getY() + 0), (entityiterator.getZ() + 1.5), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
	}
}