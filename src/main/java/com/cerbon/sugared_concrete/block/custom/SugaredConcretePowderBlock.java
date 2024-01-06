package com.cerbon.sugared_concrete.block.custom;

import com.cerbon.sugared_concrete.config.SCClientConfigs;
import com.mojang.serialization.MapCodec;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SugaredConcretePowderBlock extends FallingBlock {
    public static final MapCodec<SugaredConcretePowderBlock> CODEC = simpleCodec(SugaredConcretePowderBlock::new);

    public SugaredConcretePowderBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        if (SCClientConfigs.ENABLE_BLOCK_TOOLTIP.get())
            tooltip.add(Component.translatable("block.sugared_concrete.sugared_concrete_powder_block.tooltip").withStyle(ChatFormatting.DARK_GRAY));
    }

    @Override
    public int getDustColor(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
        return state.getMapColor(level, pos).col;
    }
}
