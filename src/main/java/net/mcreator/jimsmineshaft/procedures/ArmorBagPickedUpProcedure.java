package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ArmorBagPickedUpProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getItemEntity().getItem());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (JimsmineshaftModBlocks.BASIC_CLOTHES_BAG.get().asItem() == itemstack.getItem()) {
			JimsmineshaftMod.queueServerWork(5, () -> {
				if (hasEntityInInventory(entity, new ItemStack(JimsmineshaftModBlocks.BASIC_CLOTHES_BAG.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(JimsmineshaftModBlocks.BASIC_CLOTHES_BAG.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_GOON_SET_HELMET.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_GOON_SET_CHESTPLATE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_GOON_SET_LEGGINGS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_GOON_SET_BOOTS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 10, 3, 3, 3, 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:unzip")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:unzip")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			});
		}
		if (JimsmineshaftModBlocks.CLOTHES_BAG.get().asItem() == itemstack.getItem()) {
			JimsmineshaftMod.queueServerWork(5, () -> {
				if (hasEntityInInventory(entity, new ItemStack(JimsmineshaftModBlocks.CLOTHES_BAG.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(JimsmineshaftModBlocks.CLOTHES_BAG.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_ELITE_SET_HELMET.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_ELITE_SET_CHESTPLATE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_ELITE_SET_LEGGINGS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_ELITE_SET_BOOTS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 10, 3, 3, 3, 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:unzip")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:unzip")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			});
		}
		if (JimsmineshaftModBlocks.VETERAN_ARMOR_BAG.get().asItem() == itemstack.getItem()) {
			JimsmineshaftMod.queueServerWork(5, () -> {
				if (hasEntityInInventory(entity, new ItemStack(JimsmineshaftModBlocks.VETERAN_ARMOR_BAG.get()))) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(JimsmineshaftModBlocks.VETERAN_ARMOR_BAG.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_VETERAN_SET_HELMET.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_VETERAN_SET_CHESTPLATE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_VETERAN_SET_LEGGINGS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JimsmineshaftModItems.MINING_VETERAN_SET_BOOTS.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 10, 3, 3, 3, 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:unzip")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("jimsmineshaft:unzip")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			});
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}