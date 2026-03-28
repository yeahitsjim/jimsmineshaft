package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class InventoryValueCalculationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double letsgogambling = 0;
		double localInvCalculation = 0;
		localInvCalculation = 0;
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerIter) {
			for (int _idx = 0; _idx < _modHandlerIter.getSlots(); _idx++) {
				ItemStack itemstackiterator = _modHandlerIter.getStackInSlot(_idx).copy();
				if (itemstackiterator.getItem() == JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A.get().asItem()) {
					localInvCalculation = localInvCalculation + 24.75;
				}
				if (itemstackiterator.getItem() == JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B.get().asItem()) {
					localInvCalculation = localInvCalculation + 31.1;
				}
				if (itemstackiterator.getItem() == JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C.get().asItem()) {
					localInvCalculation = localInvCalculation + 21.6;
				}
				if (itemstackiterator.getItem() == JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D.get().asItem()) {
					localInvCalculation = localInvCalculation + 34.53;
				}
				if (itemstackiterator.getItem() == JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E.get().asItem()) {
					localInvCalculation = localInvCalculation + 38.1;
				}
			}
		}
		{
			JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
			_vars.playerInvValue = localInvCalculation;
			_vars.syncPlayerVariables(entity);
		}
	}
}