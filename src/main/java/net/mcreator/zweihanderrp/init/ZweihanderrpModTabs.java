
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.zweihanderrp.ZweihanderrpMod;

public class ZweihanderrpModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZweihanderrpMod.MODID);
	public static final RegistryObject<CreativeModeTab> ZWEIHANDER_RP_CORE = REGISTRY.register("zweihander_rp_core",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.zweihanderrp.zweihander_rp_core")).icon(() -> new ItemStack(ZweihanderrpModItems.KRICA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ZweihanderrpModItems.KRICA.get());
				tabData.accept(ZweihanderrpModBlocks.SYRODUT.get().asItem());
				tabData.accept(ZweihanderrpModItems.SCHICHT.get());
				tabData.accept(ZweihanderrpModItems.CHUGUNOK.get());
				tabData.accept(ZweihanderrpModItems.COAL_DUST.get());
				tabData.accept(ZweihanderrpModBlocks.LAND_ROCK.get().asItem());
				tabData.accept(ZweihanderrpModItems.STONE_SHOVEL_HEAD.get());
				tabData.accept(ZweihanderrpModItems.STONE_AXE_HEAD.get());
				tabData.accept(ZweihanderrpModItems.STONE_HOE_HEAD.get());
				tabData.accept(ZweihanderrpModItems.STONE_PICKAXE_HEAD.get());
				tabData.accept(ZweihanderrpModItems.STONE_KNIFE_HEAD.get());
				tabData.accept(ZweihanderrpModItems.ROPE.get());
				tabData.accept(ZweihanderrpModBlocks.WOODSTUPKA.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> EQUIPMENT = REGISTRY.register("equipment",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.zweihanderrp.equipment")).icon(() -> new ItemStack(Items.IRON_SWORD)).displayItems((parameters, tabData) -> {
				tabData.accept(ZweihanderrpModItems.NORDIC_HELMET_1_HELMET.get());
				tabData.accept(ZweihanderrpModItems.NORDIC_HELMET_2_HELMET.get());
				tabData.accept(ZweihanderrpModItems.NORDIC_HELMET_3_HELMET.get());
				tabData.accept(ZweihanderrpModItems.NORDIC_HELMET_4_HELMET.get());
				tabData.accept(ZweihanderrpModItems.NORDIC_HELMET_5_HELMET.get());
				tabData.accept(ZweihanderrpModItems.NODIC_HELMET_6_HELMET.get());
				tabData.accept(ZweihanderrpModItems.BACINET_HELMET.get());
				tabData.accept(ZweihanderrpModItems.BARBUTE_HELMET.get());
				tabData.accept(ZweihanderrpModItems.SALLET_HELMET.get());
				tabData.accept(ZweihanderrpModItems.BASCINETWITHKLAPPVISOR_HELMET.get());
				tabData.accept(ZweihanderrpModItems.H_ZHELMETE_HELMET.get());
				tabData.accept(ZweihanderrpModItems.ENGRAVED_TOPHELM_HELMET.get());
				tabData.accept(ZweihanderrpModItems.TOPHELM_HELMET.get());
				tabData.accept(ZweihanderrpModItems.REDTOPHELM_HELMET.get());
				tabData.accept(ZweihanderrpModItems.VERYRICHTOPHELM_HELMET.get());
				tabData.accept(ZweihanderrpModItems.RICH_KLAPPVISER_HELMET.get());
				tabData.accept(ZweihanderrpModItems.H_ZHELMETE_RICH_HELMET.get());
				tabData.accept(ZweihanderrpModItems.ENGRAVEDBARBUTE_HELMET.get());
				tabData.accept(ZweihanderrpModItems.PAINTED_BARBUTE_HELMET.get());
				tabData.accept(ZweihanderrpModItems.BLUEDSALLET_HELMET.get());
				tabData.accept(ZweihanderrpModItems.BLUED_KLAPVISOR_HELMET.get());
				tabData.accept(ZweihanderrpModItems.ROMANARMOR_HELMET.get());
				tabData.accept(ZweihanderrpModItems.ROMANARMOR_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.MAIL_STANDARD_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.KOIFE_HELMET.get());
				tabData.accept(ZweihanderrpModItems.SIMPLE_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.FULL_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.CRUDE_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.PAULDRONS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.CRUDE_GOVNO_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.PAULDRONS_STANDARD_LEATHER_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.LEATHER_BRIGANDINE_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.RED_PAINTED_PAULDRONS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.ENGRAVED_PAULDRONS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.ENGRAVED_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.RICH_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.BLUED_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.BLACK_BLUED_CUIRASS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.BLUED_PAULDRONS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.ARABIC_STANDARD_PAULDRONS_CHESTPLATE.get());
				tabData.accept(ZweihanderrpModItems.TURBAN_HELMET.get());
				tabData.accept(ZweihanderrpModItems.IBERIAN_HELMET_HELMET.get());
				tabData.accept(ZweihanderrpModItems.ARABIC_TUNIK_LEGGINGS.get());
				tabData.accept(ZweihanderrpModItems.BLUE_TUNIK_1_LEGGINGS.get());
				tabData.accept(ZweihanderrpModItems.BLUE_TUNIK_2_LEGGINGS.get());
				tabData.accept(ZweihanderrpModItems.BLUE_TUNIK_3_LEGGINGS.get());
			}).withSearchBar().build());
}
