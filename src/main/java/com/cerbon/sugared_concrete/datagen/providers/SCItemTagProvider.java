package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.util.SCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ConcretePowderBlock;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.CompletableFuture;


public class SCItemTagProvider extends ItemTagsProvider {

    public SCItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SugaredConcrete.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        ForgeRegistries.BLOCKS.getEntries().stream()
                .map(Map.Entry::getValue)
                .filter(ConcretePowderBlock.class::isInstance)
                .forEach(block -> this.tag(SCTags.CONCRETE_POWDERS).add(block.asItem()));
    }
}
