package com.axperty.cratedelight.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Carrot Crate
    public static final DeferredBlock<Block> CARROT_CRATE = BLOCKS.registerSimpleBlock("carrot_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Beetroot Crate
    public static final DeferredBlock<Block> BEETROOT_CRATE = BLOCKS.registerSimpleBlock("beetroot_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Potato Crate
    public static final DeferredBlock<Block> POTATO_CRATE = BLOCKS.registerSimpleBlock("potato_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Poisonous Potato Crate
    public static final DeferredBlock<Block> POISONOUS_POTATO_CRATE = BLOCKS.registerSimpleBlock("poisonous_potato_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Apple Crate
    public static final DeferredBlock<Block> APPLE_CRATE = BLOCKS.registerSimpleBlock("apple_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Berry Crate
    public static final DeferredBlock<Block> BERRY_CRATE = BLOCKS.registerSimpleBlock("berry_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Glow Berry Crate
    public static final DeferredBlock<Block> GLOWBERRY_CRATE = BLOCKS.registerSimpleBlock("glowberry_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD).lightLevel((state) -> 13));

    // Egg Crate
    public static final DeferredBlock<Block> EGG_CRATE = BLOCKS.registerSimpleBlock("egg_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Brown Egg Crate
    public static final DeferredBlock<Block> BROWN_EGG_CRATE = BLOCKS.registerSimpleBlock("brown_egg_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Blue Egg Crate
    public static final DeferredBlock<Block> BLUE_EGG_CRATE = BLOCKS.registerSimpleBlock("blue_egg_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Peanut Crate (Expanded Delight)
    public static final DeferredBlock<Block> PEANUT_CRATE = BLOCKS.registerSimpleBlock("peanut_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Salmon Crate
    public static final DeferredBlock<Block> SALMON_CRATE = BLOCKS.registerSimpleBlock("salmon_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Cod Crate
    public static final DeferredBlock<Block> COD_CRATE = BLOCKS.registerSimpleBlock("cod_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Red Mushroom Crate
    public static final DeferredBlock<Block> RED_MUSHROOM_CRATE = BLOCKS.registerSimpleBlock("red_mushroom_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Brown Mushroom Crate
    public static final DeferredBlock<Block> BROWN_MUSHROOM_CRATE = BLOCKS.registerSimpleBlock("brown_mushroom_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Pumpkin Slice Crate
    public static final DeferredBlock<Block> PUMPKIN_SLICE_CRATE = BLOCKS.registerSimpleBlock("pumpkin_slice_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Golden Carrot Crate
    public static final DeferredBlock<Block> GOLDEN_CARROT_CRATE = BLOCKS.registerSimpleBlock("golden_carrot_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Golden Apple Crate
    public static final DeferredBlock<Block> GOLDEN_APPLE_CRATE = BLOCKS.registerSimpleBlock("golden_apple_crate",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Bread Bag
    public static final DeferredBlock<Block> BREAD_BAG = BLOCKS.registerSimpleBlock("bread_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));

    // Cookie Bag
    public static final DeferredBlock<Block> COOKIE_BAG = BLOCKS.registerSimpleBlock("cookie_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));

    // Cocoa Beans Bag
    public static final DeferredBlock<Block> COCOABEANS_BAG = BLOCKS.registerSimpleBlock("cocoabeans_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));

    // Sugar Bag
    public static final DeferredBlock<Block> SUGAR_BAG = BLOCKS.registerSimpleBlock("sugar_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));

    // Gunpowder Bag
    public static final DeferredBlock<Block> GUNPOWDER_BAG = BLOCKS.registerSimpleBlock("gunpowder_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));

    // Salt Bag (Expanded Delight)
    public static final DeferredBlock<Block> SALT_BAG = BLOCKS.registerSimpleBlock("salt_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));

    // Ground Cinnamon Bag (Expanded Delight)
    public static final DeferredBlock<Block> GROUND_CINNAMON_BAG = BLOCKS.registerSimpleBlock("ground_cinnamon_bag",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOL));
}
