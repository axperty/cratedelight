package com.axperty.cratedelight.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class UtilRegistries {

    private static void renderLayer(Block block, RenderLayer layer) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
    }
}
