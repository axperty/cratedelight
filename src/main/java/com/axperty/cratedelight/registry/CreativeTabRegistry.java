package com.axperty.cratedelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRATEDELIGHT_TAB = CREATIVE_MODE_TABS.register("cratedelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cratedelight"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.BERRY_CRATE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                if (!ModList.get().isLoaded("farmersdelight")) {
                    output.accept(BlockRegistry.CARROT_CRATE.get());
                    output.accept(BlockRegistry.BEETROOT_CRATE.get());
                    output.accept(BlockRegistry.POTATO_CRATE.get());
                }

                output.accept(BlockRegistry.POISONOUS_POTATO_CRATE.get());

                output.accept(BlockRegistry.APPLE_CRATE.get());
                output.accept(BlockRegistry.BERRY_CRATE.get());

                if (ModList.get().isLoaded("nutritious_feast")) {
                    output.accept(BlockRegistry.BLUEBERRY_CRATE.get());
                }

                output.accept(BlockRegistry.GLOWBERRY_CRATE.get());
                output.accept(BlockRegistry.EGG_CRATE.get());
                output.accept(BlockRegistry.SALMON_CRATE.get());
                output.accept(BlockRegistry.COD_CRATE.get());

                if (ModList.get().isLoaded("naturalist")) {
                    output.accept(BlockRegistry.DUCK_EGG_CRATE.get());
                    output.accept(BlockRegistry.CATFISH_CRATE.get());
                    output.accept(BlockRegistry.BASS_CRATE.get());
                }

                if (ModList.get().isLoaded("expandeddelight")) {
                    output.accept(BlockRegistry.PEANUT_CRATE.get());
                }

                if (ModList.get().isLoaded("jagmkiwis")) {
                    output.accept(BlockRegistry.KIWI_EGG_CRATE.get());
                    output.accept(BlockRegistry.KIWIFRUIT_CRATE.get());
                }

                if (ModList.get().isLoaded("alexsmobs")) {
                    output.accept(BlockRegistry.EMU_EGG_CRATE.get());
                    output.accept(BlockRegistry.TERRAPIN_EGG_CRATE.get());
                    output.accept(BlockRegistry.CROCODILE_EGG_CRATE.get());
                    output.accept(BlockRegistry.CAIMAN_EGG_CRATE.get());
                    output.accept(BlockRegistry.PLATYPUS_EGG_CRATE.get());
                    output.accept(BlockRegistry.BANANA_CRATE.get());
                }

                output.accept(BlockRegistry.RED_MUSHROOM_CRATE.get());
                output.accept(BlockRegistry.BROWN_MUSHROOM_CRATE.get());

                if (!ModList.get().isLoaded("farmersdelight")) {
                    output.accept(BlockRegistry.PUMPKIN_SLICES_CRATE.get());
                }

                output.accept(BlockRegistry.GOLDEN_CARROT_CRATE.get());
                output.accept(BlockRegistry.GOLDEN_APPLE_CRATE.get());
                output.accept(BlockRegistry.STICKS_CRATE);
                output.accept(BlockRegistry.COCOABEANS_BAG.get());
                output.accept(BlockRegistry.SUGAR_BAG.get());
                output.accept(BlockRegistry.COOKIE_BAG.get());
                output.accept(BlockRegistry.GUNPOWDER_BAG.get());

                if (ModList.get().isLoaded("expandeddelight")) {
                    output.accept(BlockRegistry.SALT_BAG.get());
                    output.accept(BlockRegistry.GROUND_CINNAMON_BAG.get());
                }

                if (ModList.get().isLoaded("create")) {
                    output.accept(BlockRegistry.WHEAT_FLOUR_BAG.get());
                    output.accept(BlockRegistry.POWDERED_OBSIDIAN_BAG.get());
                    output.accept(BlockRegistry.CINDER_FLOUR_BAG.get());
                }
            }).build());
}
