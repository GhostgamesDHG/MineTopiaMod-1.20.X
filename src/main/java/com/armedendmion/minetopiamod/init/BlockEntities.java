package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.blocks.blockentity.BrowncabinetBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.OilCanBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.SafeBlockEntity;
import com.armedendmion.minetopiamod.blocks.blockentity.bag.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MineTopiaMod.MOD_ID);
    public static final RegistryObject<BlockEntityType<?>> SAFE = register("safe", ModBlocks.SAFE, SafeBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BROWN_CABINET = register("brown_cabinet", ModBlocks.BROWN_CABINET, BrowncabinetBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> YELLOW_BAG = register("yellow_bag", ModBlocks.YELLOW_BAG, YellowBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> GREEN_BAG = register("green_bag", ModBlocks.GREEN_BAG, GreenBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> WHITE_BAG = register("white_bag", ModBlocks.WHITE_BAG, WhiteBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> ORANGE_BAG = register("orange_bag", ModBlocks.ORANGE_BAG, OrangeBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> MAGENTA_BAG = register("magenta_bag", ModBlocks.MAGENTA_BAG, MagentaBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> LIGHT_BLUE_BAG = register("light_blue_bag", ModBlocks.LIGHT_BLUE_BAG, LightBlueBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> LIME_BAG = register("lime_bag", ModBlocks.LIME_BAG, LimeBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> PINK_BAG = register("pink_bag", ModBlocks.PINK_BAG, PinkBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> GRAY_BAG = register("gray_bag", ModBlocks.GRAY_BAG, GrayBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> LIGHT_GRAY_BAG = register("light_gray_bag", ModBlocks.LIGHT_GRAY_BAG, LightGrayBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CYAN_BAG = register("cyan_bag", ModBlocks.CYAN_BAG, CyanBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> PURPLE_BAG = register("purple_bag", ModBlocks.PURPLE_BAG, PurpleBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BLUE_BAG = register("blue_bag", ModBlocks.BLUE_BAG, BlueBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BROWN_BAG = register("brown_bag", ModBlocks.BROWN_BAG, BrownBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> RED_BAG = register("red_bag", ModBlocks.RED_BAG, RedBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BLACK_BAG = register("black_bag", ModBlocks.BLACK_BAG, BlackBagBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> OILCAN = register("oilcan", ModBlocks.OIL_CAN, OilCanBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }
}
