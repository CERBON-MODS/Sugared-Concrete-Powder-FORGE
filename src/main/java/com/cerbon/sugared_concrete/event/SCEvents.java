package com.cerbon.sugared_concrete.event;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.block.SCBlocks;
import com.cerbon.sugared_concrete.datagen.providers.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SugaredConcrete.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SCEvents {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        SCBlockTagProvider blockTagProvider = generator.addProvider(event.includeServer(), new SCBlockTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(), new SCItemTagProvider(packOutput, lookupProvider, blockTagProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new SCRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), SCLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new SCBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new SCLanguageProvider(packOutput));
    }

    @SubscribeEvent
    public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS)
            SCBlocks.BLOCKS.getEntries().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
    }
}
