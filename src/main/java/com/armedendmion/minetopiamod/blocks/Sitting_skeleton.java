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


public class Sitting_skeleton extends Block {

    public Sitting_skeleton() {
        super(Properties.of().sound(SoundType.BONE_BLOCK).forceSolidOff().requiresCorrectToolForDrops().strength(1.5F, 6.0F));
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
            default -> Shapes.or(box(0, 0, 0, 15.9, 1.9, 15.9), box(0, 1.9, 0, 15.9, 18.9, 4.9));
            case NORTH -> Shapes.or(box(0, 0, 0, 15.9, 1.9, 15.9), box(0, 1.9, 10.9, 15.9, 18.9, 15.9));
            case EAST -> Shapes.or(box(0, 0, 0, 15.9, 1.9, 15.9), box(0, 1.9, 0, 4.9, 18.9, 15.9));
            case WEST -> Shapes.or(box(0, 0, 0, 15.9, 1.9, 15.9), box(10.9, 1.9, 0, 15.9, 18.9, 15.9));
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
