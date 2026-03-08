/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class JimsmineshaftModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, JimsmineshaftMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LIGHTPARTICLE = REGISTRY.register("lightparticle", () -> new SimpleParticleType(true));
}