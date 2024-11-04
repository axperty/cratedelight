package com.axperty.cratedelight.block;

import com.axperty.cratedelight.CrateDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import com.axperty.cratedelight.item.ModItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Carrot Crate Registry
    public static final Block CARROT_CRATE = !FabricLoader.getInstance().isModLoaded("farmersdelight") ?
            registerBlock("carrot_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Potato Crate Registry
    public static final Block POTATO_CRATE = !FabricLoader.getInstance().isModLoaded("farmersdelight") ?
            registerBlock("potato_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Beetroot Crate Registry
    public static final Block BEETROOT_CRATE = !FabricLoader.getInstance().isModLoaded("farmersdelight") ?
            registerBlock("beetroot_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Apple Crate Registry
    public static final Block APPLE_CRATE = registerBlock("apple_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Berry Crate Registry
    public static final Block BERRY_CRATE = registerBlock("berry_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Blueberry Crate Registry (Nutritious Feast)
    public static final Block BLUEBERRY_CRATE = FabricLoader.getInstance().isModLoaded("nutritious-feast") ?
            registerBlock("blueberry_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Glow Berry Crate Registry
    public static final Block GLOWBERRY_CRATE = registerBlock("glowberry_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).luminance((state) -> 13)), ModItemGroup.CREATIVE_MODE_TAB);

    // Egg Crate Registry
    public static final Block EGG_CRATE = registerBlock("egg_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Duck Egg Crate Registry (Naturalist)
    public static final Block DUCK_EGG_CRATE = FabricLoader.getInstance().isModLoaded("naturalist") ?
            registerBlock("duck_egg_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Peanut Crate Registry (Expanded Delight)
    public static final Block PEANUT_CRATE = FabricLoader.getInstance().isModLoaded("expandeddelight") ?
            registerBlock("peanut_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Salmon Crate Registry
    public static final Block SALMON_CRATE = registerBlock("salmon_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Cod Crate Registry
    public static final Block COD_CRATE = registerBlock("cod_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Catfish Crate Registry (Naturalist)
    public static final Block CATFISH_CRATE = FabricLoader.getInstance().isModLoaded("naturalist") ?
            registerBlock("catfish_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Bass Crate Registry (Naturalist)
    public static final Block BASS_CRATE = FabricLoader.getInstance().isModLoaded("naturalist") ?
            registerBlock("bass_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // End Fish Crate Registry (BetterEnd)
    public static final Block END_FISH_CRATE = FabricLoader.getInstance().isModLoaded("betterend") ?
            registerBlock("end_fish_crate", new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Red Mushroom Crate Registry
    public static final Block RED_MUSHROOM_CRATE = registerBlock("red_mushroom_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Brown Mushroom Crate Registry
    public static final Block BROWN_MUSHROOM_CRATE = registerBlock("brown_mushroom_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Golden Carrot Crate Registry
    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Golden Apple Crate Registry
    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Cocoa Beans Bag Registry
    public static final Block COCOABEANS_BAG = registerBlock("cocoabeans_bag",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB);

    // Sugar Bag Registry
    public static final Block SUGAR_BAG = registerBlock("sugar_bag",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB);

    // Gunpowder Bag Registry
    public static final Block GUNPOWDER_BAG = registerBlock("gunpowder_bag",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB);

    // Cookie Bag Registry
    public static final Block COOKIE_BAG = registerBlock("cookie_bag",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB);

    // Salt Bag Registry (Expanded Delight)
    public static final Block SALT_BAG = FabricLoader.getInstance().isModLoaded("expandeddelight") ?
            registerBlock("salt_bag", new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Ground Cinnamon Bag Registry (Expanded Delight)
    public static final Block GROUND_CINNAMON_BAG = FabricLoader.getInstance().isModLoaded("expandeddelight") ?
            registerBlock("ground_cinnamon_bag", new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Wheat Flour Bag Registry (Create)
    public static final Block WHEAT_FLOUR_BAG = FabricLoader.getInstance().isModLoaded("create") ?
            registerBlock("wheat_flour_bag", new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Powdered Bag Registry (Create)
    public static final Block POWDERED_OBSIDIAN_BAG = FabricLoader.getInstance().isModLoaded("create") ?
            registerBlock("powdered_obsidian_bag", new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Powdered Obsidian Bag Registry (Create)
    public static final Block CINDER_FLOUR_BAG = FabricLoader.getInstance().isModLoaded("create") ?
            registerBlock("cinder_flour_bag", new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Ender Dust Bag Registry (BetterEnd)
    public static final Block ENDER_DUST_BAG = FabricLoader.getInstance().isModLoaded("betterend") ?
            registerBlock("ender_dust_bag", new Block(FabricBlockSettings.of(Material.WOOL).strength(.9F, 3.0F).sounds(BlockSoundGroup.WOOL)), ModItemGroup.CREATIVE_MODE_TAB) : null;

    // Stacked Melons Registry
    public static final Block STACKED_MELONS = registerBlock("stacked_melons",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    // Stacked Melons Registry
    public static final Block STACKED_PUMPKINS = registerBlock("stacked_pumpkins",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.CREATIVE_MODE_TAB);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CrateDelight.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(CrateDelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        CrateDelight.LOGGER.debug("Registering ModBlocks for " + CrateDelight.MOD_ID);
    }
}
