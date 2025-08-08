package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.world.item.*;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrateDelight.MOD_ID);

    private static final Item.Properties DEFAULT_PROPS = new Item.Properties();

    // Carrot Crate
    public static final RegistryObject<Item> CARROT_CRATE = !modLoaded("farmersdelight") ? ITEMS.register("carrot_crate",
            () -> (new BlockItem(BlockRegistry.CARROT_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP)))) : null;

    // Beetroot Crate
    public static final RegistryObject<Item> BEETROOT_CRATE = !modLoaded("farmersdelight") ? ITEMS.register("beetroot_crate",
            () -> (new BlockItem(BlockRegistry.BEETROOT_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP)))) : null;

    // Potato Crate
    public static final RegistryObject<Item> POTATO_CRATE = !modLoaded("farmersdelight") ? ITEMS.register("potato_crate",
            () -> (new BlockItem(BlockRegistry.POTATO_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP)))) : null;

    // Poisonous Potato Crate
    public static final RegistryObject<Item> POISONOUS_POTATO_CRATE = ITEMS.register("poisonous_potato_crate",
            () -> (new BlockItem(BlockRegistry.POISONOUS_POTATO_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Apple Crate
    public static final RegistryObject<Item> APPLE_CRATE = ITEMS.register("apple_crate",
            () -> (new BlockItem(BlockRegistry.APPLE_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Berry Crate
    public static final RegistryObject<Item> BERRY_CRATE = ITEMS.register("berry_crate",
            () -> (new BlockItem(BlockRegistry.BERRY_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Glow Berry Crate
    public static final RegistryObject<Item> GLOWBERRY_CRATE = ITEMS.register("glowberry_crate",
            () -> (new BlockItem(BlockRegistry.GLOWBERRY_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Egg Crate
    public static final RegistryObject<Item> EGG_CRATE = ITEMS.register("egg_crate",
            () -> (new BlockItem(BlockRegistry.EGG_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Salmon Crate
    public static final RegistryObject<Item> SALMON_CRATE = ITEMS.register("salmon_crate",
            () -> (new BlockItem(BlockRegistry.SALMON_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Cod Crate
    public static final RegistryObject<Item> COD_CRATE = ITEMS.register("cod_crate",
            () -> (new BlockItem(BlockRegistry.COD_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Red Mushroom Crate
    public static final RegistryObject<Item> RED_MUSHROOM_CRATE = ITEMS.register("red_mushroom_crate",
            () -> (new BlockItem(BlockRegistry.RED_MUSHROOM_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Brown Mushroom Crate
    public static final RegistryObject<Item> BROWN_MUSHROOM_CRATE = ITEMS.register("brown_mushroom_crate",
            () -> (new BlockItem(BlockRegistry.BROWN_MUSHROOM_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Pumpkin Slice Crate
    public static final RegistryObject<Item> PUMPKIN_SLICE_CRATE = modLoaded("farmersdelight") ? ITEMS.register("pumpkin_slice_crate",
            () -> (new BlockItem(BlockRegistry.PUMPKIN_SLICE_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP)))) : null;

    // Golden Carrot Crate
    public static final RegistryObject<Item> GOLDEN_CARROT_CRATE = ITEMS.register("golden_carrot_crate",
            () -> (new BlockItem(BlockRegistry.GOLDEN_CARROT_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Golden Apple Crate
    public static final RegistryObject<Item> GOLDEN_APPLE_CRATE = ITEMS.register("golden_apple_crate",
            () -> (new BlockItem(BlockRegistry.GOLDEN_APPLE_CRATE.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Bread Bag
    public static final RegistryObject<Item> BREAD_BAG = ITEMS.register("bread_bag",
            () -> (new BlockItem(BlockRegistry.BREAD_BAG.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Cookie Bag
    public static final RegistryObject<Item> COOKIE_BAG = ITEMS.register("cookie_bag",
            () -> (new BlockItem(BlockRegistry.COOKIE_BAG.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Cocoa Beans Bag
    public static final RegistryObject<Item> COCOABEANS_BAG = ITEMS.register("cocoabeans_bag",
            () -> (new BlockItem(BlockRegistry.COCOABEANS_BAG.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Sugar Bag
    public static final RegistryObject<Item> SUGAR_BAG = ITEMS.register("sugar_bag",
            () -> (new BlockItem(BlockRegistry.SUGAR_BAG.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    // Gunpowder Bag
    public static final RegistryObject<Item> GUNPOWDER_BAG = ITEMS.register("gunpowder_bag",
            () -> (new BlockItem(BlockRegistry.GUNPOWDER_BAG.get(), (new Item.Properties()).tab(CrateDelight.ITEM_GROUP))));

    private static boolean modLoaded(String modName) {
        return ModList.get().isLoaded(modName);
    }
}
