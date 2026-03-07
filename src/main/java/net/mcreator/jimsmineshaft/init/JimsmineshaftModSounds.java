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
	public static final DeferredHolder<SoundEvent, SoundEvent> BUTTONCLICK = REGISTRY.register("buttonclick", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "buttonclick")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BATTERYCHARGE = REGISTRY.register("batterycharge", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "batterycharge")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BIGDOOR = REGISTRY.register("bigdoor", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "bigdoor")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THUD = REGISTRY.register("thud", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "thud")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BATTERYLEVELBEEP = REGISTRY.register("batterylevelbeep", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "batterylevelbeep")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTON = REGISTRY.register("lighton", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "lighton")));
}