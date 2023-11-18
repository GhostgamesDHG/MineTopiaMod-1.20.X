package com.armedendmion.minetopiamod.gui.vendingmachine;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.network.VendingMachine.VendingguiButtonMessage;
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

public class VendingGuiScreen extends AbstractContainerScreen<VendingguiMenu> {
	private final static HashMap<String, Object> guistate = VendingguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_a;
	Button button_b;
	Button button_c;
	Button button_d;
	Button button_e;
	Button button_f;
	Button button_g;
	Button button_h;
	Button button_i;
	Button button_j;

	public VendingGuiScreen(VendingguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 206;
	}

	private static final ResourceLocation texture = new ResourceLocation("gmm:textures/screens/vendinggui.png");

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_a = Button.builder(Component.translatable("gui.gmm.vendinggui.button_a"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(0, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 6, 70, 10).build();
		guistate.put("button:button_a", button_a);
		this.addRenderableWidget(button_a);

		button_b = Button.builder(Component.translatable("gui.gmm.vendinggui.button_b"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(1, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 15, 70, 11).build();
		guistate.put("button:button_b", button_b);
		this.addRenderableWidget(button_b);

		button_c = Button.builder(Component.translatable("gui.gmm.vendinggui.button_c"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(2, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 26, 70, 11).build();
		guistate.put("button:button_c", button_c);
		this.addRenderableWidget(button_c);

		button_d = Button.builder(Component.translatable("gui.gmm.vendinggui.button_d"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(3, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 3, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 37, 70, 11).build();
		guistate.put("button:button_d", button_d);
		this.addRenderableWidget(button_d);

		button_e = Button.builder(Component.translatable("gui.gmm.vendinggui.button_e"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(4, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 4, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 48, 70, 11).build();
		guistate.put("button:button_e", button_e);
		this.addRenderableWidget(button_e);

		button_f = Button.builder(Component.translatable("gui.gmm.vendinggui.button_f"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(5, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 5, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 59, 70, 11).build();
		guistate.put("button:button_f", button_f);
		this.addRenderableWidget(button_f);

		button_g = Button.builder(Component.translatable("gui.gmm.vendinggui.button_g"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(6, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 6, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 92, 70, 11).build();
		guistate.put("button:button_g", button_g);
		this.addRenderableWidget(button_g);

		button_h = Button.builder(Component.translatable("gui.gmm.vendinggui.button_h"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(7, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 7, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 103, 70, 11).build();
		guistate.put("button:button_h", button_h);
		this.addRenderableWidget(button_h);

		button_i = Button.builder(Component.translatable("gui.gmm.vendinggui.button_i"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(8, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 8, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 70, 70, 11).build();
		guistate.put("button:button_i", button_i);
		this.addRenderableWidget(button_i);

		button_j = Button.builder(Component.translatable("gui.gmm.vendinggui.button_j"), e -> {
            MineTopiaMod.PACKET_HANDLER.sendToServer(new VendingguiButtonMessage(9, x, y, z));
            VendingguiButtonMessage.handleButtonAction(entity, 9, x, y, z);
        }).bounds(this.leftPos + 6, this.topPos + 81, 70, 11).build();
		guistate.put("button:button_j", button_j);
		this.addRenderableWidget(button_j);
	}
}
