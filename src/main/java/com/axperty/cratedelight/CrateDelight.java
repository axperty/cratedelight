package com.axperty.cratedelight;

import com.axperty.cratedelight.registry.BlockRegistry;
import com.axperty.cratedelight.registry.CreativeTabRegistry;
import com.axperty.cratedelight.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrateDelight.MOD_ID)
public class CrateDelight {
    public static final String MOD_ID = "cratedelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelight(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        BlockRegistry.BLOCKS.register(modBusGroup);
        ItemRegistry.ITEMS.register(modBusGroup);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modBusGroup);
    }
}
