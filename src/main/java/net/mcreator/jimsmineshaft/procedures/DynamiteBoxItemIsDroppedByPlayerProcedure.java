package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class DynamiteBoxItemIsDroppedByPlayerProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		double coord1x = 0;
		double coord2y = 0;
		double coord3z = 0;
		double coord1y = 0;
		double coord2z = 0;
		double coord1z = 0;
		double coord3x = 0;
		double coord2x = 0;
		double coord3y = 0;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("do not forget to remove this feature"), false);
		{
			final String _tagName = "coordCount";
			final double _tagValue = 3;
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
		}
		itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("Dynamite Box:\u00A76 " + (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount") + " sticks remaining"))));
	}
}