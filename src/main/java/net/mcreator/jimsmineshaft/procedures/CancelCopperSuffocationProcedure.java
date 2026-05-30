package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class CancelCopperSuffocationProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (entity instanceof CopperDrilledNorthEntity) {
			if (damagesource.is(DamageTypes.IN_WALL)) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		}
		if (entity instanceof CopperDrilledEastEntity) {
			if (damagesource.is(DamageTypes.IN_WALL)) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		}
		if (entity instanceof LeftgateEntity) {
			if (damagesource.is(DamageTypes.IN_WALL)) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		}
		if (entity instanceof RightgateEntity) {
			if (damagesource.is(DamageTypes.IN_WALL)) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		}
		if (entity instanceof Player) {
			if (damagesource.is(DamageTypes.IN_WALL)) {
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_4_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_5_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_6_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
			}
		}
		if (entity instanceof Player) {
			if (damagesource.is(DamageTypes.FALL)) {
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_1_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:shopdimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_2_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_3_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_4_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_5_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
				if (ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:level_6_dimension")) == (entity.level().dimension())) {
					if (event instanceof ICancellableEvent _cancellable) {
						_cancellable.setCanceled(true);
					}
				}
			}
		}
		if (entity instanceof ElevatorEntity) {
			if (damagesource.is(DamageTypes.IN_WALL)) {
				if (event instanceof ICancellableEvent _cancellable) {
					_cancellable.setCanceled(true);
				}
			}
		}
	}
}