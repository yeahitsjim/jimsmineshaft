package net.mcreator.jimsmineshaft.client.gui;

public class StoreGUIScreen extends AbstractContainerScreen<StoreGUIMenu> implements JimsmineshaftModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public StoreGUIScreen(StoreGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 280;
		this.imageHeight = 190;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("jimsmineshaft:textures/screens/store_gui.png");

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
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.jimsmineshaft.store_gui.label_tools"), 45, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jimsmineshaft.store_gui.label_tools1"), 44, 14, -3381760, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jimsmineshaft.store_gui.label_weapons"), 122, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jimsmineshaft.store_gui.label_weapons1"), 123, 14, -3381760, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jimsmineshaft.store_gui.label_armor"), 214, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jimsmineshaft.store_gui.label_armor1"), 215, 15, -3381760, false);
	}

	@Override
	public void init() {
		super.init();
	}
}