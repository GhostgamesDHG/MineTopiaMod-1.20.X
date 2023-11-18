package com.armedendmion.minetopiamod.gui.safe;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.network.safe.SafeGuiSetPasswordButtonMessage;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class SafeGuiSetPasswordScreen extends AbstractContainerScreen<SafeGuiSetPasswordMenu> {
	private final static HashMap<String, Object> guistate = SafeGuiSetPasswordMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox password;
	Button button_set_password;

	public SafeGuiSetPasswordScreen(SafeGuiSetPasswordMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 139;
		this.imageHeight = 64;
	}

	private static final ResourceLocation texture = new ResourceLocation("gmm:textures/screens/safe_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		password.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("gmm:textures/screens/safe_gui.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 139, 64, 139, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (password.isFocused())
			return password.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		password.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.gmm.safe_gui_set_password.label_safe"), 10, 5, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		password = new EditBox(this.font, this.leftPos + 10, this.topPos + 16, 120, 20, Component.translatable("gui.gmm.safe_gui_set_password.password")) {
			{
				setSuggestion(Component.translatable("gui.gmm.safe_gui_set_password.password").getString());
			}

			@Override
			public void insertText(@NotNull String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.gmm.safe_gui_set_password.password").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.gmm.safe_gui_set_password.password").getString());
				else
					setSuggestion(null);
			}
		};
		password.setMaxLength(32767);
		guistate.put("text:password", password);
		this.addWidget(this.password);
		button_set_password = Button.builder(Component.translatable("gui.gmm.safe_gui_set_password.button_set_password"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new SafeGuiSetPasswordButtonMessage(0, x, y, z));
            SafeGuiSetPasswordButtonMessage.handleButtonAction(entity, 0, x, y, z);
        }).bounds(this.leftPos + 28, this.topPos + 39, 85, 20).build();
		guistate.put("button:button_set_password", button_set_password);
		this.addRenderableWidget(button_set_password);
	}
}
