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
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(
                        SCBlocks.SUGARED_WHITE_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_LIME_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_PINK_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_GRAY_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_CYAN_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_BLUE_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_BROWN_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_GREEN_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_RED_CONCRETE_POWDER.get(),
                        SCBlocks.SUGARED_BLACK_CONCRETE_POWDER.get()
                );
    }
}
