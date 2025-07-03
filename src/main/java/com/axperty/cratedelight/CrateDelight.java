package com.axperty.cratedelight;

import com.axperty.cratedelight.registry.BlockRegistry;
import com.axperty.cratedelight.registry.CreativeTabRegistry;
import com.axperty.cratedelight.registry.ItemRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(CrateDelight.MODID)
public class CrateDelight
{
    public static final String MODID = "cratedelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelight(IEventBus modEventBus)
    {
        BlockRegistry.BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
