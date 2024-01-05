package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.util.SCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;


public class SCItemTagProvider extends ItemTagsProvider {

    public SCItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SugaredConcrete.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(SCTags.CONCRETE_POWDERS)
                .add(
                        Blocks.WHITE_CONCRETE_POWDER.asItem(),
                        Blocks.ORANGE_CONCRETE_POWDER.asItem(),
                        Blocks.MAGENTA_CONCRETE_POWDER.asItem(),
                        Blocks.LIGHT_BLUE_CONCRETE_POWDER.asItem(),
                        Blocks.YELLOW_CONCRETE_POWDER.asItem(),
                        Blocks.LIME_CONCRETE_POWDER.asItem(),
                        Blocks.PINK_CONCRETE_POWDER.asItem(),
                        Blocks.GRAY_CONCRETE_POWDER.asItem(),
                        Blocks.LIGHT_GRAY_CONCRETE_POWDER.asItem(),
                        Blocks.CYAN_CONCRETE_POWDER.asItem(),
                        Blocks.PURPLE_CONCRETE_POWDER.asItem(),
                        Blocks.BLUE_CONCRETE_POWDER.asItem(),
                        Blocks.BROWN_CONCRETE_POWDER.asItem(),
                        Blocks.GREEN_CONCRETE_POWDER.asItem(),
                        Blocks.RED_CONCRETE_POWDER.asItem(),
                        Blocks.BLACK_CONCRETE_POWDER.asItem()
                );
    }
}
