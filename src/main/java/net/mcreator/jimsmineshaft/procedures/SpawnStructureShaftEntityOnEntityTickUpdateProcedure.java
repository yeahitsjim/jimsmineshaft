package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

public class SpawnStructureShaftEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("jimsmineshaft", "shafthouse2"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x, y - 123, z), BlockPos.containing(x, y - 123, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}