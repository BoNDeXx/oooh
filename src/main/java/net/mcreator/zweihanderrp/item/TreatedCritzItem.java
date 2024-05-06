
package net.mcreator.zweihanderrp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TreatedCritzItem extends Item {
	public TreatedCritzItem() {
		super(new Item.Properties().stacksTo(8).fireResistant().rarity(Rarity.COMMON));
	}
}
