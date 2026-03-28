package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.component.DataComponents;

import net.mcreator.jimsmineshaft.network.PlayPlayerAnimationMessage;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModItems;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class DetonatorBlockItemRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double coord1x = 0;
		double coord1y = 0;
		double coord1z = 0;
		double coord2x = 0;
		double coord2y = 0;
		double coord2z = 0;
		double coord3x = 0;
		double coord3y = 0;
		double coord3z = 0;
		if (JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player) {
				if (entity.level().isClientSide()) {
					CompoundTag data = entity.getPersistentData();
					data.putString("PlayerCurrentAnimation", "jimsmineshaft:boomRight");
					data.putBoolean("OverrideCurrentAnimation", true);
				} else {
					PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "jimsmineshaft:boomRight", true));
				}
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(
								Component.literal(("x: " + (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1x")) + ""
										+ (" y: " + (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1y")) + ""
												+ (" z: " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1z")))))))),
								false);
			DetonatorExplosionProcProcedure.execute(world, entity, entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DETONATOR_BLOCK_PUSHED.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			JimsmineshaftMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			});
		}
		if (JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player) {
				if (entity.level().isClientSide()) {
					CompoundTag data = entity.getPersistentData();
					data.putString("PlayerCurrentAnimation", "jimsmineshaft:boomLeft");
					data.putBoolean("OverrideCurrentAnimation", true);
				} else {
					PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "jimsmineshaft:boomLeft", true));
				}
			}
			DetonatorExplosionProcProcedure.execute(world, entity, entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			JimsmineshaftMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DETONATOR_BLOCK_PUSHED.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			});
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DETONATOR_BLOCK_PUSHED.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}