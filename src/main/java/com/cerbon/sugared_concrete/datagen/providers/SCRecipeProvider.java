package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.block.SCBlocks;
import com.cerbon.sugared_concrete.util.SCTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

public class SCRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public SCRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        sugaredConcretePowder(recipeOutput, Blocks.WHITE_CONCRETE_POWDER, SCBlocks.SUGARED_WHITE_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.LIGHT_GRAY_CONCRETE_POWDER, SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.GRAY_CONCRETE_POWDER, SCBlocks.SUGARED_GRAY_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.BLACK_CONCRETE_POWDER, SCBlocks.SUGARED_BLACK_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.BROWN_CONCRETE_POWDER, SCBlocks.SUGARED_BROWN_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.RED_CONCRETE_POWDER, SCBlocks.SUGARED_RED_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.ORANGE_CONCRETE_POWDER, SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.YELLOW_CONCRETE_POWDER, SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.LIME_CONCRETE_POWDER, SCBlocks.SUGARED_LIME_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.GREEN_CONCRETE_POWDER, SCBlocks.SUGARED_GREEN_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.CYAN_CONCRETE_POWDER, SCBlocks.SUGARED_CYAN_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.LIGHT_BLUE_CONCRETE_POWDER, SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.BLUE_CONCRETE_POWDER, SCBlocks.SUGARED_BLUE_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.PURPLE_CONCRETE_POWDER, SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.MAGENTA_CONCRETE_POWDER, SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER.get());
        sugaredConcretePowder(recipeOutput, Blocks.PINK_CONCRETE_POWDER, SCBlocks.SUGARED_PINK_CONCRETE_POWDER.get());
    }

    private void sugaredConcretePowder(RecipeOutput recipeOutput, Block concretePowder, Block result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 8)
                .pattern("ccc")
                .pattern("csc")
                .pattern("ccc")
                .define('c', concretePowder)
                .define('s', Items.SUGAR)
                .group("sugared_concrete_powder")
                .unlockedBy("has_concrete_powder", has(SCTags.CONCRETE_POWDERS))
                .save(recipeOutput);
    }
}
