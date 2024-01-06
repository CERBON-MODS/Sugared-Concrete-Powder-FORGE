package com.cerbon.sugared_concrete.datagen.loot;

//import com.cerbon.sugared_concrete.block.SCBlocks;
//import net.minecraft.data.loot.BlockLootSubProvider;
//import net.minecraft.world.flag.FeatureFlags;
//import net.minecraft.world.level.block.Block;
//import net.minecraftforge.registries.RegistryObject;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.Set;
//
//public class SCBlockLootTables extends BlockLootSubProvider {
//
//    public SCBlockLootTables() {
//        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
//    }
//
//    @Override
//    protected void generate() {
//        SCBlocks.BLOCKS.getEntries().forEach(block -> this.dropSelf(block.get()));
//    }
//
//    @Override
//    protected @NotNull Iterable<Block> getKnownBlocks() {
//        return SCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
//    }
//}
