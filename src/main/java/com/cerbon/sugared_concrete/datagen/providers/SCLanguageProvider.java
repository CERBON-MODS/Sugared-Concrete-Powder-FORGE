package com.cerbon.sugared_concrete.datagen.providers;

import com.cerbon.sugared_concrete.SugaredConcrete;
import com.cerbon.sugared_concrete.block.SCBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class SCLanguageProvider extends LanguageProvider {

    public SCLanguageProvider(PackOutput output) {
        super(output, SugaredConcrete.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(SCBlocks.SUGARED_WHITE_CONCRETE_POWDER.get(), "White Sugared Concrete Powder");
        add(SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER.get(), "Orange Sugared Concrete Powder");
        add(SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER.get(), "Magenta Sugared Concrete Powder");
        add(SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER.get(), "Light Blue Sugared Concrete Powder");
        add(SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER.get(), "Yellow Sugared Concrete Powder");
        add(SCBlocks.SUGARED_LIME_CONCRETE_POWDER.get(), "Lime Sugared Concrete Powder");
        add(SCBlocks.SUGARED_PINK_CONCRETE_POWDER.get(), "Pink Sugared Concrete Powder");
        add(SCBlocks.SUGARED_GRAY_CONCRETE_POWDER.get(), "Gray Sugared Concrete Powder");
        add(SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER.get(), "Light Gray Sugared Concrete Powder");
        add(SCBlocks.SUGARED_CYAN_CONCRETE_POWDER.get(), "Cyan Sugared Concrete Powder");
        add(SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER.get(), "Purple Sugared Concrete Powder");
        add(SCBlocks.SUGARED_BLUE_CONCRETE_POWDER.get(), "Blue Sugared Concrete Powder");
        add(SCBlocks.SUGARED_BROWN_CONCRETE_POWDER.get(), "Brown Sugared Concrete Powder");
        add(SCBlocks.SUGARED_GREEN_CONCRETE_POWDER.get(), "Green Sugared Concrete Powder");
        add(SCBlocks.SUGARED_RED_CONCRETE_POWDER.get(), "Red Sugared Concrete Powder");
        add(SCBlocks.SUGARED_BLACK_CONCRETE_POWDER.get(), "Black Sugared Concrete Powder");

        add("block.sugared_concrete.sugared_concrete_powder_block.tooltip", "Does not harden when touching water");
    }
}
