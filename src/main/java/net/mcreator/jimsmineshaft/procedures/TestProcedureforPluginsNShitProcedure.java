package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class TestProcedureforPluginsNShitProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getEntity());
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
com.google.gson.JsonObject testDependency = new com.google.gson.JsonObject();com.google.gson.JsonObject testDependency2 = new com.google.gson.JsonObject();double coordtest = 0;Direction testdirectiontest = Direction.NORTH;String heresexamplevariable = "";
if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {testdirectiontest = Direction.NORTH;coordtest = 500;testDependency = ;if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("test2 string from json I was returned: "+testDependency.get("hi").getAsString())), false);}
}
}