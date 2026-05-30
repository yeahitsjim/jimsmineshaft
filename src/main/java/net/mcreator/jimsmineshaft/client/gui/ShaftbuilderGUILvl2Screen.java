package net.mcreator.jimsmineshaft.client.gui;

public class ShaftbuilderGUILvl2Screen extends AbstractContainerScreen<ShaftbuilderGUILvl2Menu> implements JimsmineshaftModScreens.ScreenAccessor {
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
	Button button_c_shaft_3;
	Button button_c_shaft_4;
	Button button_c_shaft_5;
	Button button_c_bit_1;
	Button button_c_bit_2;
	Button button_c_bit_3;
	Button button_c_bit_4;
	Button button_resetpos;
	Button button_b_room_1;
	Button button_b_room_2;
	Button button_g_room_1;
	Button button_g_room_2;
	Button button_g_bit_1;
	Button button_g_bit_2;
	Button button_g_bit_3;
	Button button_g_bit_4;

	public ShaftbuilderGUILvl2Screen(ShaftbuilderGUILvl2Menu container, Inventory inventory, Component text) {
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
		button_main_lit = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_main_lit"), e -> {
		}).bounds(this.leftPos + -24, this.topPos + 0, 66, 20).build();
		this.addRenderableWidget(button_main_lit);
		button_a_non_lit = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_a_non_lit"), e -> {
		}).bounds(this.leftPos + -24, this.topPos + 24, 71, 20).build();
		this.addRenderableWidget(button_a_non_lit);
		button_a_bit = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_a_bit"), e -> {
		}).bounds(this.leftPos + -24, this.topPos + 48, 51, 20).build();
		this.addRenderableWidget(button_a_bit);
		button_b_shaft1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_shaft1"), e -> {
		}).bounds(this.leftPos + 68, this.topPos + 0, 66, 20).build();
		this.addRenderableWidget(button_b_shaft1);
		button_b_shaft_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_shaft_2"), e -> {
		}).bounds(this.leftPos + 68, this.topPos + 24, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_2);
		button_b_shaft_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_shaft_3"), e -> {
		}).bounds(this.leftPos + 68, this.topPos + 48, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_3);
		button_b_shaft_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_shaft_4"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(6, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 73, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_4);
		button_b_shaft_5 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_shaft_5"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(7, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 98, 71, 20).build();
		this.addRenderableWidget(button_b_shaft_5);
		button_b_bit_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_bit_1"), e -> {
		}).bounds(this.leftPos + -24, this.topPos + 73, 61, 20).build();
		this.addRenderableWidget(button_b_bit_1);
		button_b_bit_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_bit_2"), e -> {
		}).bounds(this.leftPos + -24, this.topPos + 98, 61, 20).build();
		this.addRenderableWidget(button_b_bit_2);
		button_b_bit_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_bit_3"), e -> {
		}).bounds(this.leftPos + -24, this.topPos + 121, 61, 20).build();
		this.addRenderableWidget(button_b_bit_3);
		button_b_bit_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_bit_4"), e -> {
		}).bounds(this.leftPos + -21, this.topPos + 142, 61, 20).build();
		this.addRenderableWidget(button_b_bit_4);
		button_c_shaft_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_shaft_1"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(12, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 121, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_1);
		button_c_shaft_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_shaft_2"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(13, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 146, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_2);
		button_c_shaft_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_shaft_3"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(14, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}).bounds(this.leftPos + 164, this.topPos + 0, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_3);
		button_c_shaft_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_shaft_4"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(15, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}).bounds(this.leftPos + 164, this.topPos + 24, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_4);
		button_c_shaft_5 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_shaft_5"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(16, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}).bounds(this.leftPos + 164, this.topPos + 48, 71, 20).build();
		this.addRenderableWidget(button_c_shaft_5);
		button_c_bit_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_bit_1"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(17, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}).bounds(this.leftPos + 164, this.topPos + 73, 61, 20).build();
		this.addRenderableWidget(button_c_bit_1);
		button_c_bit_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_bit_2"), e -> {
		}).bounds(this.leftPos + 165, this.topPos + 98, 61, 20).build();
		this.addRenderableWidget(button_c_bit_2);
		button_c_bit_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_bit_3"), e -> {
		}).bounds(this.leftPos + 165, this.topPos + 122, 61, 20).build();
		this.addRenderableWidget(button_c_bit_3);
		button_c_bit_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_c_bit_4"), e -> {
		}).bounds(this.leftPos + 165, this.topPos + 143, 61, 20).build();
		this.addRenderableWidget(button_c_bit_4);
		button_resetpos = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_resetpos"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(21, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}).bounds(this.leftPos + 263, this.topPos + 183, 67, 20).build();
		this.addRenderableWidget(button_resetpos);
		button_b_room_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_room_1"), e -> {
		}).bounds(this.leftPos + 263, this.topPos + 0, 66, 20).build();
		this.addRenderableWidget(button_b_room_1);
		button_b_room_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_b_room_2"), e -> {
		}).bounds(this.leftPos + 263, this.topPos + 24, 66, 20).build();
		this.addRenderableWidget(button_b_room_2);
		button_g_room_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_g_room_1"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(24, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		}).bounds(this.leftPos + 263, this.topPos + 48, 66, 20).build();
		this.addRenderableWidget(button_g_room_1);
		button_g_room_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_g_room_2"), e -> {
			int x = ShaftbuilderGUILvl2Screen.this.x;
			int y = ShaftbuilderGUILvl2Screen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ShaftbuilderGUILvl2ButtonMessage(25, x, y, z));
				ShaftbuilderGUILvl2ButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		}).bounds(this.leftPos + 263, this.topPos + 73, 66, 20).build();
		this.addRenderableWidget(button_g_room_2);
		button_g_bit_1 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_g_bit_1"), e -> {
		}).bounds(this.leftPos + 263, this.topPos + 97, 61, 20).build();
		this.addRenderableWidget(button_g_bit_1);
		button_g_bit_2 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_g_bit_2"), e -> {
		}).bounds(this.leftPos + 264, this.topPos + 118, 61, 20).build();
		this.addRenderableWidget(button_g_bit_2);
		button_g_bit_3 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_g_bit_3"), e -> {
		}).bounds(this.leftPos + 264, this.topPos + 139, 61, 20).build();
		this.addRenderableWidget(button_g_bit_3);
		button_g_bit_4 = Button.builder(Component.translatable("gui.jimsmineshaft.shaftbuilder_gui_lvl_2.button_g_bit_4"), e -> {
		}).bounds(this.leftPos + 264, this.topPos + 159, 61, 20).build();
		this.addRenderableWidget(button_g_bit_4);
	}
}