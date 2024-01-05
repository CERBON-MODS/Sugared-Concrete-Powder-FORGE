package com.cerbon.sugared_concrete.block;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.block.custom.SugaredConcretePowderBlock;
import com.cerbon.sugared_concrete.item.SCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SCBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SugaredConcrete.MOD_ID);

    public static final RegistryObject<Block> SUGARED_WHITE_CONCRETE_POWDER      = registerBlockWithItem("sugared_white_concrete_powder",      () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_ORANGE_CONCRETE_POWDER     = registerBlockWithItem("sugared_orange_concrete_powder",     () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_MAGENTA_CONCRETE_POWDER    = registerBlockWithItem("sugared_magenta_concrete_powder",    () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_LIGHT_BLUE_CONCRETE_POWDER = registerBlockWithItem("sugared_light_blue_concrete_powder", () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_YELLOW_CONCRETE_POWDER     = registerBlockWithItem("sugared_yellow_concrete_powder",     () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_LIME_CONCRETE_POWDER       = registerBlockWithItem("sugared_lime_concrete_powder",       () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_PINK_CONCRETE_POWDER       = registerBlockWithItem("sugared_pink_concrete_powder",       () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_GRAY_CONCRETE_POWDER       = registerBlockWithItem("sugared_gray_concrete_powder",       () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_LIGHT_GRAY_CONCRETE_POWDER = registerBlockWithItem("sugared_light_gray_concrete_powder", () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_CYAN_CONCRETE_POWDER       = registerBlockWithItem("sugared_cyan_concrete_powder",       () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_PURPLE_CONCRETE_POWDER     = registerBlockWithItem("sugared_purple_concrete_powder",     () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_BLUE_CONCRETE_POWDER       = registerBlockWithItem("sugared_blue_concrete_powder",       () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_BROWN_CONCRETE_POWDER      = registerBlockWithItem("sugared_brown_concrete_powder",      () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_GREEN_CONCRETE_POWDER      = registerBlockWithItem("sugared_green_concrete_powder",      () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_RED_CONCRETE_POWDER        = registerBlockWithItem("sugared_red_concrete_powder",        () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE_POWDER)));
    public static final RegistryObject<Block> SUGARED_BLACK_CONCRETE_POWDER      = registerBlockWithItem("sugared_black_concrete_powder",      () -> new SugaredConcretePowderBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE_POWDER)));

    private static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> block) {
        RegistryObject<T> blockRegistry = BLOCKS.register(name, block);
        SCItems.ITEMS.register(name, () -> new BlockItem(blockRegistry.get(), new Item.Properties()));
        return blockRegistry;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
