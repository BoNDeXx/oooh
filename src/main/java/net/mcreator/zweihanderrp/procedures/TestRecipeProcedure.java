package net.mcreator.zweihanderrp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.Map;

public class TestRecipeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double slotCount = 0;
		double ItemCount = 0;
		double slot = 0;
		double airCount = 0;
		slotCount = 9;
		ItemCount = 0;
		slot = 0;
		for (int index0 = 0; index0 < (int) slotCount; index0++) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slot)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("zweihanderrp:test_tag")))) {
				ItemCount = ItemCount + 1;
			}
			slot = slot + 1;
		}
		slot = 0;
		for (int index1 = 0; index1 < (int) slotCount; index1++) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slot)).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
				airCount = airCount + 1;
			}
			slot = slot + 1;
		}
		return ItemCount == 1 && airCount == slotCount - 1;
	}
}
