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
        SCBlocks.BLOCKS.getEntries().forEach(this::blockWithItem);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
