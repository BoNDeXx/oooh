package net.mcreator.zweihanderrp.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.zweihanderrp.block.model.VSTUPlenieDisplayModel;
import net.mcreator.zweihanderrp.block.display.VSTUPlenieDisplayItem;

public class VSTUPlenieDisplayItemRenderer extends GeoItemRenderer<VSTUPlenieDisplayItem> {
	public VSTUPlenieDisplayItemRenderer() {
		super(new VSTUPlenieDisplayModel());
	}

	@Override
	public RenderType getRenderType(VSTUPlenieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
