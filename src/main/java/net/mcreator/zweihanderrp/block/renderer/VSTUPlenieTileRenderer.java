package net.mcreator.zweihanderrp.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.zweihanderrp.block.model.VSTUPlenieBlockModel;
import net.mcreator.zweihanderrp.block.entity.VSTUPlenieTileEntity;

public class VSTUPlenieTileRenderer extends GeoBlockRenderer<VSTUPlenieTileEntity> {
	public VSTUPlenieTileRenderer() {
		super(new VSTUPlenieBlockModel());
	}

	@Override
	public RenderType getRenderType(VSTUPlenieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
