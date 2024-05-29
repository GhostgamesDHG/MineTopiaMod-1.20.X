package com.armedendmion.minetopiamod.procedures.christmastree;

import com.armedendmion.minetopiamod.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class ChristmastreeTopDestroyed {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ModBlocks.CHRISTMAS_TREE_TOP.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ModBlocks.CHRISTMAS_TREE.get()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
