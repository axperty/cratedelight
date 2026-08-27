package com.axperty.cratedelight.registry;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Carrot Crate Item
    public static final DeferredItem<BlockItem> CARROT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("carrot_crate", BlockRegistry.CARROT_CRATE);

    // Beetroot Crate Item
    public static final DeferredItem<BlockItem> BEETROOT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("beetroot_crate", BlockRegistry.BEETROOT_CRATE);

    // Potato Crate Item
    public static final DeferredItem<BlockItem> POTATO_CRATE_ITEM = ITEMS.registerSimpleBlockItem("potato_crate", BlockRegistry.POTATO_CRATE);

    // Poisonous Potato Crate Item
    public static final DeferredItem<BlockItem> POISONOUS_POTATO_CRATE_ITEM = ITEMS.registerSimpleBlockItem("poisonous_potato_crate", BlockRegistry.POISONOUS_POTATO_CRATE);

    // Apple Crate Item
    public static final DeferredItem<BlockItem> APPLE_CRATE_ITEM = ITEMS.registerSimpleBlockItem("apple_crate", BlockRegistry.APPLE_CRATE);

    // Berry Crate Item
    public static final DeferredItem<BlockItem> BERRY_CRATE_ITEM = ITEMS.registerSimpleBlockItem("berry_crate", BlockRegistry.BERRY_CRATE);

    // Glow Berry Crate Item
    public static final DeferredItem<BlockItem> GLOWBERRY_CRATE_ITEM = ITEMS.registerSimpleBlockItem("glowberry_crate", BlockRegistry.GLOWBERRY_CRATE);

    // Egg Crate Item
    public static final DeferredItem<BlockItem> EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("egg_crate", BlockRegistry.EGG_CRATE);

    // Brown Egg Crate Item
    public static final DeferredItem<BlockItem> BROWN_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("brown_egg_crate", BlockRegistry.BROWN_EGG_CRATE);

    // Blue Egg Crate Item
    public static final DeferredItem<BlockItem> BLUE_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("blue_egg_crate", BlockRegistry.BLUE_EGG_CRATE);

    // Salmon Crate Item
    public static final DeferredItem<BlockItem> SALMON_CRATE_ITEM = ITEMS.registerSimpleBlockItem("salmon_crate", BlockRegistry.SALMON_CRATE);

    // Cod Crate Item
    public static final DeferredItem<BlockItem> COD_CRATE_ITEM = ITEMS.registerSimpleBlockItem("cod_crate", BlockRegistry.COD_CRATE);

    // Pufferfish Crate Item
    public static final DeferredItem<BlockItem> PUFFERFISH_CRATE_ITEM = ITEMS.registerSimpleBlockItem("pufferfish_crate", BlockRegistry.PUFFERFISH_CRATE);

    // Tropical Fish Crate Item
    public static final DeferredItem<BlockItem> TROPICAL_FISH_CRATE_ITEM = ITEMS.registerSimpleBlockItem("tropical_fish_crate", BlockRegistry.TROPICAL_FISH_CRATE);

    // Red Mushroom Crate Item
    public static final DeferredItem<BlockItem> RED_MUSHROOM_CRATE_ITEM = ITEMS.registerSimpleBlockItem("red_mushroom_crate", BlockRegistry.RED_MUSHROOM_CRATE);

    // Brown Mushroom Crate Item
    public static final DeferredItem<BlockItem> BROWN_MUSHROOM_CRATE_ITEM = ITEMS.registerSimpleBlockItem("brown_mushroom_crate", BlockRegistry.BROWN_MUSHROOM_CRATE);

    // Pumpkin Slice Crate Item
    public static final DeferredItem<BlockItem> PUMPKIN_SLICE_CRATE_ITEM = ITEMS.registerSimpleBlockItem("pumpkin_slice_crate", BlockRegistry.PUMPKIN_SLICE_CRATE);

    // Golden Carrot Crate Item
    public static final DeferredItem<BlockItem> GOLDEN_CARROT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("golden_carrot_crate", BlockRegistry.GOLDEN_CARROT_CRATE);

    // Golden Apple Crate Item
    public static final DeferredItem<BlockItem> GOLDEN_APPLE_CRATE_ITEM = ITEMS.registerSimpleBlockItem("golden_apple_crate", BlockRegistry.GOLDEN_APPLE_CRATE);

    // Bread Bag Item
    public static final DeferredItem<BlockItem> BREAD_BAG_ITEM = ITEMS.registerSimpleBlockItem("bread_bag", BlockRegistry.BREAD_BAG);

    // Cookie Bag Item
    public static final DeferredItem<BlockItem> COOKIE_BAG_ITEM = ITEMS.registerSimpleBlockItem("cookie_bag", BlockRegistry.COOKIE_BAG);

    // Cocoa Beans Bag Item
    public static final DeferredItem<BlockItem> COCOABEANS_BAG_ITEM = ITEMS.registerSimpleBlockItem("cocoabeans_bag", BlockRegistry.COCOABEANS_BAG);

    // Sugar Bag Item
    public static final DeferredItem<BlockItem> SUGAR_BAG_ITEM = ITEMS.registerSimpleBlockItem("sugar_bag", BlockRegistry.SUGAR_BAG);

    // Gunpowder Bag Item
    public static final DeferredItem<BlockItem> GUNPOWDER_BAG_ITEM = ITEMS.registerSimpleBlockItem("gunpowder_bag", BlockRegistry.GUNPOWDER_BAG);

    // Leaf Litter Bag Item
    public static final DeferredItem<BlockItem> LEAF_LITTER_BAG_ITEM = ITEMS.registerSimpleBlockItem("leaf_litter_bag", BlockRegistry.LEAF_LITTER_BAG);

    // Oak Leaves Bag Item
    public static final DeferredItem<BlockItem> OAK_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("oak_leaves_bag", BlockRegistry.OAK_LEAVES_BAG);

    // Wheat Seeds Bag Item
    public static final DeferredItem<BlockItem> WHEAT_SEEDS_BAG_ITEM = ITEMS.registerSimpleBlockItem("wheat_seeds_bag", BlockRegistry.WHEAT_SEEDS_BAG);

    // Pumpkin Seeds Bag Item
    public static final DeferredItem<BlockItem> PUMPKIN_BAG_ITEM = ITEMS.registerSimpleBlockItem("pumpkin_seeds_bag", BlockRegistry.PUMPKIN_SEEDS_BAG);

    // Melon Seeds Bag Item
    public static final DeferredItem<BlockItem> MELON_SEEDS_BAG_ITEM = ITEMS.registerSimpleBlockItem("melon_seeds_bag", BlockRegistry.MELON_SEEDS_BAG);

    // Beetroot Seeds Bag Item
    public static final DeferredItem<BlockItem> BEETROOT_SEEDS_BAG_ITEM = ITEMS.registerSimpleBlockItem("beetroot_seeds_bag", BlockRegistry.BEETROOT_SEEDS_BAG);

    // Spruce Leaves Bag Item
    public static final DeferredItem<BlockItem> SPRUCE_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("spruce_leaves_bag", BlockRegistry.SPRUCE_LEAVES_BAG);

    // Birch Leaves Bag Item
    public static final DeferredItem<BlockItem> BIRCH_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("birch_leaves_bag", BlockRegistry.BIRCH_LEAVES_BAG);

    // Jungle Leaves Bag Item
    public static final DeferredItem<BlockItem> JUNGLE_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("jungle_leaves_bag", BlockRegistry.JUNGLE_LEAVES_BAG);

    // Acacia Leaves Bag Item
    public static final DeferredItem<BlockItem> ACACIA_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("acacia_leaves_bag", BlockRegistry.ACACIA_LEAVES_BAG);

    // Dark Oak Leaves Bag Item
    public static final DeferredItem<BlockItem> DARK_OAK_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("dark_oak_leaves_bag", BlockRegistry.DARK_OAK_LEAVES_BAG);

    // Mangrove Leaves Bag Item
    public static final DeferredItem<BlockItem> MANGROVE_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("mangrove_leaves_bag", BlockRegistry.MANGROVE_LEAVES_BAG);

    // Cherry Leaves Bag Item
    public static final DeferredItem<BlockItem> CHERRY_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("cherry_leaves_bag", BlockRegistry.CHERRY_LEAVES_BAG);

    // Pale Oak Leaves Bag Item
    public static final DeferredItem<BlockItem> PALE_OAK_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("pale_oak_leaves_bag", BlockRegistry.PALE_OAK_LEAVES_BAG);

    // Azalea Leaves Bag Item
    public static final DeferredItem<BlockItem> AZALEA_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("azalea_leaves_bag", BlockRegistry.AZALEA_LEAVES_BAG);

    // Flowering Azalea Leaves Bag Item
    public static final DeferredItem<BlockItem> FLOWERING_AZALEA_LEAVES_BAG_ITEM = ITEMS.registerSimpleBlockItem("flowering_azalea_leaves_bag", BlockRegistry.FLOWERING_AZALEA_LEAVES_BAG);
}
