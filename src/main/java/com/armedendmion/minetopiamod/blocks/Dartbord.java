package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class Dartbord extends DogCot {

    public Dartbord() {
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(
                    box(0, 0, 0, 16, 16, 2));

            case NORTH -> Shapes.or(
                    box(0, 0, 14, 16, 16, 16));

            case EAST -> Shapes.or(
                    box(0, 0, 0, 2, 16, 16));

            case WEST -> Shapes.or(
                    box(14, 0, 0, 16, 16, 16));
        };

    }
}