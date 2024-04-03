package com.armedendmion.minetopiamod.blocks.crops;

import com.armedendmion.minetopiamod.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;

public class WeedBlock extends CropBlock {
    public static final int FIRST_STAGE_MAX_AGE = 7;
    public static final int SECOND_STAGE_MAX_AGE = 1;

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), //0
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), //1
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), //2
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), //3
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),//4
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), //5
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),//6
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),//7
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};//8


    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 8);

    public WeedBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_AGE[this.getAge(pState)];
    }

    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
    if (!pLevel.isAreaLoaded(pPos,1)) return;;
    if (pLevel.getRawBrightness(pPos, 0) >= 9) { //is brightness 9 or above
        int currentAge = this.getAge(pState);

        if (currentAge < this.getMaxAge()) {
            float growthspeed = getGrowthSpeed(this, pLevel, pPos);

            if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(pLevel, pPos, pState, pRandom.nextInt((int) (25.0 / growthspeed) +1) ==0)) {
                if (currentAge == FIRST_STAGE_MAX_AGE) {
                    if (pLevel.getBlockState(pPos.above(1)).is(Blocks.AIR)) {
                        pLevel.setBlock(pPos.above(1), this.getStateForAge(currentAge +1), 2);
                    }
                } else {
                    pLevel.setBlock(pPos, this.getStateForAge(currentAge +1), 2);
                }

                net.minecraftforge.common.ForgeHooks.onCropsGrowPost(pLevel, pPos, pState);
            }
        }
    }
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return super.mayPlaceOn(state, world, pos);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return false;
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return super.canSurvive(pState, pLevel, pPos) || (pLevel.getBlockState(pPos.below(1)).is(this) &&
                pLevel.getBlockState(pPos.below(1)).getValue(AGE) == 7);
    }

    @Override
    public void growCrops(Level pLevel, BlockPos pPos, BlockState pState) {
        int nextAge = this.getAge(pState) + this.getBonemealAgeIncrease(pLevel);
        int maxAge = this.getMaxAge();
        if(nextAge > maxAge) {
            nextAge = maxAge;
        }

        if(this.getAge(pState) == FIRST_STAGE_MAX_AGE && pLevel.getBlockState(pPos.above(1)).is(Blocks.AIR)) {
            pLevel.setBlock(pPos.above(1), this.getStateForAge(nextAge), 2);
        } else {
            pLevel.setBlock(pPos, this.getStateForAge(nextAge -1),2 );
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.PODZOL);
    }

    @Override
    public int getMaxAge() {
        return FIRST_STAGE_MAX_AGE + SECOND_STAGE_MAX_AGE;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.WEED_SEEDS.get();
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
