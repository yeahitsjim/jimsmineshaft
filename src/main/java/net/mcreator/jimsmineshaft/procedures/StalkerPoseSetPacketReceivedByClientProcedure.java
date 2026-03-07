package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.entity.StalkerEntity;

import java.util.regex.Pattern;
import java.util.Comparator;

public class StalkerPoseSetPacketReceivedByClientProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, String inboundString) {
		if (inboundString == null)
			return;
		double pose_a = 0;
		Entity stalker = null;
		pose_a = 0;
		{
			String[] _array = inboundString.split(Pattern.quote(","));
			if (_array.length != 0) {
				for (String stringiterator : _array) {
					if (pose_a == 0) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.toList()) {
								if ((entityiterator.getStringUUID()).equals(stringiterator)) {
									stalker = entityiterator;
									break;
								}
							}
						}
					}
					if (pose_a == 1) {
						if (stalker instanceof StalkerEntity) {
							stalker.getPersistentData().putString("ClientPose", stringiterator);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.bee.hurt")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.bee.hurt")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					}
					pose_a = pose_a + 1;
				}
			} else {
				String stringiterator = inboundString;
				for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
					if (pose_a == 0) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.toList()) {
								if ((entityiterator.getStringUUID()).equals(stringiterator)) {
									stalker = entityiterator;
									break;
								}
							}
						}
					}
					if (pose_a == 1) {
						if (stalker instanceof StalkerEntity) {
							stalker.getPersistentData().putString("ClientPose", stringiterator);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.bee.hurt")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.bee.hurt")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					}
					pose_a = pose_a + 1;
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.break")), SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.netherite_block.break")), SoundSource.BLOCKS, 1, 1, false);
			}
		}
	}
}