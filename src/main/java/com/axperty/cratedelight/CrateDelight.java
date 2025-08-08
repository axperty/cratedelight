package com.axperty.cratedelight;

import com.mojang.logging.LogUtils;
import com.axperty.cratedelight.registry.BlockRegistry;
import com.axperty.cratedelight.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrateDelight.MOD_ID)
public class CrateDelight {
    public static final String MOD_ID = "cratedelight";
    public static final CreativeModeTab ITEM_GROUP = new VCItemGroup(CrateDelight.MOD_ID);
    private static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static class VCItemGroup extends CreativeModeTab {
        public VCItemGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemRegistry.BERRY_CRATE.get().getDefaultInstance();
        }
    }
}
