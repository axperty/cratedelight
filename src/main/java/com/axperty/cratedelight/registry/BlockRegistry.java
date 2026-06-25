package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    // Carrot Crate Registry
    public static final Block CARROT_CRATE = !FabricLoader.getInstance().isModLoaded("farmersdelight") ?
            registerBlock("carrot_crate", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD))) : null;

    // Beetroot Crate Registry
    public static final Block BEETROOT_CRATE = !FabricLoader.getInstance().isModLoaded("farmersdelight") ?
            registerBlock("beetroot_crate", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD))) : null;

    // Potato Crate Registry
    public static final Block POTATO_CRATE = !FabricLoader.getInstance().isModLoaded("farmersdelight") ?
            registerBlock("potato_crate", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD))) : null;

    // Poisonous Potato Crate Registry
    public static final Block POISONOUS_POTATO_CRATE = registerBlock("poisonous_potato_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Apple Crate Registry
    public static final Block APPLE_CRATE = registerBlock("apple_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Berry Crate Registry
    public static final Block BERRY_CRATE = registerBlock("berry_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Glow Berry Crate Registry
    public static final Block GLOWBERRY_CRATE = registerBlock("glowberry_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD).luminance((state) -> 13)));

    // Egg Crate Registry
    public static final Block EGG_CRATE = registerBlock("egg_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Peanut Crate Registry (Expanded Delight)
    public static final Block PEANUT_CRATE = registerBlock("peanut_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Salmon Crate Registry
    public static final Block SALMON_CRATE = registerBlock("salmon_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Cod Crate Registry
    public static final Block COD_CRATE = registerBlock("cod_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Pufferfish Crate Registry
    public static final Block PUFFERFISH_CRATE = registerBlock("pufferfish_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Tropical Fish Crate Registry
    public static final Block TROPICAL_FISH_CRATE = registerBlock("tropical_fish_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Red Mushroom Crate Registry
    public static final Block RED_MUSHROOM_CRATE = registerBlock("red_mushroom_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Brown Mushroom Crate Registry
    public static final Block BROWN_MUSHROOM_CRATE = registerBlock("brown_mushroom_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Pumpkin Slice Crate Registry
    public static final Block PUMPKIN_SLICE_CRATE = registerBlock("pumpkin_slice_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Golden Carrot Crate Registry
    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Golden Apple Crate Registry
    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    // Bread Bag Registry
    public static final Block BREAD_BAG = registerBlock("bread_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Cookie Bag Registry
    public static final Block COOKIE_BAG = registerBlock("cookie_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Cocoa Beans Bag Registry
    public static final Block COCOABEANS_BAG = registerBlock("cocoabeans_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Sugar Bag Registry
    public static final Block SUGAR_BAG = registerBlock("sugar_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Gunpowder Bag Registry
    public static final Block GUNPOWDER_BAG = registerBlock("gunpowder_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Wheat Seeds Bag Registry
    public static final Block WHEAT_SEEDS_BAG = registerBlock("wheat_seeds_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Pumpkin Seeds Bag Registry
    public static final Block PUMPKIN_SEEDS_BAG = registerBlock("pumpkin_seeds_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Melon Seeds Bag Registry
    public static final Block MELON_SEEDS_BAG = registerBlock("melon_seeds_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Beetroot Seeds Bag Registry
    public static final Block BEETROOT_SEEDS_BAG = registerBlock("beetroot_seeds_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Salt Bag Registry (Expanded Delight)
    public static final Block SALT_BAG = registerBlock("salt_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    // Ground Cinnamon Bag Registry (Expanded Delight)
    public static final Block GROUND_CINNAMON_BAG =  registerBlock("ground_cinnamon_bag",
            new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(CrateDelight.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(CrateDelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {}
}
