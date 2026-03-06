package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class ElevatorEntityIsHurtProcedure {
public static void execute(
Entity entity ) {
if (
entity == null ) return ;
if (!) {entity.getPersistentData().putDouble("playerCount", (entity.getPersistentData().getDouble("playerCount")+1));}
}
}