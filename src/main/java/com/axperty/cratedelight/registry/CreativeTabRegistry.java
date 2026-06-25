package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;
import net.minecraftforge.fml.ModList;

public class CreativeTabRegistry {
    public static final CreativeModeTab CREATIVE_MODE_TAB = new CreativeModeTab(CrateDelight.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.BERRY_CRATE.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) {

            if (!ModList.get().isLoaded("farmersdelight")) {
                items.add(new ItemStack(ItemRegistry.CARROT_CRATE.get()));
                items.add(new ItemStack(ItemRegistry.BEETROOT_CRATE.get()));
                items.add(new ItemStack(ItemRegistry.POTATO_CRATE.get()));
            }
            items.add(new ItemStack(ItemRegistry.POISONOUS_POTATO_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.APPLE_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.BERRY_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.GLOWBERRY_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.EGG_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.SALMON_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.COD_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.PUFFERFISH_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.TROPICAL_FISH_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.RED_MUSHROOM_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.BROWN_MUSHROOM_CRATE.get()));

            if (ModList.get().isLoaded("farmersdelight")) {
                items.add(new ItemStack(ItemRegistry.PUMPKIN_SLICE_CRATE.get()));
            }

            items.add(new ItemStack(ItemRegistry.GOLDEN_CARROT_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.GOLDEN_APPLE_CRATE.get()));
            items.add(new ItemStack(ItemRegistry.BREAD_BAG.get()));
            items.add(new ItemStack(ItemRegistry.COOKIE_BAG.get()));
            items.add(new ItemStack(ItemRegistry.COCOABEANS_BAG.get()));
            items.add(new ItemStack(ItemRegistry.SUGAR_BAG.get()));
            items.add(new ItemStack(ItemRegistry.GUNPOWDER_BAG.get()));
            items.add(new ItemStack(ItemRegistry.WHEAT_SEEDS_BAG.get()));
            items.add(new ItemStack(ItemRegistry.PUMPKIN_SEEDS_BAG.get()));
            items.add(new ItemStack(ItemRegistry.MELON_SEEDS_BAG.get()));
            items.add(new ItemStack(ItemRegistry.BEETROOT_SEEDS_BAG.get()));
        }
    };
}
