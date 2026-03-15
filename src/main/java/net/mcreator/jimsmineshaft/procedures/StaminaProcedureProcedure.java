package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class StaminaProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity ) {
if (
entity == null ) return ;
if (!world.isClientSide()) {if (entity.isSprinting()) {entity.getPersistentData().putBoolean("sprintcooldown", true);}else{if (entity.getPersistentData().getBoolean("sprintcooldown")==true) {if (entity.getPersistentData().getBoolean("sprintoutcooldown")==true) {JimsmineshaftMod.queueServerWork(70, () -> {
entity.getPersistentData().putBoolean("sprintcooldown", false);
});
}else{JimsmineshaftMod.queueServerWork(35, () -> {
entity.getPersistentData().putBoolean("sprintcooldown", false);
});
}}if (entity.getPersistentData().getBoolean("sprintcooldown")==false) {if (<) {}if (>) {}}}if (==0) {entity.setSprinting(false);entity.getPersistentData().putBoolean("sprintoutcooldown", true);entity.getPersistentData().putBoolean("sprintcooldown", true);}}
}
}