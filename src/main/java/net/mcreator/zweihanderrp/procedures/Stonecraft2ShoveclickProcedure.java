package net.mcreator.zweihanderrp.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.zweihanderrp.init.ZweihanderrpModItems;
import net.mcreator.zweihanderrp.init.ZweihanderrpModBlocks;

public class Stonecraft2ShoveclickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ZweihanderrpModBlocks.LAND_ROCK.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zweihanderrp:carve_pebble_sound")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zweihanderrp:carve_pebble_sound")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ZweihanderrpModBlocks.LAND_ROCK.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ZweihanderrpModItems.STONE_SHOVEL_HEAD.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
