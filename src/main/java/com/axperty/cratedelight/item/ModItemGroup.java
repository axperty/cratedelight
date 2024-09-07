package com.axperty.cratedelight.item;

import com.axperty.cratedelight.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import com.axperty.cratedelight.CrateDelight;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATIVE_MODE_TAB = FabricItemGroupBuilder.build(
            new Identifier(CrateDelight.MOD_ID, "creative_tab"), () -> new ItemStack(ModBlocks.BERRY_CRATE));
}
