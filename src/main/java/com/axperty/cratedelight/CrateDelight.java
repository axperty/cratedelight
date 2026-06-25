package com.axperty.cratedelight;

import com.axperty.cratedelight.registry.BlockRegistry;
import com.axperty.cratedelight.registry.CreativeTabRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrateDelight implements ModInitializer {
	public static final String MOD_ID = "cratedelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CreativeTabRegistry.registerCreativeTabs();
		BlockRegistry.registerModBlocks();
		LOGGER.info("Crate Delight loaded");
	}
}
