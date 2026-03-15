// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author phant
 */
public class opengateAnimation {
	public static final AnimationDefinition gateopen = AnimationDefinition.Builder.withLength(0.4167F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, 7.24F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0833F, KeyframeAnimations.degreeVec(0.0F, 21.895F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 95.76F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, 104.125F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 106.38F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, 104.445F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 99.36F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 96.485F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 96.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition gateclose = AnimationDefinition.Builder.withLength(0.375F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 96.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, 90.365F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0833F, KeyframeAnimations.degreeVec(0.0F, 77.345F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 53.2F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 28.13F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, -0.6F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, 5.525F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition close = AnimationDefinition.Builder.withLength(0.0F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F,
							KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition open = AnimationDefinition.Builder.withLength(0.0F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 96.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F,
							KeyframeAnimations.posVec(0.0F, 79.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}