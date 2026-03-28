/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jimsmineshaft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.event.RegisterRangeSelectItemModelPropertyEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.jimsmineshaft.item.WoemineshaftfullmemefortotemItem;
import net.mcreator.jimsmineshaft.item.WoeMineshaftBeUponTheItem;
import net.mcreator.jimsmineshaft.item.WoeMineshaftBeUponThe2Item;
import net.mcreator.jimsmineshaft.item.TommyGunItem;
import net.mcreator.jimsmineshaft.item.TestSyncTheSecondItem;
import net.mcreator.jimsmineshaft.item.StructureSpawnerItem;
import net.mcreator.jimsmineshaft.item.SmallSlideUpGateItem;
import net.mcreator.jimsmineshaft.item.SmallSideOpenGateItem;
import net.mcreator.jimsmineshaft.item.SmallPickaxeItem;
import net.mcreator.jimsmineshaft.item.RustyPickaxeItem;
import net.mcreator.jimsmineshaft.item.OldKnifeItem;
import net.mcreator.jimsmineshaft.item.MiningVeteranSetItem;
import net.mcreator.jimsmineshaft.item.MiningGoonSetItem;
import net.mcreator.jimsmineshaft.item.MiningEliteSetItem;
import net.mcreator.jimsmineshaft.item.Level1DimensionItem;
import net.mcreator.jimsmineshaft.item.LargeGateItem;
import net.mcreator.jimsmineshaft.item.JimsminedimensionItem;
import net.mcreator.jimsmineshaft.item.IronBulletItem;
import net.mcreator.jimsmineshaft.item.GreaseGunItem;
import net.mcreator.jimsmineshaft.item.FlintlockPistolItem;
import net.mcreator.jimsmineshaft.item.FlashlightItem;
import net.mcreator.jimsmineshaft.item.FireAxeItem;
import net.mcreator.jimsmineshaft.item.DynamiteBoxItem;
import net.mcreator.jimsmineshaft.item.DetonatorBlockPushedItem;
import net.mcreator.jimsmineshaft.item.DetonatorBlockItemItem;
import net.mcreator.jimsmineshaft.item.BatteryItem;
import net.mcreator.jimsmineshaft.JimsmineshaftMod;

import java.util.function.Function;

public class JimsmineshaftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(JimsmineshaftMod.MODID);
	public static final DeferredItem<Item> TEST_SYNC_THE_SECOND = register("test_sync_the_second", TestSyncTheSecondItem::new);
	public static final DeferredItem<Item> IRON_SIDING_CORNER = block(JimsmineshaftModBlocks.IRON_SIDING_CORNER);
	public static final DeferredItem<Item> ROTTEN_PLANKS = block(JimsmineshaftModBlocks.ROTTEN_PLANKS);
	public static final DeferredItem<Item> ROTTEN_SUPPORT_BEAM = block(JimsmineshaftModBlocks.ROTTEN_SUPPORT_BEAM);
	public static final DeferredItem<Item> IRON_SIDING = block(JimsmineshaftModBlocks.IRON_SIDING);
	public static final DeferredItem<Item> WOODEN_SUPPORT_CORNER_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B);
	public static final DeferredItem<Item> WOE_MINESHAFT_BE_UPON_THE = register("woe_mineshaft_be_upon_the", WoeMineshaftBeUponTheItem::new);
	public static final DeferredItem<Item> WOODEN_SUPPORT_FULL_TYPE_C = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_FULL_TYPE_C);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TOP_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_TYPE_A);
	public static final DeferredItem<Item> WOODEN_SUPPORT_PLAIN_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_PLAIN_TYPE_B);
	public static final DeferredItem<Item> JIMSMINEDIMENSION = register("jimsminedimension", JimsminedimensionItem::new);
	public static final DeferredItem<Item> WOODEN_SUPPORT_CORNER_TYPE_B_2 = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_CORNER_TYPE_B_2);
	public static final DeferredItem<Item> WOODEN_WALL_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_WALL_TYPE_B);
	public static final DeferredItem<Item> WOE_MINESHAFT_BE_UPON_THE_2 = register("woe_mineshaft_be_upon_the_2", WoeMineshaftBeUponThe2Item::new);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_A);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TOP_LIGHT_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TOP_LIGHT_TYPE_A);
	public static final DeferredItem<Item> WOODEN_SUPPORT_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_SUPPORT_TYPE_B);
	public static final DeferredItem<Item> WOODEN_ROOF_TYPE_A = block(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_A);
	public static final DeferredItem<Item> WOODEN_ROOF_TYPE_C = block(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_C);
	public static final DeferredItem<Item> WOODEN_ROOF_TYPE_B = block(JimsmineshaftModBlocks.WOODEN_ROOF_TYPE_B);
	public static final DeferredItem<Item> STRIPPED_ROTTEN_SUPPORT_BEAM = block(JimsmineshaftModBlocks.STRIPPED_ROTTEN_SUPPORT_BEAM);
	public static final DeferredItem<Item> CORRUPTED_SUPPORT_BEAM = block(JimsmineshaftModBlocks.CORRUPTED_SUPPORT_BEAM);
	public static final DeferredItem<Item> TILTED_CORRUPTED_SUPPORT_BEAM = block(JimsmineshaftModBlocks.TILTED_CORRUPTED_SUPPORT_BEAM);
	public static final DeferredItem<Item> STEEL_SHELF = block(JimsmineshaftModBlocks.STEEL_SHELF);
	public static final DeferredItem<Item> OLD_CABINET = block(JimsmineshaftModBlocks.OLD_CABINET);
	public static final DeferredItem<Item> ROTTEN_CABINET = block(JimsmineshaftModBlocks.ROTTEN_CABINET);
	public static final DeferredItem<Item> WOOD_PILE = block(JimsmineshaftModBlocks.WOOD_PILE);
	public static final DeferredItem<Item> RUSTED_MINECART = block(JimsmineshaftModBlocks.RUSTED_MINECART);
	public static final DeferredItem<Item> STACKABLE_STEEL_SHELF = block(JimsmineshaftModBlocks.STACKABLE_STEEL_SHELF);
	public static final DeferredItem<Item> WALL_SUPPORTED_WOODEN_SHELF = block(JimsmineshaftModBlocks.WALL_SUPPORTED_WOODEN_SHELF);
	public static final DeferredItem<Item> WOODEN_SHAFT_LINING = block(JimsmineshaftModBlocks.WOODEN_SHAFT_LINING);
	public static final DeferredItem<Item> WOODEN_SHELF = block(JimsmineshaftModBlocks.WOODEN_SHELF);
	public static final DeferredItem<Item> LONG_WOODEN_SHELF = block(JimsmineshaftModBlocks.LONG_WOODEN_SHELF);
	public static final DeferredItem<Item> FENCED_CORRUPTED_SUPPORT_BEAM = block(JimsmineshaftModBlocks.FENCED_CORRUPTED_SUPPORT_BEAM);
	public static final DeferredItem<Item> CORRUPTED_SUPPORT_BAR = block(JimsmineshaftModBlocks.CORRUPTED_SUPPORT_BAR);
	public static final DeferredItem<Item> ROTTEN_PLANK_SLAB = block(JimsmineshaftModBlocks.ROTTEN_PLANK_SLAB);
	public static final DeferredItem<Item> ROTTEN_PLANK_STAIRS = block(JimsmineshaftModBlocks.ROTTEN_PLANK_STAIRS);
	public static final DeferredItem<Item> IRON_SUPPORT = block(JimsmineshaftModBlocks.IRON_SUPPORT);
	public static final DeferredItem<Item> RUSTED_IRON_SUPPORT = block(JimsmineshaftModBlocks.RUSTED_IRON_SUPPORT);
	public static final DeferredItem<Item> CANARY_CAGE = block(JimsmineshaftModBlocks.CANARY_CAGE);
	public static final DeferredItem<Item> CANDLE_HOLDER = block(JimsmineshaftModBlocks.CANDLE_HOLDER);
	public static final DeferredItem<Item> CANTEEN = block(JimsmineshaftModBlocks.CANTEEN);
	public static final DeferredItem<Item> RUSTED_IRON_CATWALK = block(JimsmineshaftModBlocks.RUSTED_IRON_CATWALK);
	public static final DeferredItem<Item> RUSTED_IRON_SUPPORT_COOL = block(JimsmineshaftModBlocks.RUSTED_IRON_SUPPORT_COOL);
	public static final DeferredItem<Item> RUSTED_IRON_RAILING = block(JimsmineshaftModBlocks.RUSTED_IRON_RAILING);
	public static final DeferredItem<Item> RUSTED_IRON_CATWALK_SUPPORTED = block(JimsmineshaftModBlocks.RUSTED_IRON_CATWALK_SUPPORTED);
	public static final DeferredItem<Item> RUSTED_IRON_RAILING_CORNER = block(JimsmineshaftModBlocks.RUSTED_IRON_RAILING_CORNER);
	public static final DeferredItem<Item> RUSTED_IRON_CROSS_SUPPORT = block(JimsmineshaftModBlocks.RUSTED_IRON_CROSS_SUPPORT);
	public static final DeferredItem<Item> RUSTED_IRON_CATWALK_WALL_SUPPORT = block(JimsmineshaftModBlocks.RUSTED_IRON_CATWALK_WALL_SUPPORT);
	public static final DeferredItem<Item> RUSTED_IRON_STAIRS = block(JimsmineshaftModBlocks.RUSTED_IRON_STAIRS);
	public static final DeferredItem<Item> DETONATOR_BLOCK_ITEM = register("detonator_block_item", DetonatorBlockItemItem::new);
	public static final DeferredItem<Item> SMALL_PICKAXE = register("small_pickaxe", SmallPickaxeItem::new);
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_EAST = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_B = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_B, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_C = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_C, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_D = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_D, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_E = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_E, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_CHUNK_TYPE_A = block(JimsmineshaftModBlocks.COPPER_CHUNK_TYPE_A, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> THECART_SPAWN_EGG = register("thecart_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.THECART.get(), properties));
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_EAST_DYNAMITE = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_EAST_DYNAMITE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> PRESSURE_DRILL_SPAWN_EGG = register("pressure_drill_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.PRESSURE_DRILL.get(), properties));
	public static final DeferredItem<Item> IRON_BULLET = register("iron_bullet", IronBulletItem::new);
	public static final DeferredItem<Item> FLINTLOCK_PISTOL = register("flintlock_pistol", FlintlockPistolItem::new);
	public static final DeferredItem<Item> RAW_COPPER_2 = block(JimsmineshaftModBlocks.RAW_COPPER_2, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> OLD_KNIFE = register("old_knife", OldKnifeItem::new);
	public static final DeferredItem<Item> STALKER_SPAWN_EGG = register("stalker_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.STALKER.get(), properties));
	public static final DeferredItem<Item> WOEMINESHAFTFULLMEMEFORTOTEM = register("woemineshaftfullmemefortotem", WoemineshaftfullmemefortotemItem::new);
	public static final DeferredItem<Item> FIRE_AXE = register("fire_axe", FireAxeItem::new);
	public static final DeferredItem<Item> NEW_STRIPPED_DARK_OAK_LOG = block(JimsmineshaftModBlocks.NEW_STRIPPED_DARK_OAK_LOG);
	public static final DeferredItem<Item> COPPER_SHARD = block(JimsmineshaftModBlocks.COPPER_SHARD, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> STRUCTURE_SPAWNER = register("structure_spawner", StructureSpawnerItem::new);
	public static final DeferredItem<Item> PRESSURE_DRILL_FOLDED_SPAWN_EGG = register("pressure_drill_folded_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.PRESSURE_DRILL_FOLDED.get(), properties));
	public static final DeferredItem<Item> COPPER_DRILLED_EAST_SPAWN_EGG = register("copper_drilled_east_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.COPPER_DRILLED_EAST.get(), properties));
	public static final DeferredItem<Item> COPPER_SHARD_TRIPLE = block(JimsmineshaftModBlocks.COPPER_SHARD_TRIPLE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> BATTERY = register("battery", BatteryItem::new);
	public static final DeferredItem<Item> MYSTERY_ITEM = block(JimsmineshaftModBlocks.MYSTERY_ITEM);
	public static final DeferredItem<Item> HOLE_ENTITY_SPAWN_EGG = register("hole_entity_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.HOLE_ENTITY.get(), properties));
	public static final DeferredItem<Item> CART_RAIL = block(JimsmineshaftModBlocks.CART_RAIL);
	public static final DeferredItem<Item> ELEVATOR_SPAWN_EGG = register("elevator_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR.get(), properties));
	public static final DeferredItem<Item> DETONATOR_BLOCK_PUSHED = register("detonator_block_pushed", DetonatorBlockPushedItem::new);
	public static final DeferredItem<Item> ELEVATOR_BOUNDING_BOX_SPAWN_EGG = register("elevator_bounding_box_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_BOUNDING_BOX.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_FRONT = block(JimsmineshaftModBlocks.ELEVATOR_FRONT);
	public static final DeferredItem<Item> RUSTY_PICKAXE = register("rusty_pickaxe", RustyPickaxeItem::new);
	public static final DeferredItem<Item> ELEVATOR_SEAT_5_SPAWN_EGG = register("elevator_seat_5_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_5.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_SEAT_6_SPAWN_EGG = register("elevator_seat_6_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_6.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_SEAT_3_SPAWN_EGG = register("elevator_seat_3_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_3.get(), properties));
	public static final DeferredItem<Item> FLASHLIGHT = register("flashlight", FlashlightItem::new);
	public static final DeferredItem<Item> ELEVATOR_SEAT_4_SPAWN_EGG = register("elevator_seat_4_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_4.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_SEAT_7_SPAWN_EGG = register("elevator_seat_7_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_7.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_SEAT_8_SPAWN_EGG = register("elevator_seat_8_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_8.get(), properties));
	public static final DeferredItem<Item> COPPER_FRAGMENT_5 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_5, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_1 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_1, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_2 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_2, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_3 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_3, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> COPPER_FRAGMENT_4 = block(JimsmineshaftModBlocks.COPPER_FRAGMENT_4, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> MYSTERY_RAIL = block(JimsmineshaftModBlocks.MYSTERY_RAIL);
	public static final DeferredItem<Item> CART_4_SPAWN_EGG = register("cart_4_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.CART_4.get(), properties));
	public static final DeferredItem<Item> RAW_COPPER_210 = block(JimsmineshaftModBlocks.RAW_COPPER_210, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> PRESSURE_DRILL_HOLDABLE = block(JimsmineshaftModBlocks.PRESSURE_DRILL_HOLDABLE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> CART_3_SPAWN_EGG = register("cart_3_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.CART_3.get(), properties));
	public static final DeferredItem<Item> CART_2_SPAWN_EGG = register("cart_2_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.CART_2.get(), properties));
	public static final DeferredItem<Item> RIGHTGATE_SPAWN_EGG = register("rightgate_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.RIGHTGATE.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_SEAT_1_SPAWN_EGG = register("elevator_seat_1_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_1.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_SEAT_2_SPAWN_EGG = register("elevator_seat_2_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.ELEVATOR_SEAT_2.get(), properties));
	public static final DeferredItem<Item> LEFTGATE_SPAWN_EGG = register("leftgate_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.LEFTGATE.get(), properties));
	public static final DeferredItem<Item> COPPER_SHARD_DOUBLE = block(JimsmineshaftModBlocks.COPPER_SHARD_DOUBLE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_29 = block(JimsmineshaftModBlocks.RAW_COPPER_29, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_28 = block(JimsmineshaftModBlocks.RAW_COPPER_28, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_27 = block(JimsmineshaftModBlocks.RAW_COPPER_27, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_26 = block(JimsmineshaftModBlocks.RAW_COPPER_26, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_25 = block(JimsmineshaftModBlocks.RAW_COPPER_25, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_24 = block(JimsmineshaftModBlocks.RAW_COPPER_24, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_23 = block(JimsmineshaftModBlocks.RAW_COPPER_23, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> RAW_COPPER_22 = block(JimsmineshaftModBlocks.RAW_COPPER_22, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> NEW_SUSPICIOUS_GRAVEL = block(JimsmineshaftModBlocks.NEW_SUSPICIOUS_GRAVEL);
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_NORTH_DYNAMITE = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH_DYNAMITE, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> NEW_STONE = block(JimsmineshaftModBlocks.NEW_STONE);
	public static final DeferredItem<Item> PRESSURE_DRILL_FOLDED_MODEL = block(JimsmineshaftModBlocks.PRESSURE_DRILL_FOLDED_MODEL);
	public static final DeferredItem<Item> BIG_GATE_SPAWN_EGG = register("big_gate_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.BIG_GATE.get(), properties));
	public static final DeferredItem<Item> DYNAMITE_BOX = register("dynamite_box", DynamiteBoxItem::new);
	public static final DeferredItem<Item> MINING_GOON_SET_HELMET = register("mining_goon_set_helmet", MiningGoonSetItem.Helmet::new);
	public static final DeferredItem<Item> MINING_GOON_SET_CHESTPLATE = register("mining_goon_set_chestplate", MiningGoonSetItem.Chestplate::new);
	public static final DeferredItem<Item> MINING_GOON_SET_LEGGINGS = register("mining_goon_set_leggings", MiningGoonSetItem.Leggings::new);
	public static final DeferredItem<Item> MINING_GOON_SET_BOOTS = register("mining_goon_set_boots", MiningGoonSetItem.Boots::new);
	public static final DeferredItem<Item> COPPER_DRILLED_NORTH_SPAWN_EGG = register("copper_drilled_north_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.COPPER_DRILLED_NORTH.get(), properties));
	public static final DeferredItem<Item> FLASHLIGHTENTITY_SPAWN_EGG = register("flashlightentity_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.FLASHLIGHTENTITY.get(), properties));
	public static final DeferredItem<Item> RAW_COPPER_DRILLED_NORTH = block(JimsmineshaftModBlocks.RAW_COPPER_DRILLED_NORTH, new Item.Properties().stacksTo(1));
	public static final DeferredItem<Item> LIGHTBLOCK = block(JimsmineshaftModBlocks.LIGHTBLOCK);
	public static final DeferredItem<Item> TOMMY_GUN = register("tommy_gun", TommyGunItem::new);
	public static final DeferredItem<Item> NEW_GRAVEL = block(JimsmineshaftModBlocks.NEW_GRAVEL);
	public static final DeferredItem<Item> RUSTED_TUMBLER_SPAWN_EGG = register("rusted_tumbler_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.RUSTED_TUMBLER.get(), properties));
	public static final DeferredItem<Item> ELEVATORLIGHT = block(JimsmineshaftModBlocks.ELEVATORLIGHT);
	public static final DeferredItem<Item> STALKER_INSIDES_SPAWN_EGG = register("stalker_insides_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.STALKER_INSIDES.get(), properties));
	public static final DeferredItem<Item> SMALL_SIDE_OPEN_GATE_ENTITY_SPAWN_EGG = register("small_side_open_gate_entity_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.SMALL_SIDE_OPEN_GATE_ENTITY.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_CROSSBAR_SUPPORT = block(JimsmineshaftModBlocks.ELEVATOR_CROSSBAR_SUPPORT);
	public static final DeferredItem<Item> LEECH_SPAWN_EGG = register("leech_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.LEECH.get(), properties));
	public static final DeferredItem<Item> BOTTLE = block(JimsmineshaftModBlocks.BOTTLE);
	public static final DeferredItem<Item> GREASE_GUN = register("grease_gun", GreaseGunItem::new);
	public static final DeferredItem<Item> PLAYER_LIGHT = block(JimsmineshaftModBlocks.PLAYER_LIGHT);
	public static final DeferredItem<Item> LARGE_GATE = register("large_gate", LargeGateItem::new);
	public static final DeferredItem<Item> ELEVATOR_LINING_CORNER_LEFT = block(JimsmineshaftModBlocks.ELEVATOR_LINING_CORNER_LEFT);
	public static final DeferredItem<Item> STALKER_INSIDES_2_SPAWN_EGG = register("stalker_insides_2_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.STALKER_INSIDES_2.get(), properties));
	public static final DeferredItem<Item> SKIN_STEALER_ENTITY_SPAWN_EGG = register("skin_stealer_entity_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.SKIN_STEALER_ENTITY.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_BRACE = block(JimsmineshaftModBlocks.ELEVATOR_BRACE);
	public static final DeferredItem<Item> ELEVATOR_WHEEL = block(JimsmineshaftModBlocks.ELEVATOR_WHEEL);
	public static final DeferredItem<Item> LEVEL_1_DIMENSION = register("level_1_dimension", Level1DimensionItem::new);
	public static final DeferredItem<Item> CART_RAIL_BROKE_1 = block(JimsmineshaftModBlocks.CART_RAIL_BROKE_1);
	public static final DeferredItem<Item> CART_RAIL_BROKE_2 = block(JimsmineshaftModBlocks.CART_RAIL_BROKE_2);
	public static final DeferredItem<Item> CART_RAIL_BROKE_3 = block(JimsmineshaftModBlocks.CART_RAIL_BROKE_3);
	public static final DeferredItem<Item> ELEVATOR_PIPES = block(JimsmineshaftModBlocks.ELEVATOR_PIPES);
	public static final DeferredItem<Item> CART_RAIL_BROKE_4 = block(JimsmineshaftModBlocks.CART_RAIL_BROKE_4);
	public static final DeferredItem<Item> CART_RAIL_BROKE_5 = block(JimsmineshaftModBlocks.CART_RAIL_BROKE_5);
	public static final DeferredItem<Item> CART_RAIL_BROKE_6 = block(JimsmineshaftModBlocks.CART_RAIL_BROKE_6);
	public static final DeferredItem<Item> MINING_ELITE_SET_HELMET = register("mining_elite_set_helmet", MiningEliteSetItem.Helmet::new);
	public static final DeferredItem<Item> MINING_ELITE_SET_CHESTPLATE = register("mining_elite_set_chestplate", MiningEliteSetItem.Chestplate::new);
	public static final DeferredItem<Item> MINING_ELITE_SET_LEGGINGS = register("mining_elite_set_leggings", MiningEliteSetItem.Leggings::new);
	public static final DeferredItem<Item> MINING_ELITE_SET_BOOTS = register("mining_elite_set_boots", MiningEliteSetItem.Boots::new);
	public static final DeferredItem<Item> ELEVATOR_LINING = block(JimsmineshaftModBlocks.ELEVATOR_LINING);
	public static final DeferredItem<Item> MINING_VETERAN_SET_HELMET = register("mining_veteran_set_helmet", MiningVeteranSetItem.Helmet::new);
	public static final DeferredItem<Item> MINING_VETERAN_SET_CHESTPLATE = register("mining_veteran_set_chestplate", MiningVeteranSetItem.Chestplate::new);
	public static final DeferredItem<Item> MINING_VETERAN_SET_LEGGINGS = register("mining_veteran_set_leggings", MiningVeteranSetItem.Leggings::new);
	public static final DeferredItem<Item> MINING_VETERAN_SET_BOOTS = register("mining_veteran_set_boots", MiningVeteranSetItem.Boots::new);
	public static final DeferredItem<Item> MYSTERY_ORE = block(JimsmineshaftModBlocks.MYSTERY_ORE);
	public static final DeferredItem<Item> FLASHLIGHTB_1 = block(JimsmineshaftModBlocks.FLASHLIGHTB_1);
	public static final DeferredItem<Item> PLAYER_STALKIER_SPAWN_EGG = register("player_stalkier_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.PLAYER_STALKIER.get(), properties));
	public static final DeferredItem<Item> ELEVATOR_LINING_CORNER_RIGHT = block(JimsmineshaftModBlocks.ELEVATOR_LINING_CORNER_RIGHT);
	public static final DeferredItem<Item> VISION_SPAWN_EGG = register("vision_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.VISION.get(), properties));
	public static final DeferredItem<Item> SMALL_SIDE_OPEN_GATE = register("small_side_open_gate", SmallSideOpenGateItem::new);
	public static final DeferredItem<Item> SMALL_SLIDE_UP_GATE_ENTITY_SPAWN_EGG = register("small_slide_up_gate_entity_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.SMALL_SLIDE_UP_GATE_ENTITY.get(), properties));
	public static final DeferredItem<Item> ELEVATORLIGHTMIDBLOCK = block(JimsmineshaftModBlocks.ELEVATORLIGHTMIDBLOCK);
	public static final DeferredItem<Item> ELEVATOR_LINING_CORNER_MIDDLE = block(JimsmineshaftModBlocks.ELEVATOR_LINING_CORNER_MIDDLE);
	public static final DeferredItem<Item> AMALGAMATION_SPAWN_EGG = register("amalgamation_spawn_egg", properties -> new SpawnEggItem(JimsmineshaftModEntities.AMALGAMATION.get(), properties));
	public static final DeferredItem<Item> SMALL_SLIDE_UP_GATE = register("small_slide_up_gate", SmallSlideUpGateItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerItemModelProperties(RegisterRangeSelectItemModelPropertyEvent event) {
			event.register(ResourceLocation.parse("jimsmineshaft:flashlight/flashlightonfull"), FlashlightItem.FlashlightonfullProperty.MAP_CODEC);
		}
	}
}