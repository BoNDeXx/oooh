
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.zweihanderrp.world.inventory.StoneCraftMenu;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

public class ZweihanderrpModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ZweihanderrpMod.MODID);
	public static final RegistryObject<MenuType<StoneCraftMenu>> STONE_CRAFT = REGISTRY.register("stone_craft", () -> IForgeMenuType.create(StoneCraftMenu::new));
}
