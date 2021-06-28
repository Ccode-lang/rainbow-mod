
package net.mcreator.rainbow.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.rainbow.ElementsRainbowMod;

import java.util.Set;
import java.util.HashMap;

@ElementsRainbowMod.ModElement.Tag
public class ItemRainbowToolsHoe extends ElementsRainbowMod.ModElement {
	@GameRegistry.ObjectHolder("rainbow:rainbow_tools_hoe")
	public static final Item block = null;
	public ItemRainbowToolsHoe(ElementsRainbowMod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("RAINBOW_TOOLS_HOE", 4, 660, 9f, 0f, 28)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("rainbow_tools_hoe").setRegistryName("rainbow_tools_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("rainbow:rainbow_tools_hoe", "inventory"));
	}
}
