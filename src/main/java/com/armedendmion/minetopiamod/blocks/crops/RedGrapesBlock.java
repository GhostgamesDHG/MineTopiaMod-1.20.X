package com.armedendmion.minetopiamod.blocks.crops;

import com.armedendmion.minetopiamod.init.ModItems;
import net.minecraft.world.level.ItemLike;

public class RedGrapesBlock extends GrapesBlock {
    public RedGrapesBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.RED_GRAPES_SEEDS.get();
    }

}
