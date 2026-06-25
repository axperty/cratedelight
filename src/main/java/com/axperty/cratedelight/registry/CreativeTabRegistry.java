package com.axperty.cratedelight.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import com.axperty.cratedelight.CrateDelight;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup CREATIVE_MODE_TAB = FabricItemGroupBuilder.create(
            new Identifier(CrateDelight.MOD_ID, "title"))
            .icon(() -> new ItemStack(BlockRegistry.BERRY_CRATE))
            .appendItems(stacks -> {

                if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                    stacks.add(new ItemStack(BlockRegistry.CARROT_CRATE));
                    stacks.add(new ItemStack(BlockRegistry.BEETROOT_CRATE));
                    stacks.add(new ItemStack(BlockRegistry.POTATO_CRATE));
                }
                stacks.add(new ItemStack(BlockRegistry.POISONOUS_POTATO_CRATE));
                stacks.add(new ItemStack(BlockRegistry.APPLE_CRATE));
                stacks.add(new ItemStack(BlockRegistry.BERRY_CRATE));
                stacks.add(new ItemStack(BlockRegistry.GLOWBERRY_CRATE));
                stacks.add(new ItemStack(BlockRegistry.EGG_CRATE));

                if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                    stacks.add(new ItemStack(BlockRegistry.PEANUT_CRATE));
                }

                stacks.add(new ItemStack(BlockRegistry.SALMON_CRATE));
                stacks.add(new ItemStack(BlockRegistry.COD_CRATE));
                stacks.add(new ItemStack(BlockRegistry.PUFFERFISH_CRATE));
                stacks.add(new ItemStack(BlockRegistry.TROPICAL_FISH_CRATE));
                stacks.add(new ItemStack(BlockRegistry.RED_MUSHROOM_CRATE));
                stacks.add(new ItemStack(BlockRegistry.BROWN_MUSHROOM_CRATE));

                if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                    stacks.add(new ItemStack(BlockRegistry.PUMPKIN_SLICE_CRATE));
                }

                stacks.add(new ItemStack(BlockRegistry.GOLDEN_CARROT_CRATE));
                stacks.add(new ItemStack(BlockRegistry.GOLDEN_APPLE_CRATE));
                stacks.add(new ItemStack(BlockRegistry.BREAD_BAG));
                stacks.add(new ItemStack(BlockRegistry.COOKIE_BAG));
                stacks.add(new ItemStack(BlockRegistry.COCOABEANS_BAG));
                stacks.add(new ItemStack(BlockRegistry.SUGAR_BAG));
                stacks.add(new ItemStack(BlockRegistry.GUNPOWDER_BAG));
                stacks.add(new ItemStack(BlockRegistry.WHEAT_SEEDS_BAG));
                stacks.add(new ItemStack(BlockRegistry.PUMPKIN_SEEDS_BAG));
                stacks.add(new ItemStack(BlockRegistry.MELON_SEEDS_BAG));
                stacks.add(new ItemStack(BlockRegistry.BEETROOT_SEEDS_BAG));

                if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                    stacks.add(new ItemStack(BlockRegistry.SALT_BAG));
                    stacks.add(new ItemStack(BlockRegistry.GROUND_CINNAMON_BAG));
                }
            })
            .build();

    public static void registerCreativeTabs() {}
}
