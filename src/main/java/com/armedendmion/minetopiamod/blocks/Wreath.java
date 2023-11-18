package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class Wreath extends ChristmasGarlands {

    public Wreath() {
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(0, 1, 0, 16, 17, 4);
            case NORTH -> box(0, 1, 12, 16, 17, 16);
            case EAST -> box(0, 1, 0, 4, 17, 16);
            case WEST -> box(12, 1, 0, 16, 17, 16);
        };
    }
}
