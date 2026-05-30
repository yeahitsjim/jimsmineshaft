package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class StopmatchProcedureProcedure {
public static void execute(
LevelAccessor world ) {
if () {if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Match Stopped"), false);}else{if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Match Started"), false);}
}
}