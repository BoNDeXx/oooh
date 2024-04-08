package net.mcreator.zweihanderrp.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.zweihanderrp.init.ZweihanderrpModBlockEntities;
import net.mcreator.zweihanderrp.block.renderer.VSTUPlenieTileRenderer;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

@Mod.EventBusSubscriber(modid = ZweihanderrpMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(ZweihanderrpModBlockEntities.VSTU_PLENIE.get(), context -> new VSTUPlenieTileRenderer());
	}
}
