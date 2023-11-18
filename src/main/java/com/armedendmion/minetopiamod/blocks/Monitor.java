package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class Monitor extends Computer {

    public Monitor() {

    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(
                    box(-1, 4, 4.5, 17, 15.5, 5),
                    box(6, 0, 1, 9, 0.5, 5.5),
                    box(6.6875, 0.5, 2, 8.1875, 3.5, 3.5));

            case NORTH -> Shapes.or(
                    box(-1, 4, 11, 17, 15.5, 11.5),
                    box(7, 0, 10.5, 10, 0.5, 15),
                    box(7.8125, 0.5, 12.5, 9.3125, 3.5, 14));

            case EAST -> Shapes.or(
                    box(4.5, 4, -1, 5, 15.5, 17),
                    box(1, 0, 7, 5.5, 0.5, 10),
                    box(2, 0.5, 7.8125, 3.5, 3.5, 9.3125));

            case WEST -> Shapes.or(
                    box(11, 4, -1, 11.5, 15.5, 17),
                    box(10.5, 0, 6, 15, 0.5, 9),
                    box(12.5, 0.5, 6.6875, 14, 3.5, 8.1875));
        };

    }
}
