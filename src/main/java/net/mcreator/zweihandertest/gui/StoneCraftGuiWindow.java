
package net.mcreator.zweihandertest.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.zweihandertest.ZweihanderTestMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class StoneCraftGuiWindow extends ContainerScreen<StoneCraftGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = StoneCraftGui.guistate;

	public StoneCraftGuiWindow(StoneCraftGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 191;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("zweihander_test:textures/stone_craft.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Pebble Carving", 59, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 61, 30, 20, new StringTextComponent("Topor"), e -> {
			if (true) {
				ZweihanderTestMod.PACKET_HANDLER.sendToServer(new StoneCraftGui.ButtonPressedMessage(0, x, y, z));
				StoneCraftGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 50, this.guiTop + 61, 30, 20, new StringTextComponent("Nozhik"), e -> {
			if (true) {
				ZweihanderTestMod.PACKET_HANDLER.sendToServer(new StoneCraftGui.ButtonPressedMessage(1, x, y, z));
				StoneCraftGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 86, this.guiTop + 61, 30, 20, new StringTextComponent(" Strela"), e -> {
			if (true) {
				ZweihanderTestMod.PACKET_HANDLER.sendToServer(new StoneCraftGui.ButtonPressedMessage(2, x, y, z));
				StoneCraftGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 122, this.guiTop + 61, 51, 20, new StringTextComponent("kopye"), e -> {
			if (true) {
				ZweihanderTestMod.PACKET_HANDLER.sendToServer(new StoneCraftGui.ButtonPressedMessage(3, x, y, z));
				StoneCraftGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
