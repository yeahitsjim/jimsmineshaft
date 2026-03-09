package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class ThecartEntityIsHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity,
Entity sourceentity ) {
if (
entity == null ||
sourceentity == null ) return ;
if (sourceentity instanceof Player) {if () {entity.getPersistentData().putString("ownedBy", " ");}else{entity.getPersistentData().putString("ownedBy", (sourceentity.getDisplayName().getString()));}entity.getPersistentData().putBoolean("shake", true);JimsmineshaftMod.queueServerWork(20, () -> {
entity.getPersistentData().putBoolean("shake", false);
});
}
}
}