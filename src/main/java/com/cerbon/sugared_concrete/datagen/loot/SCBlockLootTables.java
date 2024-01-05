package com.cerbon.sugared_concrete.datagen.loot;

import com.cerbon.sugared_concrete.block.SCBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class SCBlockLootTables extends BlockLootSubProvider {

    public SCBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(SCBlocks.SUGARED_WHITE_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_LIME_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_PINK_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_GRAY_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_CYAN_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_BLUE_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_BROWN_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_GREEN_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_RED_CONCRETE_POWDER.get());
        this.dropSelf(SCBlocks.SUGARED_BLACK_CONCRETE_POWDER.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return SCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
