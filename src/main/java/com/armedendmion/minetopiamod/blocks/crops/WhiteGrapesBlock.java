package com.armedendmion.minetopiamod.blocks.crops;

import com.armedendmion.minetopiamod.init.ModItems;
import net.minecraft.world.level.ItemLike;

public class WhiteGrapesBlock extends GrapesBlock {
    public WhiteGrapesBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.WHITE_GRAPES_SEEDS.get();
    }
}
