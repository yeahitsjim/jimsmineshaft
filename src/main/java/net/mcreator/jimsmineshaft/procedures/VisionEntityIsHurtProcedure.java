package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class VisionEntityIsHurtProcedure {
	public static boolean execute(DamageSource damagesource) {
		if (damagesource == null)
			return false;
		return damagesource.is(TagKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft:bypasses_invulnerability")));
	}
}