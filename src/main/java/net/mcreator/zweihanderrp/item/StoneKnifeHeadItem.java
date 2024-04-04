
package net.mcreator.zweihanderrp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.zweihanderrp.itemgroup.TestItemGroup;
import net.mcreator.zweihanderrp.ZweihanderrpModElements;

@ZweihanderrpModElements.ModElement.Tag
public class StoneKnifeHeadItem extends ZweihanderrpModElements.ModElement {
	@ObjectHolder("zweihanderrp:stone_knife_head")
	public static final Item block = null;

	public StoneKnifeHeadItem(ZweihanderrpModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TestItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("stone_knife_head");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
