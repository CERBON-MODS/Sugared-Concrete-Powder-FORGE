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
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class SCRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public SCRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> writer) {
        SCBlocks.BLOCKS.getEntries().forEach(block -> sugaredConcretePowder(writer, block.get()));
    }

    private void sugaredConcretePowder(Consumer<FinishedRecipe> finishedRecipeConsumer, Block block) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 8)
                .pattern("ccc")
                .pattern("csc")
                .pattern("ccc")
                .define('c', block.asItem())
                .define('s', Items.SUGAR)
                .group("sugared_concrete_powder")
                .unlockedBy("has_concrete_powder", has(SCTags.CONCRETE_POWDERS))
                .save(finishedRecipeConsumer);
    }
}
