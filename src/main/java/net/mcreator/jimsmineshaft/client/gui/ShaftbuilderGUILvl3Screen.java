package net.mcreator.jimsmineshaft.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jimsmineshaft.world.inventory.ShaftbuilderGUILvl3Menu;
import net.mcreator.jimsmineshaft.network.ShaftbuilderGUILvl3ButtonMessage;
import net.mcreator.jimsmineshaft.init.JimsmineshaftModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShaftbuilderGUILvl3Screen extends AbstractContainerScreen<ShaftbuilderGUILvl3Menu> implements JimsmineshaftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_main_lit;
	Button button_a_non_lit;
	Button button_a_bit;
	Button button_b_shaft1;
	Button button_b_shaft_2;
	Button button_b_shaft_3;
	Button button_b_shaft_4;
	Button button_b_shaft_5;
	Button button_b_bit_1;
	Button button_b_bit_2;
	Button button_b_bit_3;
	Button button_b_bit_4;
	Button button_c_shaft_1;
	Button button_c_shaft_2;
	Button button_resetpos;

	public ShaftbuilderGUILvl3Screen(ShaftbuilderGUILvl3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 190;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_main_lit = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_main_lit"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(0, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 0, 66, 20).build();
		this.addRenderableWidget(button_main_lit);
		button_a_non_lit = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_a_non_lit"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(1, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 27, 71, 20).build();
		this.addRenderableWidget(button_a_non_lit);
		button_a_bit = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_a_bit"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(2, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 56, 51, 20).build();
		this.addRenderableWidget(button_a_bit);
		button_b_shaft1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_shaft1"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(3, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 0, 66, 20).build();
		this.addRenderableWidget(button_b_shaft1);
		button_b_shaft_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_shaft_2"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(4, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 28, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_2);
		button_b_shaft_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_shaft_3"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(5, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 55, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_3);
		button_b_shaft_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_shaft_4"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(6, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 84, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_4);
		button_b_shaft_5 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_shaft_5"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(7, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 113, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_5);
		button_b_bit_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_bit_1"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(8, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 84, 61, 20).build();
		this.addRenderableWidget(button_b_bit_1);
		button_b_bit_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_bit_2"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(9, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 114, 61, 20).build();
		this.addRenderableWidget(button_b_bit_2);
		button_b_bit_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_bit_3"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(10, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 145, 61, 20).build();
		this.addRenderableWidget(button_b_bit_3);
		button_b_bit_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_b_bit_4"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(11, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + -24, this.topPos + 176, 61, 20).build();
		this.addRenderableWidget(button_b_bit_4);
		button_c_shaft_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_c_shaft_1"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(12, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 145, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_1);
		button_c_shaft_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_c_shaft_2"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(13, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 176, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_2);
		button_resetpos = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_3.button_resetpos"), e -> {
			int x = ShaftbuilderGUILvl3Screen.this.x;
			int y = ShaftbuilderGUILvl3Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl3ButtonMessage(14, x, y, z));
				ShaftbuilderGUILvl3ButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}).bounds(this.leftPos + 263, this.topPos + 176, 67, 20).build();
		this.addRenderableWidget(button_resetpos);
	}
}