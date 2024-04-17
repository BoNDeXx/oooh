package net.mcreator.zweihanderrp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;

public class KricaTemperatureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public String getTrimMaterial() {
				CompoundTag dataIndex0 = new CompoundTag();
				entity.saveWithoutId(dataIndex0);
				ListTag inventory = dataIndex0.getList("Inventory", 10);
				for (int i = 0; i < inventory.size(); i++) {
					CompoundTag item = inventory.getCompound(i);
					byte slot = item.getByte("Slot");
					if (slot == 103) {
						return item.getCompound("tag").getCompound("Trim").getString("material");
					}
				}
				return null;
			}
		}.getTrimMaterial()).equals("minecraft:iron")) {
			if (entity instanceof Player _player_) {
				if (!_player_.getMainHandItem().isEmpty() && _player_.getMainHandItem().getCount() > 0) {
					_player_.drop(new ItemStack(_player_.getMainHandItem().getItem(), 1), true);
					_player_.getMainHandItem().shrink(1);
					_player_.getInventory().setChanged();
				}
			}
		}
	}
}
