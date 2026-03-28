package net.mcreator.jimsmineshaft.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements JimsmineshaftModBiomes.JimsmineshaftModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> jimsmineshaft_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.jimsmineshaft_dimensionTypeReference != null) {
			retval = JimsmineshaftModBiomes.adaptSurfaceRule(retval, this.jimsmineshaft_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setjimsmineshaftDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.jimsmineshaft_dimensionTypeReference = dimensionType;
	}
}