package net.mcreator.zweihanderrp.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.zweihanderrp.world.inventory.SmallanvilGUIMenu;
import net.mcreator.zweihanderrp.procedures.Anvilprogressbar4Procedure;
import net.mcreator.zweihanderrp.procedures.Anvilprogressbar3Procedure;
import net.mcreator.zweihanderrp.procedures.Anvilprogressbar2Procedure;
import net.mcreator.zweihanderrp.procedures.Anvilprogressbar1Procedure;
import net.mcreator.zweihanderrp.procedures.Anvilprogressbar0Procedure;
import net.mcreator.zweihanderrp.network.SmallanvilGUIButtonMessage;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SmallanvilGUIScreen extends AbstractContainerScreen<SmallanvilGUIMenu> {
	private final static HashMap<String, Object> guistate = SmallanvilGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button_smith;

	public SmallanvilGUIScreen(SmallanvilGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("zweihanderrp:textures/screens/smallanvil_gui.png");

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

		guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/no_progbar.png"), this.leftPos + 69, this.topPos + 43, 0, 0, 54, 18, 54, 18);

		if (Anvilprogressbar0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/1_progbar.png"), this.leftPos + 87, this.topPos + 43, 0, 0, 33, 18, 33, 18);
		}
		if (Anvilprogressbar1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/2_progbar.png"), this.leftPos + 87, this.topPos + 43, 0, 0, 33, 18, 33, 18);
		}
		if (Anvilprogressbar2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/3_progbar.png"), this.leftPos + 87, this.topPos + 43, 0, 0, 33, 18, 33, 18);
		}
		if (Anvilprogressbar3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/5_progbar.png"), this.leftPos + 87, this.topPos + 43, 0, 0, 33, 18, 33, 18);
		}
		if (Anvilprogressbar4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("zweihanderrp:textures/screens/full_progbar.png"), this.leftPos + 88, this.topPos + 43, 0, 0, 33, 18, 33, 18);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.zweihanderrp.smallanvil_gui.label_blacksmithing"), 51, 7, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_smith = new ImageButton(this.leftPos + 69, this.topPos + 43, 54, 18, 0, 0, 18, new ResourceLocation("zweihanderrp:textures/screens/atlas/imagebutton_button_smith.png"), 54, 36, e -> {
			if (true) {
				ZweihanderrpMod.PACKET_HANDLER.sendToServer(new SmallanvilGUIButtonMessage(0, x, y, z));
				SmallanvilGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_smith", imagebutton_button_smith);
		this.addRenderableWidget(imagebutton_button_smith);
	}
}
