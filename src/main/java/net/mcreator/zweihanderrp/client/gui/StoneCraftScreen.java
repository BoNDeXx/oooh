package net.mcreator.zweihanderrp.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
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
	ImageButton imagebutton_stone_hoe_baza;
	ImageButton imagebutton_stone_shovel_baza;
	ImageButton imagebutton_arrow_baza;
	ImageButton imagebutton_stone_axe_baza;
	ImageButton imagebutton_stone_pickaxe_baza;
	ImageButton imagebutton_stone_sword_baza;

	public StoneCraftScreen(StoneCraftMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 50;
		this.imageHeight = 70;
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
	public void init() {
		super.init();
		imagebutton_stone_hoe_baza = new ImageButton(this.leftPos + 5, this.topPos + 45, 20, 20, 0, 0, 20, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_stone_hoe_baza.png"), 20, 40, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(0, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stone_hoe_baza", imagebutton_stone_hoe_baza);
		this.addRenderableWidget(imagebutton_stone_hoe_baza);
		imagebutton_stone_shovel_baza = new ImageButton(this.leftPos + 25, this.topPos + 45, 20, 20, 0, 0, 20, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_stone_shovel_baza.png"), 20, 40, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(1, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stone_shovel_baza", imagebutton_stone_shovel_baza);
		this.addRenderableWidget(imagebutton_stone_shovel_baza);
		imagebutton_arrow_baza = new ImageButton(this.leftPos + 5, this.topPos + 25, 20, 20, 0, 0, 20, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_arrow_baza.png"), 20, 40, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(2, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_baza", imagebutton_arrow_baza);
		this.addRenderableWidget(imagebutton_arrow_baza);
		imagebutton_stone_axe_baza = new ImageButton(this.leftPos + 25, this.topPos + 25, 20, 20, 0, 0, 20, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_stone_axe_baza.png"), 20, 40, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(3, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stone_axe_baza", imagebutton_stone_axe_baza);
		this.addRenderableWidget(imagebutton_stone_axe_baza);
		imagebutton_stone_pickaxe_baza = new ImageButton(this.leftPos + 5, this.topPos + 5, 20, 20, 0, 0, 20, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_stone_pickaxe_baza.png"), 20, 40, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(4, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stone_pickaxe_baza", imagebutton_stone_pickaxe_baza);
		this.addRenderableWidget(imagebutton_stone_pickaxe_baza);
		imagebutton_stone_sword_baza = new ImageButton(this.leftPos + 25, this.topPos + 5, 20, 20, 0, 0, 20, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_stone_sword_baza.png"), 20, 40, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new StoneCraftButtonMessage(5, x, y, z));
				StoneCraftButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stone_sword_baza", imagebutton_stone_sword_baza);
		this.addRenderableWidget(imagebutton_stone_sword_baza);
	}
}
