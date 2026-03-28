package net.mcreator.jimsmineshaft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

public class PressureDrillRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (ItemStack.EMPTY.getItem() == (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).playerDrillMode == false) {
				sourceentity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())));
				{
					Entity _ent = sourceentity;
					_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
				}
				{
					JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.playerDrillMode = true;
					_vars.syncPlayerVariables(sourceentity);
				}
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		} else {
			{
				JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
				_vars.playerCantOpenDrill = true;
				_vars.syncPlayerVariables(sourceentity);
			}
			JimsmineshaftMod.queueServerWork(80, () -> {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = sourceentity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.playerCantOpenDrill = false;
					_vars.syncPlayerVariables(sourceentity);
				}
			});
		}
	}
}