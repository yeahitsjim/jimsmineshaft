package net.mcreator.jimsmineshaft.world.inventory;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jimsmineshaft.procedures.CartGUIWhileThisGUIIsOpenTickProcedure;
import net.mcreator.jimsmineshaft.procedures.CartGUIThisGUIIsClosedProcedure;
import net.mcreator.jimsmineshaft.network.CartGUISlotMessage;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class CartGUIMenu extends AbstractContainerMenu implements JimsmineshaftModMenus.MenuAccessor {
	public final Map<String, Object> menuState = new HashMap<>() {
		@Override
		public Object put(String key, Object value) {
			if (!this.containsKey(key) && this.size() >= 115)
				return null;
			return super.put(key, value);
		}
	};
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public CartGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(JimsmineshaftModMenus.CART_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(114);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				IItemHandler cap = itemstack.getCapability(Capabilities.ItemHandler.ITEM);
				if (cap != null) {
					this.internal = cap;
					this.bound = true;
				}
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null) {
					IItemHandler cap = boundEntity.getCapability(Capabilities.ItemHandler.ENTITY);
					if (cap != null) {
						this.internal = cap;
						this.bound = true;
					}
				}
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity instanceof BaseContainerBlockEntity baseContainerBlockEntity) {
					this.internal = new InvWrapper(baseContainerBlockEntity);
					this.bound = true;
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 10, 115) {
			private final int slot = 0;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(0, 0, 0);
			}
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 28, 115) {
			private final int slot = 1;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(1, 0, 0);
			}
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 46, 115) {
			private final int slot = 2;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(2, 0, 0);
			}
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 64, 115) {
			private final int slot = 3;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(3, 0, 0);
			}
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 82, 115) {
			private final int slot = 4;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(4, 0, 0);
			}
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 100, 115) {
			private final int slot = 5;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(5, 0, 0);
			}
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 118, 115) {
			private final int slot = 6;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(6, 0, 0);
			}
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 136, 115) {
			private final int slot = 7;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(7, 0, 0);
			}
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 154, 115) {
			private final int slot = 8;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(8, 0, 0);
			}
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 172, 115) {
			private final int slot = 9;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(9, 0, 0);
			}
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 190, 115) {
			private final int slot = 10;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(10, 0, 0);
			}
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 208, 115) {
			private final int slot = 11;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(11, 0, 0);
			}
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 226, 115) {
			private final int slot = 12;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(12, 0, 0);
			}
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 244, 115) {
			private final int slot = 13;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(13, 0, 0);
			}
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 262, 115) {
			private final int slot = 14;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(14, 0, 0);
			}
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 280, 115) {
			private final int slot = 15;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(15, 0, 0);
			}
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 298, 115) {
			private final int slot = 16;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(16, 0, 0);
			}
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 316, 115) {
			private final int slot = 17;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(17, 0, 0);
			}
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 334, 115) {
			private final int slot = 18;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(18, 0, 0);
			}
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 10, 97) {
			private final int slot = 19;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(19, 0, 0);
			}
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 28, 97) {
			private final int slot = 20;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(20, 0, 0);
			}
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 46, 97) {
			private final int slot = 21;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(21, 0, 0);
			}
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 64, 97) {
			private final int slot = 22;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(22, 0, 0);
			}
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 82, 97) {
			private final int slot = 23;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(23, 0, 0);
			}
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 100, 97) {
			private final int slot = 24;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(24, 0, 0);
			}
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 118, 97) {
			private final int slot = 25;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(25, 0, 0);
			}
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 136, 97) {
			private final int slot = 26;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(26, 0, 0);
			}
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 154, 97) {
			private final int slot = 27;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(27, 0, 0);
			}
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 172, 97) {
			private final int slot = 28;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(28, 0, 0);
			}
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 190, 97) {
			private final int slot = 29;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(29, 0, 0);
			}
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 208, 97) {
			private final int slot = 30;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(30, 0, 0);
			}
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 226, 97) {
			private final int slot = 31;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(31, 0, 0);
			}
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 244, 97) {
			private final int slot = 32;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(32, 0, 0);
			}
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 262, 97) {
			private final int slot = 33;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(33, 0, 0);
			}
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 280, 97) {
			private final int slot = 34;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(34, 0, 0);
			}
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 298, 97) {
			private final int slot = 35;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(35, 0, 0);
			}
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 316, 97) {
			private final int slot = 36;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(36, 0, 0);
			}
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 334, 97) {
			private final int slot = 37;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(37, 0, 0);
			}
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 10, 79) {
			private final int slot = 38;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(38, 0, 0);
			}
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 28, 79) {
			private final int slot = 39;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(39, 0, 0);
			}
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 46, 79) {
			private final int slot = 40;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(40, 0, 0);
			}
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 64, 79) {
			private final int slot = 41;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(41, 0, 0);
			}
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 82, 79) {
			private final int slot = 42;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(42, 0, 0);
			}
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 100, 79) {
			private final int slot = 43;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(43, 0, 0);
			}
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 118, 79) {
			private final int slot = 44;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(44, 0, 0);
			}
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 136, 79) {
			private final int slot = 45;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(45, 0, 0);
			}
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 154, 79) {
			private final int slot = 46;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(46, 0, 0);
			}
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 172, 79) {
			private final int slot = 47;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(47, 0, 0);
			}
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 190, 79) {
			private final int slot = 48;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(48, 0, 0);
			}
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 208, 79) {
			private final int slot = 49;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(49, 0, 0);
			}
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 226, 79) {
			private final int slot = 50;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(50, 0, 0);
			}
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 244, 79) {
			private final int slot = 51;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(51, 0, 0);
			}
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 262, 79) {
			private final int slot = 52;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(52, 0, 0);
			}
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 280, 79) {
			private final int slot = 53;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(53, 0, 0);
			}
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 298, 79) {
			private final int slot = 54;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(54, 0, 0);
			}
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 316, 79) {
			private final int slot = 55;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(55, 0, 0);
			}
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 334, 79) {
			private final int slot = 56;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(56, 0, 0);
			}
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 10, 61) {
			private final int slot = 57;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(57, 0, 0);
			}
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 28, 61) {
			private final int slot = 58;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(58, 0, 0);
			}
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 46, 61) {
			private final int slot = 59;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(59, 0, 0);
			}
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 64, 61) {
			private final int slot = 60;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(60, 0, 0);
			}
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 82, 61) {
			private final int slot = 61;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(61, 0, 0);
			}
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 100, 61) {
			private final int slot = 62;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(62, 0, 0);
			}
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 118, 61) {
			private final int slot = 63;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(63, 0, 0);
			}
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 136, 61) {
			private final int slot = 64;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(64, 0, 0);
			}
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 154, 61) {
			private final int slot = 65;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(65, 0, 0);
			}
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 172, 61) {
			private final int slot = 66;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(66, 0, 0);
			}
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 190, 61) {
			private final int slot = 67;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(67, 0, 0);
			}
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 208, 61) {
			private final int slot = 68;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(68, 0, 0);
			}
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 226, 61) {
			private final int slot = 69;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(69, 0, 0);
			}
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 244, 61) {
			private final int slot = 70;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(70, 0, 0);
			}
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 262, 61) {
			private final int slot = 71;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(71, 0, 0);
			}
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 280, 61) {
			private final int slot = 72;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(72, 0, 0);
			}
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 298, 61) {
			private final int slot = 73;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(73, 0, 0);
			}
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 316, 61) {
			private final int slot = 74;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(74, 0, 0);
			}
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 334, 61) {
			private final int slot = 75;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(75, 0, 0);
			}
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 10, 43) {
			private final int slot = 76;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(76, 0, 0);
			}
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 28, 43) {
			private final int slot = 77;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(77, 0, 0);
			}
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 46, 43) {
			private final int slot = 78;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(78, 0, 0);
			}
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 64, 43) {
			private final int slot = 79;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(79, 0, 0);
			}
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 82, 43) {
			private final int slot = 80;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(80, 0, 0);
			}
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 100, 43) {
			private final int slot = 81;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(81, 0, 0);
			}
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 118, 43) {
			private final int slot = 82;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(82, 0, 0);
			}
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 136, 43) {
			private final int slot = 83;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(83, 0, 0);
			}
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 154, 43) {
			private final int slot = 84;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(84, 0, 0);
			}
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 172, 43) {
			private final int slot = 85;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(85, 0, 0);
			}
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 190, 43) {
			private final int slot = 86;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(86, 0, 0);
			}
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 208, 43) {
			private final int slot = 87;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(87, 0, 0);
			}
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 226, 43) {
			private final int slot = 88;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(88, 0, 0);
			}
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 244, 43) {
			private final int slot = 89;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(89, 0, 0);
			}
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 262, 43) {
			private final int slot = 90;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(90, 0, 0);
			}
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 280, 43) {
			private final int slot = 91;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(91, 0, 0);
			}
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 298, 43) {
			private final int slot = 92;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(92, 0, 0);
			}
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 316, 43) {
			private final int slot = 93;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(93, 0, 0);
			}
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 334, 43) {
			private final int slot = 94;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(94, 0, 0);
			}
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 10, 25) {
			private final int slot = 95;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(95, 0, 0);
			}
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 28, 25) {
			private final int slot = 96;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(96, 0, 0);
			}
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 46, 25) {
			private final int slot = 97;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(97, 0, 0);
			}
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 64, 25) {
			private final int slot = 98;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(98, 0, 0);
			}
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 82, 25) {
			private final int slot = 99;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(99, 0, 0);
			}
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 100, 25) {
			private final int slot = 100;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(100, 0, 0);
			}
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 118, 25) {
			private final int slot = 101;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(101, 0, 0);
			}
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 136, 25) {
			private final int slot = 102;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(102, 0, 0);
			}
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 154, 25) {
			private final int slot = 103;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(103, 0, 0);
			}
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 172, 25) {
			private final int slot = 104;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(104, 0, 0);
			}
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 190, 25) {
			private final int slot = 105;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(105, 0, 0);
			}
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 208, 25) {
			private final int slot = 106;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(106, 0, 0);
			}
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 226, 25) {
			private final int slot = 107;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(107, 0, 0);
			}
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 244, 25) {
			private final int slot = 108;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(108, 0, 0);
			}
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 262, 25) {
			private final int slot = 109;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(109, 0, 0);
			}
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 280, 25) {
			private final int slot = 110;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(110, 0, 0);
			}
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 298, 25) {
			private final int slot = 111;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(111, 0, 0);
			}
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 316, 25) {
			private final int slot = 112;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(112, 0, 0);
			}
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 334, 25) {
			private final int slot = 113;
			private int x = CartGUIMenu.this.x;
			private int y = CartGUIMenu.this.y;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(113, 0, 0);
			}
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 92 + 8 + sj * 18, 54 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 92 + 8 + si * 18, 54 + 142));
		CartGUIWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 114) {
				if (!this.moveItemStackTo(itemstack1, 114, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 114, false)) {
				if (index < 114 + 27) {
					if (!this.moveItemStackTo(itemstack1, 114 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 114, 114 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.isEmpty()) {
				slot.setByPlayer(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty() && (p_38907_ ? i >= p_38905_ : i < p_38906_)) {
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameComponents(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int k = slot.getMaxStackSize(itemstack);
					if (j <= k) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < k) {
						p_38904_.shrink(k - itemstack.getCount());
						itemstack.setCount(k);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					i--;
				} else {
					i++;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (p_38907_ ? i >= p_38905_ : i < p_38906_) {
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					int l = slot1.getMaxStackSize(p_38904_);
					slot1.setByPlayer(p_38904_.split(Math.min(p_38904_.getCount(), l)));
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					i--;
				} else {
					i++;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		CartGUIThisGUIIsClosedProcedure.execute(entity);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.getStackInSlot(j), false);
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(j, ItemStack.EMPTY);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.getStackInSlot(i));
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(i, ItemStack.EMPTY);
				}
			}
		}
	}

	private void slotChanged(int slotid, int ctype, int meta) {
		if (this.world != null && this.world.isClientSide()) {
			PacketDistributor.sendToServer(new CartGUISlotMessage(slotid, x, y, z, ctype, meta));
			CartGUISlotMessage.handleSlotAction(entity, slotid, ctype, meta, x, y, z);
		}
	}

	@Override
	public Map<Integer, Slot> getSlots() {
		return Collections.unmodifiableMap(customSlots);
	}

	@Override
	public Map<String, Object> getMenuState() {
		return menuState;
	}
}