// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author phant
 */
public class slideupgateAnimation {
	public static final AnimationDefinition gateopen = AnimationDefinition.Builder.withLength(0.5833F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 81.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 81.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 79.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();

	public static final AnimationDefinition gateclose = AnimationDefinition.Builder.withLength(0.5833F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 79.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 81.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();

	public static final AnimationDefinition close = AnimationDefinition.Builder.withLength(0.0F)

			.build();

	public static final AnimationDefinition open = AnimationDefinition.Builder.withLength(0.0F)
			.addAnimation("leftdoor",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F,
							KeyframeAnimations.posVec(0.0F, 79.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}