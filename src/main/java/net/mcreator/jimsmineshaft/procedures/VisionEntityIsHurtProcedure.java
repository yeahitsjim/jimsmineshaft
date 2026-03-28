package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class VisionEntityIsHurtProcedure {
	public static boolean execute(DamageSource damagesource) {
		if (damagesource == null)
			return false;
		return damagesource.is(TagKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft:bypasses_invulnerability")));
	}
}