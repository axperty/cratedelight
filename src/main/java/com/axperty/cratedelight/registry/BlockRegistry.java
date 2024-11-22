package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import com.axperty.cratedelight.block.BlockList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    public static void registerBlocks() {

        // Carrot, Potatoes, and Beetroot Crate Registry
        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
            BlockList.CARROT_CRATE = block("carrot_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            BlockList.POTATO_CRATE = block("potato_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            BlockList.BEETROOT_CRATE = block("beetroot_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Apple Crate Registry
        BlockList.APPLE_CRATE = block("apple_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Diamond Apples Crate Registry
        if (FabricLoader.getInstance().isModLoaded("diamond_apples")) {
            BlockList.DIAMOND_APPLE_CRATE = block("diamond_apple_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Berry Crate Registry
        BlockList.BERRY_CRATE = block("berry_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Blueberry Crate Registry
        if (FabricLoader.getInstance().isModLoaded("nutritious-feast") || FabricLoader.getInstance().isModLoaded("moreberries")) {
            BlockList.BLUEBERRY_CRATE = block("blueberry_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Black, Green, Orange, Purple, and Yellow Berry Crate Registry
        if (FabricLoader.getInstance().isModLoaded("moreberries")) {
            BlockList.BLACK_BERRY_CRATE = block("black_berry_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            BlockList.GREEN_BERRY_CRATE = block("green_berry_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            BlockList.ORANGE_BERRY_CRATE = block("orange_berry_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            BlockList.YELLOW_BERRY_CRATE = block("yellow_berry_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            BlockList.PURPLE_BERRY_CRATE = block("purple_berry_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Glow Berry Crate Registry
        BlockList.GLOWBERRY_CRATE = block("glowberry_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD).luminance((state) -> 13)));

        // Egg Crate Registry
        BlockList.EGG_CRATE = block("egg_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Duck Egg Crate Registry
        if (FabricLoader.getInstance().isModLoaded("naturalist")) {
            BlockList.DUCK_EGG_CRATE = block("duck_egg_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Peanut Crate Registry (for Expanded Delight)
        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
            BlockList.PEANUT_CRATE = block("peanut_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Jagm's Kiwis Compatibility
        if (FabricLoader.getInstance().isModLoaded("jagmkiwis")) {
            // Kiwi Egg Crate Registry
            BlockList.KIWI_EGG_CRATE = block("kiwi_egg_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            // Kiwifruit Crate Registry
            BlockList.KIWIFRUIT_CRATE = block("kiwifruit_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Salmon Crate Registry
        BlockList.SALMON_CRATE = block("salmon_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Cod Crate Registry
        BlockList.COD_CRATE = block("cod_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Naturalist Compatibility
        if (FabricLoader.getInstance().isModLoaded("naturalist")) {
            // Cat Fish Crate Registry
            BlockList.CATFISH_CRATE = block("catfish_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

            // Bass Crate Registry
            BlockList.BASS_CRATE = block("bass_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // BetterEnd Compatibility
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            // End Fish Crate Registry
            BlockList.END_FISH_CRATE = block("end_fish_crate",
                    new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));
        }

        // Red Mushroom Crate Registry
        BlockList.RED_MUSHROOM_CRATE = block("red_mushroom_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Brown Mushroom Crate Registry
        BlockList.BROWN_MUSHROOM_CRATE = block("brown_mushroom_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Golden Carrot Crate Registry
        BlockList.GOLDEN_CARROT_CRATE = block("golden_carrot_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Golden Apple Crate Registry
        BlockList.GOLDEN_APPLE_CRATE = block("golden_apple_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Cocoa Beans Bag Registry
        BlockList.COCOABEANS_BAG = block("cocoabeans_bag",
                new Block(blockSettings(.8f, .8f, BlockSoundGroup.WOOL)));

        // Sugar Bag Registry
        BlockList.SUGAR_BAG = block("sugar_bag",
                new Block(blockSettings(.8f, .8f, BlockSoundGroup.WOOL)));

        // Gunpowder Bag Registry
        BlockList.GUNPOWDER_BAG = block("gunpowder_bag",
                new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));

        // Cookie Bag Registry
        BlockList.COOKIE_BAG = block("cookie_bag",
                new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));

        // Expanded Delight Compatibility:
        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
            // Salt Bag Registry
            BlockList.SALT_BAG = block("salt_bag",
                    new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));
            // Cinnamon Bag Registry
            BlockList.GROUND_CINNAMON_BAG = block("ground_cinnamon_bag",
                    new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));
        }

        // Create Mod Compatibility:
        if (FabricLoader.getInstance().isModLoaded("create")) {
            // Wheat Flour Bag Registry
            BlockList.WHEAT_FLOUR_BAG = block("wheat_flour_bag",
                    new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));

            // Powdered Obsidian Bag Registry
            BlockList.POWDERED_OBSIDIAN_BAG = block("powdered_obsidian_bag",
                    new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));

            // Cinder Flour Bag Registry
            BlockList.CINDER_FLOUR_BAG = block("cinder_flour_bag",
                    new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));
        }

        // BetterEnd Mod Compatibility:
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            // End Dust Bag Registry
            BlockList.ENDER_DUST_BAG = block("ender_dust_bag",
                    new Block(blockSettings(.7f, .8f, BlockSoundGroup.WOOL)));
        }

    }
    private static FabricBlockSettings blockSettings(float hardness, float resistance, BlockSoundGroup sound) {
        return FabricBlockSettings.create().strength(hardness, resistance).sounds(sound);
    }

    private static Block block(String name, Block block) {
        blockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CrateDelight.MODID, name), block);
    }

    private static Item blockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(CrateDelight.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(CrateDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Block withoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(CrateDelight.MODID, name), block);
    }
}
