package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.block.SCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SCBlockTagProvider extends BlockTagsProvider {

    public SCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SugaredConcrete.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        SCBlocks.BLOCKS.getEntries().forEach(block -> this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block.get()));
    }
}
