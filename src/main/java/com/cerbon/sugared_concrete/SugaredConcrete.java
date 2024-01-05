package com.cerbon.sugared_concrete;

import com.cerbon.sugared_concrete.block.SCBlocks;
import com.cerbon.sugared_concrete.item.SCItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SugaredConcrete.MOD_ID)
public class SugaredConcrete {
    public static final String MOD_ID = "sugared_concrete";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SugaredConcrete() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SCBlocks.register(modEventBus);
        SCItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
