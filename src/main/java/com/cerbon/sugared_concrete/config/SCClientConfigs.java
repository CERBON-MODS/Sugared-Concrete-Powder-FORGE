package com.cerbon.sugared_concrete.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class SCClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_BLOCK_TOOLTIP;

    static {
        ENABLE_BLOCK_TOOLTIP = BUILDER.define("Enable Block Tooltip", true);

        SPEC = BUILDER.build();
    }
}
