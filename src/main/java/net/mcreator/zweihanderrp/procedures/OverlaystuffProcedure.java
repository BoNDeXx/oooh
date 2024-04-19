package net.mcreator.zweihanderrp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.zweihanderrp.init.ZweihanderrpModItems;

public class OverlaystuffProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (ZweihanderrpModItems.NORDIC_HELMET_3_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()) {
			return true;
		}
		return false;
	}
}
