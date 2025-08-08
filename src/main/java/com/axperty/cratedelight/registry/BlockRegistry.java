package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    // Carrot Crate Registry
    public static final Block CARROT_CRATE = registerBlock("carrot_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Potato Crate Registry
    public static final Block POTATO_CRATE = registerBlock("potato_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Beetroot Crate Registry
    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Poisonous Potato Crate Registry
    public static final Block POISONOUS_POTATO_CRATE = registerBlock("poisonous_potato_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Apple Crate Registry
    public static final Block APPLE_CRATE = registerBlock("apple_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Berry Crate Registry
    public static final Block BERRY_CRATE = registerBlock("berry_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Glow Berry Crate Registry
    public static final Block GLOWBERRY_CRATE = registerBlock("glowberry_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).luminance((state) -> 13)));

    // Egg Crate Registry
    public static final Block EGG_CRATE = registerBlock("egg_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Peanut Crate Registry
    public static final Block PEANUT_CRATE = registerBlock("peanut_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Salmon Crate Registry
    public static final Block SALMON_CRATE = registerBlock("salmon_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Cod Crate Registry
    public static final Block COD_CRATE = registerBlock("cod_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Red Mushroom Crate Registry
    public static final Block RED_MUSHROOM_CRATE = registerBlock("red_mushroom_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Brown Mushroom Crate Registry
    public static final Block BROWN_MUSHROOM_CRATE = registerBlock("brown_mushroom_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Pumpkin Slice Crate Registry
    public static final Block PUMPKIN_SLICE_CRATE = registerBlock("pumpkin_slice_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Golden Carrot Crate Registry
    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Golden Apple Crate Registry
    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Bread Bag Registry
    public static final Block BREAD_BAG = registerBlock("bread_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    // Cookie Bag Registry
    public static final Block COOKIE_BAG = registerBlock("cookie_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    // Cocoa Beans Bag Registry
    public static final Block COCOABEANS_BAG = registerBlock("cocoabeans_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    // Sugar Bag Registry
    public static final Block SUGAR_BAG = registerBlock("sugar_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    // Gunpowder Bag Registry
    public static final Block GUNPOWDER_BAG = registerBlock("gunpowder_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    // Salt Bag Registry
    public static final Block SALT_BAG = registerBlock("salt_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    // Cinnamon Bag Registry
    public static final Block GROUND_CINNAMON_BAG = registerBlock("ground_cinnamon_bag",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.tryParse(CrateDelight.MODID + ":" + name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(CrateDelight.MODID + ":" + name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CrateDelight.LOGGER.info("Registering mod blocks for " + CrateDelight.MODID);
    }
}
