package com.armedendmion.minetopiamod.gui.safe;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.network.safe.SAFEINVENTORYButtonMessage;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;


import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import org.jetbrains.annotations.NotNull;

public class SAFEINVENTORYScreen extends AbstractContainerScreen<SAFEINVENTORYMenu> {
	private final static HashMap<String, Object> guistate = SAFEINVENTORYMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_lock;

	public SAFEINVENTORYScreen(SAFEINVENTORYMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 149;
	}

	private static final ResourceLocation texture = new ResourceLocation("gmm:textures/screens/safeinventory.png");

	@Override
	public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.gmm.safeinventory.label_safe"), 6, 12, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_lock = Button.builder(Component.translatable("gui.gmm.safeinventory.button_lock"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new SAFEINVENTORYButtonMessage(0, x, y, z));
            SAFEINVENTORYButtonMessage.handleButtonAction(entity, 0, x, y, z);
        }).bounds(this.leftPos + 64, this.topPos + 45, 45, 20).build();
		guistate.put("button:button_lock", button_lock);
		this.addRenderableWidget(button_lock);
	}
}
