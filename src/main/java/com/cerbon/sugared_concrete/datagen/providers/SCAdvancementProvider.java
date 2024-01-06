package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.util.SCTags;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class SCAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {

    @Override
    public void generate(HolderLookup.@NotNull Provider registries, @NotNull Consumer<AdvancementHolder> saver, @NotNull ExistingFileHelper existingFileHelper) {
        Advancement.Builder.advancement()
                .parent(new ResourceLocation("husbandry/root"))
                .addCriterion("has_sugared_concrete_powder", has(SCTags.SUGARED_CONCRETE_POWDERS))
                .display(
                        new DisplayInfo(
                                new ItemStack(Items.SUGAR),
                                Component.translatable("advancement.sugared_concrete.sugar_coated.title"),
                                Component.translatable("advancement.sugared_concrete.sugar_coated.description"),
                                null,
                                AdvancementType.GOAL,
                                true,
                                true,
                                false
                        )
                )
                .save(saver, new ResourceLocation(SugaredConcrete.MOD_ID, "sugar_coated"));
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> has(TagKey<Item> pTag) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(pTag));
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryTrigger(ItemPredicate.Builder... items) {
        return inventoryTrigger(Arrays.stream(items).map(ItemPredicate.Builder::build).toArray(ItemPredicate[]::new));
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryTrigger(ItemPredicate... predicates) {
        return CriteriaTriggers.INVENTORY_CHANGED.createCriterion(new InventoryChangeTrigger.TriggerInstance(Optional.empty(), InventoryChangeTrigger.TriggerInstance.Slots.ANY, List.of(predicates)));
    }
}
