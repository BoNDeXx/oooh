
package net.mcreator.zweihandertest.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.zweihandertest.itemgroup.EquipmentItemGroup;
import net.mcreator.zweihandertest.ZweihanderTestModElements;

@ZweihanderTestModElements.ModElement.Tag
public class NormanHelmetItem extends ZweihanderTestModElements.ModElement {
	@ObjectHolder("zweihander_test:norman_helmet_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zweihander_test:norman_helmet_chestplate")
	public static final Item body = null;
	@ObjectHolder("zweihander_test:norman_helmet_leggings")
	public static final Item legs = null;
	@ObjectHolder("zweihander_test:norman_helmet_boots")
	public static final Item boots = null;

	public NormanHelmetItem(ZweihanderTestModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("zweihander_test:helmet_sound1"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "norman_helmet";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(EquipmentItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zweihander_test:textures/models/armor/r1norhelms__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("norman_helmet_helmet"));
	}

}
