package com.axperty.cratedelight.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Carrot Crate Item
    public static final DeferredItem<BlockItem> CARROT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("carrot_crate", BlockRegistry.CARROT_CRATE);

    // Potato Crate Item
    public static final DeferredItem<BlockItem> POTATO_CRATE_ITEM = ITEMS.registerSimpleBlockItem("potato_crate", BlockRegistry.POTATO_CRATE);

    // Beetroot Crate Item
    public static final DeferredItem<BlockItem> BEETROOT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("beetroot_crate", BlockRegistry.BEETROOT_CRATE);

    // Apple Crate Item
    public static final DeferredItem<BlockItem> APPLE_CRATE_ITEM = ITEMS.registerSimpleBlockItem("apple_crate", BlockRegistry.APPLE_CRATE);

    // Berry Crate Item
    public static final DeferredItem<BlockItem> BERRY_CRATE_ITEM = ITEMS.registerSimpleBlockItem("berry_crate", BlockRegistry.BERRY_CRATE);

    // Blueberry Crate Item
    public static final DeferredItem<BlockItem> BLUEBERRY_CRATE_ITEM = ITEMS.registerSimpleBlockItem("blueberry_crate", BlockRegistry.BLUEBERRY_CRATE);

    // Glow Berry Crate Item
    public static final DeferredItem<BlockItem> GLOWBERRY_CRATE_ITEM = ITEMS.registerSimpleBlockItem("glowberry_crate", BlockRegistry.GLOWBERRY_CRATE);

    // Egg Crate Item
    public static final DeferredItem<BlockItem> EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("egg_crate", BlockRegistry.EGG_CRATE);

    // Duck Egg Crate Item
    public static final DeferredItem<BlockItem> DUCK_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("duck_egg_crate", BlockRegistry.DUCK_EGG_CRATE);

    // Peanut Egg Crate Item
    public static final DeferredItem<BlockItem> PEANUT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("peanut_crate", BlockRegistry.PEANUT_CRATE);

    // Emu Egg Crate Item
    public static final DeferredItem<BlockItem> EMU_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("emu_egg_crate", BlockRegistry.EMU_EGG_CRATE);

    // Terrapin Egg Crate Item
    public static final DeferredItem<BlockItem> TERRAPIN_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("terrapin_egg_crate", BlockRegistry.TERRAPIN_EGG_CRATE);

    // Crocodile Egg Crate Item
    public static final DeferredItem<BlockItem> CROCODILE_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("crocodile_egg_crate", BlockRegistry.CROCODILE_EGG_CRATE);

    // Caiman Egg Crate Item
    public static final DeferredItem<BlockItem> CAIMAN_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("caiman_egg_crate", BlockRegistry.CAIMAN_EGG_CRATE);

    // Platypus Egg Crate Item
    public static final DeferredItem<BlockItem> PLATYPUS_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("platypus_egg_crate", BlockRegistry.PLATYPUS_EGG_CRATE);

    // Kiwi Egg Crate Item
    public static final DeferredItem<BlockItem> KIWI_EGG_CRATE_ITEM = ITEMS.registerSimpleBlockItem("kiwi_egg_crate", BlockRegistry.KIWI_EGG_CRATE);

    // Kiwifruit Crate Item
    public static final DeferredItem<BlockItem> KIWIFRUIT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("kiwifruit_crate", BlockRegistry.KIWIFRUIT_CRATE);

    // Banana Crate Item
    public static final DeferredItem<BlockItem> BANANA_CRATE_ITEM = ITEMS.registerSimpleBlockItem("banana_crate", BlockRegistry.BANANA_CRATE);

    // Salmon Crate Item
    public static final DeferredItem<BlockItem> SALMON_CRATE_ITEM = ITEMS.registerSimpleBlockItem("salmon_crate", BlockRegistry.SALMON_CRATE);

    // Cod Crate Item
    public static final DeferredItem<BlockItem> COD_CRATE_ITEM = ITEMS.registerSimpleBlockItem("cod_crate", BlockRegistry.COD_CRATE);

    // Catfish Crate Item
    public static final DeferredItem<BlockItem> CATFISH_CRATE_ITEM = ITEMS.registerSimpleBlockItem("catfish_crate", BlockRegistry.CATFISH_CRATE);

    // Bass Crate Item
    public static final DeferredItem<BlockItem> BASS_CRATE_ITEM = ITEMS.registerSimpleBlockItem("bass_crate", BlockRegistry.BASS_CRATE);

    // Red Mushroom Crate Item
    public static final DeferredItem<BlockItem> RED_MUSHROOM_CRATE_ITEM = ITEMS.registerSimpleBlockItem("red_mushroom_crate", BlockRegistry.RED_MUSHROOM_CRATE);

    // Brown Mushroom Crate Item
    public static final DeferredItem<BlockItem> BROWN_MUSHROOM_CRATE_ITEM = ITEMS.registerSimpleBlockItem("brown_mushroom_crate", BlockRegistry.BROWN_MUSHROOM_CRATE);

    // Golden Carrot Crate Item
    public static final DeferredItem<BlockItem> GOLDEN_CARROT_CRATE_ITEM = ITEMS.registerSimpleBlockItem("golden_carrot_crate", BlockRegistry.GOLDEN_CARROT_CRATE);

    // Golden Apple Crate Item
    public static final DeferredItem<BlockItem> GOLDEN_APPLE_CRATE_ITEM = ITEMS.registerSimpleBlockItem("golden_apple_crate", BlockRegistry.GOLDEN_APPLE_CRATE);

    // Cocoa Beans Bag Item
    public static final DeferredItem<BlockItem> COCOABEANS_BAG_ITEM = ITEMS.registerSimpleBlockItem("cocoabeans_bag", BlockRegistry.COCOABEANS_BAG);

    // Sugar Bag Item
    public static final DeferredItem<BlockItem> SUGAR_BAG_ITEM = ITEMS.registerSimpleBlockItem("sugar_bag", BlockRegistry.SUGAR_BAG);

    // Gunpowder Bag Item
    public static final DeferredItem<BlockItem> GUNPOWDER_BAG_ITEM = ITEMS.registerSimpleBlockItem("gunpowder_bag", BlockRegistry.GUNPOWDER_BAG);

    // Salt Bag Item
    public static final DeferredItem<BlockItem> SALT_BAG_ITEM = ITEMS.registerSimpleBlockItem("salt_bag", BlockRegistry.SALT_BAG);

    // Ground Cinnamon Bag Item
    public static final DeferredItem<BlockItem> GROUND_CINNAMON_BAG_ITEM = ITEMS.registerSimpleBlockItem("ground_cinnamon_bag", BlockRegistry.GROUND_CINNAMON_BAG);

    // Wheat Flour Bag Item
    public static final DeferredItem<BlockItem> WHEAT_FLOUR_BAG_ITEM = ITEMS.registerSimpleBlockItem("wheat_flour_bag", BlockRegistry.WHEAT_FLOUR_BAG);

    // Powdered Obsidian Bag Item
    public static final DeferredItem<BlockItem> POWDERED_OBSIDIAN_BAG_ITEM = ITEMS.registerSimpleBlockItem("powdered_obsidian_bag", BlockRegistry.POWDERED_OBSIDIAN_BAG);

    // Cinder Flour Bag Item
    public static final DeferredItem<BlockItem> CINDER_FLOUR_BAG_ITEM = ITEMS.registerSimpleBlockItem("cinder_flour_bag", BlockRegistry.CINDER_FLOUR_BAG);

    // Cookie Bag Item
    public static final DeferredItem<BlockItem> COOKIE_BAG_ITEM = ITEMS.registerSimpleBlockItem("cookie_bag", BlockRegistry.COOKIE_BAG);
}
