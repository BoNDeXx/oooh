
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.zweihanderrp.client.gui.StoneCraftScreen;
import net.mcreator.zweihanderrp.client.gui.SmallanvilGUIScreen;
import net.mcreator.zweihanderrp.client.gui.RennOfenGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZweihanderrpModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ZweihanderrpModMenus.STONE_CRAFT.get(), StoneCraftScreen::new);
			MenuScreens.register(ZweihanderrpModMenus.SMALLANVIL_GUI.get(), SmallanvilGUIScreen::new);
			MenuScreens.register(ZweihanderrpModMenus.RENN_OFEN_GUI.get(), RennOfenGUIScreen::new);
		});
	}
}
