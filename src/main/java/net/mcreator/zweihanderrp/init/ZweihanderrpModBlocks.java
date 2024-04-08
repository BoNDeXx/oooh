
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.zweihanderrp.block.VSTUPlenieBlock;
import net.mcreator.zweihanderrp.block.SyrodutBlock;
import net.mcreator.zweihanderrp.block.LandRockBlock;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

public class ZweihanderrpModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ZweihanderrpMod.MODID);
	public static final RegistryObject<Block> SYRODUT = REGISTRY.register("syrodut", () -> new SyrodutBlock());
	public static final RegistryObject<Block> LAND_ROCK = REGISTRY.register("land_rock", () -> new LandRockBlock());
	public static final RegistryObject<Block> VSTU_PLENIE = REGISTRY.register("vstu_plenie", () -> new VSTUPlenieBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			SyrodutBlock.blockColorLoad(event);
			LandRockBlock.blockColorLoad(event);
		}
	}
}
