/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.jimsmineshaft.potion.TestEffectMobEffect;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class JimsmineshaftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, JimsmineshaftMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> TEST_EFFECT = REGISTRY.register("test_effect", () -> new TestEffectMobEffect());
}