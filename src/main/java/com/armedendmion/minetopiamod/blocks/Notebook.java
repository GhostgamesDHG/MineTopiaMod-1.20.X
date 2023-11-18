package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class Notebook extends Computer {

    public Notebook() {

    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(
                    box(1.5, 0, 4.15, 14.6, 0.2, 13.15));

            case NORTH -> Shapes.or(
                    box(1.4, 0, 2.91481, 14.5, 0.2, 11.91481));

            case EAST -> Shapes.or(
                    box(3.6, 0, 1.5, 12.6, 0.2, 14.6));

            case WEST -> Shapes.or(
                    box(3.5, 0, 1.5, 12.5, 0.2, 14.6));
        };

    }
}
