package com.armedendmion.minetopiamod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class ChristmasGarlands extends Block {

    public ChristmasGarlands() {
        super(Properties.copy(Blocks.OAK_LEAVES).noOcclusion().strength(1.5F, 6.0F));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));

    }
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;


    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(
                    box(11.06985, 7.37849, -1, 17.06985, 11.37849, 3),
                    box(-0.79045, 7.37849, -1, 5.20955, 11.37849, 3),
                    box(4.1397, 6, -1, 12.1397, 10, 3));

            case NORTH -> Shapes.or(
                    box(-0.93015, 7.37849, 12, 5.06985, 11.37849, 16),
                    box(10.93015, 7.37849, 12, 16.93015, 11.37849, 16),
                    box(4, 6, 12, 12, 10, 16));

            case EAST -> Shapes.or(
                    box(-0.93015, 7.37849, -1, 3.06985, 11.37849, 5),
                    box(-0.93015, 7.37849, 10.8603, 3.06985, 11.37849, 16.8603),
                    box(-0.93015, 6, 3.93015, 3.06985, 10, 11.93015));

            case WEST -> Shapes.or(                        
                    box(13.06985, 7.37849, 11, 17.06985, 11.37849, 17),
                    box(13.06985, 7.37849, -0.8603, 17.06985, 11.37849, 5.1397),
                    box(13.06985, 6, 4.06985, 17.06985, 10, 12.06985));
        };

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }


}
