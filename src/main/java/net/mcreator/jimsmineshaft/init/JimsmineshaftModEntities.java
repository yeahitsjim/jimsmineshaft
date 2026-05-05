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
import net.mcreator.jimsmineshaft.entity.SpawnStructureShaftEntityEntity;
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
import net.mcreator.jimsmineshaft.entity.ElevatorFAILSAFEboxEntity;
import net.mcreator.jimsmineshaft.entity.ElevatorEntity;
import net.mcreator.jimsmineshaft.entity.ElevatorBoundingBoxEntity;
import net.mcreator.jimsmineshaft.entity.CopperDrilledNorthEntity;
import net.mcreator.jimsmineshaft.entity.CopperDrilledEastEntity;
import net.mcreator.jimsmineshaft.entity.CartelevatorWestEntity;
import net.mcreator.jimsmineshaft.entity.CartelevatorEntity;
import net.mcreator.jimsmineshaft.entity.CartelevatorEastEntity;
import net.mcreator.jimsmineshaft.entity.CartElevatorBoundingBoxEntity;
import net.mcreator.jimsmineshaft.entity.Cart4Entity;
import net.mcreator.jimsmineshaft.entity.Cart3Entity;
import net.mcreator.jimsmineshaft.entity.Cart2Entity;
import net.mcreator.jimsmineshaft.entity.BulletProjectileEntity;
import net.mcreator.jimsmineshaft.entity.BigGateEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JimsmineshaftMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ThecartEntity>> THECART = register("thecart",
			EntityType.Builder.<ThecartEntity>of(ThecartEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.2f));
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
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat1Entity>> ELEVATOR_SEAT_1 = register("elevator_seat_1",
			EntityType.Builder.<ElevatorSeat1Entity>of(ElevatorSeat1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorSeat2Entity>> ELEVATOR_SEAT_2 = register("elevator_seat_2",
			EntityType.Builder.<ElevatorSeat2Entity>of(ElevatorSeat2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<CopperDrilledNorthEntity>> COPPER_DRILLED_NORTH = register("copper_drilled_north",
			EntityType.Builder.<CopperDrilledNorthEntity>of(CopperDrilledNorthEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StalkerEntity>> STALKER = register("stalker",
			EntityType.Builder.<StalkerEntity>of(StalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StalkerInsidesEntity>> STALKER_INSIDES = register("stalker_insides",
			EntityType.Builder.<StalkerInsidesEntity>of(StalkerInsidesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.02f, 0.03f));
	public static final DeferredHolder<EntityType<?>, EntityType<PlayerStalkierEntity>> PLAYER_STALKIER = register("player_stalkier",
			EntityType.Builder.<PlayerStalkierEntity>of(PlayerStalkierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<StalkerInsides2Entity>> STALKER_INSIDES_2 = register("stalker_insides_2",
			EntityType.Builder.<StalkerInsides2Entity>of(StalkerInsides2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerEntityEntity>> SKIN_STEALER_ENTITY = register("skin_stealer_entity",
			EntityType.Builder.<SkinStealerEntityEntity>of(SkinStealerEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigGateEntity>> BIG_GATE = register("big_gate",
			EntityType.Builder.<BigGateEntity>of(BigGateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BulletProjectileEntity>> BULLET_PROJECTILE = register("bullet_projectile",
			EntityType.Builder.<BulletProjectileEntity>of(BulletProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RightgateEntity>> RIGHTGATE = register("rightgate",
			EntityType.Builder.<RightgateEntity>of(RightgateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(1.7f, 5.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlashlightentityEntity>> FLASHLIGHTENTITY = register("flashlightentity",
			EntityType.Builder.<FlashlightentityEntity>of(FlashlightentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LeftgateEntity>> LEFTGATE = register("leftgate",
			EntityType.Builder.<LeftgateEntity>of(LeftgateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(1.7f, 5.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmallSideOpenGateEntityEntity>> SMALL_SIDE_OPEN_GATE_ENTITY = register("small_side_open_gate_entity",
			EntityType.Builder.<SmallSideOpenGateEntityEntity>of(SmallSideOpenGateEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<VisionEntity>> VISION = register("vision",
			EntityType.Builder.<VisionEntity>of(VisionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1.1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmallSlideUpGateEntityEntity>> SMALL_SLIDE_UP_GATE_ENTITY = register("small_slide_up_gate_entity",
			EntityType.Builder.<SmallSlideUpGateEntityEntity>of(SmallSlideUpGateEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElevatorFAILSAFEboxEntity>> ELEVATOR_FAILSAF_EBOX = register("elevator_failsaf_ebox",
			EntityType.Builder.<ElevatorFAILSAFEboxEntity>of(ElevatorFAILSAFEboxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(5f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpawnStructureShaftEntityEntity>> SPAWN_STRUCTURE_SHAFT_ENTITY = register("spawn_structure_shaft_entity", EntityType.Builder
			.<SpawnStructureShaftEntityEntity>of(SpawnStructureShaftEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.2f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CartelevatorEastEntity>> CARTELEVATOR_EAST = register("cartelevator_east",
			EntityType.Builder.<CartelevatorEastEntity>of(CartelevatorEastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CartElevatorBoundingBoxEntity>> CART_ELEVATOR_BOUNDING_BOX = register("cart_elevator_bounding_box", EntityType.Builder
			.<CartElevatorBoundingBoxEntity>of(CartElevatorBoundingBoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(4f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<CartelevatorEntity>> CARTELEVATOR = register("cartelevator",
			EntityType.Builder.<CartelevatorEntity>of(CartelevatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CartelevatorWestEntity>> CARTELEVATOR_WEST = register("cartelevator_west",
			EntityType.Builder.<CartelevatorWestEntity>of(CartelevatorWestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LeechEntity>> LEECH = register("leech",
			EntityType.Builder.<LeechEntity>of(LeechEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AmalgamationEntity>> AMALGAMATION = register("amalgamation",
			EntityType.Builder.<AmalgamationEntity>of(AmalgamationEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerChickenNuggetACEntity>> SKIN_STEALER_CHICKEN_NUGGET_AC = register("skin_stealer_chicken_nugget_ac",
			EntityType.Builder.<SkinStealerChickenNuggetACEntity>of(SkinStealerChickenNuggetACEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerGooberEntity>> SKIN_STEALER_GOOBER = register("skin_stealer_goober",
			EntityType.Builder.<SkinStealerGooberEntity>of(SkinStealerGooberEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerGigoEntity>> SKIN_STEALER_GIGO = register("skin_stealer_gigo",
			EntityType.Builder.<SkinStealerGigoEntity>of(SkinStealerGigoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerGoshiggyEntity>> SKIN_STEALER_GOSHIGGY = register("skin_stealer_goshiggy",
			EntityType.Builder.<SkinStealerGoshiggyEntity>of(SkinStealerGoshiggyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerKunzyEntity>> SKIN_STEALER_KUNZY = register("skin_stealer_kunzy",
			EntityType.Builder.<SkinStealerKunzyEntity>of(SkinStealerKunzyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerWylanEntity>> SKIN_STEALER_WYLAN = register("skin_stealer_wylan",
			EntityType.Builder.<SkinStealerWylanEntity>of(SkinStealerWylanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerYourNotLuisEntity>> SKIN_STEALER_YOUR_NOT_LUIS = register("skin_stealer_your_not_luis",
			EntityType.Builder.<SkinStealerYourNotLuisEntity>of(SkinStealerYourNotLuisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerCowMan5000Entity>> SKIN_STEALER_COW_MAN_5000 = register("skin_stealer_cow_man_5000",
			EntityType.Builder.<SkinStealerCowMan5000Entity>of(SkinStealerCowMan5000Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PlayerStalkierChickenNuggetACEntity>> PLAYER_STALKIER_CHICKEN_NUGGET_AC = register("player_stalkier_chicken_nugget_ac",
			EntityType.Builder.<PlayerStalkierChickenNuggetACEntity>of(PlayerStalkierChickenNuggetACEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkinStealerEntity2Entity>> SKIN_STEALER_ENTITY_2 = register("skin_stealer_entity_2",
			EntityType.Builder.<SkinStealerEntity2Entity>of(SkinStealerEntity2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));

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
		ElevatorSeat1Entity.init(event);
		ElevatorSeat2Entity.init(event);
		CopperDrilledNorthEntity.init(event);
		StalkerEntity.init(event);
		StalkerInsidesEntity.init(event);
		PlayerStalkierEntity.init(event);
		StalkerInsides2Entity.init(event);
		SkinStealerEntityEntity.init(event);
		BigGateEntity.init(event);
		RightgateEntity.init(event);
		FlashlightentityEntity.init(event);
		LeftgateEntity.init(event);
		SmallSideOpenGateEntityEntity.init(event);
		VisionEntity.init(event);
		SmallSlideUpGateEntityEntity.init(event);
		ElevatorFAILSAFEboxEntity.init(event);
		SpawnStructureShaftEntityEntity.init(event);
		CartelevatorEastEntity.init(event);
		CartElevatorBoundingBoxEntity.init(event);
		CartelevatorEntity.init(event);
		CartelevatorWestEntity.init(event);
		LeechEntity.init(event);
		AmalgamationEntity.init(event);
		SkinStealerChickenNuggetACEntity.init(event);
		SkinStealerGooberEntity.init(event);
		SkinStealerGigoEntity.init(event);
		SkinStealerGoshiggyEntity.init(event);
		SkinStealerKunzyEntity.init(event);
		SkinStealerWylanEntity.init(event);
		SkinStealerYourNotLuisEntity.init(event);
		SkinStealerCowMan5000Entity.init(event);
		PlayerStalkierChickenNuggetACEntity.init(event);
		SkinStealerEntity2Entity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
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
		event.put(ELEVATOR_SEAT_1.get(), ElevatorSeat1Entity.createAttributes().build());
		event.put(ELEVATOR_SEAT_2.get(), ElevatorSeat2Entity.createAttributes().build());
		event.put(COPPER_DRILLED_NORTH.get(), CopperDrilledNorthEntity.createAttributes().build());
		event.put(STALKER.get(), StalkerEntity.createAttributes().build());
		event.put(STALKER_INSIDES.get(), StalkerInsidesEntity.createAttributes().build());
		event.put(PLAYER_STALKIER.get(), PlayerStalkierEntity.createAttributes().build());
		event.put(STALKER_INSIDES_2.get(), StalkerInsides2Entity.createAttributes().build());
		event.put(SKIN_STEALER_ENTITY.get(), SkinStealerEntityEntity.createAttributes().build());
		event.put(BIG_GATE.get(), BigGateEntity.createAttributes().build());
		event.put(RIGHTGATE.get(), RightgateEntity.createAttributes().build());
		event.put(FLASHLIGHTENTITY.get(), FlashlightentityEntity.createAttributes().build());
		event.put(LEFTGATE.get(), LeftgateEntity.createAttributes().build());
		event.put(SMALL_SIDE_OPEN_GATE_ENTITY.get(), SmallSideOpenGateEntityEntity.createAttributes().build());
		event.put(VISION.get(), VisionEntity.createAttributes().build());
		event.put(SMALL_SLIDE_UP_GATE_ENTITY.get(), SmallSlideUpGateEntityEntity.createAttributes().build());
		event.put(ELEVATOR_FAILSAF_EBOX.get(), ElevatorFAILSAFEboxEntity.createAttributes().build());
		event.put(SPAWN_STRUCTURE_SHAFT_ENTITY.get(), SpawnStructureShaftEntityEntity.createAttributes().build());
		event.put(CARTELEVATOR_EAST.get(), CartelevatorEastEntity.createAttributes().build());
		event.put(CART_ELEVATOR_BOUNDING_BOX.get(), CartElevatorBoundingBoxEntity.createAttributes().build());
		event.put(CARTELEVATOR.get(), CartelevatorEntity.createAttributes().build());
		event.put(CARTELEVATOR_WEST.get(), CartelevatorWestEntity.createAttributes().build());
		event.put(LEECH.get(), LeechEntity.createAttributes().build());
		event.put(AMALGAMATION.get(), AmalgamationEntity.createAttributes().build());
		event.put(SKIN_STEALER_CHICKEN_NUGGET_AC.get(), SkinStealerChickenNuggetACEntity.createAttributes().build());
		event.put(SKIN_STEALER_GOOBER.get(), SkinStealerGooberEntity.createAttributes().build());
		event.put(SKIN_STEALER_GIGO.get(), SkinStealerGigoEntity.createAttributes().build());
		event.put(SKIN_STEALER_GOSHIGGY.get(), SkinStealerGoshiggyEntity.createAttributes().build());
		event.put(SKIN_STEALER_KUNZY.get(), SkinStealerKunzyEntity.createAttributes().build());
		event.put(SKIN_STEALER_WYLAN.get(), SkinStealerWylanEntity.createAttributes().build());
		event.put(SKIN_STEALER_YOUR_NOT_LUIS.get(), SkinStealerYourNotLuisEntity.createAttributes().build());
		event.put(SKIN_STEALER_COW_MAN_5000.get(), SkinStealerCowMan5000Entity.createAttributes().build());
		event.put(PLAYER_STALKIER_CHICKEN_NUGGET_AC.get(), PlayerStalkierChickenNuggetACEntity.createAttributes().build());
		event.put(SKIN_STEALER_ENTITY_2.get(), SkinStealerEntity2Entity.createAttributes().build());
	}
}