package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.block.SCBlocks;
import com.cerbon.sugared_concrete.util.SCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;


public class SCItemTagProvider extends ItemTagsProvider {

    public SCItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SugaredConcrete.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        SCBlocks.BLOCKS.getEntries().forEach(block -> this.tag(SCTags.CONCRETE_POWDERS).add(block.get().asItem()));
    }
}
