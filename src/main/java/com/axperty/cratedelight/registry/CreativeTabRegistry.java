package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrateDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRATEDELIGHT_TAB = CREATIVE_MODE_TABS.register(CrateDelight.MOD_ID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup.cratedelight"))
            .icon(() -> ItemRegistry.BERRY_CRATE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, pOutput) -> {
                if (!ModList.get().isLoaded("farmersdelight")) {
                    pOutput.accept(BlockRegistry.CARROT_CRATE.get());
                    pOutput.accept(BlockRegistry.POTATO_CRATE.get());
                    pOutput.accept(BlockRegistry.BEETROOT_CRATE.get());
                }

                pOutput.accept(BlockRegistry.APPLE_CRATE.get());
                pOutput.accept(BlockRegistry.BERRY_CRATE.get());

                pOutput.accept(BlockRegistry.GLOWBERRY_CRATE.get());
                pOutput.accept(BlockRegistry.EGG_CRATE.get());
                pOutput.accept(BlockRegistry.SALMON_CRATE.get());
                pOutput.accept(BlockRegistry.COD_CRATE.get());

                pOutput.accept(BlockRegistry.RED_MUSHROOM_CRATE.get());
                pOutput.accept(BlockRegistry.BROWN_MUSHROOM_CRATE.get());
                pOutput.accept(BlockRegistry.GOLDEN_CARROT_CRATE.get());
                pOutput.accept(BlockRegistry.GOLDEN_APPLE_CRATE.get());
                pOutput.accept(BlockRegistry.COCOABEANS_BAG.get());
                pOutput.accept(BlockRegistry.SUGAR_BAG.get());
                pOutput.accept(BlockRegistry.GUNPOWDER_BAG.get());
                pOutput.accept(BlockRegistry.COOKIE_BAG.get());
            }).build());
}