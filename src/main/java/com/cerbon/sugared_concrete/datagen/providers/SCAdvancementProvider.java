package com.cerbon.sugared_concrete.datagen.providers;

//import com.cerbon.sugared_concrete.SugaredConcrete;
//import com.cerbon.sugared_concrete.util.SCTags;
//import net.minecraft.advancements.Advancement;
//import net.minecraft.advancements.DisplayInfo;
//import net.minecraft.advancements.FrameType;
//import net.minecraft.advancements.critereon.ContextAwarePredicate;
//import net.minecraft.advancements.critereon.InventoryChangeTrigger;
//import net.minecraft.advancements.critereon.ItemPredicate;
//import net.minecraft.advancements.critereon.MinMaxBounds;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.TagKey;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.minecraftforge.common.data.ForgeAdvancementProvider;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.function.Consumer;
//
//public class SCAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {
//
//    @Override
//    public void generate(HolderLookup.@NotNull Provider registries, @NotNull Consumer<Advancement> saver, @NotNull ExistingFileHelper existingFileHelper) {
//        Advancement.Builder.advancement()
//                .parent(new ResourceLocation("husbandry/root"))
//                .addCriterion("has_sugared_concrete_powder", has(SCTags.SUGARED_CONCRETE_POWDERS))
//                .display(
//                        new DisplayInfo(
//                                new ItemStack(Items.SUGAR),
//                                Component.translatable("advancement.sugared_concrete.sugar_coated.title"),
//                                Component.translatable("advancement.sugared_concrete.sugar_coated.description"),
//                                null,
//                                FrameType.GOAL,
//                                true,
//                                true,
//                                false
//                        )
//                )
//                .save(saver, new ResourceLocation(SugaredConcrete.MOD_ID, "sugar_coated"), existingFileHelper);
//    }
//
//    private static InventoryChangeTrigger.TriggerInstance has(TagKey<Item> tag) {
//        return inventoryTrigger(ItemPredicate.Builder.item().of(tag).build());
//    }
//
//    private static InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... predicates) {
//        return new InventoryChangeTrigger.TriggerInstance(ContextAwarePredicate.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, predicates);
//    }
//}
