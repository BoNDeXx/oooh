
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zweihanderrp.ZweihanderrpMod;

public class ZweihanderrpModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ZweihanderrpMod.MODID);
	public static final RegistryObject<SoundEvent> CARVE_PEBBLE_SOUND = REGISTRY.register("carve_pebble_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "carve_pebble_sound")));
	public static final RegistryObject<SoundEvent> HELMET_SOUND1M = REGISTRY.register("helmet_sound1m", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "helmet_sound1m")));
	public static final RegistryObject<SoundEvent> UDAR_PO_KOLCHUGE = REGISTRY.register("udar_po_kolchuge", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "udar_po_kolchuge")));
	public static final RegistryObject<SoundEvent> PLATE_ARMOR1 = REGISTRY.register("plate_armor1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_armor1")));
	public static final RegistryObject<SoundEvent> KOLCHUGA = REGISTRY.register("kolchuga", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "kolchuga")));
	public static final RegistryObject<SoundEvent> MORTARPESTESOUND = REGISTRY.register("mortarpestesound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "mortarpestesound")));
	public static final RegistryObject<SoundEvent> ANVIL_STUK1 = REGISTRY.register("anvil_stuk1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "anvil_stuk1")));
	public static final RegistryObject<SoundEvent> PLATE_CHEST_WALK_1 = REGISTRY.register("plate_chest_walk_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_chest_walk_1")));
	public static final RegistryObject<SoundEvent> PLATE_CHEST_WALK_2 = REGISTRY.register("plate_chest_walk_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_chest_walk_2")));
	public static final RegistryObject<SoundEvent> PLATE_CHEST_WALK_3 = REGISTRY.register("plate_chest_walk_3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_chest_walk_3")));
	public static final RegistryObject<SoundEvent> PLATE_LEGS_WALK_1 = REGISTRY.register("plate_legs_walk_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_legs_walk_1")));
	public static final RegistryObject<SoundEvent> PLATE_LEGS_WALK_2 = REGISTRY.register("plate_legs_walk_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_legs_walk_2")));
	public static final RegistryObject<SoundEvent> PLATE_LEGS_WALK_3 = REGISTRY.register("plate_legs_walk_3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("zweihanderrp", "plate_legs_walk_3")));
}
