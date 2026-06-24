package com.axperty.cratedelight.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.axperty.cratedelight.CrateDelight;

public class CreativeTabRegistry {
    public static final ItemGroup CRATEDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(CrateDelight.MODID + ":" + "cratedelight_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.cratedelight"))
                    .icon(() -> new ItemStack(BlockRegistry.BERRY_CRATE))
                    .entries((displayContext, entries) -> {

                        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                            entries.add(BlockRegistry.CARROT_CRATE);
                            entries.add(BlockRegistry.BEETROOT_CRATE);
                            entries.add(BlockRegistry.POTATO_CRATE);
                        }

                        entries.add(BlockRegistry.POISONOUS_POTATO_CRATE);
                        entries.add(BlockRegistry.APPLE_CRATE);
                        entries.add(BlockRegistry.BERRY_CRATE);
                        entries.add(BlockRegistry.GLOWBERRY_CRATE);
                        entries.add(BlockRegistry.EGG_CRATE);

                        entries.add(BlockRegistry.SALMON_CRATE);
                        entries.add(BlockRegistry.COD_CRATE);
                        entries.add(BlockRegistry.PUFFERFISH_CRATE);
                        entries.add(BlockRegistry.TROPICAL_FISH_CRATE);
                        entries.add(BlockRegistry.RED_MUSHROOM_CRATE);
                        entries.add(BlockRegistry.BROWN_MUSHROOM_CRATE);

                        if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                            entries.add(BlockRegistry.PUMPKIN_SLICE_CRATE);
                        }

                        entries.add(BlockRegistry.GOLDEN_CARROT_CRATE);
                        entries.add(BlockRegistry.GOLDEN_APPLE_CRATE);
                        entries.add(BlockRegistry.BREAD_BAG);
                        entries.add(BlockRegistry.COOKIE_BAG);
                        entries.add(BlockRegistry.COCOABEANS_BAG);
                        entries.add(BlockRegistry.SUGAR_BAG);
                        entries.add(BlockRegistry.GUNPOWDER_BAG);
                        entries.add(BlockRegistry.WHEAT_SEEDS_BAG);
                        entries.add(BlockRegistry.PUMPKIN_SEEDS_BAG);
                        entries.add(BlockRegistry.MELON_SEEDS_BAG);
                        entries.add(BlockRegistry.BEETROOT_SEEDS_BAG);
                    })
                    .build());

    public static void registerItemGroups() {}
}