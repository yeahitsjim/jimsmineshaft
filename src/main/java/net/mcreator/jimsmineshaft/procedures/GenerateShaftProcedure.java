package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

import net.mcreator.jimsmineshaft.network.JimsmineshaftModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GenerateShaftProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Direction workingDirection = Direction.NORTH;
		com.google.gson.JsonObject workingCoords = new com.google.gson.JsonObject();
		String workingRoomPick = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.TWISTING_VINES.asItem()) {
			JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining = 50;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).levelTokens = 25;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.MapVariables.get(world).variantTokens = 5;
			JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
			JimsmineshaftModVariables.cuurentCoords.addProperty("x", (entity.getX()));
			JimsmineshaftModVariables.cuurentCoords.addProperty("y", (entity.getY()));
			JimsmineshaftModVariables.cuurentCoords.addProperty("z", (entity.getZ()));
			if (0 < JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining) {
				if (0 < JimsmineshaftModVariables.MapVariables.get(world).levelTokens) {
					JimsmineshaftModVariables.MapVariables.get(world).lastGeneratedStructure = "mainelevator";
					JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
					JimsmineshaftModVariables.MapVariables.get(world).currentVariant = "a";
					JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76\u00A7lSpawning Main Elevator"), false);
					while (JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining > 0) {
						JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining = JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining - 1;
						JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
						JimsmineshaftModVariables.MapVariables.get(world).levelTokens = JimsmineshaftModVariables.MapVariables.get(world).totalTokensRemaining - 1;
						JimsmineshaftModVariables.MapVariables.get(world).syncData(world);
						workingDirection = CheckgenerationsideProcedure.execute(world);
						workingCoords = CheckGenerationCoordsProcedure.execute(world);
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList()
									.broadcastSystemMessage(
											Component.literal(("\u00A76\u00A7ISetting working coords to: X: " + (new java.text.DecimalFormat("##.##").format(workingCoords.get("x").getAsDouble()) + ""
													+ (" Y: "
															+ (new java.text.DecimalFormat("##.##").format(workingCoords.get("y").getAsDouble()) + "" + (" Z: " + new java.text.DecimalFormat("##.##").format(workingCoords.get("z").getAsDouble()))))))),
											false);
						workingRoomPick = PickRoomProcedure.execute(world);
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A76\u00A7IRoom Picked: " + workingRoomPick)), false);
						if (("elevator2").equals(workingRoomPick)) {
						}
						if (("variantabitmain").equals(workingRoomPick)) {
						}
						if (("variantashaft1").equals(workingRoomPick)) {
						}
						if (("variantashaft2").equals(workingRoomPick)) {
						}
						if (("variantashaftmain").equals(workingRoomPick)) {
						}
						if (("variantashaftmainnontlit").equals(workingRoomPick)) {
						}
						if (("variantbbit1").equals(workingRoomPick)) {
						}
						if (("variantbbit2").equals(workingRoomPick)) {
						}
						if (("variantbbit3").equals(workingRoomPick)) {
						}
						if (("variantbbit4").equals(workingRoomPick)) {
						}
						if (("variantbroom1").equals(workingRoomPick)) {
						}
						if (("variantbroom2").equals(workingRoomPick)) {
						}
						if (("variantbshaft1").equals(workingRoomPick)) {
						}
						if (("variantbshaft2").equals(workingRoomPick)) {
						}
						if (("variantbshaft3").equals(workingRoomPick)) {
						}
						if (("variantbshaft5").equals(workingRoomPick)) {
						}
						if (("variantcbit1").equals(workingRoomPick)) {
						}
						if (("variantcbit2").equals(workingRoomPick)) {
						}
					}
				}
			}
		}
	}
}