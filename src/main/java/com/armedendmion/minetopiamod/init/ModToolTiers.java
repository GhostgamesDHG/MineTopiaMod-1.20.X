package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BLUE_CRYSTAL = TierSortingRegistry.registerTier(new ForgeTier(3, 1500, 9f ,1f,12,
            ModTags.Blocks.NEEDS_BLUE_CRYSTAL_TOOL, () -> Ingredient.of(ModItems.BLUE_CRYSTAL.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "blue_crystal"), List.of(Tiers.IRON), List.of());

    public static final Tier WAPENSTOK = TierSortingRegistry.registerTier(new ForgeTier(0, 1200, 2f ,0f,15,
                    ModTags.Blocks.NEEDS_WAPENSTOK_TOOL, () -> Ingredient.of(ModItems.CHEESE.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "wapenstok"), List.of(Tiers.WOOD), List.of());

    public static final Tier TASER = TierSortingRegistry.registerTier(new ForgeTier(0, 140, 6f ,0f,15,
                    ModTags.Blocks.NEEDS_TASER_TOOL, () -> Ingredient.of(ModItems.CHEESE.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "taser"), List.of(Tiers.WOOD), List.of());

    public static final Tier MES = TierSortingRegistry.registerTier(new ForgeTier(1, 40, 4f ,3f,14,
                    ModTags.Blocks.NEEDS_MES_TOOL, () -> Ingredient.of(ModItems.CHEESE.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "mes"), List.of(Tiers.STONE), List.of());

    public static final Tier LIGHTSABER = TierSortingRegistry.registerTier(new ForgeTier(2, 600, 4f ,1f,14,
                    ModTags.Blocks.NEEDS_LIGHTSABER_TOOL, () -> Ingredient.of(ModItems.CHEESE.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "lightsaber"), List.of(Tiers.STONE), List.of());

    public static final Tier SCYTHE = TierSortingRegistry.registerTier(new ForgeTier(2, 80, 4f ,10f,14,
                    ModTags.Blocks.NEEDS_SCYTHE_TOOL, () -> Ingredient.of(ModItems.CHEESE.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "scythe"), List.of(Tiers.STONE), List.of());

    public static final Tier BAT = TierSortingRegistry.registerTier(new ForgeTier(0, 40, 4f ,20f,14,
                    ModTags.Blocks.NEEDS_BAT_TOOL, () -> Ingredient.of(ModItems.CHEESE.get())), new ResourceLocation(MineTopiaMod.MOD_ID, "bat"), List.of(Tiers.WOOD), List.of());




}
