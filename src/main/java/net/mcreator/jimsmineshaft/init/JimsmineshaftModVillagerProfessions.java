/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableSet;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModVillagerProfessions {
	private static final Map<String, ProfessionPoiType> POI_TYPES = new HashMap<>();
	public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(Registries.VILLAGER_PROFESSION, JimsmineshaftMod.MODID);
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK = registerProfession("company_store_clerk", () -> JimsmineshaftModBlocks.CLERK_ARMOR_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK_TOOLS = registerProfession("company_store_clerk_tools", () -> JimsmineshaftModBlocks.CLERK_TOOLS_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK_DRILLER = registerProfession("company_store_clerk_driller", () -> JimsmineshaftModBlocks.DRILLING_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK_WEAPONS_LIGHT = registerProfession("company_store_clerk_weapons_light", () -> JimsmineshaftModBlocks.CLERK_WEAPONS_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK_AMMO = registerProfession("company_store_clerk_ammo", () -> JimsmineshaftModBlocks.CLERK_AMMO_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK_WEAPONS_HEAVY = registerProfession("company_store_clerk_weapons_heavy", () -> JimsmineshaftModBlocks.CLERK_WEAPONS_HEAVY_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> COMPANY_STORE_CLERK_BASIC = registerProfession("company_store_clerk_basic", () -> JimsmineshaftModBlocks.CLERK_BASIC_BLOCK.get(),
			() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:pickupbit2")));

	private static DeferredHolder<VillagerProfession, VillagerProfession> registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
		POI_TYPES.put(name, new ProfessionPoiType(block, null));
		return PROFESSIONS.register(name, () -> {
			Predicate<Holder<PoiType>> poiPredicate = poiTypeHolder -> (POI_TYPES.get(name).poiType != null) && (poiTypeHolder.value() == POI_TYPES.get(name).poiType.value());
			return new VillagerProfession(JimsmineshaftMod.MODID + ":" + name, poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), soundEvent.get());
		});
	}

	@SubscribeEvent
	public static void registerProfessionPointsOfInterest(RegisterEvent event) {
		event.register(Registries.POINT_OF_INTEREST_TYPE, registerHelper -> {
			for (Map.Entry<String, ProfessionPoiType> entry : POI_TYPES.entrySet()) {
				Block block = entry.getValue().block.get();
				String name = entry.getKey();
				Optional<Holder<PoiType>> existingCheck = PoiTypes.forState(block.defaultBlockState());
				if (existingCheck.isPresent()) {
					JimsmineshaftMod.LOGGER.error("Skipping villager profession " + name + " that uses POI block " + block + " that is already in use by " + existingCheck);
					continue;
				}
				PoiType poiType = new PoiType(ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()), 1, 1);
				registerHelper.register(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", name), poiType);
				entry.getValue().poiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.wrapAsHolder(poiType);
			}
		});
	}

	private static class ProfessionPoiType {
		final Supplier<Block> block;
		Holder<PoiType> poiType;

		ProfessionPoiType(Supplier<Block> block, Holder<PoiType> poiType) {
			this.block = block;
			this.poiType = poiType;
		}
	}
}