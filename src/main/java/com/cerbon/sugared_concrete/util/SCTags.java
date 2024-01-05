package com.cerbon.sugared_concrete.util;

import com.cerbon.sugared_concrete.SugaredConcrete;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SCTags {
    public static final TagKey<Item> CONCRETE_POWDERS = ItemTags.create(new ResourceLocation(SugaredConcrete.MOD_ID, "concrete_powders"));
}
