package com.armedendmion.minetopiamod.blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class Computer extends Block {

    public Computer() {
        super(Properties.copy(Blocks.GRAY_CONCRETE).mapColor(MapColor.COLOR_GRAY).sound(SoundType.METAL).noOcclusion());
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
                    box(-1, 4, 4.5, 17, 15.5, 5),
                    box(6, 0, 1, 9, 0.5, 5.5),
                    box(6.6875, 0.5, 2, 8.1875, 3.5, 3.5),
                    box(6.6875, 3, 2.5, 8.1875, 5.5, 4),
                    box(6.6875, 4.5, 3, 8.1875, 6, 4.5),
                    box(-0.5, 5, 5, 16.5, 15, 5.0625),
                    box(3, 0, 7.5, 16, 0.5, 12),
                    box(0.25, -0.0625, 8.4375, 2.25, 0.75, 11.5625));

            case NORTH -> Shapes.or(
                    box(-1, 4, 11, 17, 15.5, 11.5),
                    box(7, 0, 10.5, 10, 0.5, 15),
                    box(7.8125, 0.5, 12.5, 9.3125, 3.5, 14),
                    box(7.8125, 3, 12, 9.3125, 5.5, 13.5),
                    box(7.8125, 4.5, 11.5, 9.3125, 6, 13),
                    box(-0.5, 5, 10.9375, 16.5, 15, 11),
                    box(0, 0, 4, 13, 0.5, 8.5),
                    box(13.75, -0.0625, 4.4375, 15.75, 0.75, 7.5625));

            case EAST -> Shapes.or(
                    box(4.5, 4, -1, 5, 15.5, 17),
                    box(1, 0, 7, 5.5, 0.5, 10),
                    box(2, 0.5, 7.8125, 3.5, 3.5, 9.3125),
                    box(2.5, 3, 7.8125, 4, 5.5, 9.3125),
                    box(3, 4.5, 7.8125, 4.5, 6, 9.3125),
                    box(5, 5, -0.5, 5.0625, 15, 16.5),
                    box(7.5, 0, 0, 12, 0.5, 13),
                    box(8.4375, -0.0625, 13.75, 11.5625, 0.75, 15.75));

            case WEST -> Shapes.or(
                    box(11, 4, -1, 11.5, 15.5, 17),
                    box(10.5, 0, 6, 15, 0.5, 9),
                    box(12.5, 0.5, 6.6875, 14, 3.5, 8.1875),
                    box(12, 3, 6.6875, 13.5, 5.5, 8.1875),
                    box(11.5, 4.5, 6.6875, 13, 6, 8.1875),
                    box(10.9375, 5, -0.5, 11, 15, 16.5),
                    box(4, 0, 3, 8.5, 0.5, 16),
                    box(4.4375, -0.0625, 0.25, 7.5625, 0.75, 2.25));
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
