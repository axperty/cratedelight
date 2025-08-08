package com.axperty.cratedelight;

import com.axperty.cratedelight.registry.BlockRegistry;
import com.axperty.cratedelight.registry.CreativeTabRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrateDelight implements ModInitializer {
    public static final String MODID = "cratedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.debug("[Crate Delight]: Registering blocks...");
        CreativeTabRegistry.registerItemGroups();
        BlockRegistry.registerModBlocks();
        LOGGER.debug("[Crate Delight]: Blocks registered successfully!");
    }
}
