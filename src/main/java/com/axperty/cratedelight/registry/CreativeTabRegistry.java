package com.axperty.cratedelight.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import com.axperty.cratedelight.CrateDelight;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup CREATIVE_MODE_TAB = FabricItemGroupBuilder.build(
            new Identifier(CrateDelight.MOD_ID, "creative_tab"), () -> new ItemStack(BlockRegistry.BERRY_CRATE));
}
