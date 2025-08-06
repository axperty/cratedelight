package com.axperty.cratedelight.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    // Carrot Crate
    public static final RegistryObject<Block> CARROT_CRATE = BLOCKS.register("carrot_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("carrot_crate")).sound(SoundType.WOOD)));

    // Potato Crate
    public static final RegistryObject<Block> POTATO_CRATE = BLOCKS.register("potato_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("potato_crate")).sound(SoundType.WOOD)));

    // Poisonous Potato Crate
    public static final RegistryObject<Block> POISONOUS_POTATO_CRATE = BLOCKS.register("poisonous_potato_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("poisonous_potato_crate")).sound(SoundType.WOOD)));

    // Beetroot Crate
    public static final RegistryObject<Block> BEETROOT_CRATE = BLOCKS.register("beetroot_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("beetroot_crate")).sound(SoundType.WOOD)));

    // Apple Crate
    public static final RegistryObject<Block> APPLE_CRATE = BLOCKS.register("apple_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("apple_crate")).sound(SoundType.WOOD)));

    // Berry Crate
    public static final RegistryObject<Block> BERRY_CRATE = BLOCKS.register("berry_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("berry_crate")).sound(SoundType.WOOD)));

    // Glow Berry Crate
    public static final RegistryObject<Block> GLOWBERRY_CRATE = BLOCKS.register("glowberry_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("glowberry_crate")).sound(SoundType.WOOD).lightLevel((state) -> 13)));

    // Egg Crate
    public static final RegistryObject<Block> EGG_CRATE = BLOCKS.register("egg_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("egg_crate")).sound(SoundType.WOOD)));

    // Salmon Crate
    public static final RegistryObject<Block> SALMON_CRATE = BLOCKS.register("salmon_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("salmon_crate")).sound(SoundType.WOOD)));

    // Cod Crate
    public static final RegistryObject<Block> COD_CRATE = BLOCKS.register("cod_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("cod_crate")).sound(SoundType.WOOD)));

    // Red Mushroom Crate
    public static final RegistryObject<Block> RED_MUSHROOM_CRATE = BLOCKS.register("red_mushroom_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("red_mushroom_crate")).sound(SoundType.WOOD)));

    // Brown Mushroom Crate
    public static final RegistryObject<Block> BROWN_MUSHROOM_CRATE = BLOCKS.register("brown_mushroom_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("brown_mushroom_crate")).sound(SoundType.WOOD)));

    // Golden Carrot Crate
    public static final RegistryObject<Block> GOLDEN_CARROT_CRATE = BLOCKS.register("golden_carrot_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("golden_carrot_crate")).sound(SoundType.WOOD)));

    // Golden Apple Crate
    public static final RegistryObject<Block> GOLDEN_APPLE_CRATE = BLOCKS.register("golden_apple_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("golden_apple_crate")).sound(SoundType.WOOD)));

    // Bread Bag
    public static final RegistryObject<Block> BREAD_BAG = BLOCKS.register("bread_bag",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(BLOCKS.key("bread_bag")).sound(SoundType.WOOL)));

    // Cocoa Beans Bag
    public static final RegistryObject<Block> COCOABEANS_BAG = BLOCKS.register("cocoabeans_bag",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(BLOCKS.key("cocoabeans_bag")).sound(SoundType.WOOL)));

    // Sugar Bag
    public static final RegistryObject<Block> SUGAR_BAG = BLOCKS.register("sugar_bag",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(BLOCKS.key("sugar_bag")).sound(SoundType.WOOL)));

    // Gunpowder Bag
    public static final RegistryObject<Block> GUNPOWDER_BAG = BLOCKS.register("gunpowder_bag",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(BLOCKS.key("gunpowder_bag")).sound(SoundType.WOOL)));

    // Cookie Bag
    public static final RegistryObject<Block> COOKIE_BAG = BLOCKS.register("cookie_bag",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(BLOCKS.key("cookie_bag")).sound(SoundType.WOOL)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}