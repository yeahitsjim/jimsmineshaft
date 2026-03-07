/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.entity.RightgateEntity;
import net.mcreator.jimsmineshaft.entity.LeftgateEntity;
import net.mcreator.jimsmineshaft.entity.FlashlightentityEntity;
import net.mcreator.jimsmineshaft.entity.BigIronGateRightEntity;
import net.mcreator.jimsmineshaft.entity.BigIronGateLeftEntity;
import net.mcreator.jimsmineshaft.entity.BigIronGateFrameEntity;
import net.mcreator.jimsmineshaft.entity.BigGateEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, JimsmineshaftMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FlashlightentityEntity>> FLASHLIGHTENTITY = register("flashlightentity",
			EntityType.Builder.<FlashlightentityEntity>of(FlashlightentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigIronGateFrameEntity>> BIG_IRON_GATE_FRAME = register("big_iron_gate_frame",
			EntityType.Builder.<BigIronGateFrameEntity>of(BigIronGateFrameEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigIronGateRightEntity>> BIG_IRON_GATE_RIGHT = register("big_iron_gate_right",
			EntityType.Builder.<BigIronGateRightEntity>of(BigIronGateRightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1.5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigIronGateLeftEntity>> BIG_IRON_GATE_LEFT = register("big_iron_gate_left",
			EntityType.Builder.<BigIronGateLeftEntity>of(BigIronGateLeftEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1.5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BigGateEntity>> BIG_GATE = register("big_gate",
			EntityType.Builder.<BigGateEntity>of(BigGateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LeftgateEntity>> LEFTGATE = register("leftgate",
			EntityType.Builder.<LeftgateEntity>of(LeftgateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(1.5f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RightgateEntity>> RIGHTGATE = register("rightgate",
			EntityType.Builder.<RightgateEntity>of(RightgateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(1.5f, 5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(JimsmineshaftMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		FlashlightentityEntity.init(event);
		BigIronGateFrameEntity.init(event);
		BigIronGateRightEntity.init(event);
		BigIronGateLeftEntity.init(event);
		BigGateEntity.init(event);
		LeftgateEntity.init(event);
		RightgateEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FLASHLIGHTENTITY.get(), FlashlightentityEntity.createAttributes().build());
		event.put(BIG_IRON_GATE_FRAME.get(), BigIronGateFrameEntity.createAttributes().build());
		event.put(BIG_IRON_GATE_RIGHT.get(), BigIronGateRightEntity.createAttributes().build());
		event.put(BIG_IRON_GATE_LEFT.get(), BigIronGateLeftEntity.createAttributes().build());
		event.put(BIG_GATE.get(), BigGateEntity.createAttributes().build());
		event.put(LEFTGATE.get(), LeftgateEntity.createAttributes().build());
		event.put(RIGHTGATE.get(), RightgateEntity.createAttributes().build());
	}
}