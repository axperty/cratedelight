package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlockRegistry {

    public static final Block CARROT_CRATE = registerBlock("carrot_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block POTATO_CRATE = registerBlock("potato_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block POISONOUS_POTATO_CRATE = registerBlock("poisonous_potato_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block APPLE_CRATE = registerBlock("apple_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BERRY_CRATE = registerBlock("berry_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block GLOWBERRY_CRATE = registerBlock("glowberry_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS).luminance((state) -> 13));

    public static final Block EGG_CRATE = registerBlock("egg_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BROWN_EGG_CRATE = registerBlock("brown_egg_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BLUE_EGG_CRATE = registerBlock("blue_egg_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block PEANUT_CRATE = registerBlock("peanut_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block SALMON_CRATE = registerBlock("salmon_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block COD_CRATE = registerBlock("cod_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block RED_MUSHROOM_CRATE = registerBlock("red_mushroom_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BROWN_MUSHROOM_CRATE = registerBlock("brown_mushroom_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block PUMPKIN_SLICE_CRATE = registerBlock("pumpkin_slice_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate", Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block BREAD_BAG = registerBlock("bread_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));

    public static final Block COOKIE_BAG = registerBlock("cookie_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));

    public static final Block COCOABEANS_BAG = registerBlock("cocoabeans_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));

    public static final Block SUGAR_BAG = registerBlock("sugar_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));

    public static final Block GUNPOWDER_BAG = registerBlock("gunpowder_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));

    public static final Block SALT_BAG = registerBlock("salt_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));

    public static final Block GROUND_CINNAMON_BAG = registerBlock("ground_cinnamon_bag", Block::new, Block.Settings.copy(Blocks.WHITE_WOOL));
    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(CrateDelight.MODID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, factory, settings);
        registerItem(path, itemSettings -> new BlockItem(block, itemSettings), new Item.Settings());
        return block;
    }

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CrateDelight.MODID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerModBlocks() {
        CrateDelight.LOGGER.info("Registering mod blocks for " + CrateDelight.MODID);
    }
}
