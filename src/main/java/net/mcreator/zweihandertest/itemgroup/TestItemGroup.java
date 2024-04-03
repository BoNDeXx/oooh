
package net.mcreator.zweihandertest.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.zweihandertest.item.KricaItem;
import net.mcreator.zweihandertest.ZweihanderTestModElements;

@ZweihanderTestModElements.ModElement.Tag
public class TestItemGroup extends ZweihanderTestModElements.ModElement {
	public TestItemGroup(ZweihanderTestModElements instance) {
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
