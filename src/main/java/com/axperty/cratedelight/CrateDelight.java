package com.axperty.cratedelight;

import com.axperty.cratedelight.block.ModBlocks;
import com.axperty.cratedelight.item.ModCreativeModTabs;
import com.axperty.cratedelight.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrateDelight.MOD_ID)
public class CrateDelight {
    public static final String MOD_ID = "cratedelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelight(FMLJavaModLoadingContext context) {
        LOGGER.debug("[Crate Delight]: Registering blocks...");
        IEventBus modEventBus = context.getModEventBus();
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.debug("[Crate Delight]: Blocks registered successfully!");
    }
}
