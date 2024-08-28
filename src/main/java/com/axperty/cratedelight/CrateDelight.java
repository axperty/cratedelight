package com.axperty.cratedelight;

import com.axperty.cratedelight.block.BlockList;
import com.axperty.cratedelight.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrateDelight implements ModInitializer {
    public static final String MODID = "cratedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("Crate Delight"))
                .icon(() -> new ItemStack(BlockList.BERRY_CRATE))
                .build());
        BlockRegistry.registerBlocks();
    }
}
