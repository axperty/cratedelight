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

    // Carrot Crate
    public static final RegistryObject<Item> CARROT_CRATE = !modLoaded("farmersdelight") ? ITEMS.register("carrot_crate",
            () -> (new BlockItem(BlockRegistry.CARROT_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB)))) : null;

    // Beetroot Crate
    public static final RegistryObject<Item> BEETROOT_CRATE = !modLoaded("farmersdelight") ? ITEMS.register("beetroot_crate",
            () -> (new BlockItem(BlockRegistry.BEETROOT_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB)))) : null;

    // Potato Crate
    public static final RegistryObject<Item> POTATO_CRATE = !modLoaded("farmersdelight") ? ITEMS.register("potato_crate",
            () -> (new BlockItem(BlockRegistry.POTATO_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB)))) : null;

    // Poisonous Potato Crate
    public static final RegistryObject<Item> POISONOUS_POTATO_CRATE = ITEMS.register("poisonous_potato_crate",
            () -> (new BlockItem(BlockRegistry.POISONOUS_POTATO_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Apple Crate
    public static final RegistryObject<Item> APPLE_CRATE = ITEMS.register("apple_crate",
            () -> (new BlockItem(BlockRegistry.APPLE_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Berry Crate
    public static final RegistryObject<Item> BERRY_CRATE = ITEMS.register("berry_crate",
            () -> (new BlockItem(BlockRegistry.BERRY_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Glow Berry Crate
    public static final RegistryObject<Item> GLOWBERRY_CRATE = ITEMS.register("glowberry_crate",
            () -> (new BlockItem(BlockRegistry.GLOWBERRY_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Egg Crate
    public static final RegistryObject<Item> EGG_CRATE = ITEMS.register("egg_crate",
            () -> (new BlockItem(BlockRegistry.EGG_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Salmon Crate
    public static final RegistryObject<Item> SALMON_CRATE = ITEMS.register("salmon_crate",
            () -> (new BlockItem(BlockRegistry.SALMON_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Cod Crate
    public static final RegistryObject<Item> COD_CRATE = ITEMS.register("cod_crate",
            () -> (new BlockItem(BlockRegistry.COD_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Red Mushroom Crate
    public static final RegistryObject<Item> RED_MUSHROOM_CRATE = ITEMS.register("red_mushroom_crate",
            () -> (new BlockItem(BlockRegistry.RED_MUSHROOM_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Brown Mushroom Crate
    public static final RegistryObject<Item> BROWN_MUSHROOM_CRATE = ITEMS.register("brown_mushroom_crate",
            () -> (new BlockItem(BlockRegistry.BROWN_MUSHROOM_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Pufferfish Crate
    public static final RegistryObject<Item> PUFFERFISH_CRATE = ITEMS.register("pufferfish_crate",
            () -> (new BlockItem(BlockRegistry.PUFFERFISH_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Tropical Fish Crate
    public static final RegistryObject<Item> TROPICAL_FISH_CRATE = ITEMS.register("tropical_fish_crate",
            () -> (new BlockItem(BlockRegistry.TROPICAL_FISH_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Pumpkin Slice Crate
    public static final RegistryObject<Item> PUMPKIN_SLICE_CRATE = ITEMS.register("pumpkin_slice_crate",
            () -> (new BlockItem(BlockRegistry.PUMPKIN_SLICE_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Golden Carrot Crate
    public static final RegistryObject<Item> GOLDEN_CARROT_CRATE = ITEMS.register("golden_carrot_crate",
            () -> (new BlockItem(BlockRegistry.GOLDEN_CARROT_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Golden Apple Crate
    public static final RegistryObject<Item> GOLDEN_APPLE_CRATE = ITEMS.register("golden_apple_crate",
            () -> (new BlockItem(BlockRegistry.GOLDEN_APPLE_CRATE.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Bread Bag
    public static final RegistryObject<Item> BREAD_BAG = ITEMS.register("bread_bag",
            () -> (new BlockItem(BlockRegistry.BREAD_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Cookie Bag
    public static final RegistryObject<Item> COOKIE_BAG = ITEMS.register("cookie_bag",
            () -> (new BlockItem(BlockRegistry.COOKIE_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Cocoa Beans Bag
    public static final RegistryObject<Item> COCOABEANS_BAG = ITEMS.register("cocoabeans_bag",
            () -> (new BlockItem(BlockRegistry.COCOABEANS_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Sugar Bag
    public static final RegistryObject<Item> SUGAR_BAG = ITEMS.register("sugar_bag",
            () -> (new BlockItem(BlockRegistry.SUGAR_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Gunpowder Bag
    public static final RegistryObject<Item> GUNPOWDER_BAG = ITEMS.register("gunpowder_bag",
            () -> (new BlockItem(BlockRegistry.GUNPOWDER_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Wheat Seeds Bag
    public static final RegistryObject<Item> WHEAT_SEEDS_BAG = ITEMS.register("wheat_seeds_bag",
            () -> (new BlockItem(BlockRegistry.WHEAT_SEEDS_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Pumpkin Seeds Bag
    public static final RegistryObject<Item> PUMPKIN_SEEDS_BAG = ITEMS.register("pumpkin_seeds_bag",
            () -> (new BlockItem(BlockRegistry.PUMPKIN_SEEDS_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Melon Seeds Bag
    public static final RegistryObject<Item> MELON_SEEDS_BAG = ITEMS.register("melon_seeds_bag",
            () -> (new BlockItem(BlockRegistry.MELON_SEEDS_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    // Beetroot Seeds Bag
    public static final RegistryObject<Item> BEETROOT_SEEDS_BAG = ITEMS.register("beetroot_seeds_bag",
            () -> (new BlockItem(BlockRegistry.BEETROOT_SEEDS_BAG.get(), (new Item.Properties()).tab(CreativeTabRegistry.CREATIVE_MODE_TAB))));

    private static boolean modLoaded(String modName) {
        return ModList.get().isLoaded(modName);
    }
}
