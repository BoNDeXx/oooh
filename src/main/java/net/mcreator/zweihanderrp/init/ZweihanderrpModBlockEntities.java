
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.zweihanderrp.block.entity.SyrodutBlockEntity;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

public class ZweihanderrpModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ZweihanderrpMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SYRODUT = register("syrodut", ZweihanderrpModBlocks.SYRODUT, SyrodutBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
