package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class RawCopperDrilledEastOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double coord1x = 0;
		double coord2y = 0;
		double coord3z = 0;
		double coord1y = 0;
		double coord2z = 0;
		double coord1z = 0;
		double coord3x = 0;
		double coord2x = 0;
		double coord3y = 0;
		if (JimsmineshaftModItems.DYNAMITE_BOX.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount") >= 0) {
				{
					final String _tagName = "coordCount";
					final double _tagValue = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH_DYNAMITE.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(("Dynamite Box:\u00A76 "
						+ (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount")) + " sticks remaining"))));
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount") == 2) {
					{
						final String _tagName = "coord1x";
						final double _tagValue = x;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord1y";
						final double _tagValue = y;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord1z";
						final double _tagValue = z;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 10, 1, 1, 1, 1);
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount") == 1) {
					{
						final String _tagName = "coord2x";
						final double _tagValue = x;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord2y";
						final double _tagValue = y;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord2z";
						final double _tagValue = z;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 10, 1, 1, 1, 1);
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coordCount") == 0) {
					{
						final String _tagName = "coord3x";
						final double _tagValue = x;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord3y";
						final double _tagValue = y;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord3z";
						final double _tagValue = z;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					coord1x = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1x");
					coord1y = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1y");
					coord1z = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord1z");
					coord2x = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord2x");
					coord2y = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord2y");
					coord2z = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord2z");
					coord3x = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord3x");
					coord3y = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord3y");
					coord3z = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("coord3z");
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JimsmineshaftModItems.DETONATOR_BLOCK_ITEM.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					{
						final String _tagName = "coord1x";
						final double _tagValue = coord1x;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord1y";
						final double _tagValue = coord1y;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord1z";
						final double _tagValue = coord1z;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord2x";
						final double _tagValue = coord2x;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord2y";
						final double _tagValue = coord2y;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord2z";
						final double _tagValue = coord2z;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord3x";
						final double _tagValue = coord3x;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord3y";
						final double _tagValue = coord3y;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "coord3z";
						final double _tagValue = coord3z;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal("\u00A7l\u00A76Detonator: Primed "));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 10, 1, 1, 1, 1);
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, x, y, z, 10, 1, 1, 1, 1);
			}
		}
	}
}