package com.axperty.cratedelight.registry;

import com.axperty.cratedelight.CrateDelight;
import com.axperty.cratedelight.block.BlockList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
public class BlockRegistry {

    public static void registerBlocks() {
        // Apple Crate Registry
        BlockList.APPLE_CRATE = block("apple_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Berry Crate Registry
        BlockList.BERRY_CRATE = block("berry_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Glowberry Crate Registry
        BlockList.GLOWBERRY_CRATE = block("glowberry_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Egg Crate Registry
        BlockList.EGG_CRATE = block("egg_crate",
                new Block(blockSettings(2.0f, 3.0f, BlockSoundGroup.WOOD)));

        // Cocoa Beans Bag Registry
        BlockList.COCOABEANS_BAG = block("cocoabeans_bag",
                new Block(blockSettings(.8f, .8f, BlockSoundGroup.WOOL)));

        // Sugar Bag Registry
        BlockList.SUGAR_BAG = block("sugar_bag",
                new Block(blockSettings(.8f, .8f, BlockSoundGroup.WOOL)));

    }
    private static FabricBlockSettings blockSettings(float hardness, float resistance, BlockSoundGroup sound) {
        return FabricBlockSettings.create().strength(hardness, resistance).sounds(sound);
    }

    private static FabricBlockSettings cropSettings() {
        return FabricBlockSettings.copyOf(Blocks.WHEAT).sounds(BlockSoundGroup.CROP).breakInstantly().ticksRandomly().noCollision().nonOpaque();
    }

    private static Block block(String name, Block block) {
        blockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CrateDelight.MODID, name), block);
    }

    private static Item blockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(CrateDelight.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(CrateDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Block withoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(CrateDelight.MODID, name), block);
    }
}
