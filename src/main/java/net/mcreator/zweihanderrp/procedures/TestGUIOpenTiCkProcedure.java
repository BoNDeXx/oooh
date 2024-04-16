package net.mcreator.zweihanderrp.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.zweihanderrp.init.ZweihanderrpModItems;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class TestGUIOpenTiCkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ForgingClickButtonProcedure.execute();
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Forgingprogress") == 100 && TestRecipeProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ZweihanderrpModItems.SCHICHT.get());
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 6) + 1));
				((Slot) _slots.get(6)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("Forgingprogress", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
