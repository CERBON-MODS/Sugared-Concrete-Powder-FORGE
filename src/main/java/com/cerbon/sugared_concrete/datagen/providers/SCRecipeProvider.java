package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.block.SCBlocks;
import com.cerbon.sugared_concrete.util.SCTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class SCRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public SCRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> writer) {
        sugaredConcretePowder(writer, Blocks.WHITE_CONCRETE_POWDER, SCBlocks.SUGARED_WHITE_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.LIGHT_GRAY_CONCRETE_POWDER, SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.GRAY_CONCRETE_POWDER, SCBlocks.SUGARED_GRAY_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.BLACK_CONCRETE_POWDER, SCBlocks.SUGARED_BLACK_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.BROWN_CONCRETE_POWDER, SCBlocks.SUGARED_BROWN_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.RED_CONCRETE_POWDER, SCBlocks.SUGARED_RED_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.ORANGE_CONCRETE_POWDER, SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.YELLOW_CONCRETE_POWDER, SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.LIME_CONCRETE_POWDER, SCBlocks.SUGARED_LIME_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.GREEN_CONCRETE_POWDER, SCBlocks.SUGARED_GREEN_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.CYAN_CONCRETE_POWDER, SCBlocks.SUGARED_CYAN_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.LIGHT_BLUE_CONCRETE_POWDER, SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.BLUE_CONCRETE_POWDER, SCBlocks.SUGARED_BLUE_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.PURPLE_CONCRETE_POWDER, SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.MAGENTA_CONCRETE_POWDER, SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER.get());
        sugaredConcretePowder(writer, Blocks.PINK_CONCRETE_POWDER, SCBlocks.SUGARED_PINK_CONCRETE_POWDER.get());
    }

    private void sugaredConcretePowder(Consumer<FinishedRecipe> finishedRecipeConsumer, Block concretePowder, Block result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 8)
                .pattern("ccc")
                .pattern("csc")
                .pattern("ccc")
                .define('c', concretePowder)
                .define('s', Items.SUGAR)
                .group("sugared_concrete_powder")
                .unlockedBy("has_concrete_powder", has(SCTags.CONCRETE_POWDERS))
                .save(finishedRecipeConsumer);
    }
}
