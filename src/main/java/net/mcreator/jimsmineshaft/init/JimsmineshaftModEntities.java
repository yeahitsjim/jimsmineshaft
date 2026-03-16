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

import net.mcreator.jimsmineshaft.entity.VisionEntity;
import net.mcreator.jimsmineshaft.entity.ThecartEntity;
import net.mcreator.jimsmineshaft.entity.StalkerInsidesEntity;
import net.mcreator.jimsmineshaft.entity.StalkerInsides2Entity;
import net.mcreator.jimsmineshaft.entity.StalkerEntity;
import net.mcreator.jimsmineshaft.entity.SmallSlideUpGateEntityEntity;
import net.mcreator.jimsmineshaft.entity.SmallSideOpenGateEntityEntity;
import net.mcreator.jimsmineshaft.entity.SkinStealerEntityEntity;
import net.mcreator.jimsmineshaft.entity.RightgateEntity;
import net.mcreator.jimsmineshaft.entity.PressureDrillFoldedEntity;
import net.mcreator.jimsmineshaft.entity.PressureDrillEntity;
import net.mcreator.jimsmineshaft.entity.PlayerStalkierEntity;
import net.mcreator.jimsmineshaft.entity.LeftgateEntity;
import net.mcreator.jimsmineshaft.entity.HoleEntityEntity;
import net.mcreator.jimsmineshaft.entity.FlashlightentityEntity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat8Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat7Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat6Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat5Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat4Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat3Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat2Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorSeat1Entity;
import net.mcreator.jimsmineshaft.entity.ElevatorEntity;
import net.mcreator.jimsmineshaft.entity.ElevatorBoundingBoxEntity;
import net.mcreator.jimsmineshaft.entity.CopperDrilledNorthEntity;
import net.mcreator.jimsmineshaft.entity.CopperDrilledEastEntity;
import net.mcreator.jimsmineshaft.entity.Cart4Entity;
import net.mcreator.jimsmineshaft.entity.Cart3Entity;
import net.mcreator.jimsmineshaft.entity.Cart2Entity;
import net.mcreator.jimsmineshaft.entity.BulletProjectileEntity;
import net.mcreator.jimsmineshaft.entity.BigGateEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JimsmineshaftMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<StalkerEntity>> STALKER = register("stalker",
			EntityType.Builder.<StalkerEntity>of(StalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BulletProjectileEntity>> BULLET_PROJECTILE = register("bullet_projectile",
			EntityType.Builder.<BulletProjectileEntity>of(BulletProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
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
	public static final DeferredHolder<EntityType<?>, EntityType<HoleEntityEntity>> HOLE_ENTITY = register("hole_entity",
			EntityType.Builder.<HoleEntityEntity>of(HoleEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorEntity>> ELEVATOR = register("elevator",
			EntityType.Builder.<ElevatorEntity>of(ElevatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(5f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorBoundingBoxEntity>> ELEVATOR_BOUNDING_BOX = register("elevator_bounding_box",
			EntityType.Builder.<ElevatorBoundingBoxEntity>of(ElevatorBoundingBoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(5f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat5Entity>> ELEVATOR_SEAT_5 = register("elevator_seat_5",
			EntityType.Builder.<ElevatorSeat5Entity>of(ElevatorSeat5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat6Entity>> ELEVATOR_SEAT_6 = register("elevator_seat_6",
			EntityType.Builder.<ElevatorSeat6Entity>of(ElevatorSeat6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat3Entity>> ELEVATOR_SEAT_3 = register("elevator_seat_3",
			EntityType.Builder.<ElevatorSeat3Entity>of(ElevatorSeat3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat4Entity>> ELEVATOR_SEAT_4 = register("elevator_seat_4",
			EntityType.Builder.<ElevatorSeat4Entity>of(ElevatorSeat4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat7Entity>> ELEVATOR_SEAT_7 = register("elevator_seat_7",
			EntityType.Builder.<ElevatorSeat7Entity>of(ElevatorSeat7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat8Entity>> ELEVATOR_SEAT_8 = register("elevator_seat_8",
			EntityType.Builder.<ElevatorSeat8Entity>of(ElevatorSeat8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cart4Entity>> CART_4 = register("cart_4",
			EntityType.Builder.<Cart4Entity>of(Cart4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cart3Entity>> CART_3 = register("cart_3",
			EntityType.Builder.<Cart3Entity>of(Cart3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Cart2Entity>> CART_2 = register("cart_2",
			EntityType.Builder.<Cart2Entity>of(Cart2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RightgateEntity>> RIGHTGATE = register("rightgate",
			EntityType.Builder.<RightgateEntity>of(RightgateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(1.7f, 5.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat1Entity>> ELEVATOR_SEAT_1 = register("elevator_seat_1",
			EntityType.Builder.<ElevatorSeat1Entity>of(ElevatorSeat1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat2Entity>> ELEVATOR_SEAT_2 = register("elevator_seat_2",
			EntityType.Builder.<ElevatorSeat2Entity>of(ElevatorSeat2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<LeftgateEntity>> LEFTGATE = register("leftgate",
			EntityType.Builder.<LeftgateEntity>of(LeftgateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(1.7f, 5.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigGateEntity>> BIG_GATE = register("big_gate",
			EntityType.Builder.<BigGateEntity>of(BigGateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperDrilledNorthEntity>> COPPER_DRILLED_NORTH = register("copper_drilled_north",
			EntityType.Builder.<CopperDrilledNorthEntity>of(CopperDrilledNorthEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlashlightentityEntity>> FLASHLIGHTENTITY = register("flashlightentity",
			EntityType.Builder.<FlashlightentityEntity>of(FlashlightentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<VisionEntity>> VISION = register("vision",
			EntityType.Builder.<VisionEntity>of(VisionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1.1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<StalkerInsidesEntity>> STALKER_INSIDES = register("stalker_insides",
			EntityType.Builder.<StalkerInsidesEntity>of(StalkerInsidesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.02f, 0.03f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmallSideOpenGateEntityEntity>> SMALL_SIDE_OPEN_GATE_ENTITY = register("small_side_open_gate_entity",
			EntityType.Builder.<SmallSideOpenGateEntityEntity>of(SmallSideOpenGateEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PlayerStalkierEntity>> PLAYER_STALKIER = register("player_stalkier",
			EntityType.Builder.<PlayerStalkierEntity>of(PlayerStalkierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StalkerInsides2Entity>> STALKER_INSIDES_2 = register("stalker_insides_2",
			EntityType.Builder.<StalkerInsides2Entity>of(StalkerInsides2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerEntityEntity>> SKIN_STEALER_ENTITY = register("skin_stealer_entity",
			EntityType.Builder.<SkinStealerEntityEntity>of(SkinStealerEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmallSlideUpGateEntityEntity>> SMALL_SLIDE_UP_GATE_ENTITY = register("small_slide_up_gate_entity",
			EntityType.Builder.<SmallSlideUpGateEntityEntity>of(SmallSlideUpGateEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, registryname))));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, THECART.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, CART_4.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, CART_3.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, CART_2.get(), (living, context) -> living.getCombinedInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		StalkerEntity.init(event);
		ThecartEntity.init(event);
		PressureDrillEntity.init(event);
		PressureDrillFoldedEntity.init(event);
		CopperDrilledEastEntity.init(event);
		HoleEntityEntity.init(event);
		ElevatorEntity.init(event);
		ElevatorBoundingBoxEntity.init(event);
		ElevatorSeat5Entity.init(event);
		ElevatorSeat6Entity.init(event);
		ElevatorSeat3Entity.init(event);
		ElevatorSeat4Entity.init(event);
		ElevatorSeat7Entity.init(event);
		ElevatorSeat8Entity.init(event);
		Cart4Entity.init(event);
		Cart3Entity.init(event);
		Cart2Entity.init(event);
		RightgateEntity.init(event);
		ElevatorSeat1Entity.init(event);
		ElevatorSeat2Entity.init(event);
		LeftgateEntity.init(event);
		BigGateEntity.init(event);
		CopperDrilledNorthEntity.init(event);
		FlashlightentityEntity.init(event);
		VisionEntity.init(event);
		StalkerInsidesEntity.init(event);
		SmallSideOpenGateEntityEntity.init(event);
		PlayerStalkierEntity.init(event);
		StalkerInsides2Entity.init(event);
		SkinStealerEntityEntity.init(event);
		SmallSlideUpGateEntityEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STALKER.get(), StalkerEntity.createAttributes().build());
		event.put(THECART.get(), ThecartEntity.createAttributes().build());
		event.put(PRESSURE_DRILL.get(), PressureDrillEntity.createAttributes().build());
		event.put(PRESSURE_DRILL_FOLDED.get(), PressureDrillFoldedEntity.createAttributes().build());
		event.put(COPPER_DRILLED_EAST.get(), CopperDrilledEastEntity.createAttributes().build());
		event.put(HOLE_ENTITY.get(), HoleEntityEntity.createAttributes().build());
		event.put(ELEVATOR.get(), ElevatorEntity.createAttributes().build());
		event.put(ELEVATOR_BOUNDING_BOX.get(), ElevatorBoundingBoxEntity.createAttributes().build());
		event.put(ELEVATOR_SEAT_5.get(), ElevatorSeat5Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_6.get(), ElevatorSeat6Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_3.get(), ElevatorSeat3Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_4.get(), ElevatorSeat4Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_7.get(), ElevatorSeat7Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_8.get(), ElevatorSeat8Entity.createAttributes().build());
		event.put(CART_4.get(), Cart4Entity.createAttributes().build());
		event.put(CART_3.get(), Cart3Entity.createAttributes().build());
		event.put(CART_2.get(), Cart2Entity.createAttributes().build());
		event.put(RIGHTGATE.get(), RightgateEntity.createAttributes().build());
		event.put(ELEVATOR_SEAT_1.get(), ElevatorSeat1Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_2.get(), ElevatorSeat2Entity.createAttributes().build());
		event.put(LEFTGATE.get(), LeftgateEntity.createAttributes().build());
		event.put(BIG_GATE.get(), BigGateEntity.createAttributes().build());
		event.put(COPPER_DRILLED_NORTH.get(), CopperDrilledNorthEntity.createAttributes().build());
		event.put(FLASHLIGHTENTITY.get(), FlashlightentityEntity.createAttributes().build());
		event.put(VISION.get(), VisionEntity.createAttributes().build());
		event.put(STALKER_INSIDES.get(), StalkerInsidesEntity.createAttributes().build());
		event.put(SMALL_SIDE_OPEN_GATE_ENTITY.get(), SmallSideOpenGateEntityEntity.createAttributes().build());
		event.put(PLAYER_STALKIER.get(), PlayerStalkierEntity.createAttributes().build());
		event.put(STALKER_INSIDES_2.get(), StalkerInsides2Entity.createAttributes().build());
		event.put(SKIN_STEALER_ENTITY.get(), SkinStealerEntityEntity.createAttributes().build());
		event.put(SMALL_SLIDE_UP_GATE_ENTITY.get(), SmallSlideUpGateEntityEntity.createAttributes().build());
	}
}