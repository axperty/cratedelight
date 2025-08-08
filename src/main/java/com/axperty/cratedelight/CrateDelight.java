package com.axperty.cratedelight;

import com.axperty.cratedelight.item.BlockRegistry;
import com.axperty.cratedelight.item.CreativeTabRegistry;
import com.axperty.cratedelight.item.ItemRegistry;
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

    public CrateDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(modEventBus);
        ItemRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
