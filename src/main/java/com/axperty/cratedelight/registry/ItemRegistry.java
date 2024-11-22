package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Carrot Crate
    public static final RegistryObject<Item> CARROT_CRATE_ITEM = ITEMS.register("carrot_crate",
            () -> new BlockItem(BlockRegistry.CARROT_CRATE.get(), new Item.Properties().setId(ITEMS.key("carrot_crate")))
    );

    // Potato Crate
    public static final RegistryObject<Item> POTATO_CRATE_ITEM = ITEMS.register("potato_crate",
            () -> new BlockItem(BlockRegistry.POTATO_CRATE.get(), new Item.Properties().setId(ITEMS.key("potato_crate")))
    );

    // Beetroot Crate
    public static final RegistryObject<Item> BEETROOT_CRATE_ITEM = ITEMS.register("beetroot_crate",
            () -> new BlockItem(BlockRegistry.BEETROOT_CRATE.get(), new Item.Properties().setId(ITEMS.key("beetroot_crate")))
    );

    // Apple Crate
    public static final RegistryObject<Item> APPLE_CRATE_ITEM = ITEMS.register("apple_crate",
            () -> new BlockItem(BlockRegistry.APPLE_CRATE.get(), new Item.Properties().setId(ITEMS.key("apple_crate")))
    );

    // Berry Crate
    public static final RegistryObject<Item> BERRY_CRATE_ITEM = ITEMS.register("berry_crate",
            () -> new BlockItem(BlockRegistry.BERRY_CRATE.get(), new Item.Properties().setId(ITEMS.key("berry_crate")))
    );

    // Glow Berry Crate
    public static final RegistryObject<Item> GLOWBERRY_CRATE_ITEM = ITEMS.register("glowberry_crate",
            () -> new BlockItem(BlockRegistry.GLOWBERRY_CRATE.get(), new Item.Properties().setId(ITEMS.key("glowberry_crate")))
    );

    // Egg Crate
    public static final RegistryObject<Item> EGG_CRATE_ITEM = ITEMS.register("egg_crate",
            () -> new BlockItem(BlockRegistry.EGG_CRATE.get(), new Item.Properties().setId(ITEMS.key("egg_crate")))
    );

    // Salmon Crate
    public static final RegistryObject<Item> SALMON_CRATE_ITEM = ITEMS.register("salmon_crate",
            () -> new BlockItem(BlockRegistry.SALMON_CRATE.get(), new Item.Properties().setId(ITEMS.key("salmon_crate")))
    );

    // Cod Crate
    public static final RegistryObject<Item> COD_CRATE_ITEM = ITEMS.register("cod_crate",
            () -> new BlockItem(BlockRegistry.COD_CRATE.get(), new Item.Properties().setId(ITEMS.key("cod_crate")))
    );

    // Red Mushroom Crate
    public static final RegistryObject<Item> RED_MUSHROOM_CRATE_ITEM = ITEMS.register("red_mushroom_crate",
            () -> new BlockItem(BlockRegistry.RED_MUSHROOM_CRATE.get(), new Item.Properties().setId(ITEMS.key("red_mushroom_crate")))
    );

    // Brown Mushroom Crate
    public static final RegistryObject<Item> BROWN_MUSHROOM_CRATE_ITEM = ITEMS.register("brown_mushroom_crate",
            () -> new BlockItem(BlockRegistry.BROWN_MUSHROOM_CRATE.get(), new Item.Properties().setId(ITEMS.key("brown_mushroom_crate")))
    );

    // Golden Carrot Crate
    public static final RegistryObject<Item> GOLDEN_CARROT_CRATE_ITEM = ITEMS.register("golden_carrot_crate",
            () -> new BlockItem(BlockRegistry.GOLDEN_CARROT_CRATE.get(), new Item.Properties().setId(ITEMS.key("golden_carrot_crate")))
    );

    // Golden Apple Crate
    public static final RegistryObject<Item> GOLDEN_APPLE_CRATE_ITEM = ITEMS.register("golden_apple_crate",
            () -> new BlockItem(BlockRegistry.GOLDEN_APPLE_CRATE.get(), new Item.Properties().setId(ITEMS.key("golden_apple_crate")))
    );

    // Cocoa Beans Bag
    public static final RegistryObject<Item> COCOABEANS_BAG_ITEM = ITEMS.register("cocoabeans_bag",
            () -> new BlockItem(BlockRegistry.COCOABEANS_BAG.get(), new Item.Properties().setId(ITEMS.key("cocoabeans_bag")))
    );

    // Sugar Bag
    public static final RegistryObject<Item> SUGAR_BAG_ITEM = ITEMS.register("sugar_bag",
            () -> new BlockItem(BlockRegistry.SUGAR_BAG.get(), new Item.Properties().setId(ITEMS.key("sugar_bag")))
    );

    // Gunpowder Bag
    public static final RegistryObject<Item> GUNPOWDER_BAG_ITEM = ITEMS.register("gunpowder_bag",
            () -> new BlockItem(BlockRegistry.GUNPOWDER_BAG.get(), new Item.Properties().setId(ITEMS.key("gunpowder_bag")))
    );

    // Cookie Bag
    public static final RegistryObject<Item> COOKIE_BAG_ITEM = ITEMS.register("cookie_bag",
            () -> new BlockItem(BlockRegistry.COOKIE_BAG.get(), new Item.Properties().setId(ITEMS.key("cookie_bag")))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
