/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class JimsmineshaftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, JimsmineshaftMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> STALKER_IMPALE = REGISTRY.register("stalker_impale", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "stalker_impale")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STALKER_GROWL_1 = REGISTRY.register("stalker_growl_1", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "stalker_growl_1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STALKER_EMERGE = REGISTRY.register("stalker.emerge", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "stalker.emerge")));
}