
package net.mcreator.zweihanderrp.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.zweihanderrp.item.KricaItem;
import net.mcreator.zweihanderrp.ZweihanderrpModElements;

@ZweihanderrpModElements.ModElement.Tag
public class TestItemGroup extends ZweihanderrpModElements.ModElement {
	public TestItemGroup(ZweihanderrpModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabzweihander_rp_core") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KricaItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
