//package com.axperty.cratedelight.event;
//
//import com.axperty.cratedelight.CrateDelight;
//import com.axperty.cratedelight.registry.BlockRegistry;
//import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.server.packs.resources.ResourceProvider;
//import net.minecraft.world.entity.npc.villager.VillagerProfession;
//import net.minecraft.world.entity.npc.villager.VillagerTrades;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.level.ItemLike;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.common.EventBusSubscriber;
//import net.neoforged.neoforge.common.BasicItemListing;
//import net.neoforged.neoforge.event.village.VillagerTradesEvent;
//
//import javax.annotation.ParametersAreNonnullByDefault;
//import java.util.List;
//
//@EventBusSubscriber(modid = CrateDelight.MODID)
//@ParametersAreNonnullByDefault
//public class VillagerEvents {
//    public VillagerEvents()
//    {
//
//    }
//
//    @SubscribeEvent
//    public static void onVillagerTrades(VillagerTradesEvent event) {
//        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//        ResourceKey<VillagerProfession> profession = event.getType();
//
//        if (profession.equals(VillagerProfession.FARMER)) {
//            trades.get(1).add(emeraldForItemsTrade(BlockRegistry.CARROT_CRATE.get(), 3, 1, 2));
//            trades.get(1).add(emeraldForItemsTrade(BlockRegistry.POTATO_CRATE.get(), 3, 1, 2));
//            trades.get(1).add(emeraldForItemsTrade(BlockRegistry.APPLE_CRATE.get(), 3, 1, 2));
//        }
//    }
//
//    public static BasicItemListing emeraldForItemsTrade(ItemLike item, int count, int maxTrades, int xp) {
//        return new BasicItemListing(new ItemStack(item, count), new ItemStack(Items.EMERALD,  9), maxTrades, xp, 0.05F);
//    }
//
//    public static BasicItemListing itemForEmeraldTrade(ItemLike item, int count, int maxTrades, int xp) {
//        return new BasicItemListing(9, new ItemStack(item, count), maxTrades, xp, 0.05F);
//    }
//}
