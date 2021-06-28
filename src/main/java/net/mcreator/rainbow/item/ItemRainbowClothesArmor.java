
package net.mcreator.rainbow.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.rainbow.ElementsRainbowMod;

@ElementsRainbowMod.ModElement.Tag
public class ItemRainbowClothesArmor extends ElementsRainbowMod.ModElement {
	@GameRegistry.ObjectHolder("rainbow:rainbow_clothes_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("rainbow:rainbow_clothes_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("rainbow:rainbow_clothes_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("rainbow:rainbow_clothes_armorboots")
	public static final Item boots = null;
	public ItemRainbowClothesArmor(ElementsRainbowMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RAINBOW_CLOTHES_ARMOR", "rainbow:rainbowclothes", 45, new int[]{6, 18, 15, 6},
				27, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rainbow_clothes_armorhelmet")
				.setRegistryName("rainbow_clothes_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("rainbow_clothes_armorbody")
				.setRegistryName("rainbow_clothes_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rainbow_clothes_armorlegs")
				.setRegistryName("rainbow_clothes_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("rainbow_clothes_armorboots")
				.setRegistryName("rainbow_clothes_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("rainbow:rainbow_clothes_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("rainbow:rainbow_clothes_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("rainbow:rainbow_clothes_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("rainbow:rainbow_clothes_armorboots", "inventory"));
	}
}
