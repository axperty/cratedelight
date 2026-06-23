package com.axperty.cratedelight.registry;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import com.axperty.cratedelight.CrateDelight;

public class CreativeTabRegistry {
    public static final CreativeModeTab CRATEDELIGHT_ITEMGROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.tryParse(CrateDelight.MODID + ":" + "cratedelight_itemgroup"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cratedelight"))
                    .icon(() -> new ItemStack(BlockRegistry.BERRY_CRATE))
                    .displayItems((displayContext, entries) -> {

                        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                            entries.accept(BlockRegistry.CARROT_CRATE);
                            entries.accept(BlockRegistry.BEETROOT_CRATE);
                            entries.accept(BlockRegistry.POTATO_CRATE);
                        }

                        entries.accept(BlockRegistry.POISONOUS_POTATO_CRATE);
                        entries.accept(BlockRegistry.APPLE_CRATE);
                        entries.accept(BlockRegistry.BERRY_CRATE);
                        entries.accept(BlockRegistry.GLOWBERRY_CRATE);
                        entries.accept(BlockRegistry.EGG_CRATE);
                        entries.accept(BlockRegistry.BROWN_EGG_CRATE);
                        entries.accept(BlockRegistry.BLUE_EGG_CRATE);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                            entries.accept(BlockRegistry.PEANUT_CRATE);
                        }

                        entries.accept(BlockRegistry.SALMON_CRATE);
                        entries.accept(BlockRegistry.COD_CRATE);
                        entries.accept(BlockRegistry.PUFFERFISH_CRATE);
                        entries.accept(BlockRegistry.TROPICAL_FISH_CRATE);
                        entries.accept(BlockRegistry.RED_MUSHROOM_CRATE);
                        entries.accept(BlockRegistry.BROWN_MUSHROOM_CRATE);

                        if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                            entries.accept(BlockRegistry.PUMPKIN_SLICE_CRATE);
                        }

                        entries.accept(BlockRegistry.GOLDEN_CARROT_CRATE);
                        entries.accept(BlockRegistry.GOLDEN_APPLE_CRATE);
                        entries.accept(BlockRegistry.BREAD_BAG);
                        entries.accept(BlockRegistry.COOKIE_BAG);
                        entries.accept(BlockRegistry.COCOABEANS_BAG);
                        entries.accept(BlockRegistry.SUGAR_BAG);
                        entries.accept(BlockRegistry.GUNPOWDER_BAG);
                        entries.accept(BlockRegistry.LEAF_LITTER_BAG);
                        entries.accept(BlockRegistry.WHEAT_SEEDS_BAG);
                        entries.accept(BlockRegistry.PUMPKIN_SEEDS_BAG);
                        entries.accept(BlockRegistry.MELON_SEEDS_BAG);
                        entries.accept(BlockRegistry.BEETROOT_SEEDS_BAG);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                            entries.accept(BlockRegistry.SALT_BAG);
                            entries.accept(BlockRegistry.GROUND_CINNAMON_BAG);
                        }
                    })
                    .build());

    public static void registerItemGroups() {}
}