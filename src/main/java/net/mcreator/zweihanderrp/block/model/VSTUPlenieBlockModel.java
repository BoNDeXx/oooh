package net.mcreator.zweihanderrp.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.zweihanderrp.block.entity.VSTUPlenieTileEntity;

public class VSTUPlenieBlockModel extends GeoModel<VSTUPlenieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VSTUPlenieTileEntity animatable) {
		return new ResourceLocation("zweihanderrp", "animations/stupipestikw_-_converted_-_converted.geo_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VSTUPlenieTileEntity animatable) {
		return new ResourceLocation("zweihanderrp", "geo/stupipestikw_-_converted_-_converted.geo_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VSTUPlenieTileEntity entity) {
		return new ResourceLocation("zweihanderrp", "textures/block/birch_planks.png");
	}
}
