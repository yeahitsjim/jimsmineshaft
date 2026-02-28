/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.jimsmineshaft.block.entity.WoodenWallTypeBBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportTypeBBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportTypeABlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportTopTypeABlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportTopLightTypeABlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportPlainTypeBBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportFullTypeCBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportCornerTypeBBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenSupportCornerTypeB2BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenRoofTypeCBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenRoofTypeBBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.WoodenRoofTypeABlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper2BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper29BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper28BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper27BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper26BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper25BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper24BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper23BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper22BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.RawCopper210BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.NewSuspiciousGravelBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.NewStrippedDarkOakLogBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.NewStoneBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.NewGravelBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.MysteryRailBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.MysteryItemBlockEntity;
import net.mcreator.jimsmineshaft.block.entity.CopperFragment5BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.CopperFragment4BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.CopperFragment3BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.CopperFragment2BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.CopperFragment1BlockEntity;
import net.mcreator.jimsmineshaft.block.entity.CopperChunkTypeABlockEntity;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class JimsmineshaftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, JimsmineshaftMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportCornerTypeBBlockEntity>> WOODEN_SUPPORT_CORNER_TYPE_B = register("wooden_support_corner_type_b", JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B,
			WoodenSupportCornerTypeBBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportFullTypeCBlockEntity>> WOODEN_SUPPORT_FULL_TYPE_C = register("wooden_support_full_type_c", JimsmineshaftModBlocks.WOODEN_SUPPORT_FULL_TYPE_C,
			WoodenSupportFullTypeCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportTopTypeABlockEntity>> WOODEN_SUPPORT_TOP_TYPE_A = register("wooden_support_top_type_a", JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_TYPE_A,
			WoodenSupportTopTypeABlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportPlainTypeBBlockEntity>> WOODEN_SUPPORT_PLAIN_TYPE_B = register("wooden_support_plain_type_b", JimsmineshaftModBlocks.WOODEN_SUPPORT_PLAIN_TYPE_B,
			WoodenSupportPlainTypeBBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportCornerTypeB2BlockEntity>> WOODEN_SUPPORT_CORNER_TYPE_B_2 = register("wooden_support_corner_type_b_2", JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B_2,
			WoodenSupportCornerTypeB2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenWallTypeBBlockEntity>> WOODEN_WALL_TYPE_B = register("wooden_wall_type_b", JimsmineshaftModBlocks.WOODEN_WALL_TYPE_B, WoodenWallTypeBBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportTypeABlockEntity>> WOODEN_SUPPORT_TYPE_A = register("wooden_support_type_a", JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_A, WoodenSupportTypeABlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportTopLightTypeABlockEntity>> WOODEN_SUPPORT_TOP_LIGHT_TYPE_A = register("wooden_support_top_light_type_a", JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_LIGHT_TYPE_A,
			WoodenSupportTopLightTypeABlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenSupportTypeBBlockEntity>> WOODEN_SUPPORT_TYPE_B = register("wooden_support_type_b", JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_B, WoodenSupportTypeBBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenRoofTypeABlockEntity>> WOODEN_ROOF_TYPE_A = register("wooden_roof_type_a", JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_A, WoodenRoofTypeABlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenRoofTypeCBlockEntity>> WOODEN_ROOF_TYPE_C = register("wooden_roof_type_c", JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_C, WoodenRoofTypeCBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenRoofTypeBBlockEntity>> WOODEN_ROOF_TYPE_B = register("wooden_roof_type_b", JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_B, WoodenRoofTypeBBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperFragment5BlockEntity>> COPPER_FRAGMENT_5 = register("copper_fragment_5", JimsmineshaftModBlocks.COPPER_FRAGMENT_5, CopperFragment5BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperFragment1BlockEntity>> COPPER_FRAGMENT_1 = register("copper_fragment_1", JimsmineshaftModBlocks.COPPER_FRAGMENT_1, CopperFragment1BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperFragment2BlockEntity>> COPPER_FRAGMENT_2 = register("copper_fragment_2", JimsmineshaftModBlocks.COPPER_FRAGMENT_2, CopperFragment2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperFragment3BlockEntity>> COPPER_FRAGMENT_3 = register("copper_fragment_3", JimsmineshaftModBlocks.COPPER_FRAGMENT_3, CopperFragment3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperChunkTypeABlockEntity>> COPPER_CHUNK_TYPE_A = register("copper_chunk_type_a", JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A, CopperChunkTypeABlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CopperFragment4BlockEntity>> COPPER_FRAGMENT_4 = register("copper_fragment_4", JimsmineshaftModBlocks.COPPER_FRAGMENT_4, CopperFragment4BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MysteryRailBlockEntity>> MYSTERY_RAIL = register("mystery_rail", JimsmineshaftModBlocks.MYSTERY_RAIL, MysteryRailBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper210BlockEntity>> RAW_COPPER_210 = register("raw_copper_210", JimsmineshaftModBlocks.RAW_COPPER_210, RawCopper210BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper2BlockEntity>> RAW_COPPER_2 = register("raw_copper_2", JimsmineshaftModBlocks.RAW_COPPER_2, RawCopper2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NewStrippedDarkOakLogBlockEntity>> NEW_STRIPPED_DARK_OAK_LOG = register("new_stripped_dark_oak_log", JimsmineshaftModBlocks.NEW_STRIPPED_DARK_OAK_LOG,
			NewStrippedDarkOakLogBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper29BlockEntity>> RAW_COPPER_29 = register("raw_copper_29", JimsmineshaftModBlocks.RAW_COPPER_29, RawCopper29BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper28BlockEntity>> RAW_COPPER_28 = register("raw_copper_28", JimsmineshaftModBlocks.RAW_COPPER_28, RawCopper28BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper27BlockEntity>> RAW_COPPER_27 = register("raw_copper_27", JimsmineshaftModBlocks.RAW_COPPER_27, RawCopper27BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper26BlockEntity>> RAW_COPPER_26 = register("raw_copper_26", JimsmineshaftModBlocks.RAW_COPPER_26, RawCopper26BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper25BlockEntity>> RAW_COPPER_25 = register("raw_copper_25", JimsmineshaftModBlocks.RAW_COPPER_25, RawCopper25BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper24BlockEntity>> RAW_COPPER_24 = register("raw_copper_24", JimsmineshaftModBlocks.RAW_COPPER_24, RawCopper24BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper23BlockEntity>> RAW_COPPER_23 = register("raw_copper_23", JimsmineshaftModBlocks.RAW_COPPER_23, RawCopper23BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RawCopper22BlockEntity>> RAW_COPPER_22 = register("raw_copper_22", JimsmineshaftModBlocks.RAW_COPPER_22, RawCopper22BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NewSuspiciousGravelBlockEntity>> NEW_SUSPICIOUS_GRAVEL = register("new_suspicious_gravel", JimsmineshaftModBlocks.NEW_SUSPICIOUS_GRAVEL, NewSuspiciousGravelBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NewStoneBlockEntity>> NEW_STONE = register("new_stone", JimsmineshaftModBlocks.NEW_STONE, NewStoneBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MysteryItemBlockEntity>> MYSTERY_ITEM = register("mystery_item", JimsmineshaftModBlocks.MYSTERY_ITEM, MysteryItemBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NewGravelBlockEntity>> NEW_GRAVEL = register("new_gravel", JimsmineshaftModBlocks.NEW_GRAVEL, NewGravelBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_CORNER_TYPE_B.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_FULL_TYPE_C.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_TOP_TYPE_A.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_PLAIN_TYPE_B.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_CORNER_TYPE_B_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_WALL_TYPE_B.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_TYPE_A.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_TOP_LIGHT_TYPE_A.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SUPPORT_TYPE_B.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_ROOF_TYPE_A.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_ROOF_TYPE_C.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_ROOF_TYPE_B.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_FRAGMENT_5.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_FRAGMENT_1.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_FRAGMENT_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_FRAGMENT_3.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_CHUNK_TYPE_A.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COPPER_FRAGMENT_4.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MYSTERY_RAIL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_210.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NEW_STRIPPED_DARK_OAK_LOG.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_29.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_28.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_27.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_26.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_25.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_24.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_23.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAW_COPPER_22.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NEW_SUSPICIOUS_GRAVEL.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NEW_STONE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MYSTERY_ITEM.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NEW_GRAVEL.get(), SidedInvWrapper::new);
	}
}