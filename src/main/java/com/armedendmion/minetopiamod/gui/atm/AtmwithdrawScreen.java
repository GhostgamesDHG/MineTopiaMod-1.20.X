package com.armedendmion.minetopiamod.gui.atm;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.network.atm.AtmwithdrawButtonMessage;
import com.armedendmion.minetopiamod.procedures.loan.BalacetextProcedure;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class AtmwithdrawScreen extends AbstractContainerScreen<AtmwithdrawMenu> {
	private final static HashMap<String, Object> guistate = AtmwithdrawMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_50;
	Button button_5;
	Button button_10;
	Button button_20;
	Button button_100;
	Button button_1000;

	public AtmwithdrawScreen(AtmwithdrawMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 193;
		this.imageHeight = 83;
	}

	private static final ResourceLocation texture = new ResourceLocation("gmm:textures/screens/atmdeposit.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
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
		guiGraphics.drawString(this.font, Component.translatable("gui.gmm.atmwithdraw.label_deposit"), 78, 5, -12829636, false);
		guiGraphics.drawString(this.font,

				BalacetextProcedure.execute(entity), 97, 22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.gmm.atmwithdraw.label_balance"), 53, 22, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_50 = Button.builder(Component.translatable("gui.gmm.atmwithdraw.button_50"), e -> {
			if (true) {
				MineTopiaMod.PACKET_HANDLER.sendToServer(new AtmwithdrawButtonMessage(0, x, y, z));
				AtmwithdrawButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 110, this.topPos + 36, 35, 20).build();
		guistate.put("button:button_50", button_50);
		this.addRenderableWidget(button_50);
		button_5 = Button.builder(Component.translatable("gui.gmm.atmwithdraw.button_5"), e -> {
			if (true) {
				MineTopiaMod.PACKET_HANDLER.sendToServer(new AtmwithdrawButtonMessage(1, x, y, z));
				AtmwithdrawButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 36, 30, 20).build();
		guistate.put("button:button_5", button_5);
		this.addRenderableWidget(button_5);
		button_10 = Button.builder(Component.translatable("gui.gmm.atmwithdraw.button_10"), e -> {
			if (true) {
				MineTopiaMod.PACKET_HANDLER.sendToServer(new AtmwithdrawButtonMessage(2, x, y, z));
				AtmwithdrawButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 38, this.topPos + 36, 35, 20).build();
		guistate.put("button:button_10", button_10);
		this.addRenderableWidget(button_10);
		button_20 = Button.builder(Component.translatable("gui.gmm.atmwithdraw.button_20"), e -> {
			if (true) {
				MineTopiaMod.PACKET_HANDLER.sendToServer(new AtmwithdrawButtonMessage(3, x, y, z));
				AtmwithdrawButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 74, this.topPos + 36, 35, 20).build();
		guistate.put("button:button_20", button_20);
		this.addRenderableWidget(button_20);
		button_100 = Button.builder(Component.translatable("gui.gmm.atmwithdraw.button_100"), e -> {
			if (true) {
				MineTopiaMod.PACKET_HANDLER.sendToServer(new AtmwithdrawButtonMessage(4, x, y, z));
				AtmwithdrawButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 146, this.topPos + 36, 40, 20).build();
		guistate.put("button:button_100", button_100);
		this.addRenderableWidget(button_100);
		button_1000 = Button.builder(Component.translatable("gui.gmm.atmwithdraw.button_1000"), e -> {
			if (true) {
				MineTopiaMod.PACKET_HANDLER.sendToServer(new AtmwithdrawButtonMessage(5, x, y, z));
				AtmwithdrawButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 74, this.topPos + 56, 35, 20).build();
		guistate.put("button:button_1000", button_1000);
		this.addRenderableWidget(button_1000);
	}
}
