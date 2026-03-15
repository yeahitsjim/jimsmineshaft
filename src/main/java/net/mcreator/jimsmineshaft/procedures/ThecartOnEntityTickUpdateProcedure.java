package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ThecartOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double totalValue = 0;
		double slotNumber = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if ((entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("ownedBy"))) {
					entity.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z())));
					{
						Entity _ent = entity;
						_ent.setYRot(entityiterator.getYRot());
						_ent.setXRot(entityiterator.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getX() + entity.getLookAngle().x * 2), (entityiterator.getY()), (entityiterator.getZ() + entity.getLookAngle().z * 2));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX() + entity.getLookAngle().x * 2), (entityiterator.getY()), (entityiterator.getZ() + entity.getLookAngle().z * 2), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerIter) {
			for (int _idx = 0; _idx < _modHandlerIter.getSlots(); _idx++) {
				ItemStack itemstackiterator = _modHandlerIter.getStackInSlot(_idx).copy();
				totalValue = totalValue + itemstackiterator.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("value");
			}
		}
		entity.getPersistentData().putDouble("value", totalValue);
	}
}