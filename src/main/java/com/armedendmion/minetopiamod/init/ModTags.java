package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BLUE_CRYSTAL_TOOL = tag("needs_blue_crystal_tool");
        public static final TagKey<Block> NEEDS_WAPENSTOK_TOOL = tag("needs_wapenstok_tool");
        public static final TagKey<Block> NEEDS_TASER_TOOL = tag("needs_taser_tool");
        public static final TagKey<Block> NEEDS_MES_TOOL = tag("needs_mes_tool");
        public static final TagKey<Block> NEEDS_LIGHTSABER_TOOL = tag("needs_lightsaber_tool");
        public static final TagKey<Block> NEEDS_SCYTHE_TOOL = tag("needs_scythe_tool");
        public static final TagKey<Block> NEEDS_BAT_TOOL = tag("needs_bat_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MineTopiaMod.MOD_ID, name));
        }
    }

    public static class Items{
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MineTopiaMod.MOD_ID, name));
        }
    }
}
