
package net.mcreator.rainbow.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.rainbow.item.ItemRainbow;
import net.mcreator.rainbow.block.BlockRainbowOre;
import net.mcreator.rainbow.ElementsRainbowMod;

@ElementsRainbowMod.ModElement.Tag
public class RecipeRainbowOreSmelting extends ElementsRainbowMod.ModElement {
	public RecipeRainbowOreSmelting(ElementsRainbowMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRainbowOre.block, (int) (1)), new ItemStack(ItemRainbow.block, (int) (1)), 1.75F);
	}
}
