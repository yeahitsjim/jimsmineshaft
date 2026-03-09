package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class MysteryRailOnTickUpdateProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z ) {
double letsGoGambling = 0;boolean fuckoff = false;
if (==true) {letsGoGambling = Mth.nextInt(RandomSource.create(), 1, 10);if (y>600) {if (letsGoGambling>1) {if (getBlockNBTLogic(world, BlockPos.containing(x,y,z), "loot")==true) {fuckoff = true;}else{{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = Blocks.GOLD_BLOCK.defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Property<?> _propertyOld : _bso.getProperties()) {
Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
try {
_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 1);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);}}}if (y<400) {if (y>=300) {if (letsGoGambling>2) {if (getBlockNBTLogic(world, BlockPos.containing(x,y,z), "loot")==true) {fuckoff = true;}else{{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = Blocks.GOLD_BLOCK.defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Property<?> _propertyOld : _bso.getProperties()) {
Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
try {
_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 1);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);}}}}if (y<300) {if (y>=200) {if (letsGoGambling>3) {if (getBlockNBTLogic(world, BlockPos.containing(x,y,z), "loot")==true) {fuckoff = true;}else{{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = Blocks.GOLD_BLOCK.defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Property<?> _propertyOld : _bso.getProperties()) {
Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
try {
_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 1);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);}}}}if (y<200) {if (y>=100) {if (letsGoGambling>4) {if (getBlockNBTLogic(world, BlockPos.containing(x,y,z), "loot")==true) {fuckoff = true;}else{{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = Blocks.GOLD_BLOCK.defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Property<?> _propertyOld : _bso.getProperties()) {
Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
try {
_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 1);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);}}}}if (y<100) {if (y>=0) {if (letsGoGambling>5) {if (getBlockNBTLogic(world, BlockPos.containing(x,y,z), "loot")==true) {fuckoff = true;}else{{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = Blocks.GOLD_BLOCK.defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Property<?> _propertyOld : _bso.getProperties()) {
Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
try {
_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 1);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);}}}}if (y<0) {if (letsGoGambling>6) {if (getBlockNBTLogic(world, BlockPos.containing(x,y,z), "loot")==true) {fuckoff = true;}else{{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = Blocks.GOLD_BLOCK.defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Property<?> _propertyOld : _bso.getProperties()) {
Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
try {
_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 20, 1, 1, 1, 1);if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);}}}}
}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBoolean(tag);
		return false;
	}
}