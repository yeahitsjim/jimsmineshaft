// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 4.12.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class theElevator1Animation {
	public static final AnimationDefinition open4 = AnimationDefinition.Builder.withLength(2.5F)
			.addAnimation("doorA",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lock",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 57.5F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lock",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F,
							KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition shake = AnimationDefinition.Builder.withLength(20.0F).looping()
			.addAnimation("main",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.7917F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.1667F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5.125F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(6.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(6.4583F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(6.875F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(7.9583F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(8.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(9.5F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(9.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(10.8333F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(12.1667F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(12.5833F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(12.9583F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(13.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(14.4167F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(14.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(15.625F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(16.2917F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(16.9583F, KeyframeAnimations.degreeVec(0.0F, 7.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(18.0833F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(18.3333F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(19.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(19.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition close1 = AnimationDefinition.Builder.withLength(4.875F)
			.addAnimation("doorA",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lock",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(2.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 57.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lock",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(2.5F,
							KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}