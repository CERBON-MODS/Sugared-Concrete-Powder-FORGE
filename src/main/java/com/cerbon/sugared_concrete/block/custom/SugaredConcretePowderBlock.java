package com.cerbon.sugared_concrete.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SugaredConcretePowderBlock extends FallingBlock {

    public SugaredConcretePowderBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getMapColor(level, pos).col;
    }
}
