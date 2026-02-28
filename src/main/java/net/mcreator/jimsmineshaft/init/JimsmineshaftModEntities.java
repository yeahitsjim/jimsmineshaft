/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.entity.ThecartEntity;
import net.mcreator.jimsmineshaft.entity.PressureDrillFoldedEntity;
import net.mcreator.jimsmineshaft.entity.PressureDrillEntity;
import net.mcreator.jimsmineshaft.entity.HoleEntityEntity;
import net.mcreator.jimsmineshaft.entity.CopperDrilledNorthEntity;
import net.mcreator.jimsmineshaft.entity.CopperDrilledEastEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JimsmineshaftMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ThecartEntity>> THECART = register("thecart",
			EntityType.Builder.<ThecartEntity>of(ThecartEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PressureDrillEntity>> PRESSURE_DRILL = register("pressure_drill",
			EntityType.Builder.<PressureDrillEntity>of(PressureDrillEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PressureDrillFoldedEntity>> PRESSURE_DRILL_FOLDED = register("pressure_drill_folded",
			EntityType.Builder.<PressureDrillFoldedEntity>of(PressureDrillFoldedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperDrilledEastEntity>> COPPER_DRILLED_EAST = register("copper_drilled_east",
			EntityType.Builder.<CopperDrilledEastEntity>of(CopperDrilledEastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperDrilledNorthEntity>> COPPER_DRILLED_NORTH = register("copper_drilled_north",
			EntityType.Builder.<CopperDrilledNorthEntity>of(CopperDrilledNorthEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HoleEntityEntity>> HOLE_ENTITY = register("hole_entity",
			EntityType.Builder.<HoleEntityEntity>of(HoleEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, registryname))));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, THECART.get(), (living, context) -> living.getCombinedInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ThecartEntity.init(event);
		PressureDrillEntity.init(event);
		PressureDrillFoldedEntity.init(event);
		CopperDrilledEastEntity.init(event);
		CopperDrilledNorthEntity.init(event);
		HoleEntityEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THECART.get(), ThecartEntity.createAttributes().build());
		event.put(PRESSURE_DRILL.get(), PressureDrillEntity.createAttributes().build());
		event.put(PRESSURE_DRILL_FOLDED.get(), PressureDrillFoldedEntity.createAttributes().build());
		event.put(COPPER_DRILLED_EAST.get(), CopperDrilledEastEntity.createAttributes().build());
		event.put(COPPER_DRILLED_NORTH.get(), CopperDrilledNorthEntity.createAttributes().build());
		event.put(HOLE_ENTITY.get(), HoleEntityEntity.createAttributes().build());
	}
}