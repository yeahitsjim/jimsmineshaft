package net.mcreator.jimsmineshaft.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.12.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class playerStalkerAnimation {
	public static final AnimationDefinition snap = AnimationDefinition.Builder.withLength(3.0F)
			.addAnimation("left_torso", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.1667F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 20.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 20.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.7083F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 20.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -20.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_torso",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0417F, KeyframeAnimations.degreeVec(43.2192F, 13.9954F, -16.9328F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(43.2192F, 13.9954F, -16.9328F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.7083F, KeyframeAnimations.degreeVec(4.4565F, 14.4392F, -22.0705F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.8333F, KeyframeAnimations.degreeVec(0.0F, 10.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.625F, KeyframeAnimations.degreeVec(0.0F, 10.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.7083F, KeyframeAnimations.degreeVec(1.3184F, -9.9136F, -10.1144F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.0833F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.1667F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.3333F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.7083F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("left_leg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.7083F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("legs", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.7083F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}