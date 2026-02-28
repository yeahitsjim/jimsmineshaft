package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

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
		if (JimsmineshaftModItems.DELETED_MOD_ELEMENT.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
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
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DELETED_MOD_ELEMENT.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			JimsmineshaftMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DELETED_MOD_ELEMENT.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			});
		}
		if (JimsmineshaftModItems.DELETED_MOD_ELEMENT.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player) {
				if (entity.level().isClientSide()) {
					CompoundTag data = entity.getPersistentData();
					data.putString("PlayerCurrentAnimation", "jimsmineshaft:boomLeft");
					data.putBoolean("OverrideCurrentAnimation", true);
				} else {
					PacketDistributor.sendToPlayersInDimension((ServerLevel) entity.level(), new PlayPlayerAnimationMessage(entity.getId(), "jimsmineshaft:boomLeft", true));
				}
			}
			JimsmineshaftMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DELETED_MOD_ELEMENT.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			});
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DELETED_MOD_ELEMENT.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}