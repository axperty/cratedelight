package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrateDelight.MOD_ID);

    // Carrot Crate
    public static final RegistryObject<Block> CARROT_CRATE = BLOCKS.register("carrot_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Potato Crate
    public static final RegistryObject<Block> POTATO_CRATE = BLOCKS.register("potato_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Poisonous Potato Crate
    public static final RegistryObject<Block> POISONOUS_POTATO_CRATE = BLOCKS.register("poisonous_potato_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Beetroot Crate
    public static final RegistryObject<Block> BEETROOT_CRATE = BLOCKS.register("beetroot_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Apple Crate
    public static final RegistryObject<Block> APPLE_CRATE = BLOCKS.register("apple_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Berry Crate
    public static final RegistryObject<Block> BERRY_CRATE = BLOCKS.register("berry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Glow Berry Crate
    public static final RegistryObject<Block> GLOWBERRY_CRATE = BLOCKS.register("glowberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel((state) -> 13)));

    // Egg Crate
    public static final RegistryObject<Block> EGG_CRATE = BLOCKS.register("egg_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Salmon Crate
    public static final RegistryObject<Block> SALMON_CRATE = BLOCKS.register("salmon_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Cod Crate
    public static final RegistryObject<Block> COD_CRATE = BLOCKS.register("cod_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Pufferfish Crate
    public static final RegistryObject<Block> PUFFERFISH_CRATE = BLOCKS.register("pufferfish_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Tropical Fish Crate
    public static final RegistryObject<Block> TROPICAL_FISH_CRATE = BLOCKS.register("tropical_fish_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Red Mushroom Crate
    public static final RegistryObject<Block> RED_MUSHROOM_CRATE = BLOCKS.register("red_mushroom_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Brown Mushroom Crate
    public static final RegistryObject<Block> BROWN_MUSHROOM_CRATE = BLOCKS.register("brown_mushroom_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Pumpkin Slice Crate
    public static final RegistryObject<Block> PUMPKIN_SLICE_CRATE = BLOCKS.register("pumpkin_slice_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Golden Carrot Crate
    public static final RegistryObject<Block> GOLDEN_CARROT_CRATE = BLOCKS.register("golden_carrot_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Golden Apple Crate
    public static final RegistryObject<Block> GOLDEN_APPLE_CRATE = BLOCKS.register("golden_apple_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    // Bread Bag
    public static final RegistryObject<Block> BREAD_BAG = BLOCKS.register("bread_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Cookie Bag
    public static final RegistryObject<Block> COOKIE_BAG = BLOCKS.register("cookie_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Cocoa Beans Bag
    public static final RegistryObject<Block> COCOABEANS_BAG = BLOCKS.register("cocoabeans_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Sugar Bag
    public static final RegistryObject<Block> SUGAR_BAG = BLOCKS.register("sugar_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Gunpowder Bag
    public static final RegistryObject<Block> GUNPOWDER_BAG = BLOCKS.register("gunpowder_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Wheat Seeds Bag
    public static final RegistryObject<Block> WHEAT_SEEDS_BAG = BLOCKS.register("wheat_seeds_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Pumpkin Seeds Bag
    public static final RegistryObject<Block> PUMPKIN_SEEDS_BAG = BLOCKS.register("pumpkin_seeds_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Melon Seeds Bag
    public static final RegistryObject<Block> MELON_SEEDS_BAG = BLOCKS.register("melon_seeds_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Beetroot Seeds Bag
    public static final RegistryObject<Block> BEETROOT_SEEDS_BAG = BLOCKS.register("beetroot_seeds_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
}
