package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.block.SCBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class SCBlockStateProvider extends BlockStateProvider {

    public SCBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SugaredConcrete.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(SCBlocks.SUGARED_WHITE_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_LIME_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_PINK_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_GRAY_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_CYAN_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_BLUE_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_BROWN_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_GREEN_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_RED_CONCRETE_POWDER);
        blockWithItem(SCBlocks.SUGARED_BLACK_CONCRETE_POWDER);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
