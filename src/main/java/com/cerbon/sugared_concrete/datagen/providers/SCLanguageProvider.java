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
        add(SCBlocks.SUGARED_WHITE_CONCRETE_POWDER.get(), "Sugared White Concrete Powder");
        add(SCBlocks.SUGARED_ORANGE_CONCRETE_POWDER.get(), "Sugared Orange Concrete Powder");
        add(SCBlocks.SUGARED_MAGENTA_CONCRETE_POWDER.get(), "Sugared Magenta Concrete Powder");
        add(SCBlocks.SUGARED_LIGHT_BLUE_CONCRETE_POWDER.get(), "Sugared Light Blue Concrete Powder");
        add(SCBlocks.SUGARED_YELLOW_CONCRETE_POWDER.get(), "Sugared Yellow Concrete Powder");
        add(SCBlocks.SUGARED_LIME_CONCRETE_POWDER.get(), "Sugared Lime Concrete Powder");
        add(SCBlocks.SUGARED_PINK_CONCRETE_POWDER.get(), "Sugared Pink Concrete Powder");
        add(SCBlocks.SUGARED_GRAY_CONCRETE_POWDER.get(), "Sugared Gray Concrete Powder");
        add(SCBlocks.SUGARED_LIGHT_GRAY_CONCRETE_POWDER.get(), "Sugared Light Gray Concrete Powder");
        add(SCBlocks.SUGARED_CYAN_CONCRETE_POWDER.get(), "Sugared Cyan Concrete Powder");
        add(SCBlocks.SUGARED_PURPLE_CONCRETE_POWDER.get(), "Sugared Purple Concrete Powder");
        add(SCBlocks.SUGARED_BLUE_CONCRETE_POWDER.get(), "Sugared Blue Concrete Powder");
        add(SCBlocks.SUGARED_BROWN_CONCRETE_POWDER.get(), "Sugared Brown Concrete Powder");
        add(SCBlocks.SUGARED_GREEN_CONCRETE_POWDER.get(), "Sugared Green Concrete Powder");
        add(SCBlocks.SUGARED_RED_CONCRETE_POWDER.get(), "Sugared Red Concrete Powder");
        add(SCBlocks.SUGARED_BLACK_CONCRETE_POWDER.get(), "Sugared Black Concrete Powder");
    }
}
