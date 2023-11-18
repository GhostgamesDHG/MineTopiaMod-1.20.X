package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class ParkingSign extends Lantaarn {

    public ParkingSign() {
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        state.getValue(FACING);
        return box(0, 0, 0, 16, 16, 16);
    }
}
