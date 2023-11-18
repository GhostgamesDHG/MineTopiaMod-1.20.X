package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class WallLight extends Lantaarn {

    public WallLight() {
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(
                    box(6, 6, 0, 10, 14, 12));

            case NORTH -> Shapes.or(
                    box(6, 6, 4, 10, 14, 16));

            case EAST -> Shapes.or(
                    box(0, 6, 6, 12, 14, 10));

            case WEST -> Shapes.or(
                    box(4, 6, 6, 16, 14, 10));
        };

    }
}