package net.mcreator.zweihanderrp.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.zweihanderrp.world.inventory.StoneCraftMenu;
import net.mcreator.zweihanderrp.network.StoneCraftButtonMessage;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoneCraftScreen extends AbstractContainerScreen<StoneCraftMenu> {
	private final static HashMap<String, Object> guistate = StoneCraftMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_pickaxe;
	Button button_hoe;
	Button button_axe;
	Button button_shovel;
	Button button_arrowhead;
	Button button_knife;

	public StoneCraftScreen(StoneCraftMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 183;
		this.imageHeight = 185;
	}

	private static final ResourceLocation texture = new ResourceLocation("zweihanderrp:textures/screens/stone_craft.png");

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

		guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/stone_axe_baza.png"), this.leftPos + 74, this.topPos + 22, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/stone_hoe_baza.png"), this.leftPos + 74, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/stone_pickaxe_baza.png"), this.leftPos + 74, this.topPos + 76, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/stone_shovel_baza.png"), this.leftPos + 155, this.topPos + 22, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/stone_sword_baza.png"), this.leftPos + 155, this.topPos + 76, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.zweihanderrp.stone_craft.label_pebble_carving"), 55, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_pickaxe = Button.builder(Component.translatable("gui.zweihanderrp.stone_craft.button_pickaxe"), e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(0, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 11, this.topPos + 76, 61, 20).build();
		guistate.put("button:button_pickaxe", button_pickaxe);
		this.addRenderableWidget(button_pickaxe);
		button_hoe = Button.builder(Component.translatable("gui.zweihanderrp.stone_craft.button_hoe"), e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(1, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 11, this.topPos + 49, 61, 20).build();
		guistate.put("button:button_hoe", button_hoe);
		this.addRenderableWidget(button_hoe);
		button_axe = Button.builder(Component.translatable("gui.zweihanderrp.stone_craft.button_axe"), e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(2, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 11, this.topPos + 22, 61, 20).build();
		guistate.put("button:button_axe", button_axe);
		this.addRenderableWidget(button_axe);
		button_shovel = Button.builder(Component.translatable("gui.zweihanderrp.stone_craft.button_shovel"), e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(3, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 92, this.topPos + 22, 61, 20).build();
		guistate.put("button:button_shovel", button_shovel);
		this.addRenderableWidget(button_shovel);
		button_arrowhead = Button.builder(Component.translatable("gui.zweihanderrp.stone_craft.button_arrowhead"), e -> {
		}).bounds(this.leftPos + 92, this.topPos + 49, 61, 20).build();
		guistate.put("button:button_arrowhead", button_arrowhead);
		this.addRenderableWidget(button_arrowhead);
		button_knife = Button.builder(Component.translatable("gui.zweihanderrp.stone_craft.button_knife"), e -> {
		}).bounds(this.leftPos + 92, this.topPos + 76, 61, 20).build();
		guistate.put("button:button_knife", button_knife);
		this.addRenderableWidget(button_knife);
	}
}
