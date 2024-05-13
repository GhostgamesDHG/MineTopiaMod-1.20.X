package com.armedendmion.minetopiamod.gui;

import com.armedendmion.minetopiamod.network.OilCanGUIMenu;
import com.armedendmion.minetopiamod.procedures.OilCan.*;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class OilCanGUIScreen extends AbstractContainerScreen<OilCanGUIMenu> {
	private final static HashMap<String, Object> guistate = OilCanGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public OilCanGUIScreen(OilCanGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 50;
		this.imageHeight = 100;
	}

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

		guiGraphics.blit(new ResourceLocation("gmm:textures/screens/tank_background.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 50, 100, 50, 100);

		if (FluidGUIProgress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("gmm:textures/screens/tank_bar_1.png"), this.leftPos + 16, this.topPos + 75, 0, 0, 16, 13, 16, 13);
		}
		if (FluidGUIProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("gmm:textures/screens/tank_bar_2.png"), this.leftPos + 16, this.topPos + 62, 0, 0, 16, 26, 16, 26);
		}
		if (FluidGUIProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("gmm:textures/screens/tank_bar_3.png"), this.leftPos + 16, this.topPos + 49, 0, 0, 16, 39, 16, 39);
		}
		if (FluidGUIProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("gmm:textures/screens/tank_bar_4.png"), this.leftPos + 16, this.topPos + 36, 0, 0, 16, 52, 16, 52);
		}
		if (FluidGUIProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("gmm:textures/screens/tank_bar_5.png"), this.leftPos + 16, this.topPos + 24, 0, 0, 16, 64, 16, 64);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.gmm.fluid_gui.label_tanks"), 11, 6, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
